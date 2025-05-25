public class EmailNotificacao implements Notificacao {
    public void enviar(String mensagem) {
        System.out.println("Enviando E-MAIL: " + mensagem);
    }
}
