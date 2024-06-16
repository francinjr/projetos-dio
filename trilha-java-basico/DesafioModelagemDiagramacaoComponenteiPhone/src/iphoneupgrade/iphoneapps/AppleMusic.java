package iphoneupgrade.iphoneapps;

import iphoneupgrade.ReprodutorMusical;

public class AppleMusic implements ReprodutorMusical {
    private String musicaSelecionada;

    @Override
    public void tocar() {
        if (musicaSelecionada != null) {
            System.out.println("Tocando a música " + this.musicaSelecionada);
        }
    }

    @Override
    public void pausar() {
        if (musicaSelecionada != null) {
            System.out.println("A música " + this.musicaSelecionada + " foi pausada");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        setMusicaSelecionada(musica);
        System.out.println("A música " + getMusicaSelecionada() + " foi selecionada");
    }

    public String getMusicaSelecionada() {
        return musicaSelecionada;
    }

    public void setMusicaSelecionada(String musicaSelecionada) {
        this.musicaSelecionada = musicaSelecionada;
    }

}
