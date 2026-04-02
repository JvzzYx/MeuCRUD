
import java.util.Scanner;

public class SistemaUNIP {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();
        Curso curso = new Curso();
        Turma turma = new Turma();
        Turno turno = new Turno();
        Professor professor = new Professor();
        Disciplina disciplina = new Disciplina();
        Coordenador coordenador = new Coordenador();
        Mensalidade mensalidade = new Mensalidade();

        System.out.println("\n=== SISTEMA ===");
        System.out.println("1 - Aluno");
        System.out.println("2 - Curso");
        System.out.println("3 - Turma");
        System.out.println("4 - Turno");
        System.out.println("5 - Professor");
        System.out.println("6 - Disciplina");
        System.out.println("7 - Coordenador");
        System.out.println("8 - Mensalidade");
        System.out.print("Escolha: ");

        int opcaoPrincipal = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\n1 - Cadastrar");
        System.out.println("2 - Mostrar");
        System.out.println("3 - Atualizar");
        System.out.println("4 - Deletar");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcaoPrincipal) {

            case 1: // ALUNO
                switch (opcao) {
                    case 1: aluno.cadastrar(); 
                    break;
                    case 2: aluno.mostrar(); 
                    break;
                    case 3: aluno.atualizar(); 
                    break;
                    case 4:
                        aluno = new Aluno();
                        System.out.println("Aluno deletado!");
                        break;
                }
                break;

            case 2: // CURSO
                switch (opcao) {
                    case 1: curso.cadastrar(); 
                    break;
                    case 2: curso.mostrar(); 
                    break;
                    case 3: curso.atualizar(); 
                    break;
                    case 4:
                        curso = new Curso();
                        System.out.println("Curso deletado!");
                        break;
                }
                break;

            case 3: // TURMA
                switch (opcao) {
                    case 1: turma.cadastrar(); break;
                    case 2: turma.mostrar(); break;
                    case 3: turma.atualizar(); break;
                    case 4:
                        turma = new Turma();
                        System.out.println("Turma deletada!");
                        break;
                }
                break;

            case 4: // TURNO
                switch (opcao) {
                    case 1: turno.cadastrar(); break;
                    case 2: turno.mostrar(); break;
                    case 3: turno.atualizar(); break;
                    case 4:
                        turno = new Turno();
                        System.out.println("Turno deletado!");
                        break;
                }
                break;

            case 5: // PROFESSOR
                switch (opcao) {
                    case 1: professor.cadastrar(); break;
                    case 2: professor.mostrar(); break;
                    case 3: professor.atualizar(); break;
                    case 4:
                        professor = new Professor();
                        System.out.println("Professor deletado!");
                        break;
                }
                break;

            case 6: // DISCIPLINA
                switch (opcao) {
                    case 1: disciplina.cadastrar(); break;
                    case 2: disciplina.mostrar(); break;
                    case 3: disciplina.atualizar(); break;
                    case 4:
                        disciplina = new Disciplina();
                        System.out.println("Disciplina deletada!");
                        break;
                }
                break;

            case 7: // COORDENADOR
                switch (opcao) {
                    case 1: coordenador.cadastrar(); break;
                    case 2: coordenador.mostrar(); break;
                    case 3: coordenador.atualizar(); break;
                    case 4:
                        coordenador = new Coordenador();
                        System.out.println("Coordenador deletado!");
                        break;
                }
                break;

            case 8: // MENSALIDADE
                switch (opcao) {
                    case 1: mensalidade.cadastrar(); break;
                    case 2: mensalidade.mostrar(); break;
                    case 3: mensalidade.atualizar(); break;
                    case 4:
                        mensalidade = new Mensalidade();
                        System.out.println("Mensalidade deletada!");
                        break;
                }
                break;

            default:
                System.out.println("Opção inválida!");
        }

        System.out.println("\nSistema finalizado.");
        scanner.close();
    }
}