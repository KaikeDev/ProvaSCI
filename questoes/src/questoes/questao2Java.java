package questoes;

import java.util.Scanner;

public class questao2Java {
    public static void main(String[] args) throws Exception {

        // criando o scanner para a inserções de valores
        Scanner scan = new Scanner(System.in);

        // utilizando o try catch para tratar um possível erro do usuário
        try{

        // solicitando ao usuário o primeiro número
        System.out.println("Digite o primeiro número");
        // usuário entra com o valor do primeiro número
        double num1 = scan.nextDouble();

        // solicitando ao usuário o segundo número
        System.out.println("Digite o segundo número");
        // usuário entra com o valor do segundo número
        double num2 = scan.nextDouble();

        // solicitando ao usuário o terceiro número
        System.out.println("Digite o terceiro número");
        // usuário entra com o valor do terceiro número
        double num3 = scan.nextDouble();

        // solicitando ao usuário o quarto número
        System.out.println("Digite o quarto número");
        // usuário entra com o valor do quarto número
        double num4 = scan.nextDouble();

        // solicitando ao usuário o quinto número
        System.out.println("Digite o quinto número");
        // usuário entra com o valor do quinto número
        double num5 = scan.nextDouble();

        // criando a condição que vai verificar qual é o maior número, ela vai verificar
        // se o número é maior que todos os outros 4 números
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            // mostrando na tela para o usuário que o numero 1 é o maior número
            System.out.println("O número 1: " + num1 + " é o maior número");

        } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
            // mostrando na tela para o usuário que o numero 2 é o maior número
            System.out.println("O número 2: " + num2 + " é o maior número");

        } else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
            // mostrando na tela para o usuário que o numero 3 é o maior número
            System.out.println("O número 3: " + num3 + " é o maior número");

        }else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
            // mostrando na tela para o usuário que o numero 4 é o maior número
            System.out.println("O número 4: " + num4 + " é o maior número");
        }else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
            // mostrando na tela para o usuário que o numero 5 é o maior número
            System.out.println("O número 5: " + num5 + " é o maior número");
        }

         // criando a condição que vai verificar qual é o maior número, ela vai verificar
        // se o número é menor que todos os outros 4 números
        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
            // mostrando na tela para o usuário que o numero 1 é o menor número
            System.out.println("O número 1: " + num1 + " é o menor número");

        } else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
            // mostrando na tela para o usuário que o numero 2 é o menor número
            System.out.println("O número 2: " + num2 + " é o menor número");

        } else if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
            // mostrando na tela para o usuário que o numero 3 é o menor número
            System.out.println("O número 3: " + num3 + " é o menor número");

        }else if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
            // mostrando na tela para o usuário que o numero 4 é o menor número
            System.out.println("O número 4: " + num4 + " é o menor número");
        }else if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4) {
            // mostrando na tela para o usuário que o numero 5 é o menor número
            System.out.println("O número 5: " + num5 + " é o menor número");
        }
    }
    //se o usuário digitar um valor inválido, o programa irá mandar uma mensagem para ele, e o programa irá encerrar
    catch(Exception e){
        System.out.println("Valor digitado incorreto digite um valor correto");
    }
    
    
    scan.close();

    }
}
