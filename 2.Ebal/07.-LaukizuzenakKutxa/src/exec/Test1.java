package exec;

import enumak.Norantza;
import model.Puntua;

public class Test1 {

    public static void main(String[] args) {
        Puntua p1 = new Puntua();
        Puntua p2 = new Puntua(5, 3);
        Puntua p3 = new Puntua(0, 0);

        System.out.println(Puntua.getSortutakoPuntuak() + " puntu sortu dira orainarte:");
        System.out.println("=============================");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p2);
        
        /*Que coño le pasa a equals*/
        System.out.println("Desberdinak diren puntuak marraztuko ditugu:");
        System.out.println("============================================");
        p1.marraztu();
        if (!p2.equals(p1)) {
            p2.marraztu();
        }
        if (!p3.equals(p1) && !p3.equals(p2)){
            p3.marraztu();
        }
        
        System.out.println("Zein dago ezkerrerago?");
        System.out.println("======================");
        if (p1.isEzkerreragoThan(p2)){
            System.out.println(p1 +" puntua "+p2+" puntua baino ezkerrerago dago.");
        }
        
        
        /*pUNTUA MUGITU METODOA*/
        p1.mugitu(5,Norantza.GORA);
        p2.mugitu(2,Norantza.BEHERA);
        p3.mugitu(3,Norantza.EZKER);
        p2.mugitu(7,Norantza.ESKUMA);
    }
}
