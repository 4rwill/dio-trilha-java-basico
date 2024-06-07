package Desafio4;
import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();

        double limiteChequeEspecial = 500;

        if (saque > saldo && saque-saldo < limiteChequeEspecial) {
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        }

        else if(saque<= saldo && saldo-saque>limiteChequeEspecial){
            System.out.println("Transacao realizada com sucesso.");
        }

        else {
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}