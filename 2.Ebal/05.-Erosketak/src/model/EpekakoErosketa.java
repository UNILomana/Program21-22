package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author lomana.markel
 */
public class EpekakoErosketa extends Erosketa {

    private int epeak = 12;
    private boolean ordainketaBukatua = false;
    private double kuota;

    public EpekakoErosketa(String kodea, LocalDate data, Bezeroa bezeroa, double guztira, double kuota) {

        super(kodea, data, bezeroa, guztira);
        this.kuota = kuota;

    }

    public EpekakoErosketa(String kodea, String data, Bezeroa eroslea, ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira, double kuota) {
        super(kodea, data, eroslea, produktuak, unitateak, guztira);
        this.kuota = kuota;
    }

    public double gainetikOrdainduBeharrekoa() {
        return kuota * epeak - guztira;
    }

      
    public String toStringLuzea() {
        return "EROSKETA " + getStrKodea() + ":\n"
                + "\tData= " + data + "\n"
                + "\tBezeroa= " + bezeroa.getIzena() + " " + bezeroa.getAbizena() + "\n"
                + "\tProduktuak= " + produktuak + "\n"
                + "\tUnitateak= " + unitateak + "\n"
                + "\tGUZTIRA= " + guztira + "€\n"
                + "\tEpeak= " + epeak + "\n"
                + "\tOrdainketa Bukatua= " + ordainketaBukatua + "\n"
                + "\tKuota= " + kuota + "\n";
    }

}
