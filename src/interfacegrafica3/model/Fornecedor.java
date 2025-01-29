package interfacegrafica3.model;

public class Fornecedor extends PessoaJuridica {
    private String categoria;

    // Construtor
    public Fornecedor(String cnpj, String inscricaoEstadual, String nomeFantasia, 
                      String nome, String email, String endereco, 
                      String telefone, String categoria, int id) {
        super(cnpj, inscricaoEstadual, nomeFantasia, nome, email, endereco, telefone, id);
        this.categoria = categoria;
    }

    // Getter e Setter para categoria
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Método toString() para representar o Fornecedor de forma legível
    @Override
    public String toString() {
        return "Fornecedor{" +
               "nome=" + super.getNome() +
               ", email=" + super.getEmail() +
               ", endereco=" + super.getEndereco() +
               ", telefone=" + super.getTelefone() +
               ", cnpj=" + super.getCnpj() +
               ", inscricaoEstadual=" + super.getInscricaoEstadual() +
               ", nomeFantasia=" + super.getNomeFantasia() +
               ", categoria=" + categoria + '}';
    }
}
