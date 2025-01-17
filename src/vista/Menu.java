/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatMonokaiProIJTheme;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicLookAndFeel;
import javax.swing.plaf.metal.MetalLookAndFeel;
import logica.LOrdenar;

/**
 *
 * @author maria
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        lordenar = new LOrdenar();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        contenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        start = new javax.swing.JMenuItem();
        menuPrincipal = new javax.swing.JMenu();
        panelBurbuja = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        panelQuickSort = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        tiempos = new javax.swing.JMenu();
        tiempoTabla = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("BIENVENIDA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(jLabel2)
                .addContainerGap(288, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel2)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("Principal");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        start.setText("Crear listas");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        jMenu1.add(start);

        jMenuBar1.add(jMenu1);

        menuPrincipal.setText("Algoritmos");
        menuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrincipalActionPerformed(evt);
            }
        });

        panelBurbuja.setText("Burbuja");
        panelBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelBurbujaActionPerformed(evt);
            }
        });
        menuPrincipal.add(panelBurbuja);

        jMenuItem2.setText("Interseccion");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelIntersActionPerformed(evt);
            }
        });
        menuPrincipal.add(jMenuItem2);

        panelQuickSort.setText("QuickSort");
        panelQuickSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelQuickSortActionPerformed(evt);
            }
        });
        menuPrincipal.add(panelQuickSort);

        jMenuItem5.setText("Mergesort");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelMergeActionPerformed(evt);
            }
        });
        menuPrincipal.add(jMenuItem5);

        jMenuBar1.add(menuPrincipal);

        tiempos.setText("Tiempos");

        tiempoTabla.setText("Tabla");
        tiempoTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoTablaActionPerformed(evt);
            }
        });
        tiempos.add(tiempoTabla);

        jMenuBar1.add(tiempos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelQuickSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelQuickSortActionPerformed
        QuickSort quickSort = new QuickSort(lordenar);
        quickSort.setSize(659, 475);
        quickSort.setLocation(0, 0);
        
        contenedor.removeAll();
        contenedor.add(quickSort, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_panelQuickSortActionPerformed

    private void panelBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelBurbujaActionPerformed
        Burbuja burbuja = new Burbuja(lordenar);
        burbuja.setSize(659, 475);
        burbuja.setLocation(0, 0);
        
        contenedor.removeAll();
        contenedor.add(burbuja, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_panelBurbujaActionPerformed

    private void panelIntersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelBurbujaActionPerformed
        vInsercion interseccion = new vInsercion(lordenar);
        interseccion.setSize(659, 475);
        interseccion.setLocation(0, 0);
        
        contenedor.removeAll();
        contenedor.add(interseccion, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }
    
    private void panelMergeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelBurbujaActionPerformed
        vMerge merge = new vMerge(lordenar);
        merge.setSize(659, 475);
        merge.setLocation(0, 0);
        
        contenedor.removeAll();
        contenedor.add(merge, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }
    
    private void menuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrincipalActionPerformed
        
    }//GEN-LAST:event_menuPrincipalActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        Principal principal = new Principal(lordenar);
        principal.setSize(659, 475);
        principal.setLocation(0, 0);
        
        contenedor.removeAll();
        contenedor.add(principal, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_startActionPerformed

    private void tiempoTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoTablaActionPerformed
        Tiempo primero = new Tiempo(lordenar);
        primero.setSize(659, 475);
        primero.setLocation(0, 0);
        
        contenedor.removeAll();
        contenedor.add(primero, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_tiempoTablaActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
            //UIManager.setLookAndFeel( new FlatLightLaf() );
            FlatMonokaiProIJTheme.setup();
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuPrincipal;
    private javax.swing.JMenuItem panelBurbuja;
    private javax.swing.JMenuItem panelQuickSort;
    private javax.swing.JMenuItem start;
    private javax.swing.JMenuItem tiempoTabla;
    private javax.swing.JMenu tiempos;
    // End of variables declaration//GEN-END:variables
    private LOrdenar lordenar;
    
    
    
}
