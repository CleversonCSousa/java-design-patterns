public class Sistema {
    public void registrarUsuario(String tipo) {
        Notificacao n = NotificacaoFactory.criar(tipo);
        n.enviar("Bem-vindo!");
    }
    public void recuperarSenha(String tipo) {
        Notificacao n = NotificacaoFactory.criar(tipo);
        n.enviar("Link para redefinir sua senha.");
    }
    public void enviarPromocao(String tipo) {
        Notificacao n = NotificacaoFactory.criar(tipo);
        n.enviar("Confira nossas promoções!");
    }
}