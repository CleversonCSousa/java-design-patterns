public class Main {
    public static void main(String[] args) {
        String prompt = "Faça um resumo do filme Batman O Cavaleiro das Trevas";
        IAGenerativa ia = new IAGenerativa();
        String resposta = ia.gerarResposta(prompt);
        System.out.println(resposta);
    }
}