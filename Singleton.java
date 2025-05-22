public class Singleton {
    private static Singleton instance = null;
    // Guarda a única instância da classe (inicialmente null, pois não foi criada ainda)

    private Singleton() {
        // Impede a criação direta (com new) de instâncias fora da da classe
    }

    // Caso já exista uma instância devolva-a, senão instancie uma
    public static Singleton instance() {
        if(instance == null) {
            // Se não existe uma instẫncia, crie-a
            instance = new Singleton();
        }

        // Retorna a instância única já criada
        return instance;
    }
}