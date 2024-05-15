package aparelhoTelefonico;

import java.util.List;

public class AparelhoTelefonico {
    private int numero;
    private double saldo;
    private List<CorreioVoz> mensagensVoz;

    public void ligar(int numero){
        System.out.println("Ligando para o número "+ numero);
    }

    public void atender(int numero){
        System.out.println("Recebendo chamada de "+ numero);
    }

    public void iniciarCorreioVoz(){
        for (CorreioVoz correioVoz : mensagensVoz){
            System.out.println(correioVoz.numero+": "+correioVoz.mensagem);
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
