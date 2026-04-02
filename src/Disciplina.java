import java.util.Scanner;

public class Disciplina extends Curso {

    private String nomeDisciplina;
    private String codigo;
    private int horas;
    private String semestre;
    private String modalidade;

    Scanner scanner = new Scanner(System.in);

    // Metodos Contrutores
    public Disciplina() {
        super();
    }
    // Gets e Sets
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

     // CREATE (Cadastrar)
    public void cadastrar() {

        System.out.println("\n=== Cadastro Disciplina ===\n");

        System.out.print("Nome do Curso: ");
        this.setNomeCurso(scanner.nextLine());

        System.out.print("Carga Horária do Curso: ");
        this.setCargaHorariacurso(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Tipo do Curso: ");
        this.setTipo(scanner.nextLine());

        System.out.print("Duração do Curso: ");
        this.setDuracao(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Mensalidade: ");
        this.setValordaMensalidade(scanner.nextLine());

        System.out.print("Grau: ");
        this.setGrau(scanner.nextLine());

        System.out.print("Horas Complementares: ");
        this.setQtdhorasComplementar(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Horas de Extensão: ");
        this.setQtdhorasExtensao(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Nome da Disciplina: ");
        this.setNomeDisciplina(scanner.nextLine());

        System.out.print("Código: ");
        this.setCodigo(scanner.nextLine());

        System.out.print("Horas da Disciplina: ");
        this.setHoras(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Semestre: ");
        this.setSemestre(scanner.nextLine());

        System.out.print("Modalidade: ");
        this.setModalidade(scanner.nextLine());

        System.out.println("\nDisciplina cadastrada com sucesso!!!");
    }

     // READ (Ler)
    public void mostrar() {

        System.out.println("\n=== DADOS DA DISCIPLINA ===");

        System.out.println("Curso: " + getNomeCurso());
        System.out.println("Carga Horária Curso: " + getCargaHorariacurso());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Duração: " + getDuracao());
        System.out.println("Mensalidade: " + getValordaMensalidade());
        System.out.println("Grau: " + getGrau());
        System.out.println("Nome Disciplina: " + getNomeDisciplina());
        System.out.println("Código: " + getCodigo());
        System.out.println("Horas: " + getHoras());
        System.out.println("Semestre: " + getSemestre());
        System.out.println("Modalidade: " + getModalidade());
    }

    // UPDATE (Atualizar)
    public void atualizar() {

        System.out.println("\n=== Atualizar Disciplina ===\n");

        System.out.print("Novo nome do curso: ");
        this.setNomeCurso(scanner.nextLine());

        System.out.print("Nova carga horária do curso: ");
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

        System.out.print("Novo nome da disciplina: ");
        this.setNomeDisciplina(scanner.nextLine());

        System.out.print("Novo código: ");
        this.setCodigo(scanner.nextLine());

        System.out.print("Novas horas: ");
        this.setHoras(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Novo semestre: ");
        this.setSemestre(scanner.nextLine());

        System.out.print("Nova modalidade: ");
        this.setModalidade(scanner.nextLine());

        System.out.println("\nDisciplina atualizada com sucesso!");
    }

    @Override
    public String toString() {
        return "\n=== DISCIPLINA ===" +
               "\nCurso: " + getNomeCurso() +
               "\nCarga Horária Curso: " + getCargaHorariacurso() +
               "\nTipo: " + getTipo() +
               "\nDuração: " + getDuracao() +
               "\nMensalidade: " + getValordaMensalidade() +
               "\nGrau: " + getGrau() +
               "\nNome Disciplina: " + getNomeDisciplina() +
               "\nCódigo: " + getCodigo() +
               "\nHoras: " + getHoras() +
               "\nSemestre: " + getSemestre() +
               "\nModalidade: " + getModalidade();
    }
}