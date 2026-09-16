public class Endereco {
    private int idEndereco;
    private String rua;
    private String cidade;
    
    public Endereco(int idEndereco, String rua, String cidade) {
        this.idEndereco = idEndereco;
        this.rua = rua;
        this.cidade = cidade;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    
}
