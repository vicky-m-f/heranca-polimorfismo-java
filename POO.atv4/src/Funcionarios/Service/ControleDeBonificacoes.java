/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionarios.Service;



import Funcionarios.Model.Funcionario;

public class ControleDeBonificacoes {

    private double totalDeBonificacoes = 0;

    public void registra(Funcionario f) {
        totalDeBonificacoes += f.getBonificacao();
    }

    public double getTotalDeBonificacoes() {
        return totalDeBonificacoes;
    }
}