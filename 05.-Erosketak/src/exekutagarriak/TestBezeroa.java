package exekutagarriak;

import java.util.ArrayList;
import model.*;

/**
 *
 * @author lomana.markel
 */
public class TestBezeroa {

    public static ArrayList<Pertsona> bezeroak = new ArrayList<>();
    public static ArrayList<Enpresa> bezeroEnpresak = new ArrayList<>();

    public static void main(String[] args) {

        sortuBezeroak();
        sortuProduktuak();
        erosketakIkusi();
        Produktua toshiba = new Produktua("C01", "Toshiba Satellite", 450);
    Erosketa erosketa1 = new Erosketa("E18-01", bezeroak.get(1-1), 1000);
   
    Erosketa erosketa2 = new Erosketa("E18-01",02/02/2022, bezeroak.get(1-1),toshiba, 1,  1000);
        System.out.println(erosketa1.toString());
    }

    public static void sortuBezeroak() {
        bezeroak.add(new Pertsona(1, "Karlos", "Argi", "Zarautz", "kargi@"));
        bezeroak.add(new Pertsona(2, "Martin", "Bera", "Donostia", "martintxo@"));

        String[] emailak = {"idazkari@.eus", "zuzendari@.eus"};
        bezeroEnpresak.add(new Enpresa(3, "Uni eibar", "Kaka de uni", "Otaola", emailak));
    }

    public static void sortuProduktuak() {
        Produktua toshiba = new Produktua("C01", "Toshiba Satellite", 450);
        Produktua hp = new Produktua("C02", "HP Pavilion", 600);
        Produktua samsung = new Produktua("T01", "Samsung Galaxy", 210);
        Produktua aifon = new Produktua("T02", "iPhone X", 1300);
    }

    public static void erosketakIkusi() {
        System.out.println("Bezero Pertsonak");
        System.out.println("=================");

        for (int i = 0; i < bezeroak.size(); ++i) {
            if (bezeroak.get(i) != null) {
                System.out.println(bezeroak.get(i));
            }
        }
        System.out.println("");
        
        System.out.println("Bezero Enpresak");
        System.out.println("=================");

        for (int i = 0; i < bezeroEnpresak.size(); ++i) {
            if (bezeroEnpresak.get(i) != null) {
                System.out.println(bezeroEnpresak.get(i));
            }
        }
        System.out.println("");
    }
}
