package exekutagarriak;

import java.util.Scanner;
import model.SQLiteKudeatu;

/**
 *
 * @author lomana.markel
 */
public class ProgramaNagusia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SQLiteKudeatu app = new SQLiteKudeatu();

        int aukera = 0;
        do {
            System.out.println();
            System.out.println("Batu Baseen Menua");
            System.out.println("====================================");
            System.out.println("1.- Datu Basea ikusi ");
            System.out.println("2.- Erregistro berria sartu");
            System.out.println("3.- Erregistro bat aldatu");
            System.out.println("4.- Erregistro bat borratu");
            System.out.println("5.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = sc.nextInt();
            System.out.println("");

            switch (aukera) {
                case 1:
                    app.terminoakImprimatu();
                    break;
                case 2:
                    app.terminoakSartu("platanoa", "platano");
                    break;
                case 3:
                    app.terminoakAldatu(1, "mangoa", "mango");
                    break;
                case 4:
                    System.out.print("Sartu borratu nahi duzun ID-a: ");
                    int znb=sc.nextInt();
                    app.terminoakBorratu(znb);
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzearren.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 5);
    }
}
