package exekutagarriak;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.Author;
import model.Book;
import model.Komikia;

public class ProgramaNagusia {

    private static Author[] idazleak = new Author[100];
    private static ArrayList<Book> liburutegia = new ArrayList<>();

    public static void initialize() {
        //IDAZLEAK
        Author idazlea1 = new Author("J.K.Rowling", 'f');
        Author idazlea2 = new Author("Agatha Christie", 'f');
        Author idazlea3 = new Author("Francisco Ibañez", 'm');
        Author idazlea4 = new Author("Margaret Atwood", 'f');
        Author idazlea5 = new Author("Marjane Satrapi", 'f');
        Author idazlea6 = new Author("Mariasun Landa", 'f');
        Author idazlea7 = new Author("Harper Lee", 'f');
        Author idazlea8 = new Author("Mary Shelley", 'f');

        idazleak[0] = idazlea1;
        idazleak[1] = idazlea2;
        idazleak[2] = idazlea3;
        idazleak[3] = idazlea4;
        idazleak[4] = idazlea5;
        idazleak[5] = idazlea6;
        idazleak[6] = idazlea7;
        idazleak[7] = idazlea8;

        //LIBURUAK
        Book liburua1 = new Book("Harry Potter", idazleak[0], 99.99, 2850);
        Book liburua2 = new Book("Asesinato en el Orient Express", idazleak[1], 9.95, 275);
        Book liburua3 = new Book("Muerte en el Nilo", idazleak[1], 9.95, 300);
        Book liburua4 = new Book("10 Negritos", idazleak[1], 9.95, 325);
        Book liburua5 = new Komikia("Mortadelo y Filemón", idazleak[2], 19.95, 75, true);
        Book liburua6 = new Book("El cuento de la Criada", idazleak[3], 24.95, 410);
        Book liburua7 = new Book("Cat´s eye", idazleak[3], 6.95, 78);
        Book liburua8 = new Komikia("Persepolis", idazleak[4], 19.95, 75, false);
        Book liburua9 = new Book("Azken Balada", idazleak[5], 10.95, 225);
        Book liburua10 = new Book("Matar a un Ruiseñor", idazleak[6], 15.95, 450);
        Book liburua11 = new Book("Frankenstein", idazleak[7], 19.95, 300);

        //Liburutegia
        liburutegia.add(liburua1);

        liburutegia.add(liburua2);

        liburutegia.add(liburua3);

        liburutegia.add(liburua4);

        liburutegia.add(liburua5);

        liburutegia.add(liburua6);

        liburutegia.add(liburua7);

        liburutegia.add(liburua8);

        liburutegia.add(liburua9);

        liburutegia.add(liburua10);

        liburutegia.add(liburua11);
    }

    public static void jaiotzeDataBete() {

        Scanner in = new Scanner(System.in);
        int posizioa;
        String data;

        System.out.print("Zein idazleren jaiotze-data nahi duzu bete(Idazti posizioa)?");
        posizioa = in.nextInt();
        System.out.print("Sartu " + idazleak[posizioa - 1].getName() + " idazlearen jaiotze data (uuuu-hh-ee): ");
        
        try {
            data = in.next();
            idazleak[posizioa - 1].setBirthday(data);
            System.out.println("Jaoitze data ondo erregistratu da");
        } catch (Exception ex) {
            System.out.println("Data Okerra.");
            System.out.println("Hurrengo baten sartuko duzu data.");
        }
        
    }

    public static void inprimatu() {
        System.out.println("LIBURUTEGIA");
        System.out.println("===============================");
        for (Book b : liburutegia) {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {

        initialize();
        jaiotzeDataBete();
        inprimatu();
    }
}
