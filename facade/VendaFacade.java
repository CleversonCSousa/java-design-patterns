public class VendaFacade {
    private EstoqueService estoque = new EstoqueService();
    private PagamentoService pagamento = new PagamentoService();
    private NotaFiscalService notaFiscal = new NotaFiscalService();
    private EmailService email = new EmailService();
    
    public void vender(String produtoId, String usuarioEmail) {
        if (!estoque.temEstoque(produtoId)) {
        throw new RuntimeException("Produto fora de estoque");
        }
        pagamento.processarPagamento(produtoId);
        notaFiscal.gerarNota(produtoId);
        email.enviarConfirmacao(usuarioEmail);
    }
}