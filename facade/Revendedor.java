public class Revendedor{
    public void realizarVenda(String produtoId, String usuarioEmail) {
        VendaFacade venda= new CompraFacade();
        venda.vender("Produto123", "cliente@exemplo.com");
    }
}
