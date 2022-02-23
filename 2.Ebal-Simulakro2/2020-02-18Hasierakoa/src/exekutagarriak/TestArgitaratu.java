/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import enumak.Hizkuntza;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author lomana.markel
 */
public class TestArgitaratu {

    private static Author[] idazleak = new Author[100];
    private static ArrayList<Book> liburutegia = new ArrayList<>();

    public static void main(String[] args) {
        Author idazlea1 = new Author("J.K.Rowling", 'f');
        Author idazlea3 = new Author("Francisco Ibañez", 'm');
        idazleak[0] = idazlea1;
        idazleak[2] = idazlea3;

        Book liburua1 = new Book("Harry Potter", idazleak[0], 99.99, 2850);
        Book liburua5 = new Komikia("Mortadelo y Filemón", idazleak[2], 19.95, 75, true);
        liburua1.setHizkuntza(Hizkuntza.EN);
        liburua5.setHizkuntza(Hizkuntza.ES);
        
        liburua1.argitaratu();
        liburua5.argitaratu();
        
        System.out.println(idazlea1.equals(idazlea1));
        System.out.println(idazlea1.equals(idazlea3));
        
        System.out.println(liburua5.equals(liburua5));
        System.out.println(liburua1.equals(liburua5));
    }
}
