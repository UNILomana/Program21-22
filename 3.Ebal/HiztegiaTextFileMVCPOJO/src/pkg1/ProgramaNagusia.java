package pkg1;

/**
 *
 * @author lomana.markel
 */

public class ProgramaNagusia {
    
    public static void main(String args[]) {
        View view = View.viewaSortuBistaratu();

        Model model = new Model();
        
        //Funtzionatzen du ez gehitzeko behin eta berriz komentatua dago
       /* Terminoa terminoa = new Terminoa(14, "argia","luz");
        terminoa.terminoaGehitu(terminoa);*/

        Controller controller = new Controller(model, view);    
    }
}

