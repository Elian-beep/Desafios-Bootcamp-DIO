package Navegador;

import java.util.List;

public class Navegador {
    private Pagina paginaAtual;
    private List<Aba> abas;
    private Aba abaAtual;

    public Pagina exibirPagina(){
        System.out.println("Lendo script em "+paginaAtual.url);
        return paginaAtual;
    }

    public void adicionarNovaAba(Pagina pagina){
        Aba novaAba = new Aba(pagina);
        paginaAtual = novaAba.pagina;
        abas.add(novaAba);
    }

    public void atualizarPagina(){
        System.out.println("Lendo script em "+paginaAtual.url);
    }
}
