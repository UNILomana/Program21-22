package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author lomana.markel
 */
public class Erosketa {

    protected char[] kodea;
    protected LocalDate data;
    protected Bezeroa bezeroa;
    protected ArrayList<Produktua> produktuak;
    protected ArrayList<Integer> unitateak;
    protected double guztira;

    public Erosketa(char[] kodea, Bezeroa bezeroa, double guztira) {
        this.kodea = kodea;
        this.bezeroa = bezeroa;
        this.guztira = guztira;
    }

    public Erosketa(String kodea, String data, Bezeroa bezeroa, ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira) {
        this.kodea = new char[kodea.length()];

        for (int i = 0; i < kodea.length(); i++) {
            this.kodea[i] = kodea.charAt(i);
        }
        LocalDate dataErosketa = LocalDate.parse(data);
        this.data = dataErosketa;
        this.bezeroa = bezeroa;
        this.produktuak = produktuak;
        this.unitateak = unitateak;
        this.guztira = guztira;
    }

    public boolean guztiraEgiaztatu() {

        for (int i = 0; i < produktuak.size(); i++) {
            double prezio = unitateak.get(i) * produktuak.get(i).getPrezioa();
            if (prezio == guztira) {
                return true;
            }
        }
        return false;
    }

    public String getStrKodea() {
        return new String(kodea);
    }

    public String toStringLuzea() {

        return "EROSKETA\n"
                + "\tKodea= " + getStrKodea() + "\n"
                + "\tData= " + data + "\n"
                + "\tBez_Kod= " + bezeroa.getKodea() + "\n"
                + "\tBezeroa= " + bezeroa.getIzena() + " " + bezeroa.getAbizena() + "\n"
                + "\tHelbidea= " + bezeroa.getHelbidea() + "\n"
                + "\tProduktuak= " + produktuak + "\n"
                + "\tUnitateak= " + unitateak + "\n"
                + "\tGUZTIRA= " + guztira + "€";

    }

    @Override
    public String toString() {
        return "Erosketa{" + getStrKodea() + ", data=" + data + ", bezeroa=" + bezeroa + '}';
    }

}
