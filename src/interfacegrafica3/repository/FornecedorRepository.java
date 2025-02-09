package interfacegrafica3.repository;

import interfacegrafica3.model.Fornecedor;
import interfacegrafica3.model.Uf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FornecedorRepository implements Crud<Fornecedor> {

    @Override
    public boolean inserir(Connection connection, Fornecedor fornecedor) {
        try {
            String sql = "INSERT INTO fornecedor (nome, email, endereco, uf, telefone, cnpj, inscricaoEstadual, nomeFantasia, categoria) " +
                         "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getEmail());
            stmt.setString(3, fornecedor.getEndereco());
            stmt.setInt(4, fornecedor.getUf().getId()); // Assume que Uf possui o método getId()
            stmt.setString(5, fornecedor.getTelefone());
            stmt.setString(6, fornecedor.getCnpj());
            stmt.setString(7, fornecedor.getInscricaoEstadual());
            stmt.setString(8, fornecedor.getNomeFantasia());
            stmt.setString(9, fornecedor.getCategoria());
            int rows = stmt.executeUpdate();
            stmt.close();
            return rows > 0;
        } catch (Exception ex) {
            System.out.println("Erro ao inserir fornecedor: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean atualizar(Connection connection, Fornecedor fornecedor) {
        try {
            String sql = "UPDATE fornecedor SET nome = ?, email = ?, endereco = ?, uf = ?, telefone = ?, " +
                         "cnpj = ?, inscricaoEstadual = ?, nomeFantasia = ?, categoria = ? " +
                         "WHERE id = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getEmail());
            stmt.setString(3, fornecedor.getEndereco());
            stmt.setInt(4, fornecedor.getUf().getId());
            stmt.setString(5, fornecedor.getTelefone());
            stmt.setString(6, fornecedor.getCnpj());
            stmt.setString(7, fornecedor.getInscricaoEstadual());
            stmt.setString(8, fornecedor.getNomeFantasia());
            stmt.setString(9, fornecedor.getCategoria());
            stmt.setInt(10, fornecedor.getId());
            int rows = stmt.executeUpdate();
            stmt.close();
            return rows > 0;
        } catch (Exception ex) {
            System.out.println("Erro ao atualizar fornecedor: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean deletar(Connection connection, Fornecedor fornecedor) {
        try {
            String sql = "DELETE FROM fornecedor WHERE id = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, fornecedor.getId());
            int rows = stmt.executeUpdate();
            stmt.close();
            return rows > 0;
        } catch (Exception ex) {
            System.out.println("Erro ao deletar fornecedor: " + ex.getMessage());
            return false;
        }
    }

    /**
     * O método selecionar recebe um operador (por exemplo, "=") e um id e retorna o
     * fornecedor que atende à condição. Caso não seja encontrado, retorna null.
     */
    @Override
    public Fornecedor selecionar(Connection connection, String operador, int id) {
        try {
            // Monta a query; por exemplo, se operador for "=", a condição será "WHERE id = ?"
            String sql = "SELECT f.id, f.nome, f.email, f.endereco, f.uf, f.telefone, " +
                         "f.cnpj, f.inscricaoEstadual, f.nomeFantasia, f.categoria, " +
                         "u.nome AS uf_nome, u.sigla AS uf_sigla " +
                         "FROM fornecedor f " +
                         "JOIN uf u ON f.uf = u.id " +
                         "WHERE f.id " + operador + " ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Fornecedor fornecedor = null;
            if (rs.next()) {
                // Cria o objeto Uf com os dados retornados
                Uf uf = new Uf();
                uf.setId(rs.getInt("uf"));
                uf.setNome(rs.getString("uf_nome"));
                uf.setSigla(rs.getString("uf_sigla"));
                // Cria o objeto Fornecedor com os dados da query
                fornecedor = new Fornecedor(
                    rs.getString("cnpj"),
                    rs.getString("inscricaoEstadual"),
                    rs.getString("nomeFantasia"),
                    rs.getString("nome"),
                    rs.getString("email"),
                    rs.getString("endereco"),
                    rs.getString("telefone"),
                    rs.getString("categoria"),
                    uf,
                    rs.getInt("id")
                );
            }
            rs.close();
            stmt.close();
            return fornecedor;
        } catch (Exception ex) {
            System.out.println("Erro ao selecionar fornecedor: " + ex.getMessage());
            return null;
        }
    }

    // ADICIONADO O MÉTODO LISTAR AQUI:
    public List<Fornecedor> listar(Connection connection) {
        List<Fornecedor> fornecedores = new ArrayList<>();
        try {
            // Monta a query para selecionar todos os fornecedores
            String sql = "SELECT f.id, f.nome, f.email, f.endereco, f.uf, f.telefone, " +
                         "f.cnpj, f.inscricaoEstadual, f.nomeFantasia, f.categoria, " +
                         "u.nome AS uf_nome, u.sigla AS uf_sigla " +
                         "FROM fornecedor f " +
                         "JOIN uf u ON f.uf = u.id";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // Cria o objeto Uf com os dados retornados
                Uf uf = new Uf();
                uf.setId(rs.getInt("uf"));
                uf.setNome(rs.getString("uf_nome"));
                uf.setSigla(rs.getString("uf_sigla"));
                
                // Cria o objeto Fornecedor com os dados da query
                Fornecedor fornecedor = new Fornecedor(
                    rs.getString("cnpj"),
                    rs.getString("inscricaoEstadual"),
                    rs.getString("nomeFantasia"),
                    rs.getString("nome"),
                    rs.getString("email"),
                    rs.getString("endereco"),
                    rs.getString("telefone"),
                    rs.getString("categoria"),
                    uf,
                    rs.getInt("id")
                );
                
                fornecedores.add(fornecedor); // Adiciona o fornecedor à lista
            }
            
            rs.close();
            stmt.close();
        } catch (Exception ex) {
            System.out.println("Erro ao listar fornecedores: " + ex.getMessage());
        }
        return fornecedores; // Retorna a lista de fornecedores
    }
}

        
