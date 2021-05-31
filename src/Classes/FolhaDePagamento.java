package Classes;

public class FolhaDePagamento {
    private String funcionario;
    private double valorInss;
    private double valorIR;
    private double valorSalarioLiquido;
    
    public FolhaDePagamento(String funcionario, double valorInss, double valorIR, double valorSalarioLiquido) {
        this.funcionario = funcionario;
        this.valorInss = valorInss;
        this.valorIR = valorIR;
        this.valorSalarioLiquido = valorSalarioLiquido;
    }

    public FolhaDePagamento(Funcionario funcionario2) {
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public double getValorInss() {
        return valorInss;
    }

    public void setValorInss(double valorInss) {
        this.valorInss = valorInss;
    }

    public double getValorIR() {
        return valorIR;
    }

    public void setValorIR(double valorIR) {
        this.valorIR = valorIR;
    }

    public double getValorSalarioLiquido() {
        return valorSalarioLiquido;
    }

    public void setValorSalarioLiquido(double valorSalarioLiquido) {
        this.valorSalarioLiquido = valorSalarioLiquido;
    }

    @Override
    public String toString() {
        return String.format("%s funcionario %s valorIR %s valorInss %s valorSalarioLiquido %s", funcionario, valorIR, valorInss, valorSalarioLiquido);
        
    }
    
    
    



    
}
