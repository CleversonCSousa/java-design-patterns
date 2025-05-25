public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.registrarUsuario("email");
        sistema.recuperarSenha("email");
        sistema.enviarPromocao("email");
        sistema.registrarUsuario("sms");
        sistema.recuperarSenha("sms");
        sistema.enviarPromocao("sms");
        sistema.registrarUsuario("push");
        sistema.recuperarSenha("push");
        sistema.enviarPromocao("push");
    }
}