/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionarios.Model;


public class Estagiario extends Funcionario {

    private String instituicao;

    public Estagiario(String nome, String cpf, double salario, String instituicao) {
        super(nome, cpf, salario);
        this.instituicao = instituicao;
    }

    public String getInstituicao() {
        return this.instituicao;
    }

    @Override
    public double getBonificacao() {
        return 200.00;
    }

    @Override
    public String getCargo() {
        return "Estagiário";
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + " | Instituição: " + instituicao;
    }
}