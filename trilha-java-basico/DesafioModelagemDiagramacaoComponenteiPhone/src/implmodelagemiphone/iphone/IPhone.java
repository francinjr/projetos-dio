package implmodelagemiphone.iphone;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public IPhone() {
    }

    // Métodos de ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando a música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("A música " + musica + " foi selecionada");
    }

    // Métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    // Métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página correspondente a URL: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Uma nova aba foi adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

}
