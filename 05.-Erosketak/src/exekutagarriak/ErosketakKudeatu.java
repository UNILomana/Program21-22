/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.ArrayList;
import java.util.Scanner;
import model.*;

/**
 *
 * @author lomana.markel
 */
public class ErosketakKudeatu {

    public static ArrayList<Bezeroa> kontaktuak;
    public static ArrayList<Produktua> produktuKatalogoa;
    public static ArrayList<Erosketa> erosketenZerrenda;

    public static void main(String[] args) {
        initialize();
    }

    public initialize() {
        String[] emailak = {"idazkari@.eus", "zuzendari@.eus"};
        kontaktuak.add(new Pertsona(1, "Karlos", "Argiñano", "Hondartza Pasialekua z/g ZARAUTZ", "kargi@uni.eus"));
        kontaktuak.add(new Pertsona(2, "Martin", "Berasategi", "Mirakontxa z/g. DONOSTIA", "mbera@donostia.eus"));
        kontaktuak.add(new Enpresa(3, "IES Uni Eibar-Ermua BHI", "Uni Eibar-Ermua", "Otaola Etorbidea 29, EIBAR", emailak));

        produktuKatalogoa.add(new Produktua("C01", "Toshiba Satellite Pro", 450));

        produktuKatalogoa.add(new Produktua("C02", "HP Pavilion", 600));
        produktuKatalogoa.add(new Produktua("T01", "Samsung Galaxy", 210));
        produktuKatalogoa.add(new Produktua("T02", "iPhone X", 1300));
    }

    /*Menu bat erakutsi*/
    public int menuNagusiaErakutsi() {
        Scanner in = new Scanner(System.in);

        System.out.println("*******************************");
        System.out.println("*   EROSKETEN KUDEAKETA");
        System.out.println("*   1.  Create(Datuak Gehitu)");
        System.out.println("*   2.  Read Menua (ikusi)");
        System.out.println("*   3.  Update  (Aldatu)");
        System.out.println("*   4.  Delete  (Ezabatu)");
        System.out.println("*   20. Irten");

        int aukera;
        do {
            System.out.print("Aukeratu MENU zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    create();
                    break;
                case 2:
                    recover();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 20:
                    System.out.println("Irtetzen");
                    break;
                default:;
            }
        } while (aukera != 20);

    }
    /*
        create erosketa berria
        read menua. 
        update
        delete
        irten
     */
}

public create() {

    }

    public recover() {

    }

    public update() {

    }

    public delete() {

    }
}
