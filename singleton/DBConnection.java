public class DBConnection {
    private static DBConnection uniqueDB;
    private DBConnection() {
        System.out.println("Conexão criada.");
    }
    public static DBConnection getDBConnection() {
        if (uniqueDB == null)
            uniqueDB = new DBConnection();
        return uniqueDB;
    }
    public void connect() {
        System.out.println("Conectando ao banco de dados...");
    }
}