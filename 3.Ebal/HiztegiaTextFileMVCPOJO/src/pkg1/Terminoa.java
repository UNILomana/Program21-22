package pkg1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

/**
 *
 * @author lomana.markel
 */
public class Terminoa {
    
    private final String DB = "db/Hiztegia.db";
    private int id;
    private String  euskaraz;
    private String  gazteleraz;

    public Terminoa(String euskaraz, String gazteleraz) {
        
        this.euskaraz = euskaraz;
        this.gazteleraz = gazteleraz;
    }
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

    @Override
    public String toString() {
        return "Terminoa{ id=" + id + ", euskaraz=" + euskaraz + ", gazteleraz=" + gazteleraz + '}';
    }
    
    
    
}
