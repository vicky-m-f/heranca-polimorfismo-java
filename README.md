# Funcionários da Empresa – Herança e Polimorfismo

## Descrição

Programa que cadastra funcionários de diferentes cargos e calcula
a bonificação de fim de ano de cada um usando polimorfismo.
## Hierarquia de classes
Funcionario (abstract)


├── Programador

├── Estagiario

├── Gerente

└── Diretor

## Como executar
1. Compile o programa
2. Execute a classe ProgramaFuncionario
## Respostas
1 Significa que existe uma relação de herança . O Diretor herda todas as características e comportamentos de um Gerente, e o Gerente herda de Funcionario . Logoum Diretor também possui todas as características de um Funcionário.

2super(...)` é utilizado dentro dos construtores das subclasses para invocar o construtor da superclasse correspondente, garantindo a inicialização correta dos atributos herdados.
super.getBonificacao() é uma chamada a um método específico da superclasse a partir de uma subclasse, muito útil quando queremos reaproveitar a lógica existente na mãe e acrescentar novas regras (como no caso do Diretor).

3 Graças ao **polimorfismo**. O Java identifica dinamicamente qual é o objeto real que está armazenado na referência e executa o método getBonificacao() correspondente àquela classe específica.

4 Não.,apenas criar a classe Analista extends Funcionario implementando getBonificacao() e
getCargo(). Como ControleDeBonificacoes trabalha apenas com o tipo Funcionario, ela aceita
qualquer nova filha sem nenhuma alteração (baixo acoplamento).

5 Porque ela é uma ideia,um conceito,ela serve como ideia para as filhas e para criar metodos abstratos que obriga as classes filhas a herdar aquilo tambem

## Tecnologias
- Java 21
- Apache NetBeans IDE 31
- 
## Autora
Vicky Luzon Moreira Ferreira
