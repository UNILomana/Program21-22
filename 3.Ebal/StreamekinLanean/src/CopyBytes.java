/**
 *
 * @author lomana.markel
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;
        
        /*xanadu fitxategia zabaldu eta outagain-en gorde*/
        try {
            in = new FileInputStream("./testuak/outagain.txt");    //edozein motatako artxiboak
            out = new FileOutputStream("./testuak/copia2.jpg");    //aldatu ahal da mota tipoa ere 
            int c;
            
            /*loop-a Byte guztiak ateratzeko*/
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}