package reprodutorMusical;

import aparelhoTelefonico.CorreioVoz;

import java.util.List;

public class ReprodutorMusical {
    private String nome = "Apple Music";
    private List<Musica> musicas;
    private Musica musicaAtual;

    public void tocar(){
        System.out.println("Tocando "+musicaAtual.getNome()+" do(a) "+musicaAtual.getArtista());
    }

    public void pausar(){
        System.out.println("Pausando "+musicaAtual.getNome());
    }

    public Musica selecionarMusica(String nome){
        Musica musicaEncontrada = new Musica();
        for (Musica musica : musicas) {
            if (musica.getNome().equals(nome)) {
                musicaEncontrada = musica;
                break;
            }
        }
        musicaAtual = musicaEncontrada;
        return musicaEncontrada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public Musica getMusicaAtual() {
        return musicaAtual;
    }

    public void setMusicaAtual(Musica musicaAtual) {
        this.musicaAtual = musicaAtual;
    }
}
