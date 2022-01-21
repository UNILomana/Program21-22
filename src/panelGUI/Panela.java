package panelGUI;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import exekutagarriak.TestMyRectangle;

import model.MyPoint;

/**
 *
 * @author lomana.markel
 */
public class Panela extends JPanel {
    
    public Panela() {

    }

    /**
     * Marraztuko ditu borobila, Laukizuzena eta Triangelua automatikoki, balore
     * prederterminatu batzuekin.
     *
     * @param g
     */
    public void paintComponent(Graphics g) {  // invoke via repaint()
        super.paintComponent(g);    // fill background
        setBackground(Color.white); // set its background color

        g.setColor(Color.pink);
        g.drawOval(250, 250, 100, 100);

        g.setColor(Color.blue);
        g.drawRect(50, 50, 500, 500);

        g.setColor(Color.red);
        g.drawLine(300, 100, 500, 500);
        g.drawLine(100, 500, 300, 100);
        g.drawLine(100, 500, 500, 500);

    }

    public static void main(String[] args) {
        	
        String TITLE = "Markel Lomana";
        // Run GUI construction codes in Event-Dispatching thread for thread safety
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame(TITLE);
                // Set the content-pane of the JFrame to an instance of main JPanel
                frame.setContentPane(new Panela());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null); // center the application window
                frame.setVisible(true);            // show it
                frame.setSize(600, 600);
                frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

            }
        
             
            	
        });
    }
}
