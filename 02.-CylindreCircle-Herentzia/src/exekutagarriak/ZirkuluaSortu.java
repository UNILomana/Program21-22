/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.Scanner;
import model.Circle;
import model.Cylinder;

/**
 *
 * @author lomana.markel
 */
/**
 * A test driver for the Cylinder class.
 */
public class ZirkuluaSortu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle cy1 = new Circle();
        Cylinder cy2 = new Cylinder();

        System.out.print("Zirkulu arrunta edo zilindroa sortu nahi duzu(a/z)? ");
        char tipo = sc.next().charAt(0);

        if (tipo == 'a') {
            System.out.print("Zein izango da erradioa?");
            cy1.setRadius(sc.nextInt());
            System.out.print("Zein izango da bere kolorea?");
            cy1.setColor(sc.next().toUpperCase());

            System.out.println("Hauek dira zirkuluaren ezaugarriak:");
            System.out.println("Erradioa: " + cy1.getRadius());
            System.out.println("Kolorea: " + cy1.getColor());
            System.out.println("Azalera: " + cy1.getArea());
        } else if (tipo == 'z') {
            System.out.print("Zein izango da erradioa? ");
            cy2.setRadius(sc.nextInt());
            System.out.print("Zein izango da bere kolorea? ");
            cy2.setColor(sc.next().toUpperCase());
            System.out.print("Zein izango da bere Altuera? ");
            cy2.setHeight(sc.nextInt());

            System.out.println("Hauek dira zirkuluaren ezaugarriak:");
            System.out.println("Erradioa: " + cy2.getRadius());
            System.out.println("Kolorea: " + cy2.getColor());
            System.out.println("Altuera: " + cy2.getHeight());
            System.out.printf("Azalera: %.2f\n", cy2.getArea());
            System.out.printf("Bolumena: %.2f\n", cy2.getVolume());
        }
    }
}
