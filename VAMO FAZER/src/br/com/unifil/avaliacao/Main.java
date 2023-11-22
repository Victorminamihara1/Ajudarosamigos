package br.com.unifil.avaliacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner bind = new Scanner(System.in);

        // I - Instanciação

        Produto produto = new Produto();

        ProdutoImportado importado = new ProdutoImportado();

        ProdutoUsado produtoUsado = new ProdutoUsado();


        System.out.println("Informe o tipo do porduto");

        System.out.println("1-Comum | 2-Importado | 3-Usado:");

        int tipo = bind.nextInt();

        if(tipo == 1){

            System.out.println("Informe o nome do produto: \n");
            String nome = bind.next();
            System.out.println("Informe o preco do produto \n");
            double preco = bind.nextDouble();
            System.out.println("Informações do produto: \n" + produto);
            System.out.println();
            System.out.println("Deseja adicionar mais produtos? (S/N)");
            char resposta = bind.next().charAt(0);

            if(resposta == 's' || resposta == 'S'){


            }else{

                System.out.println(" Fim do Sistema");

            }

        }else if(tipo == 2){

            System.out.println("Informe o nome do produto: \n");
            String nome = bind.next();
            System.out.println("Informe o preco do produto \n");
            double preco = bind.nextDouble();
            System.out.println("Infomre a taxa do produto: \n");
            double taxaAlfandega = bind.nextDouble();
            System.out.println("Informações do produto: \n" + importado);
            System.out.println();
            System.out.println("Deseja adicionar mais produtos? (S/N)");
            char resposta = bind.next().charAt(0);

            if(resposta == 's' || resposta == 'S'){


            }else{

                System.out.println(" Fim do Sistema");

            }



        }else if(tipo == 3){

            System.out.println("Informe o nome do produto: \n");
            String nome = bind.next();
            System.out.println("Informe o preco do produto: \n");
            double preco = bind.nextDouble();
            System.out.println("Informe a data do produto: \n");
            String data = bind.next();
            System.out.println("Informações do produto: \n" + produtoUsado);
            System.out.println();
            System.out.println("Deseja adicionar mais produtos? (S/N)");
            char resposta = bind.next().charAt(0);

            if(resposta == 's' || resposta == 'S'){

                System.out.println(" ");

            }else{

                System.out.println(" Fim do Sistema");

            }
        }
    }
}
