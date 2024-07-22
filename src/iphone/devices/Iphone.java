package iphone.devices;

import iphone.interfaces.AparelhoMusical;
import iphone.interfaces.AparelhoTelefonico;
import iphone.interfaces.NavegadorDeInternet;

public class Iphone implements AparelhoMusical, NavegadorDeInternet, AparelhoTelefonico {

    //#region Implementação Musical
    @Override
    public void pausar() {
        System.out.println("Pausando a musica...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Musica...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }
    //#endregion

    //#region Implementação Navegador de Internet
    @Override
    public void adicionarNovaAba() {
      System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a pagina...");
    }
    //#endregion

    //#region Implementação Aparelho Telefonico
    @Override
    public void atender() {
       System.out.println("Atendendo a ligação....");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }
    //#endregion
}
