public class Funcionario extends Pessoa{
    private int rf;
    private String Salario;
    private int cargaHoraria;
    private String dataAquisicao;

    public Funcionario(){
        super();
    }
    public Funcionario(int rf,String Salario,int cargaHoraria){

        this.rf=rf;
        this.Salario=Salario;
        this.cargaHoraria=cargaHoraria;

    }
    
    public void setDataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }
    public String getDataAquisicao() {
        return dataAquisicao;
    }
    public int getRf(){
        return rf;
    }
    public void setRf(int rf){
        this.rf=rf;
    }
    public String getSalario(){
        return Salario;
    }
    public void setSalario(String Salario){
        this.Salario=Salario;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Funcionario [RF=" + rf + 
            ", Salario=" + Salario + 
            ", cargaHoraria=" + cargaHoraria + 
            ", dataAquisicao="+ dataAquisicao + 
            "]";
    }      
}
