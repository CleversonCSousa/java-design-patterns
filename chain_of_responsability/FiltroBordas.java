public class FiltroBordas extends FiltroImagem {
    public FiltroBordas(FiltroImagem proximo) {
        super(proximo);
    }

    protected void aplicarFiltro(Imagem imagem) {
        imagem.setDados(imagem.getDados() + " -> detecção de bordas");
    }
}