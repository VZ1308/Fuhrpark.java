import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection { // Klasse beginnt hier
    private static final String URL = "jdbc:mysql://localhost:3306/fahrzeugverwaltung";
    private static final String USER = "root"; // Standardbenutzername von XAMPP
    private static final String PASSWORD = ""; // Standard ist kein Passwort

    // Methode zum Herstellen der Verbindung zur Datenbank
    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Verbindung zur Datenbank erfolgreich!");
        } catch (SQLException e) {
            System.out.println("Verbindung zur Datenbank fehlgeschlagen: " + e.getMessage());
        }
        return conn;
    }
} // Klasse endet hier
