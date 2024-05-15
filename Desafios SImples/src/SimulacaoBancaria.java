import java.io.IOException;
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 0;

        boolean loop = true;
        while (loop) {
            int opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: "+ saldo);
                    break;
                case 2:
                    double saque = scanner.nextDouble();
                    if(saque > saldo){
                        System.out.println("Saldo insuficiente.");
                        break;
                    }
                    saldo -= saque;
                    System.out.println("Saldo atual: "+ saldo);
                    break;
                case 3:
                    System.out.println("Saldo atual: "+saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    loop = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}