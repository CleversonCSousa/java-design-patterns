public class FiltroCor extends FiltroImagem {
    public FiltroCor(FiltroImagem proximo) {
        super(proximo);
    }

    protected void aplicarFiltro(Imagem imagem) {
        imagem.setDados(imagem.getDados() + " -> correção de cor");
    }
}