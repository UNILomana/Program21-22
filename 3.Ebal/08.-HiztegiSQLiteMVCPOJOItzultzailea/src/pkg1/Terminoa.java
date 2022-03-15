package pkg1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.utils.Objects;

/**
 *
 * @author lomana.markel
 */
public class Terminoa {
    
    private final String DB = "db/Hiztegia.db";
    private int id;
    private String  euskaraz;
    private String  gazteleraz;

    public Terminoa(int id, String euskaraz, String gazteleraz) {
        this.id = id;
        this.euskaraz = euskaraz;
        this.gazteleraz = gazteleraz;
    }

    public int getId() {
        return id;
    }

    public String getEuskaraz() {
        return euskaraz;
    }

    public String getGazteleraz() {
        return gazteleraz;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEuskaraz(String euskaraz) {
        this.euskaraz = euskaraz;
    }

    public void setGazteleraz(String gazteleraz) {
        this.gazteleraz = gazteleraz;
    }
    
    
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
    
    public int terminoaGehitu(Terminoa t){
    
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
    
}
