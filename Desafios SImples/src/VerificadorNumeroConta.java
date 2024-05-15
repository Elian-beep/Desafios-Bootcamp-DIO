import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String numero = scanner.nextLine();
            verificarNumeroConta(numero);
        }
        catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    private static void verificarNumeroConta(String numeroConta) {
        if(numeroConta.length() != 8){
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }else{
            System.out.println("Numero de conta valido.");
        }
    }
}