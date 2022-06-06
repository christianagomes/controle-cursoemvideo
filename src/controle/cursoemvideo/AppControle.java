package controle.cursoemvideo;

public class AppControle {
    public static void main(String[] args) {

        ControleRemoto controleRemoto = new ControleRemoto();

        controleRemoto.maisVolume();
        controleRemoto.ligarMudo();

        controleRemoto.abrirMenu();
        controleRemoto.fecharMenu();
    }
}
