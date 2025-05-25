public class NotificacaoFactory {
    public static Notificacao criar(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "email" -> new EmailNotificacao();
            case "sms" -> new SmsNotificacao();
            case "push" -> new PushNotificacao();
            default -> throw new IllegalArgumentException("Tipo de notificação inválido: " + tipo);
    };
    }
}