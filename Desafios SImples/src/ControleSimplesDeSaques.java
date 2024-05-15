import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();


        double i;
        for(i=0; i<limiteDiario; i++){
            double saque = scanner.nextDouble();
            if(saque != 0){
                if(saque > limiteDiario){
                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    break;
                }else{
                    i = limiteDiario - saque;
                    System.out.println("Saque realizado. Limite restante: " + i);
                }
            }else{
                System.out.println("Transacoes encerradas.");
                break;
            }
        }

    }
}
