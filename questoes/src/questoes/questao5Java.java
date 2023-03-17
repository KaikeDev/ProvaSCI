package questoes;

import java.util.Scanner;

public class questao5Java {
    public static void main(String[] args) throws Exception {

        // criando a classe scanner para a inserções de valores
        Scanner scan = new Scanner(System.in);

        // utilizando o try catch para tratar um possível erro do usuário
        try {

            // criando uma matriz que vai armarzenar a quantidade de alunos(repesentado pelo 3) e notas(representado pelo 4)
            double[][] notasAlunos = new double[3][4];

            //criando um vetor que irá armazernar a quantidade de alunos
            String alunos[] = new String[3];

            //criando um laço for para o usuário digitar os nomes dos 3 alunos
            for (int a = 0; a < 3; a++) {

                //mensagem para o usuário digitar o nome dos alunos
                System.out.println("Digite o nome do aluno aluno " + (a + 1));

                //usuário digitará o nome dos alunos
                alunos[a] = scan.nextLine();
            }

            //criando o laço for para que repita 3 vezes o laço
            for (int a = 0; a < 3; a++) {
                //criando outro laço for para que o usuário digite as 4 notas dos alunos
                for (int n = 0; n < 4; n++) {

                    //aqui o usuário aparece a mensagem para que o usuário digite as notas dos alunos
                    System.out.println("Digite a nota: " + (n + 1) + " do aluno: " + alunos[a]);
                    //usuário insere as 4 notas de cada aluno
                    notasAlunos[a][n] = scan.nextDouble();

                    //laço while para alertar o usuário de que a nota está incorreta
                    while(notasAlunos[a][n] >10 || notasAlunos[a][n] < 0){
                        //mensagem ao usuário informando que a nota deve ser entre 0 e 10
                        System.out.println("Nota inválida, nota deve ser entre 0 e 10");

                        //usuário deve inserir outra nota
                        notasAlunos[a][n] = scan.nextDouble();
                    }
                }
            }

            //criando a variável que irá armazernar a maior media
            double maiorMedia = 0;

            //criando a variável que irá armazernar o nome do aluno que possui a maior media
            String nomeMaiorMedia = "";

             //criando a variável que irá armazernar a menor media
            double menorMedia = 10;

             //criando a variável que irá armazernar o nome do aluno que possui a menor media
            String nomeMenorMedia = "";

            // criando um laço for que irá repetir 3 vezes, para calcular a média dos 3 alunos
            for (int a = 0; a < 3; a++) {
                //criando uma variável que irá armazernar a media dos alunos
                double media = 0;

                //criando um laço for que irá se repetir 4 vezes para calcular a média das 4 notas
                for (int n = 0; n < 4; n++) {
                    //a variável "media" irá somar as 4 notas dos 3 alunos
                    media += notasAlunos[a][n];
                }

                //a variável media será dividida por 4, que é a quantidade de notas que foram inseridas
                media = media / 4;

                //mensagem ao usuário mostrando o nome e a media de cada aluno
                System.out.println(alunos[a] + " teve média " + media);

                //condição que irá identificar qual a maior media dentro os 3 alunos
                if (media > maiorMedia) {
                    //a variável maiorMedia irá receber o valor da variável media
                    maiorMedia = media;

                    //a variável nomeMaiorMedia irá receber o nome do aluno que possui a maior média
                    nomeMaiorMedia = alunos[a];
                }

                //condição que irá identificar qual a menor media dentro os 3 alunos
                if (media < menorMedia) {

                    //variável menorMedia irá receber o valor da variável media
                    menorMedia = media;

                    //a variável nomeMenorMedia irá receber o nome do aluno que possui a menor média
                    nomeMenorMedia = alunos[a];
                }
            }

            //mensagem ao usuário mostrando qual aluno teve a maior media
            System.out.println("O aluno com a maior média foi o aluno " + nomeMaiorMedia + " com média " + maiorMedia);

            
            //mensagem ao usuário mostrando qual aluno teve a menor media
            System.out.println("O aluno com a menor média foi o aluno " + nomeMenorMedia + " com média " + menorMedia);

            // se o usuário digitar um valor inválido, o programa irá mandar uma mensagem
            // para ele, e o programa irá encerrar
        } catch (Exception e) {
            System.out.println("Valor digitado incorreto digite um valor correto");
        }

        scan.close();
    }
}
