package model;

import enumak.Hizkuntza;
import java.time.LocalDate;
import java.util.Objects;

/*
 * The Book class models a book with one (and only one) author.
 */
public class Book implements Argitagarria {

    // The private instance variables
    protected static int argitaratutakoLiburuak = 0;
    private String name;
    private Author author;
    private double price;
    private int pages;
    protected Hizkuntza hizkuntza;

    // Constructors
    public Book() {

    }

    public Book(String name, Author author, double price, int pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;  // return member author, which is an instance of the class Author
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getNolakoa() {
        if (pages <= 100) {
            return "txikia";
        } else if (pages > 100 && pages <= 400) {
            return "normala";
        } else if (pages > 400) {
            return "handia";
        }
        return null;
    }

    public Hizkuntza getHizkuntza() {
        return hizkuntza;
    }

    public void setHizkuntza(Hizkuntza hizkuntza) {
        this.hizkuntza = hizkuntza;
    }
    /**
     * Argitaratutako liburu kopurua
     * @return 
     */
    public int getArgitaratutakoLiburua() {
        return argitaratutakoLiburuak;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        return true;
    }
    
    @Override
    public void argitaratu() {
        if (hizkuntza == Hizkuntza.ES) {
            System.out.println("Publicado en Madrid a " + LocalDate.now().toString());
            argitaratutakoLiburuak++;
        } else if (hizkuntza == Hizkuntza.EUS) {
            System.out.println("Eibarren argitaratua " + LocalDate.now().toString() + " egunean");
            argitaratutakoLiburuak++;
        } else if (hizkuntza == Hizkuntza.EN) {
            System.out.println("Published in London at " + LocalDate.now().toString());
            argitaratutakoLiburuak++;
        }

    }

    @Override
    public String toString() {
        return name + ", " + author.getName() + ", " + price + ", " + pages;
    }
}
