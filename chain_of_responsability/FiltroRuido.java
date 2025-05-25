public class FiltroRuido extends FiltroImagem {
    public FiltroRuido(FiltroImagem proximo) {
        super(proximo);
    }

    protected void aplicarFiltro(Imagem imagem) {
        imagem.setDados(imagem.getDados() + " -> redução de ruído");
    }
}