import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner bind = new Scanner(System.in);


        Conta conta = new Conta(1001, "Amanda", 500.0);

        ContaPJ contapj = new ContaPJ(1002, "UNIFIL", 0.0, 1000.0);

            //UPCASTING > quando temos algo da subclasse para a superclasse
        Conta conta1 = contapj;
            //conta1.getSaldo();

        Conta conta2 = new ContaPJ(1003, "Bobs", 0.0, 500.0);
        Conta conta3 = new ContaPoupanca(1004, "Cida", 0.0, 0.02);

        //Downcasting
        Conta conta4 = (ContaPJ) conta2;

       /* System.out.println("Infome numero da conta:");
        int numero = bind.nextInt();

        System.out.println("Informe o titular da conta:");
        String nome = bind.next();

        System.out.println("Possui deposito inicial? (s/n)");
        char resposta = bind.next().charAt(0);

        if(resposta == 's' ||  resposta == 'S'){

            System.out.println("qual valor do deposito: ");
            double depositoIncial = bind.nextDouble();
            conta = new Conta(numero, nome, depositoIncial);
        }else{

            conta = new Conta(numero, nome);


        */
        System.out.println("Dados da conta: \n" + conta);

        System.out.println("Informe o valor de deposito: ");
        double valorDeposito = bind.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println();
        System.out.println("Dados da Conta: \n" + conta);
        System.out.println();
        System.out.println("Informe o valor da Saque");
        double valorSaque = bind.nextDouble();
        conta.saque(valorSaque);
        System.out.println();

        System.out.println("Dados Atualizados: \n" + conta);



    }

}