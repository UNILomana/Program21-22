package pkg1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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

    private final String DB = "./Terminoak.txt";

    /**
     * Fitxategia irakurri eta String batera pasa
     *
     * @return
     * @throws IOException
     */
    public String terminoakJaso() throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        String strInput = inputStream.readLine();
        String edukia = null;

        try {
            inputStream = new BufferedReader(new FileReader(DB));
            outputStream = new PrintWriter(new FileWriter("./testuak/linesOutput.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                String[] osagaiak = strInput.split(" | ");
                
                for (int i=0;i< osagaiak.length;i++){
                    edukia = osagaiak[i].toString();
                }
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
        
        return edukia;
    }

    public void terminoakImprimatu() throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        String strInput = inputStream.readLine();

        
        while (rs.next()) {
                System.out.printf("%d %10s %10s\n", rs.getInt("id"), rs.getString("euskaraz"), rs.getString("gazteleraz"));
                count++;
            }
        
        
        try {
            inputStream = new BufferedReader(new FileReader(DB));
            outputStream = new PrintWriter(new FileWriter("./testuak/linesOutput.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                String[] osagaiak = strInput.split(" | ");
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
        
        
        
        
    }

   /* public void terminoakGorde(String edukia) throws IOException {
      PrintWriter gorde = null;
     
        try { 
            gorde = new PrintWriter(new FileWriter("./testuak/lineOutput.txt"));
           
            String l;
            while ((l = inputStream.readLine()) != null) {
                edukia.write;
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }*/
}
