public class Main {
    public static Database database;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        database = new Database();
        database.deposit(987654321, 20, 1); // DEBUG
        // ACCOUNT TYPES
        // 0 = CHEQUING
        // 1 = SAVINGS

    }
}
