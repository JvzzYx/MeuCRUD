public class Pessoa {

    private int idPessoa;
    private String nome;
    private long cpf;
    private int idade;
    private char sexo; 
    private String dataNasc;
    private long telefone;
    private String email;

    private int cep;
    private String bairro;
    private String cidade;
    private String uf;
    private int numero;
    private String complemento;
    private String logradouro;

    public Pessoa() {
    }

    public Pessoa(int idPessoa, String nome, long cpf, int idade,
                  char sexo, String dataNasc, long telefone, String email,
                  int cep, String bairro, String cidade, String uf,
                  int numero, String complemento, String logradouro) {

        this.idPessoa = idPessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.email = email;

        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.numero = numero;
        this.complemento = complemento;
        this.logradouro = logradouro;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    @Override
    public String toString() {
        return "Pessoa [idPessoa=" + idPessoa +
                ", nome=" + nome +
                ", cpf=" + cpf +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", dataNasc=" + dataNasc +
                ", telefone=" + telefone +
                ", email=" + email +
                "\nEndereco [cep=" + cep +
                ", bairro=" + bairro +
                ", cidade=" + cidade +
                ", uf=" + uf +
                ", numero=" + numero +
                ", complemento=" + complemento +
                ", logradouro=" + logradouro +
                "]";
    }
}