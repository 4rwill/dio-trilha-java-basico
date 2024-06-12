package diagrama;

import diagrama.AparelhoTelefonico;
import diagrama.NavegadorInternet;
import diagrama.ReprodutorMusical;


public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    //AparelhoTelefonico
    public void ligar(String numero) {
    }

    public void atender() {
    }

    public void iniciarCorreioVoz() {
    }

    //NavegadorInternet
    public void exibirPagina(String url) {
    }

    public void adicionarNovaAba() {
    }

    public void atualizarPagina() {
    }

    //ReprodutorMusical
    public void tocar() {
    }

    public void pausar() {
    }

    public void selecionarMusica(String musica) {
    }
}