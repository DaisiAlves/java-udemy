package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Conta {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        Dados dados;

        System.out.print("Digite o número da conta: ");
        int conta = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome do titular: ");
        String name = sc.nextLine();
        System.out.print("Deseja realizar um depósito incial? s/n ");
        char resposta = sc.next().charAt(0);


        if (resposta == 's') {
            System.out.print("Digite o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            dados = new Dados(conta,name, depositoInicial);
        }
        else {
            dados = new Dados(conta, name);
        }

        
        System.out.println();
        System.out.println("Dados da conta:" + dados);
        System.out.println();

        System.out.print("Insira o valor do depósito: ");
        double deposito = sc.nextDouble();
        dados.addSaldo(deposito);

        System.out.println("Dados atualizados:" + dados);
        System.out.println();

        System.out.print("Insira o valor do saque: ");
        double saque = sc.nextDouble();
        dados.subtraiSaldo(saque);

        System.out.println("Dados atualizados:" + dados);
        

        sc.close();
    }
}

