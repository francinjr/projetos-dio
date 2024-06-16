package iphoneupgrade.main;
import iphoneupgrade.AparelhoTelefonico;
import iphoneupgrade.IPhone;
import iphoneupgrade.NavegadorInternet;
import iphoneupgrade.ReprodutorMusical;
import iphoneupgrade.iphoneapps.AppleMusic;
import iphoneupgrade.iphoneapps.Safari;
import iphoneupgrade.iphoneapps.Telefone;

public class IPhoneUpgrade {
    /*  Obs: Essa não é a implementação referente a Modelagem e Diagramação de um Componente iPhone. É uma implementação extra
        usando ainda mais conceitos de orientação a objetos.
        A implementaçao referente ao diagrama de classes que modelei está no pacote "implmodelagemiphone".
        E o diagrama de classes que modelei está como uma imagem .jpeg "ModelagemIPhone.jpeg", nesse projeto.
    */
    public static void main(String[] args) throws Exception {
        IPhone iPhone = new IPhone();

        ReprodutorMusical reprodutorMusical = new AppleMusic();
        iPhone.setReprodutorMusical(reprodutorMusical);

        AparelhoTelefonico aparelhoTelefonico = new Telefone();
        iPhone.setAparelhoTelefonico(aparelhoTelefonico);

        NavegadorInternet navegadorInternet = new Safari();
        iPhone.setNavegadorInternet(navegadorInternet);

        // Simulando as funcionalidades do iPhone

        // Utilizando o reprodutor de música
        iPhone.getReprodutorMusical().selecionarMusica("Change The World");
        iPhone.getReprodutorMusical().tocar();
        iPhone.getReprodutorMusical().pausar();

        // Utilizando o aparelho telefônico
        iPhone.getAparelhoTelefonico().ligar("99 99999-9999");
        iPhone.getAparelhoTelefonico().atender();
        iPhone.getAparelhoTelefonico().iniciarCorreioVoz();

        // Utilizando o navegador na internet
        iPhone.getNavegadorInternet().exibirPagina("https://www.google.com/");
        iPhone.getNavegadorInternet().adicionarNovaAba();
        iPhone.getNavegadorInternet().atualizarPagina();
    }
}
