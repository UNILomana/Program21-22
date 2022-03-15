package pkg1;

/**
 *
 * @author lomana.markel
 */

public class ProgramaNagusia {
    
    public static void main(String args[]) {

        View view = View.viewaSortuBistaratu();

        Model model = new Model();

        Controller controller = new Controller(model, view);    
    }
}

