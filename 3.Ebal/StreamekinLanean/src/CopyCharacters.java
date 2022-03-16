/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lomana.markel
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {
 
        FileReader inputStream = null; //Aldatzen den gauza bakarra izena
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("./testuak/xanadu.txt"); 
            outputStream = new FileWriter("./testuak/characteroutput.txt");   

            int c;
            while ((c = inputStream.read()) != -1) {
                
                outputStream.write(c);
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
}