/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframeak;

import java.awt.*;
import model.Puntua;

/**
 *
 * @author lomana.markel
 */

/*EZ DAKIT EZTA NUNDIK HARTU EZ DAKIT EGITEN*/
public class JFrame extends javax.swing.JFrame {

    
    public JFrame() {
        initComponents();
    }
    
    public void paintComponent(Graphics g) {  // invoke via repaint()
        
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 719, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        Graphics g = (Graphics) g;
        Puntua p1 = new Puntua(2,4);
        p1.marraztu(g);
        
    }//GEN-LAST:event_formMouseClicked

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        	
        String TITLE = "Markel Lomana";
        // Run GUI construction codes in Event-Dispatching thread for thread safety
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                javax.swing.JFrame frame = new javax.swing.JFrame(TITLE);
                // Set the content-pane of the JFrame to an instance of main JPanel
                frame.setContentPane(new JFrameMarrazkigarria());
                frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null); // center the application window
                frame.setVisible(true);            // show it
                frame.setSize(600, 600);
                frame.setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);

            }
        
             
            	
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
