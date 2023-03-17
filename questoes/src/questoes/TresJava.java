package questoes;

import java.util.Scanner;

public class TresJava {

    public static void main(String[] args) throws Exception {

        // criando a classe scanner para a inserções de valores
        Scanner scan = new Scanner(System.in);

        //variável String que depois irá verificar se o usuário deseja continuar calculando médias
        String resposta;

        // utilizando o try catch para tratar um possível erro do usuário
        try {

            do {

                // iniciando as variáveis notas e a média
                double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, media = 0;

                // mensagem pedindo para o usuário digitar o nome do aluno
                System.out.println("Digite o nome do aluno");
                // uusário entra com o nome do aluno
                String nomeAluno = scan.next();

                // solicitando ao usuário a primeira nota do aluno
                System.out.println("Digite a primeira nota");
                // usuário entra com o valor da primeira nota
                nota1 = scan.nextDouble();
                // verificando se a nota está entre 0 e 10, se não estiver o usuário deverá
                // digitar a nota corretamente
                while (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota errada, nota precisa estar entre 0 e 10");
                    nota1 = scan.nextDouble();
                }

                // solicitando ao usuário a segunda nota do aluno
                System.out.println("Digite a segunda nota");
                // usuário entra com o valor da segunda nota
                nota2 = scan.nextDouble();
                // verificando se a nota está entre 0 e 10, se não estiver o usuário deverá
                // digitar a nota corretamente
                while (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota errada, nota precisa estar entre 0 e 10");
                    nota2 = scan.nextDouble();
                }

                // solicitando ao usuário a terceira nota do aluno
                System.out.println("Digite a terceira nota");
                // usuário entra com o valor da terceira nota
                nota3 = scan.nextDouble();

                // verificando se a nota está entre 0 e 10, se não estiver o usuário deverá
                // digitar a nota corretamente
                while (nota3 < 0 || nota3 > 10) {
                    System.out.println("Nota errada, nota precisa estar entre 0 e 10");
                    nota3 = scan.nextDouble();
                }

                // solicitando ao usuário a quarta nota do aluno
                System.out.println("Digite a quarta nota");
                // usuário entra com o valor da quarta nota
                nota4 = scan.nextDouble();

                // verificando se a nota está entre 0 e 10, se não estiver o usuário deverá
                // digitar a nota corretamente
                while (nota4 < 0 || nota4 > 10) {
                    System.out.println("Nota errada, nota precisa estar entre 0 e 10");
                    nota4 = scan.nextDouble();
                }

                // variável que irá calcular e armazenar a média do aluno
                media = (nota1 + nota2 + nota3 + nota4) / 4;

                // criando a condição que irá verificar se a media do aluno é maior ou igual a 6
                if (media >= 6) {
                    // se for maior que 6 irá aparecer na tela o nome do aluno a sua media e que ele
                    // está aprovado
                    System.out.println("O aluno " + nomeAluno + " está com a média: " + media + " e está aprovado");
                } else {
                    // se não irá aparecer na tela o nome do aluno a sua media e que ele está
                    // reprovado
                    System.out.println("O aluno " + nomeAluno + " está com a média: " + media + " e está reprovado");
                }

                System.out.println("------------------------------");

                // perguntando a usuário se ele deseja calcular a media de outro aluno
                System.out.println("Deseja calcular a media de outro aluno? *Digite Sim ou Nao*");
                // usuário envia sua resposta, caso seja Sim o programa começa, caso seja não o
                // programa se encerra
                resposta = scan.next();

                /*  utilizando um método da classe String (equalsIgnoreCase) para verificar se dentro da
                 variável (resposta) o conteúdo é igual a "Sim" ou "sim", se for igual o programa
                 continuará executando, se não o programa irá encerrar
                 */
            } while (resposta.equalsIgnoreCase("Sim"));

            // se o usuário digitar um valor inválido, o programa irá mandar uma mensagem
            // para ele, e o programa irá encerrar
        } catch (Exception e) {
            System.out.println("Valor digitado incorreto digite um valor correto");

        }
        System.out.println("Programa encerrado");

        scan.close();
    }
}
