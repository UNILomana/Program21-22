package pkg1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pkg1.View;
import pkg1.Model;

/**
 * Kontrolatuko du view eta model-en arteko erlazioa
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
        view.jButtonTxertatu.addActionListener(listener);
        view.jButtonIrten.addActionListener(listener);
        view.jButtonTIkusi.addActionListener(listener);
        view.jButtonTGehitu.addActionListener(listener);
        view.jButtonIrten.addActionListener(listener);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            /*Botoi bakoitzeko case bat. "ezabatu, aldatu..."*/
            case "TXERTATU":
                System.out.println("TXERTATU botoia sakatu duzu");
                
                Terminoa t = new Terminoa(view.jTextFieldEuskaraz.getText(),view.jTextFieldGazteleraz.getText());
                //model.terminoaSartuObjektuGabe(t);
                model.terminoaSartu(t);
                model.terminoakImprimatu();
            
            case "DIALOG":
                view.jDialogTerminoaGehitu.setVisible(true);
                view.jDialogTerminoaGehitu.setSize(900,900);
                
                
            case "IMPRIMATU":
                System.out.println("IMPRIMATZEKO botoia sakatu duzu");
                model.terminoakImprimatu();//consolas imprimatu
                view.jDialogHiztegiaIkusi.setVisible(true);
                view.jDialogHiztegiaIkusi.setSize(900,900);
                
            case "IRTEN":
               //view.jButtonIrten.setVisible;
                //close();
        }
    }

}
