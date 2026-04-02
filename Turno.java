import java.util.Scanner;

public class Turno {

    private String descricao; 
    private String horarioturno;

    Scanner scanner = new Scanner(System.in);

    // Metodos Contrutores
    public Turno() {

    }
    public Turno(String descricao, String horarioturno) {
        this.descricao = descricao;
        this.horarioturno = horarioturno;
    }
    // Gets e Sets
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHorarioturno() {
        return horarioturno;
    }

    public void setHorarioturno(String horarioturno) {
        this.horarioturno = horarioturno;
    }

    // CREATE (Cadastrar)
    public void cadastrar() {

        System.out.println("\n=== Cadastro Turno ===\n");

        System.out.print("Descrição do turno: ");
        this.setDescricao(scanner.nextLine());

        System.out.print("Horário (ex: 08h às 12h): ");
        this.setHorarioturno(scanner.nextLine());

        System.out.println("\nTurno cadastrado com sucesso!!!");
    }

    // READ (Ler)
    public void mostrar() {

        System.out.println("\n=== DADOS DO TURNO ===");

        System.out.println("Descrição: " + getDescricao());
        System.out.println("Horário: " + getHorarioturno());
    }

    // UPDATE (Atualizar)
    public void atualizar() {

        System.out.println("\n=== Atualizar Turno ===\n");

        System.out.print("Nova descrição: ");
        this.setDescricao(scanner.nextLine());

        System.out.print("Novo horário: ");
        this.setHorarioturno(scanner.nextLine());

        System.out.println("\nTurno atualizado com sucesso!");
    }

    @Override
    public String toString() {
        return "\n=== TURNO ===" +
               "\nDescrição: " + getDescricao() +
               "\nHorário: " + getHorarioturno();
    }
}