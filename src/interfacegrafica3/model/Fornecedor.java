package interfacegrafica3.model;

public class Fornecedor extends PessoaJuridica {
    private String categoria;
    private Uf uf;  // Atributo do tipo Uf

    // Construtor atualizado
    public Fornecedor(String cnpj, String inscricaoEstadual, String nomeFantasia, 
                      String nome, String email, String endereco, 
                      String telefone, String categoria, Uf uf,int id) {
        super(cnpj, inscricaoEstadual, nomeFantasia, nome, email, endereco, telefone, id);
        this.categoria = categoria;
        this.uf = uf;
    }

    
    
    // Getter e Setter para categoria
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Getter e Setter para uf
    public Uf getUf() {
        return uf;
    }

    public void setUf(Uf uf) {
        this.uf = uf;
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
               ", categoria=" + categoria +
               ", uf=" + uf +
               '}';
    }
}
