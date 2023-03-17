package questoes;

import java.util.Scanner;

public class questao4Java {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        // utilizando o try catch para tratar um possível erro do usuário
        try {
            // iniciando a variável que possui valor 5
            int qtdNumeros = 5;
            // declarando um vetor de 5 posições
            double[] numeros = new double[5];

            /*
             * Criando o laço for que irá determinar quantas vezes o usuário irá digitar um
             * número, depende do tamanho da variável "qtdNumeros" enquento a variável "i"
             * não ultrapassar o tamanho da "qtdNumeros" o laço irá se repetir
             */
            for (int i = 0; i < qtdNumeros; i++) {

                // pedindo para o usuário digitar um número
                System.out.println("Digite um número");
                // usuário insere um número que ficará armazenado dentro do vetor
                numeros[i] = scan.nextDouble();
            }
            //mostrando ao usuário o terceiro número que foi digitado
            System.out.println("O terceiro número digitado foi o número: " + numeros[2]);

            // se o usuário digitar um valor inválido, o programa irá mandar uma mensagem
            // para ele, e o programa irá encerrar
        } catch (Exception e) {
            System.out.println("Valor digitado incorreto digite um valor correto");
        }

        scan.close();
    }

}
