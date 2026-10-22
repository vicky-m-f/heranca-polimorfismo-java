package Funcionarios.Model;

public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public abstract double getBonificacao();

    public abstract String getCargo();

    
    public String exibirDados() {
        return getCargo() 
                + " | " + nome 
                + " | CPF: " + cpf 
                + " | Salário: R$ " + String.format("%.2f", salario)
                + " | Bonificação: R$ " + String.format("%.2f", getBonificacao());
    }
}