package Funcionarios.App;

import java.util.Scanner;
import Funcionarios.Model.*;
import Funcionarios.Service.ControleDeBonificacoes;

public class ProgramaFuncionario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CADASTRO DE FUNCIONÁRIOS ===");

        
        System.out.println("\n--- Programador ---");
        System.out.print("Nome: ");
        String nomeProg = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfProg = scanner.nextLine();
        System.out.print("Salário: ");
        double salarioProg = Double.parseDouble(scanner.nextLine());
        System.out.print("Linguagem: ");
        String linguagemProg = scanner.nextLine();
        
        Funcionario programador = new Programador(nomeProg, cpfProg, salarioProg, linguagemProg);

        System.out.println("\n--- Estagiário ---");
        System.out.print("Nome: ");
        String nomeEst = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfEst = scanner.nextLine();
        System.out.print("Salário: ");
        double salarioEst = Double.parseDouble(scanner.nextLine());
        System.out.print("Instituição: ");
        String instituicaoEst = scanner.nextLine();
        
        Funcionario estagiario = new Estagiario(nomeEst, cpfEst, salarioEst, instituicaoEst);

        
        System.out.println("\n--- Gerente ---");
        System.out.print("Nome: ");
        String nomeGer = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfGer = scanner.nextLine();
        System.out.print("Salário: ");
        double salarioGer = Double.parseDouble(scanner.nextLine());
        System.out.print("Senha (número): ");
        int senhaGer = Integer.parseInt(scanner.nextLine());
       
        Gerente gerente = new Gerente(nomeGer, cpfGer, salarioGer, senhaGer);

        
        System.out.println("\n--- Diretor ---");
        System.out.print("Nome: ");
        String nomeDir = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfDir = scanner.nextLine();
        System.out.print("Salário: ");
        double salarioDir = Double.parseDouble(scanner.nextLine());
        System.out.print("Senha (número): ");
        int senhaDir = Integer.parseInt(scanner.nextLine());
        
        Funcionario diretor = new Diretor(nomeDir, cpfDir, salarioDir, senhaDir);

      
        System.out.println("\n=== TESTE DE AUTENTICAÇÃO ===");
        System.out.print("Digite a senha do Gerente " + gerente.getNome() + " para autenticar: ");
        int senhaDigitada = Integer.parseInt(scanner.nextLine());
        
        if (gerente.autentica(senhaDigitada)) {
            System.out.println("-> Acesso permitido!");
        } else {
            System.out.println("-> Acesso negado!");
        }

       
        ControleDeBonificacoes controle = new ControleDeBonificacoes();
        controle.registra(programador);
        controle.registra(estagiario);
        controle.registra(gerente);
        controle.registra(diretor);

  
        System.out.println("\n=== RELATÓRIO DE FUNCIONÁRIOS ===");
        System.out.println(programador.exibirDados());
        System.out.println(estagiario.exibirDados());
        System.out.println(gerente.exibirDados());
        System.out.println(diretor.exibirDados());

        System.out.println("----------------------------------------------------------------");
        System.out.printf("Total de bonificações: R$ %.2f%n", controle.getTotalDeBonificacoes());

        scanner.close();
    }
}