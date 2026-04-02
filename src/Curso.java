import java.util.Scanner;

public class Curso {
    private String nomeCurso;
    private int cargaHorariacurso;
    private String tipo;
    private int duracao;
    private String valordaMensalidade;
    private int qtdhorasComplementar;
    private int qtdhorasExtensao;
    private String grau;

    Scanner scanner = new Scanner(System.in);

    // Metodos Contrutores
    public Curso() {

    }
    public Curso(String nomeCurso, int cargaHorariacurso, String tipo, int duracao,
                 String valordaMensalidade, String grau, int qtdhorasComplementar, int qtdhorasExtensao) {

        this.nomeCurso = nomeCurso;
        this.cargaHorariacurso = cargaHorariacurso;
        this.tipo = tipo;
        this.duracao = duracao;
        this.valordaMensalidade = valordaMensalidade;
        this.grau = grau;
        this.qtdhorasComplementar = qtdhorasComplementar;
        this.qtdhorasExtensao = qtdhorasExtensao;
    }

    // Gets e Sets
    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getCargaHorariacurso() {
        return cargaHorariacurso;
    }

    public void setCargaHorariacurso(int cargaHorariacurso) {
        this.cargaHorariacurso = cargaHorariacurso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getValordaMensalidade() {
        return valordaMensalidade;
    }

    public void setValordaMensalidade(String valordaMensalidade) {
        this.valordaMensalidade = valordaMensalidade;
    }

    public int getQtdhorasComplementar() {
        return qtdhorasComplementar;
    }

    public void setQtdhorasComplementar(int qtdhorasComplementar) {
        this.qtdhorasComplementar = qtdhorasComplementar;
    }

    public int getQtdhorasExtensao() {
        return qtdhorasExtensao;
    }

    public void setQtdhorasExtensao(int qtdhorasExtensao) {
        this.qtdhorasExtensao = qtdhorasExtensao;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    // CREATE (Cadastrar)
    public void cadastrar() {

        System.out.println("\n=== Cadastro Curso ===\n");

        System.out.print("Nome do Curso: ");
        this.setNomeCurso(scanner.nextLine());

        System.out.print("Carga Horária: ");
        this.setCargaHorariacurso(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Tipo (EAD/Presencial/Híbrido): ");
        this.setTipo(scanner.nextLine());

        System.out.print("Duração (anos): ");
        this.setDuracao(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Valor da Mensalidade: ");
        this.setValordaMensalidade(scanner.nextLine());

        System.out.print("Grau (Licenciatura/Bacharelado/etc): ");
        this.setGrau(scanner.nextLine());

        System.out.print("Horas Complementares: ");
        this.setQtdhorasComplementar(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Horas de Extensão: ");
        this.setQtdhorasExtensao(scanner.nextInt());
        scanner.nextLine();

        System.out.println("\nCurso cadastrado com sucesso!!!");
    }

    // READ (Ler)
    public void mostrar() {

        System.out.println("\n=== DADOS DO CURSO ===");

        System.out.println("Nome: " + getNomeCurso());
        System.out.println("Carga Horária: " + getCargaHorariacurso());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Duração: " + getDuracao() + " anos");
        System.out.println("Mensalidade: " + getValordaMensalidade());
        System.out.println("Grau: " + getGrau());
        System.out.println("Horas Complementares: " + getQtdhorasComplementar());
        System.out.println("Horas de Extensão: " + getQtdhorasExtensao());
    }

    // UPDATE (Atualizar)
    public void atualizar() {

        System.out.println("\n=== Atualizar Curso ===\n");

        System.out.print("Novo nome: ");
        this.setNomeCurso(scanner.nextLine());

        System.out.print("Nova carga horária: ");
        this.setCargaHorariacurso(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Novo tipo: ");
        this.setTipo(scanner.nextLine());

        System.out.print("Nova duração: ");
        this.setDuracao(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Nova mensalidade: ");
        this.setValordaMensalidade(scanner.nextLine());

        System.out.print("Novo grau: ");
        this.setGrau(scanner.nextLine());

        System.out.print("Novas horas complementares: ");
        this.setQtdhorasComplementar(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Novas horas de extensão: ");
        this.setQtdhorasExtensao(scanner.nextInt());
        scanner.nextLine();

        System.out.println("\nCurso atualizado com sucesso!");
    }

    @Override
    public String toString() {
        return "\n=== CURSO ===" +
               "\nNome: " + getNomeCurso() +
               "\nCarga Horária: " + getCargaHorariacurso() +
               "\nTipo: " + getTipo() +
               "\nDuração: " + getDuracao() +
               "\nMensalidade: " + getValordaMensalidade() +
               "\nGrau: " + getGrau() +
               "\nHoras Complementares: " + getQtdhorasComplementar() +
               "\nHoras de Extensão: " + getQtdhorasExtensao();
    }
}