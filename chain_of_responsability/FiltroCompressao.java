public class FiltroCompressao extends FiltroImagem {
    public FiltroCompressao(FiltroImagem proximo) {
        super(proximo);
    }

    protected void aplicarFiltro(Imagem imagem) {
        imagem.setDados(imagem.getDados() + " -> compressão aplicada");
    }
}