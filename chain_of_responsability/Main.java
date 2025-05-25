public class Main {
    public static void main(String[] args) {
        FiltroImagem pipeline1 = new FiltroCor(
        new FiltroRuido(
        new FiltroBordas(
        new FiltroCompressao(null))));
        Imagem imagem1 = new Imagem("imagem_crua_1");
        pipeline1.processar(imagem1);
        System.out.println("Resultado do pipeline 1:\n" + imagem1.getDados());
        FiltroImagem pipeline2 = new FiltroRuido(
        new FiltroCompressao(
        new FiltroCor(null)));
        Imagem imagem2 = new Imagem("imagem_crua_2");
        pipeline2.processar(imagem2);
        System.out.println("\nResultado do pipeline 2:\n" + imagem2.getDados());
    }
}
