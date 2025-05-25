abstract class FiltroImagem {
    protected FiltroImagem proximo = null;

    public FiltroImagem(FiltroImagem proximo) {
        this.proximo = proximo;
    }

    public void processar(Imagem imagem) {
        aplicarFiltro(imagem);
        if (proximo != null) {
            proximo.processar(imagem);
        }
    }

    protected abstract void aplicarFiltro(Imagem imagem);
}