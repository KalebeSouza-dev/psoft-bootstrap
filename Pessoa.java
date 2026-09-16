import java.util.*;

public class Pessoa {
    private final String nome;
    private int idade;
    private final String cpf;
    private String telefone;
    private Map<Integer, Endereco> enderecos;
    private String profissao;    
    // private String papelPessoa;    

    public Pessoa(String nome, int idade, String cpf, String telefone, String profissao){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        this.profissao = profissao;
        //this.papelPessoa = papelPessoa;

        this.enderecos = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    // public String getPapelPessoa() {
    //     return papelPessoa;
    // }

    // public void setPapelPessoa(String papelPessoa) {
    //     this.papelPessoa = papelPessoa;
    // }

    public void excluirEndereco(int id){
        this.enderecos.remove(id);
    }
    
    public String verEnderecoes(){
        return enderecos.toString();
    }

    public void cadastrarEndereco(){
        
    }
}
