package Desafio1;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Encerrar");
            System.out.println("Digite:");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Quanto deseja depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo+=deposito;

                    System.out.println("Seu saldo atual é " + saldo);
                    break;

                case 2:
                    System.out.println("Saldo Disponível:" +saldo);
                    System.out.println("Quanto deseja sacar?");
                    double saque = scanner.nextDouble();

                    if (saque <= saldo){
                        saldo-=saque;

                    }

                    else {
                        System.out.println("Saldo insuficiente para saque!!");
                    }

                    break;
                case 3:
                    System.out.println("Saldo atual:" +saldo);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}