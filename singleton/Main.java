public class Main {
    public static void main(String[] args) {
        DBConnection conn1 = DBConnection.getDBConnection();
        conn1.connect();
        DBConnection conn2 = DBConnection.getDBConnection();
        conn2.connect();

        // Para conferir se são a mesma instância
        System.err.println(conn1 == conn2);
    }
}