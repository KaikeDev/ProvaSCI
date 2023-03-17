package questoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class UmJava {

    public static void main(String[] args) throws Exception {

        // criando a classe scanner para a inserções de valores
        Scanner scan = new Scanner(System.in);

        // criando um objeto para depois eu fazer com que a media dos numeros tenha
        // somente 2 casas decimais
        DecimalFormat f_02 = new DecimalFormat("0.00");

        // utilizando o try catch para tratar um possível erro do usuário
        try {

            // criando as variáveis que serão utilizadas para que o usuário entra com os
            // números
            double num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;

            // solicitando ao usuário o primeiro número
            System.out.println("Digite o primeiro número");
            // usuário entra com o valor do primeiro número
            num1 = scan.nextDouble();

            // solicitando ao usuário o segundo número
            System.out.println("Digite o segundo número");
            // usuário entra com o valor do segundo número
            num2 = scan.nextDouble();

            // solicitando ao usuário o terceiro número
            System.out.println("Digite o terceiro número");
            // usuário entra com o valor do terceiro número
            num3 = scan.nextDouble();

            // solicitando ao usuário o quarto número
            System.out.println("Digite o quarto número");
            // usuário entra com o valor do quarto número
            num4 = scan.nextDouble();

            // solicitando ao usuário o quinto número
            System.out.println("Digite o quinto número");
            // usuário entra com o valor do quinto número
            num5 = scan.nextDouble();

            /*
             * criando a condição para verificar se o número é par ou ímpar, se a divisão
             * dele restar 0 ele é par, se não o número é impar, irei fazer o mesmo
             * procedimento com os 5 numeros digitados pelo usuário
             */

            if (num1 % 2 == 0) {
                System.out.println("O primeiro número: " + num1 + " é um número par");
            } else {
                System.out.println("O primeiro número: " + num1 + " é um número impar");
            }

            if (num2 % 2 == 0) {
                System.out.println("O segundo número: " + num2 + " é um número par");
            } else {
                System.out.println("O segundo número: " + num2 + " é um número impar");
            }

            if (num3 % 2 == 0) {
                System.out.println("O terceiro número: " + num3 + " é um número par");
            } else {
                System.out.println("O terceiro  número: " + num3 + " é um número impar");
            }

            if (num4 % 2 == 0) {
                System.out.println("O quarto número: " + num4 + " é um número par");
            } else {
                System.out.println("O quarto número: " + num4 + " é um número impar");
            }

            if (num5 % 2 == 0) {
                System.out.println("O quinto número: " + num5 + " é um número par");
            } else {
                System.out.println("O quinto número: " + num5 + " é um número impar");
            }

            // criando um println para separar a parte que mostra os números pares e impares
            // e a media
            System.out.println("------------------------------------");

            // criando uma variável que irá calcular a média dos 5 números, ela irá somar os
            // números e dividir pelo número de elementos, que no caso é 5
            double media = (num1 + num2 + num3 + num4 + num5) / 5;
            
            // mostrando a média para o usuário com o objeto que eu criei anteriormente
            System.out.println("A média geral dos 5 números é: " + f_02.format(media));

            // se o usuário digitar um valor inválido, o programa irá mandar uma mensagem
            // para ele, e o programa irá encerrar
        } catch (Exception e) {
            System.out.println("Valor digitado incorreto digite um valor correto");
        }
        scan.close();
    }

}
