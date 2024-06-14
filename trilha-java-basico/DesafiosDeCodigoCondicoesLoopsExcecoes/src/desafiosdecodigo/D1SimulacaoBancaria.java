package desafiosdecodigo;

import java.util.Scanner;

public class D1SimulacaoBancaria {
    // Operações Bancárias Simples com Switch
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        while (true) {
            int opcao = scanner.nextInt();
            switch(opcao) {
                case 1:
                    double valorParaDepositar = scanner.nextDouble();
                    if(valorParaDepositar > 0) {
                        saldo += valorParaDepositar;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("O valor a ser depositado precisa ser maior que 0");
                    }
                    break;
                case 2:
                    double valorParaSacar = scanner.nextDouble();
                    if(valorParaSacar >= saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorParaSacar;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}