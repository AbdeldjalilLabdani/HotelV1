package hotel.databaseOperation;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Classe de connexion à SQLite
 */
public class DataBaseConnection {
    static String url = "jdbc:sqlite:/home/jalil/hotel.db"; // Chemin absolu vers la base de données

    public static Connection connectTODB() {
        try {
            return DriverManager.getConnection(url);
        } catch (Exception e) {
            System.err.println("Connection error: " + e.getMessage());
            return null;
        }
    }
}
