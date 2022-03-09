package model;

import enumak.Hizkuntza;
import java.time.LocalDate;

/**
 *
 * @author lomana.markel
 */
public class Komikia extends Book{

    private boolean kolorea;
    

    public Komikia(String name, Author author, double price, int pages, boolean kolorea) {
        super(name,author,price,pages);
        this.kolorea = kolorea;
    }

    public boolean isKolorea() {
        return kolorea;
        /*if (kolorea == false) {
            return false ;
        } else if (kolorea == true) {
            return true;
        }
        return false;*/
    }

    public void setKolorea(boolean kolorea) {
        this.kolorea = kolorea;
    }

    public String getNolakoa() {
        if (kolorea == false) {
            return "zuri-beltza";
        } else if (kolorea == true) {
            return "koloretakoa";
        }
        return null;
    }
    public void argitaratu() {
        if (hizkuntza == Hizkuntza.ES) {
            System.out.println("Tebeo publicado en Madrid a " + LocalDate.now().toString());
            argitaratutakoLiburuak++;
        } else if (hizkuntza == Hizkuntza.EUS) {
            System.out.println("Komikia, Eibarren argitaratua " + LocalDate.now().toString() + " egunean");
            argitaratutakoLiburuak++;
        } else if (hizkuntza == Hizkuntza.EN) {
            System.out.println("Comic published in London at " + LocalDate.now().toString());
            argitaratutakoLiburuak++;
        }

    }
    public String toString() {
        return "[Komikia]" + super.getName() + ", " + super.getName() + ", " + super.getPrice() + ", " + super.getPages();
    }

}
