public class IAGenerativa{
    private final IAGenerativaReal iaReal = new IAGenerativaReal();
    private int chamadas = 0;
    private final int LIMITE = 50;
    public String gerarResposta(String prompt) {
        if (chamadas >= LIMITE)
            return "[ERRO] Limite global de 50 chamadas atingido.";
        chamadas++;
        return iaReal.gerarResposta(prompt);
    }
    public void resetContador(){ 
        chamadas = 0;
    }
}