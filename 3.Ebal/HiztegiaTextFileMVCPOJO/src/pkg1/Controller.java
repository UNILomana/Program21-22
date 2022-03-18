package pkg1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkg1.View;
import pkg1.Model;

/**
 * Kontrolatuko du view eta model-en arteko erlazioa
 *
 * @author lomana.markel
 */
public class Controller implements ActionListener {

    private Model model;
    private View view;
    private Terminoa terminoa;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        gehituActionListener(this);
    }

    private void gehituActionListener(ActionListener listener) {
        //GUIaren konponente guztiei gehitu listenerra

        view.jButtonIrten.addActionListener(listener);
      
   

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            /*Botoi bakoitzeko case bat. "ezabatu, aldatu..."*/
            case "jButton1":
            {
                try {
                    System.out.println(model.terminoakJaso());
                    model.terminoakImprimatu();
                } catch (IOException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                System.out.println("Hitza sartu duzu.");
                break;

          
            case "IRTEN":
                view.dispose();
                break;
          
        }
    }

}
