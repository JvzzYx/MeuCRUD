public class Boleto {
    private long linhaDigitavel;
    private String dataRegularizacao;
    private String dataPagamento;
    private String valor;
    private String valorPago;
    private String valordesconto;
    private String valorjuros;
    private String valormulta;
    
    public Boleto(long linhaDigitavel,String dataRegularizacao,String dataPagamento,String valor,
        String valorPago,String valordesconto,String valorjuros,String valormulta){

        this.linhaDigitavel=linhaDigitavel;
        this.dataRegularizacao=dataRegularizacao;
        this.dataPagamento=dataPagamento;
        this.valor=valor;
        this.valorPago=valorPago;
        this.valordesconto=valordesconto;
        this.valorjuros=valorjuros;
        this.valormulta=valormulta;
    }
    public Boleto(){

    }
    public long getLinhaDigitavel() {
        return linhaDigitavel;
    }
    public void setLinhaDigitavel(long linhaDigitavel) {
        this.linhaDigitavel = linhaDigitavel;
    }
    public String getDataRegularizacao() {
        return dataRegularizacao;
    }
    public void setDataRegularizacao(String dataRegularizacao) {
        this.dataRegularizacao = dataRegularizacao;
    }
    public String getDataPagamento() {
        return dataPagamento;
    }
    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getValorPago() {
        return valorPago;
    }
    public void setValorPago(String valorPago) {
        this.valorPago = valorPago;
    }
    public String getValordesconto() {
        return valordesconto;
    }
    public void setValordesconto(String valordesconto) {
        this.valordesconto = valordesconto;
    }
    public String getValorjuros() {
        return valorjuros;
    }
    public void setValorjuros(String valorjuros) {
        this.valorjuros = valorjuros;
    }
    public String getValormulta() {
        return valormulta;
    }
    public void setValormulta(String valormulta) {
        this.valormulta = valormulta;
    }
    @Override
    public String toString() {
        
        return "Boleto [linhaDigitavel=" + linhaDigitavel + 
            ", dataRegularizacao=" + dataRegularizacao+
            ", dataPagamento=" + dataPagamento + 
            ", valor=" + valor + 
            ", valorPago=" + valorPago+
            ", valordesconto=" + valordesconto + 
            ", valorjuros=" + valorjuros + 
            ", valormulta=" + valormulta+
            "]";
    }
}
