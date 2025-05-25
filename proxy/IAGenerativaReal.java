public class IAGenerativaReal implements IAGenerativaInterface {
    public String gerarResposta(String prompt) {
        return "Resposta gerada para: \"" + prompt + "\"";
    }
}