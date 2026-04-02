import java.util.Scanner;

public class Mensalidade extends Boleto {

    private String modelodepagamento;
    private String situacao;

    Scanner scanner = new Scanner(System.in);

    // Metodos Contrutores
    public Mensalidade() {
        super();
    }

    public Mensalidade(String modelodepagamento, String situacao) {
        this.modelodepagamento = modelodepagamento;
        this.situacao = situacao;
    }

    // Gets e Sets
    public String getModelodepagamento() {
        return modelodepagamento;
    }

    public void setModelodepagamento(String modelodepagamento) {
        this.modelodepagamento = modelodepagamento;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    // // CREATE (Cadastrar)
    public void cadastrar() {

        System.out.println("\n=== Cadastro Mensalidade ===\n");

        System.out.print("Linha Digitável: ");
        this.setLinhaDigitavel(scanner.nextLong());
        scanner.nextLine();

        System.out.print("Data de Regularização: ");
        this.setDataRegularizacao(scanner.nextLine());

        System.out.print("Data de Pagamento: ");
        this.setDataPagamento(scanner.nextLine());

        System.out.print("Valor: ");
        this.setValor(scanner.nextLine());

        System.out.print("Valor Pago: ");
        this.setValorPago(scanner.nextLine());

        System.out.print("Valor Desconto: ");
        this.setValordesconto(scanner.nextLine());

        System.out.print("Valor Juros: ");
        this.setValorjuros(scanner.nextLine());

        System.out.print("Valor Multa: ");
        this.setValormulta(scanner.nextLine());

        System.out.print("Modelo de Pagamento: ");
        this.setModelodepagamento(scanner.nextLine());

        System.out.print("Situação (Pago / Pendente): ");
        this.setSituacao(scanner.nextLine());

        System.out.println("\nMensalidade cadastrada com sucesso!!!");
    }

    // READ (Ler)
    public void mostrar() {

        System.out.println("\n=== DADOS DA MENSALIDADE ===");

        System.out.println("Linha Digitável: " + getLinhaDigitavel());
        System.out.println("Data Regularização: " + getDataRegularizacao());
        System.out.println("Data Pagamento: " + getDataPagamento());
        System.out.println("Valor: " + getValor());
        System.out.println("Valor Pago: " + getValorPago());
        System.out.println("Desconto: " + getValordesconto());
        System.out.println("Juros: " + getValorjuros());
        System.out.println("Multa: " + getValormulta());

        System.out.println("Modelo de Pagamento: " + getModelodepagamento());
        System.out.println("Situação: " + getSituacao());
    }

    // UPDATE (Atualizar)
    public void atualizar() {

        System.out.println("\n=== Atualizar Mensalidade ===\n");

        System.out.print("Nova linha digitável: ");
        this.setLinhaDigitavel(scanner.nextLong());
        scanner.nextLine();

        System.out.print("Nova data de regularização: ");
        this.setDataRegularizacao(scanner.nextLine());

        System.out.print("Nova data de pagamento: ");
        this.setDataPagamento(scanner.nextLine());

        System.out.print("Novo valor: ");
        this.setValor(scanner.nextLine());

        System.out.print("Novo valor pago: ");
        this.setValorPago(scanner.nextLine());

        System.out.print("Novo desconto: ");
        this.setValordesconto(scanner.nextLine());

        System.out.print("Novo juros: ");
        this.setValorjuros(scanner.nextLine());

        System.out.print("Nova multa: ");
        this.setValormulta(scanner.nextLine());

        System.out.print("Novo modelo de pagamento: ");
        this.setModelodepagamento(scanner.nextLine());

        System.out.print("Nova situação: ");
        this.setSituacao(scanner.nextLine());

        System.out.println("\nMensalidade atualizada com sucesso!");
    }

    @Override
    public String toString() {
        return "\n=== MENSALIDADE ===" +
               "\nLinha Digitável: " + getLinhaDigitavel() +
               "\nData Regularização: " + getDataRegularizacao() +
               "\nData Pagamento: " + getDataPagamento() +
               "\nValor: " + getValor() +
               "\nValor Pago: " + getValorPago() +
               "\nDesconto: " + getValordesconto() +
               "\nJuros: " + getValorjuros() +
               "\nMulta: " + getValormulta() +
               "\nModelo de Pagamento: " + getModelodepagamento() +
               "\nSituação: " + getSituacao();
    }
}