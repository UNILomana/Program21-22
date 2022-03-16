package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lomana.markel
 */
public class Model {

    private final String DB = "db/Hiztegia.db";

    /**
     * SQL Datu Basearekin konektatzeko
     *
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
    public static Connection connect2() {
        // SQLite connection string
        String url = "jdbc:sqlite:./db/Hiztegia.db";
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
        int count = 0;

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
     * Balorea pasatuz termino berri bat sortzen du
     *
     * @param t
     */
    public void terminoaSartu(Terminoa t) {

        String sql = "INSERT INTO Terminoak (euskaraz,gazteleraz) VALUES(?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, t.getEuskaraz());
            pstmt.setString(2, t.getGazteleraz());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Baloreak pasatuz erregistro berri bat sortzen du, terminorik gabe
     *
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
     *
     * @param id
     * @param euskaraz
     * @param gazteleraz
     */
    public void terminoakAldatu(Terminoa t) {
        String sql = "UPDATE Terminoak SET euskaraz = ? , "
                + "gazteleraz = ? "
                + "WHERE id = ?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setString(1, t.getEuskaraz());
            pstmt.setString(2, t.getGazteleraz());
            pstmt.setInt(3, t.getId());
            // update 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * ID Balorearekin erregistro hori borratzen du
     *
     * @param id
     */
    public void terminoakBorratu(Terminoa t) {
        String sql = "DELETE FROM Terminoak WHERE id = ?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setInt(1, t.getId());
            // execute the delete statement
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Terminoa> erregistroakArrayList() {
        ArrayList<Terminoa> erreTerminoak = new ArrayList<>();
        String sql = "SELECT * FROM Terminoak";
        
        try (Connection conn = connect2();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Terminoa t1 = new Terminoa(rs.getInt("id"), rs.getString("euskaraz"), rs.getString("gazteleraz"));
                erreTerminoak.add(t1);
                
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return erreTerminoak;
    }
}
