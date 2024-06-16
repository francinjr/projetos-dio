package implmodelagemiphone;

import implmodelagemiphone.iphone.IPhone;


public class App {
    /*  A implementação referente ao diagrama de classes que modelei é a do presente arquivo "App.java" e dos outros arquivos do
        pacote atual "implmodelagemiphone".
        E o diagrama de classes que modelei está como uma imagem .jpeg "ModelagemIPhone.jpeg", nesse projeto.
        Obs: O pacote "iphoneupgrade" possui uma implementação das funcionalidades propostas, só que de uma forma mais avançada.
        A implementação do pacote "iphoneupgrade" não é referente ao diagrama de classes que modelei.
    */

    public static void main(String[] args) throws Exception {
        IPhone iPhone = new IPhone();
        // Simulando as funcionalidades do iPhone

        // Utilizando o reprodutor de música
        iPhone.selecionarMusica("Change The World");
        iPhone.tocar();
        iPhone.pausar();

        // Utilizando o aparelho telefônico
        iPhone.ligar("99 99999-9999");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        // Utilizando o navegador na internet
        iPhone.exibirPagina("https://www.google.com/");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}
