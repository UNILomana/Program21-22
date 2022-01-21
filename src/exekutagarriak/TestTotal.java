package exekutagarriak;

import model.*;
import exekutagarriak.*;
import java.util.Scanner;
import panelGUI.Panela;

/**
 * Proba guztien Menu bat da, bertan model bakoitzaren metodoak erabiliz
 * bistaratuko da informazioa.
 * @author lomana.markel
 */
public class TestTotal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aukera = 0;

        do {
            System.out.println();
            System.out.println("MENUA");
            System.out.println("====================================");
            System.out.println("1.- Marrazkiak");
            System.out.println("2.- Zirkulu kalkuluak");
            System.out.println("3.- Triangelua kalkuluak");
            System.out.println("4.- Laukizuzena kalkuluak");
            System.out.println("5.- Puntuen arteko distantzia");
            System.out.println("6.- Irten");
            System.out.println("");

            System.out.print("Aukeratu zenbaki bat: ");
            aukera = sc.nextInt();

            System.out.println("");

            switch (aukera) {
                case 1:
                    Panela.main(args);
                    System.out.println("Ikusi pestaña berria");
                    System.out.println("EZ ITXI, txikitu");
                    break;
                case 2:
                    CircleDistantzia();
                    break;
                case 3:
                    TriangleNeurriak();
                    break;
                case 4:
                    RectangleNeurriak();
                    break;
                case 5:
                    Puntuak();
                    break;
                case 6:
                    System.out.println("Eskerrik asko programa hau erabiltzearren.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 6);
    }
   
    /**
     * 2 Zirkuluren X Y eta erradioa sartuz, beraien arteko distantzia kalkulatzen du,
     * eta koordenatuen jatorria barneratzen duen bistarasten du.
     */
    public static void CircleDistantzia() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sartu 1.go zirkuluaren zentroa (Adibidez: 1 1): ");
        int centroZirkuluaX1 = sc.nextInt();
        int centroZirkuluaY1 = sc.nextInt();
        System.out.print("Sartu 1.go zirkuluaren erradioa: ");
        int erradioa1 = sc.nextInt();

        MyCircle zir1 = new MyCircle(centroZirkuluaX1, centroZirkuluaY1, erradioa1);

        System.out.print("Sartu 2.go zirkuluaren zentroa (Adibidez: 1 1): ");
        int centroZirkuluaX2 = sc.nextInt();
        int centroZirkuluaY2 = sc.nextInt();
        System.out.print("Sartu 2.go zirkuluaren erradioa: ");
        int erradioa2 = sc.nextInt();

        MyCircle zir2 = new MyCircle(centroZirkuluaX2, centroZirkuluaY2, erradioa1);

        System.out.println("DISTANTZIA");
        System.out.println("=======================");
        System.out.println("Zirkulu1 -> Zirkulu2 == " + zir1.distance(zir2) + " m");

        if (zir1.isInside(new MyPoint(0, 0))) {
            System.out.println("1.go zirkuluak koordenatuen jatorria barne hartzen du");
        } else {
            System.out.println("1.go zirkuluak ez du koordenatu jatorria barne hartzen");
        }
        if (zir2.isInside(new MyPoint(0, 0))) {
            System.out.println("2.go zirkuluak koordenatuen jatorria barne hartzen du");
        } else {
            System.out.println("2.go zirkuluak ez du koordenatu jatorria barne hartzen");
        }
    }
    
    /**
     * Triangeluaren 3 puntuen bitartez MyTriangle bat sortu, eta metodoak erabiliz 
     * Perimetroa eta Triangelu Mota bistaratzen dira.
     */
    public static void TriangleNeurriak()  {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Sartu triangeluaren 1.go puntua (Adibidez: 1 1): ");
        int X1 = sc.nextInt();
        int Y1 = sc.nextInt();
        System.out.print("Sartu triangeluaren 2.go puntua (Adibidez: 1 1): ");
        int X2 = sc.nextInt();
        int Y2 = sc.nextInt();
        System.out.print("Sartu triangeluaren 3.go puntua (Adibidez: 1 1): ");
        int X3 = sc.nextInt();
        int Y3 = sc.nextInt();
        
        MyPoint p1 = new MyPoint(X1,Y1);
        MyPoint p2 = new MyPoint(X2,Y2);
        MyPoint p3 = new MyPoint(X3,Y3);
        
        MyTriangle tri1 = new MyTriangle(p1, p2, p3);
        
        System.out.println(tri1);

        System.out.println("  Perimetroa: " + tri1.getPerimeter());
        System.out.println("  Mota: " + tri1.getType());
        System.out.println("");
    }
    /**
     * Laukizuzenaren TopLeft eta BottomRight puntuen bitartez,
     * Azalera eta Perimetroa metodoak bistaraziko dira.
     */
    public static void RectangleNeurriak() {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Sartu laukizuzenaren IgoEzkerreko puntua (Adibidez: 7 1): ");
        int X1 = sc.nextInt();
        int Y1 = sc.nextInt();
        System.out.print("Sartu laukizuzenaren BeheEskumako puntua (Adibidez: 1 7): ");
        int X2 = sc.nextInt();
        int Y2 = sc.nextInt();
        
        MyPoint p0 = new MyPoint(X1, Y1); //topLeft
        MyPoint p1 = new MyPoint(X2, Y2); //bottomRight
        MyRectangle p2 = new MyRectangle(p0, p1);

        System.out.println(p2.toString());

        System.out.println("    Azalera: " + p2.getAzalera());
        System.out.println("    Perimetroa: " + p2.getPerimetroa());
              
    }
    /**
     * 2 MyPoint berri sortuz, haien arteko distantzia kalkulatuko da.
     */
    public static void Puntuak() {
        Scanner sc = new Scanner(System.in);
        MyPoint p0 = new MyPoint();
        MyPoint p1 = new MyPoint();

        System.out.print("Sartu lehenengo puntua (Adibidez: 1 1): ");
        p0.setX(sc.nextInt());
        p0.setY(sc.nextInt());
        System.out.println("1.go Puntua: " + p0);

        System.out.print("Sartu bigarren puntua (Adibidez: 1 1): ");
        p1.setX(sc.nextInt());
        p1.setY(sc.nextInt());
        System.out.println("2.go Puntua: " + p1);

        System.out.println(p1);

        System.out.println("Distantzia:");
        System.out.println("====================");
        System.out.println(p0.distance(p1) + " m");
    }
}
