import java.util.Scanner;

public class Professor extends Funcionario {

    private String formacao;
    
    Scanner scanner = new Scanner(System.in);

    // Metodos Contrutores
    public Professor() {
        super();
    }
    public Professor(String formacao) {
        this.formacao = formacao;
    }
    // Gets e Sets
    public String getFormacao() {
        return formacao;
    }
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    // CREATE (Cadastrar)
    public void cadastrar() {

        System.out.println("\n=== Cadastro Professor ===\n");

        System.out.print("Nome: ");
        this.setNome(scanner.nextLine());

        System.out.print("CPF: ");
        this.setCpf(scanner.nextLong());
        scanner.nextLine();

        System.out.print("Idade: ");
        this.setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Sexo (M/F): ");
        this.setSexo(scanner.next().charAt(0));
        scanner.nextLine();

        System.out.print("Data de Nascimento: ");
        this.setDataNasc(scanner.nextLine());

        System.out.print("Telefone: ");
        this.setTelefone(scanner.nextLong());
        scanner.nextLine();

        System.out.print("Email: ");
        this.setEmail(scanner.nextLine());

        System.out.print("RF: ");
        this.setRf(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Salário: ");
        this.setSalario(scanner.nextLine());

        System.out.print("Carga Horária: ");
        this.setCargaHoraria(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Data de Aquisição: ");
        this.setDataAquisicao(scanner.nextLine());

        System.out.print("Formação: ");
        this.setFormacao(scanner.nextLine());

        // ENDEREÇO
        System.out.print("CEP: ");
        this.setCep(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Bairro: ");
        this.setBairro(scanner.nextLine());

        System.out.print("Cidade: ");
        this.setCidade(scanner.nextLine());

        System.out.print("UF: ");
        this.setUf(scanner.nextLine());

        System.out.print("Número: ");
        this.setNumero(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Complemento: ");
        this.setComplemento(scanner.nextLine());

        System.out.print("Logradouro: ");
        this.setLogradouro(scanner.nextLine());

        System.out.println("\nProfessor cadastrado com sucesso!!!");
    }

    // READ (Ler)
    public void mostrar() {

        System.out.println("\n=== DADOS DO PROFESSOR ===");

        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Data de Nascimento: " + getDataNasc());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + getEmail());

        System.out.println("RF: " + getRf());
        System.out.println("Salário: " + getSalario());
        System.out.println("Carga Horária: " + getCargaHoraria());
        System.out.println("Data de Aquisição: " + getDataAquisicao());

        System.out.println("Formação: " + getFormacao());

        // ENDEREÇO
        System.out.println("CEP: " + getCep());
        System.out.println("Bairro: " + getBairro());
        System.out.println("Cidade: " + getCidade());
        System.out.println("UF: " + getUf());
        System.out.println("Número: " + getNumero());
        System.out.println("Complemento: " + getComplemento());
        System.out.println("Logradouro: " + getLogradouro());
    }

    // UPDATE (Atualizar)
    public void atualizar() {

        System.out.println("\n=== Atualizar Professor ===\n");

        System.out.print("Novo nome: ");
        this.setNome(scanner.nextLine());

        System.out.print("Novo CPF: ");
        this.setCpf(scanner.nextLong());
        scanner.nextLine();

        System.out.print("Nova idade: ");
        this.setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Novo sexo (M/F): ");
        this.setSexo(scanner.next().charAt(0));
        scanner.nextLine();

        System.out.print("Nova data de nascimento: ");
        this.setDataNasc(scanner.nextLine());

        System.out.print("Novo telefone: ");
        this.setTelefone(scanner.nextLong());
        scanner.nextLine();

        System.out.print("Novo email: ");
        this.setEmail(scanner.nextLine());

        System.out.print("Novo RF: ");
        this.setRf(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Novo salário: ");
        this.setSalario(scanner.nextLine());

        System.out.print("Nova carga horária: ");
        this.setCargaHoraria(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Nova data de aquisição: ");
        this.setDataAquisicao(scanner.nextLine());

        System.out.print("Nova formação: ");
        this.setFormacao(scanner.nextLine());

        // ENDEREÇO
        System.out.print("Novo CEP: ");
        this.setCep(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Novo bairro: ");
        this.setBairro(scanner.nextLine());

        System.out.print("Nova cidade: ");
        this.setCidade(scanner.nextLine());

        System.out.print("Novo UF: ");
        this.setUf(scanner.nextLine());

        System.out.print("Novo número: ");
        this.setNumero(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Novo complemento: ");
        this.setComplemento(scanner.nextLine());

        System.out.print("Novo logradouro: ");
        this.setLogradouro(scanner.nextLine());

        System.out.println("\nDados atualizados com sucesso!");
    }

    @Override
    public String toString() {
        return "\n=== PROFESSOR ===" +
               "\nNome: " + getNome() +
               "\nCPF: " + getCpf() +
               "\nIdade: " + getIdade() +
               "\nSexo: " + getSexo() +
               "\nData de Nascimento: " + getDataNasc() +
               "\nTelefone: " + getTelefone() +
               "\nEmail: " + getEmail() +
               "\nRF: " + getRf() +
               "\nSalário: " + getSalario() +
               "\nCarga Horária: " + getCargaHoraria() +
               "\nData de Aquisição: " + getDataAquisicao() +
               "\nFormação: " + getFormacao() +
               "\nCEP: " + getCep() +
               "\nBairro: " + getBairro() +
               "\nCidade: " + getCidade() +
               "\nUF: " + getUf() +
               "\nNúmero: " + getNumero() +
               "\nComplemento: " + getComplemento() +
               "\nLogradouro: " + getLogradouro();
    }
}