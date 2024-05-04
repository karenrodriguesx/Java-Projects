package application;

import entities.*;

import java.util.List;

class IPhone implements AparelhoTelefonico, Fotos, Mensagem, Navegador, ReprodutorMusical, Telefone {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.ligar();
        iphone.desbloquear();
        iphone.enviarMensagem("Mensagem");
        iphone.aumentarVolume();
        iphone.fazerLigacao("61999999999");
        iphone.tirarFoto();
        iphone.pesquisar("Celulares");
        iphone.abrirPagina("site.com");
        iphone.pesquisarMusica("Justin Bieber");
        iphone.reproduzirMusica("Sorry");
        iphone.desligar();
    }

    @Override
    public void ligar() {
        System.out.println("Ligar");
    }

    @Override
    public void desligar() {
        System.out.println("Desligar");
    }

    @Override
    public void desbloquear() {
        System.out.println("Desbloquear");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentar volume");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuir volume");
    }

    @Override
    public void tirarFoto() {
        System.out.println("Tirar foto");
    }

    @Override
    public void visualizarFotos(List<String> fotos) {
        System.out.println("Visualizar fotos");
    }

    @Override
    public void pesquisar(String termoPesquisa) {
        System.out.println("Pesquisar");
    }

    @Override
    public void abrirPagina(String pagina) {
        System.out.println("Abrir Pagina");
    }

    @Override
    public void pesquisarMusica(String musica) {
        System.out.println("Pesquisar Musica");
    }

    @Override
    public void reproduzirMusica(String musicaSelecionada) {
        System.out.println("Reproduzir Musica");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausar Musica");
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Fazer Ligacao");
    }

    @Override
    public void atenderLigacao(String pessoa, String numero) {
        System.out.println("Atender Ligacao");
    }

    @Override
    public void adicionarContato(String nome, String numero) {
        System.out.println("Adicionar Contato");
    }

    @Override
    public void removerContato(String pessoa) {
        System.out.println("Remover Contato");
    }

    @Override
    public void colocarChamadaEmEspera() {
        System.out.println("Colocar Chamada Em Espera");
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviar Mensagem");
    }

    @Override
    public void receberMensagem(String mensagemRecebida) {
        System.out.println("Receber Mensagem");
    }
}