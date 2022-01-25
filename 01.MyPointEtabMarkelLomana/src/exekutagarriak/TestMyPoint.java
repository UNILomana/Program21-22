package exekutagarriak;

import java.util.Arrays;
import java.util.Random;
import model.MyPoint;

/**
 *
 * @author lomana.markel
 */
public class TestMyPoint {

    public static void main(String[] args) {
        MyPoint p0 = new MyPoint(0, 0);
        MyPoint p1 = new MyPoint(2, 1);
        MyPoint p2 = new MyPoint(4, 0);

        /*Distantzia puntu batetik KOORDENATU-JATORRIRA*/
        System.out.println(p0.distance());
        System.out.println(p1.distance());
        System.out.println(p2.distance());

        /*Distantzia puntu batetik beste batera*/
        System.out.println(p0.distance(p1)); //p0tik p1era
        System.out.println(p0.distance(p2)); //p0tik p2era
        System.out.println(p1.distance(p2)); //p1tik p2era

        /*Arrayen ATALA*/
        MyPoint[][] puntuenArraya = new MyPoint[10][10];

        for (int i = 0; i < puntuenArraya.length; i++) {
            puntuenArraya[i][i] = new MyPoint(i + 1, i + 1);
            System.out.println(puntuenArraya[i][i]);
        }

        /*100 puntuko arrayLista*/
        System.out.println("100 puntuko arrayLista:");
        MyPoint[][] arrayLista = new MyPoint[100][100];
        for (int i = 0; i < arrayLista.length; i++) {
            arrayLista[i][i] = new MyPoint(i, i);
            System.out.println(arrayLista[i][i]);
        }

        /*Auzasko lista Math.random()*/
        System.out.println("Auzasko Lista Math.random():");
        MyPoint[][] auzaskoLista = new MyPoint[5][5];

        for (int i = 0; i < auzaskoLista.length; i++) {
            auzaskoLista[i][i] = new MyPoint((int) (Math.random() * 9 + 1), (int) (Math.random() * 9 + 1));
            System.out.println(auzaskoLista[i][i]);
        }

        /*Auzasko lista java.util.Random()*/
        Random randoma = new Random();
        System.out.println("Auzasko Lista util.Random:");

        MyPoint[][] auzaskoLista2 = new MyPoint[5][5];
        for (int i = 0; i < auzaskoLista2.length; i++) {
            auzaskoLista2[i][i] = new MyPoint(randoma.nextInt(10), randoma.nextInt(10));
            System.out.println(auzaskoLista2[i][i]);
        }

    }
}
