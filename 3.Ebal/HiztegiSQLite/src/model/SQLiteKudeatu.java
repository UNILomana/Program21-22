package model;


/**
 *
 * @author lomana.markel
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteKudeatu {

    /**
     * Connect to a sample database
     */
    private static final String DB = "db/Hiztegia.db";

    /*Taula JAVA bidez sortzeko*/
    public static void createNewTable() {
        // SQLite connection string
        String url = "jdbc:sqlite:" + DB;

        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS warehouses (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	name text NOT NULL,\n"
                + "	capacity real\n"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * SQL Datu Basearekin konektatzeko
     * @return conn; 
     */
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:" + DB;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    /**
     * Taulako datuak imprimatuko ditu
     */
    public void terminoakImprimatu() {
        String sql = "SELECT * FROM Terminoak";
        int count=0;

        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            System.out.println(DB + " taulako datuak:");
            System.out.println("===================================");
            while (rs.next()) {
                System.out.print(rs.getInt("id") + "\t"
                        + rs.getString("euskaraz") + "\t\t"
                        + rs.getString("gazteleraz") + "\n");
                count++;
            }
            System.out.println("-----------------------------------");
            System.out.println("Guztira " + count + " erregistro");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Baloreak pasatuz erregistro berri bat sortzen du 
     * @param euskaraz
     * @param gazteleraz 
     */
    public void terminoakSartu(String euskaraz, String gazteleraz) {
        String sql = "INSERT INTO Terminoak (euskaraz,gazteleraz) VALUES(?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, euskaraz);
            pstmt.setString(2, gazteleraz);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Baloreak pasatuz sortutako erregistro bat aldatzen du
     * @param id
     * @param euskaraz
     * @param gazteleraz 
     */
    public void terminoakAldatu(int id, String euskaraz, String gazteleraz) {
        String sql = "UPDATE Terminoak SET euskaraz = ? , "
                + "gazteleraz = ? "
                + "WHERE id = ?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setString(1, euskaraz);
            pstmt.setString(2, gazteleraz);
            pstmt.setInt(3, id);
            // update 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * ID Balorearekin erregistro hori borratzen du
     * @param id 
     */
    public void terminoakBorratu(int id) {
        String sql = "DELETE FROM Terminoak WHERE id = ?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setInt(1, id);
            // execute the delete statement
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
