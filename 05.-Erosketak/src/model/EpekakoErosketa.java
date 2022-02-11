package model;

import java.util.ArrayList;

/**
 *
 * @author lomana.markel
 */
public class EpekakoErosketa {
    private int epeak = 12;
    private boolean ordainketaBukatua = false;
    private double kuota;
    
    public EpekakoErosketa(String kodea, String data, Bezeroa eroslea,ArrayList<Produktua> produktuak,ArrayList<Integer> unitateak,  double guztira, double kuota){ 
        super(kodea,data,eroslea,produktuak,unitateak,guztira);
        this.kuota=kuota;
    }
    
    public double gainetikOrdainduBeharrekoa(){
        return kuota * epeak - guztira;  
    }
    
}
