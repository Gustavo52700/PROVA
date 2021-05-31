package Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    private LocalDate dataPagamento;
    
    public Funcionario(String string, String string2, LocalDate parse) {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public LocalDate getDataPagamento() {
        return dataPagamento;
    }
    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    @Override
    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%s cpf %s recebeu R$ %.2f de salario %s recebeu em %s", nome, cpf, salario, dataPagamento.format(df));
        
    }
    
    
    
    
    
    
}