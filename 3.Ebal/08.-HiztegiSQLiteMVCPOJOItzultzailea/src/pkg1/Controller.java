package pkg1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
                Terminoa t = new Terminoa(view.jTextFieldEuskaraz.getText(), view.jTextFieldGazteleraz.getText());
                model.terminoaSartu(t);
                System.out.println("Hitza sartu duzu.");
                break;
            case "DIALOG":
                System.out.println("Dialog terminoa gehitu zabaltzen");
                view.jDialogTerminoaGehitu.setVisible(true);
                view.jDialogTerminoaGehitu.setSize(500, 500);
                break;
            case "IMPRIMATU":
                System.out.println("IMPRIMATZEKO botoia sakatu duzu");
                model.terminoakImprimatu();//consolas imprimatu
                view.jDialogHiztegiaIkusi.setVisible(true);
                view.jDialogHiztegiaIkusi.setSize(500, 500);
                break;
            case "IRTEN":
                view.dispose();
                break;
            /*case "IRTEN2":
                view.jDialogTerminoaGehitu.dispose();
                break;*/
        }
    }

}
