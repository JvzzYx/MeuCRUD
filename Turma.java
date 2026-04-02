import java.util.Scanner;

public class Turma {
    private String sala;
    private int maxAlunos;
    private String codigoTurma;

    Scanner scanner = new Scanner(System.in);

    // Metodos Contrutores
    public Turma() {

    }
    public Turma(String sala, int maxAlunos, String codigoTurma) {
        this.sala = sala;
        this.maxAlunos = maxAlunos;
        this.codigoTurma = codigoTurma;
    }

    // Gets e Sets
    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getMaxAlunos() {
        return maxAlunos;
    }

    public void setMaxAlunos(int maxAlunos) {
        this.maxAlunos = maxAlunos;
    }

    public String getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    // CREATE (Cadastrar)
    public void cadastrar() {

        System.out.println("\n=== Cadastro Turma ===\n");

        System.out.print("Código da Turma: ");
        this.setCodigoTurma(scanner.nextLine());

        System.out.print("Sala: ");
        this.setSala(scanner.nextLine());

        System.out.print("Máximo de Alunos: ");
        this.setMaxAlunos(scanner.nextInt());
        scanner.nextLine();

        System.out.println("\nTurma cadastrada com sucesso!!!");
    }

    // READ (Ler)
    public void mostrar() {

        System.out.println("\n=== DADOS DA TURMA ===");

        System.out.println("Código: " + getCodigoTurma());
        System.out.println("Sala: " + getSala());
        System.out.println("Máximo de Alunos: " + getMaxAlunos());
    }

    // UPDATE (Atualizar dados)
    public void atualizar() {

        System.out.println("\n=== Atualizar Turma ===\n");

        System.out.print("Novo código: ");
        this.setCodigoTurma(scanner.nextLine());

        System.out.print("Nova sala: ");
        this.setSala(scanner.nextLine());

        System.out.print("Novo máximo de alunos: ");
        this.setMaxAlunos(scanner.nextInt());
        scanner.nextLine();

        System.out.println("\nTurma atualizada com sucesso!");
    }

    @Override
    public String toString() {
        return "\n=== TURMA ===" +
               "\nCódigo: " + getCodigoTurma() +
               "\nSala: " + getSala() +
               "\nMáximo de Alunos: " + getMaxAlunos();
    }
}