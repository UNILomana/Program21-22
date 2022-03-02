/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import model.*;

/**
 *
 * @author lomana.markel
 */
public class ErosketakKudeatu {

    public static ArrayList<Bezeroa> kontaktuak = new ArrayList<>();
    public static ArrayList<Produktua> produktuKatalogoa = new ArrayList<>();
    public static ArrayList<Erosketa> erosketenZerrenda = new ArrayList<>();

    public static void main(String[] args) {
        initialize();
        menuNagusiaErakutsi();
    }

    public static void initialize() {
        String[] emailak = {"idazkari@.eus", "zuzendari@.eus"};

        Bezeroa karlos = new Pertsona(1, "Karlos", "Argiñano", "Hondartza Pasialekua z/g ZARAUTZ", "kargi@uni.eus");
        Bezeroa martin = new Pertsona(2, "Martin", "Berasategi", "Mirakontxa z/g. DONOSTIA", "mbera@donostia.eus");
        Bezeroa UNI = new Enpresa(3, "IES Uni Eibar-Ermua BHI", "Uni Eibar-Ermua", "Otaola Etorbidea 29, EIBAR", emailak);
        kontaktuak.add(karlos);
        kontaktuak.add(martin);
        kontaktuak.add(UNI);

        Produktua toshiba = new Produktua("C01", "Toshiba Satellite Pro", 450);
        Produktua samsung = new Produktua("T01", "Samsung Galaxy", 210);
        Produktua iphone = new Produktua("T02", "iPhone X", 1300);
        Produktua hp = new Produktua("C02", "HP Pavilion", 600);
        produktuKatalogoa.add(toshiba);
        produktuKatalogoa.add(samsung);
        produktuKatalogoa.add(iphone);
        produktuKatalogoa.add(hp);

        /*BAKOITZAREN EROSKETAK FALTA */
 /*LEHENENGO EROSKETA*/
        ArrayList<Produktua> erositakoProduktuak1 = new ArrayList<>();
        erositakoProduktuak1.add(toshiba);
        erositakoProduktuak1.add(hp);
        erositakoProduktuak1.add(samsung);

        ArrayList<Integer> erosketaHonetakounitateak1 = new ArrayList<>();
        erosketaHonetakounitateak1.add(4);
        erosketaHonetakounitateak1.add(2);
        erosketaHonetakounitateak1.add(3);

        erosketenZerrenda.add(new Erosketa("E18-01", "2018-09-25", martin, erositakoProduktuak1, erosketaHonetakounitateak1, 3630));

        /*BIGARREN EROSKETA*/
        ArrayList<Produktua> erositakoProduktuak2 = new ArrayList<>();
        erositakoProduktuak2.add(toshiba);

        ArrayList<Integer> erosketaHonetakounitateak2 = new ArrayList<>();
        erosketaHonetakounitateak2.add(15);

        erosketenZerrenda.add(new Erosketa("E18-02", "2018-10-24", karlos, erositakoProduktuak2, erosketaHonetakounitateak2, 6750));

        /*HIRUGARREN EROSKETA*/
        ArrayList<Produktua> erositakoProduktuak3 = new ArrayList<>();
        erositakoProduktuak3.add(toshiba);
        erositakoProduktuak3.add(samsung);

        ArrayList<Integer> erosketaHonetakounitateak3 = new ArrayList<>();
        erosketaHonetakounitateak3.add(1);
        erosketaHonetakounitateak3.add(1);

        erosketenZerrenda.add(new Erosketa("E19-01", "2019-01-09", karlos, erositakoProduktuak3, erosketaHonetakounitateak3, 660));

        /*LAUGARREN EROSKETA*/
        ArrayList<Produktua> erositakoProduktuak4 = new ArrayList<>();
        erositakoProduktuak4.add(toshiba);
        erositakoProduktuak4.add(hp);
        erositakoProduktuak4.add(iphone);

        ArrayList<Integer> erosketaHonetakounitateak4 = new ArrayList<>();
        erosketaHonetakounitateak4.add(3);
        erosketaHonetakounitateak4.add(1);
        erosketaHonetakounitateak4.add(1);

        erosketenZerrenda.add(new EpekakoErosketa("E19-02", "2019-02-09", karlos, erositakoProduktuak4, erosketaHonetakounitateak4, 3250, 300));

        /*BOSTGARREN EROSKETA*/
        ArrayList<Produktua> erositakoProduktuak5 = new ArrayList<>();
        erositakoProduktuak5.add(hp);

        ArrayList<Integer> erosketaHonetakounitateak5 = new ArrayList<>();
        erosketaHonetakounitateak5.add(25);

        erosketenZerrenda.add(new Erosketa("E21-01", "2020-01-17", UNI, erositakoProduktuak5, erosketaHonetakounitateak5, 15000));
        
        /*SEIGARREN EROSKETA*/
        ArrayList<Produktua> erositakoProduktuak6 = new ArrayList<>();
        erositakoProduktuak6.add(toshiba);
        erositakoProduktuak6.add(hp);

        ArrayList<Integer> erosketaHonetakounitateak6 = new ArrayList<>();
        erosketaHonetakounitateak6.add(2);
        erosketaHonetakounitateak6.add(2);

        erosketenZerrenda.add(new EpekakoErosketa("E22-01", "2022-02-17", UNI, erositakoProduktuak6, erosketaHonetakounitateak6, 2100, 200));

    }

    /*Menu bat erakutsi*/
    public static int menuNagusiaErakutsi() {
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
                    read();
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
        return aukera;

    }

    public static void create() {
        Scanner in = new Scanner(System.in);
        System.out.println("EROSKETA BERRIA");
        System.out.println("=============================");

        System.out.print("Sartu erosketa kodea: ");
        String kodea = in.next();

        /*bezKodea ez dago eginda bilatu egin behar delako bezeroen artean beraien kodea DIFICIL*/
 /*Erosketa denak Karlitos-ek*/
        Bezeroa karlitos = new Pertsona(1, "Karlitos", "Pizarro", "Hondartza z/g Eibar", "kauen@uni.eus");
        System.out.print("Sartu bezero kodea: ");
        int bezKodea = in.nextInt();

        System.out.print("Guztira ordaindu beharrekoa: ");
        double guztiraOrdaindu = in.nextDouble();

        //Epekako erosketa
        System.out.print("Epekako erosketa da? (B/E) ");
        char c1 = in.next().charAt(0);
        char epeka = Character.toLowerCase(c1);
        if (epeka == 'b') {
            System.out.print("Sartu kuota: ");
            double bezKuota = in.nextInt();
            erosketenZerrenda.add(new EpekakoErosketa(kodea, LocalDate.now(), karlitos, guztiraOrdaindu, bezKuota));
        } else if (epeka == 'e') {
            erosketenZerrenda.add(new Erosketa(kodea, LocalDate.now(), karlitos, guztiraOrdaindu));
        }

        erosketenZerrendaIkusi();
    }

    public static void read() {
        Scanner in = new Scanner(System.in);

        System.out.println("*******************************");
        System.out.println("*   READ MENUA");
        System.out.println("*   1.  Erosketen zerrenda");
        System.out.println("*   2.  Fakturazio osoa");
        System.out.println("*   3.  Bezerorik onena");
        System.out.println("*   4.  Helbidea bilatu");
        System.out.println("*   5.  Epekako erosketen txostena");
        System.out.println("*   20. Irten");

        int aukera;
        do {
            System.out.print("Aukeratu MENU zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    erosketenZerrendaIkusi();
                    break;
                case 2:
                    fakturazioaIkusi();
                    break;
                case 3:
                    bezeroOnena();
                    break;
                case 4:
                    helbideaBilatu();
                    break;
                case 5:
                    epekakoTxostena(); //ez dago eginda
                    break;
                case 20:
                    System.out.println("Irtetzen");
                    break;
                default:;
            }
        } while (aukera != 20);
    }

    public static void update() {
        /*Nahi duzun baloreak aldatu*/
    }

    public static void delete() {
        Scanner in = new Scanner(System.in);
        int aukera = 0;
        erosketenZerrendaIkusi();
        System.out.print("Zein erosketa borratu nahi duzu(zenbakia)? ");
        aukera = in.nextInt() -1;
        erosketenZerrenda.remove(aukera);
        erosketenZerrendaIkusi();
        
    }

    public static void erosketenZerrendaIkusi() {
        System.out.println("EROSKETEN ZERRENDA");
        System.out.println("========================");
        for (int i = 0; i < erosketenZerrenda.size(); i++) {
            System.out.println((i+1)+"-"+erosketenZerrenda.get(i));
        }
    }

    /**
     * erosketaZerrendako 'guztira' denak gehitzen ditu
     */
    public static void fakturazioaIkusi() {
        double fakturazioOsoa = 0;
        for (int i = 0; i < erosketenZerrenda.size(); i++) {
            fakturazioOsoa = fakturazioOsoa + erosketenZerrenda.get(i).getGuztira();
        }
        System.out.println(fakturazioOsoa + " €");
    }

    /**
     * Erosketa onenaren pozisioa kalkulatzen du eta bere bezeroa bistaratu
     */
    public static void bezeroOnena() {
        int guztiraAltuena = 0;

        for (int i = 0; i < erosketenZerrenda.size(); i++) {
            if (erosketenZerrenda.get(i).getGuztira() > guztiraAltuena) {
                guztiraAltuena = i;
            }
        }
        System.out.println("Bezero onena da:");
        System.out.println(erosketenZerrenda.get(guztiraAltuena).getBezeroa());
    }

    /**
     * Bezeroaren aukeraketa egin eta helbidea bistaratu
     */
    public static void helbideaBilatu() {
        Scanner in = new Scanner(System.in);
        int aukera = 0;

        for (int i = 0; i < kontaktuak.size(); i++) {
            System.out.println((i + 1) + " " + kontaktuak.get(i).getIzena() + " " + kontaktuak.get(i).getAbizena());
        }
        System.out.print("Zein bezeroren helbidea nahi duzu(zenbakia)? ");
        aukera = in.nextInt() - 1;
        System.out.println(kontaktuak.get(aukera).getHelbidea());

    }

    public static void epekakoTxostena() {
        System.out.println("EPEKAKO EROSKETAK");
        System.out.println("========================");
        for (int i = 0; i < erosketenZerrenda.size(); i++) {
            if (erosketenZerrenda.get(i).getClass() == EpekakoErosketa.class) {
                System.out.println(erosketenZerrenda.get(i).toStringLuzea());
            }
        }
    }

}
