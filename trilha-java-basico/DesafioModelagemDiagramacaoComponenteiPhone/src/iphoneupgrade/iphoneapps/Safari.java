package iphoneupgrade.iphoneapps;

import iphoneupgrade.NavegadorInternet;

public class Safari implements NavegadorInternet {
    private String pagina;

    public Safari() {
    }

    @Override
    public void exibirPagina(String url) {
        setPagina(url);
        System.out.println("Exibindo a página correspondente a URL: " + this.pagina);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Uma nova aba foi adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("A página " + this.pagina + " foi atualizada");
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }
}
