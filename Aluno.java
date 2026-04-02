import java.util.Scanner;

public class Aluno extends Pessoa {
    private String ra;
    private long reservista;
    private String curso;

    Scanner scanner = new Scanner(System.in);

    // Metodos Contrutores
    public Aluno() {
    }
    public Aluno(String ra, long reservista, String curso) {
        this.ra = ra;
        this.reservista = reservista;
        this.curso = curso;
    }

    // Gets e Sets
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public long getReservista() {
        return reservista;
    }

    public void setReservista(long reservista) {
        this.reservista = reservista;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // CREATE (CADASTRAR)
    public void cadastrar() {

    System.out.println("\n=== Cadastro Aluno ===\n");

    System.out.print("Nome: ");
    this.setNome(scanner.nextLine());

    System.out.print("CPF: ");
    this.setCpf(scanner.nextLong());
    scanner.nextLine();

    System.out.print("Idade: ");
    this.setIdade(scanner.nextInt());
    scanner.nextLine();

    System.out.print("Sexo (M/F): ");
    char sexo = scanner.next().charAt(0);
    this.setSexo(sexo);
    scanner.nextLine();

    System.out.print("Data de Nascimento: ");
    this.setDataNasc(scanner.nextLine());

    System.out.print("Telefone: ");
    this.setTelefone(scanner.nextLong());
    scanner.nextLine();

    System.out.print("Email: ");
    this.setEmail(scanner.nextLine());

    // DADOS DO ALUNO
    System.out.print("RA: ");
    this.setRa(scanner.nextLine());

    System.out.print("Curso: ");
    this.setCurso(scanner.nextLine());

    if (sexo == 'M' || sexo == 'm') {
        System.out.print("Reservista: ");
        this.setReservista(scanner.nextLong());
        scanner.nextLine();
    }

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

    System.out.println("\nAluno cadastrado com sucesso!!!");
}

    // READ (MOSTRAR)
    public void mostrar() {
    
        System.out.println("\n=== DADOS DO ALUNO ===");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Data de Nascimento: " + getDataNasc());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + getEmail());
        System.out.println("RA: " + getRa());
        System.out.println("Curso: " + getCurso());
        if (getSexo() == 'M' || getSexo() == 'm') {
            System.out.println("Reservista: " + getReservista());
        }
        // ENDEREÇO
        System.out.println("CEP: " + getCep());
        System.out.println("Bairro: " + getBairro());
        System.out.println("Cidade: " + getCidade());
        System.out.println("UF: " + getUf());
        System.out.println("Número: " + getNumero());
        System.out.println("Complemento: " + getComplemento());
        System.out.println("Logradouro: " + getLogradouro());
    }

    // UPDATE
    public void atualizar() {

    System.out.println("\n=== Atualizar Aluno ===\n");

    System.out.print("Novo nome: ");
    this.setNome(scanner.nextLine());

    System.out.print("Novo CPF: ");
    this.setCpf(scanner.nextLong());
    scanner.nextLine();

    System.out.print("Nova idade: ");
    this.setIdade(scanner.nextInt());
    scanner.nextLine();

    System.out.print("Novo sexo (M/F): ");
    char sexo = scanner.next().charAt(0);
    this.setSexo(sexo);
    scanner.nextLine();

    System.out.print("Nova data de nascimento: ");
    this.setDataNasc(scanner.nextLine());

    System.out.print("Novo telefone: ");
    this.setTelefone(scanner.nextLong());
    scanner.nextLine();

    System.out.print("Novo email: ");
    this.setEmail(scanner.nextLine());

    System.out.print("Novo RA: ");
    this.setRa(scanner.nextLine());

    System.out.print("Novo curso: ");
    this.setCurso(scanner.nextLine());

    if (sexo == 'M' || sexo == 'm') {
        System.out.print("Novo reservista: ");
        this.setReservista(scanner.nextLong());
        scanner.nextLine();
    }

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

    // DELETE
    //"Decidi colocar o delete na classe principal pois la ela apaga o objeto criado"     


    @Override
public String toString() {
    return "\n=== ALUNO ===" +
           "\nNome: " + getNome() +
           "\nCPF: " + getCpf() +
           "\nIdade: " + getIdade() +
           "\nSexo: " + getSexo() +
           "\nData de Nascimento: " + getDataNasc() +
           "\nTelefone: " + getTelefone() +
           "\nEmail: " + getEmail() +
           "\nRA: " + getRa() +
           "\nCurso: " + getCurso() +
           "\nReservista: " + getReservista() +
           "\nCEP: " + getCep() +
           "\nBairro: " + getBairro() +
           "\nCidade: " + getCidade() +
           "\nUF: " + getUf() +
           "\nNúmero: " + getNumero() +
           "\nComplemento: " + getComplemento() +
           "\nLogradouro: " + getLogradouro();
    }
}