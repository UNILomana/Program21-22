/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.time.LocalDate;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author lomana.markel
 */
public class Partida {
    LocalDate data;
    String aurkaria;
    ArrayList <Futbolista> txartelakJarri = new ArrayList <Futbolista>();

    public Partida(LocalDate data, String aurkaria) {
        this.data = data;
        this.aurkaria = aurkaria;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getAurkaria() {
        return aurkaria;
    }

    public void setAurkaria(String aurkaria) {
        this.aurkaria = aurkaria;
    }

    public ArrayList<Futbolista> getTxartelakJarri() {
        return txartelakJarri;
    }

    public void setTxartelakJarri(ArrayList<Futbolista> txartelakJarri) {
        this.txartelakJarri = txartelakJarri;
    }
    /**
     * Emandako futbolistari txartel bat jarriko zaio.
     * @param f 
     */
    public void txartelaJarri(Futbolista f){
        
    }

    @Override
    public String toString() {
        return "Partida{" + "data=" + data + ", aurkaria=" + aurkaria + '}';
    }
    
}
