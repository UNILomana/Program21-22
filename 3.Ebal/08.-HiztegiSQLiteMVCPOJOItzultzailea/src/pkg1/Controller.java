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

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        gehituActionListener(this);
    }

    private void gehituActionListener(ActionListener listener) {
        //GUIaren konponente guztiei gehitu listenerra
        view.jButtonTxertatu.addActionListener(listener);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            /*Botoi bakoitzeko case bat. "ezabatu, aldatu..."*/
            case "TXERTATU":
                System.out.println("TXERTATU botoia sakatu duzu");
                //model.terminoaSartuObjektuGabe();
                model.terminoakSartu(view.jTextFieldEuskaraz.getText(),view.jTextFieldGazteleraz.getText());
                model.terminoakImprimatu();
            case "IRTEN":
                //view.jButtonIrten.dispose();//close();
        }
    }

}
