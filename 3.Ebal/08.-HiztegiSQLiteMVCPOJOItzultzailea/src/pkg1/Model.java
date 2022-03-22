package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lomana.markel
 */
public class Model {
    private final String DB = "db/Hiztegia.db";
    
    /**
     * SQL Datu Basearekin konektatzeko
     * @return conn; 
     */
    public Connection connect() {
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
                System.out.printf("%d %10s %10s\n", rs.getInt("id"), rs.getString("euskaraz"), rs.getString("gazteleraz"));
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
     * Baloreak pasatuz erregistro berri bat sortzen du 
     * @param euskaraz
     * @param gazteleraz 
     */
    public void terminoaSartuObjektuGabe(String euskaraz, String gazteleraz) {
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
