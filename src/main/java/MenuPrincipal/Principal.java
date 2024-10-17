/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MenuPrincipal;

import ControldeExistencias.ControlExistenciasMenu;
import GestionProductos.Gestionproductos;
import InformesyEstadísticas.MenúInformeyEstaditica;
import PedidosDeCompra.MenuPedidosdeCompra;

/**
 *
 * @author Bienc
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        GestionProducto = new javax.swing.JButton();
        ControlExistencias = new javax.swing.JButton();
        PedidosCompra = new javax.swing.JButton();
        InformesyEstadisticas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MENÚ PRINCIPAL");

        GestionProducto.setText("Gestion de Productos");
        GestionProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionProductoActionPerformed(evt);
            }
        });

        ControlExistencias.setText("Control de Existencias");
        ControlExistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ControlExistenciasActionPerformed(evt);
            }
        });

        PedidosCompra.setText("Pedidos de compra");
        PedidosCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedidosCompraActionPerformed(evt);
            }
        });

        InformesyEstadisticas.setText("Informes y Estadisticas");
        InformesyEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformesyEstadisticasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PedidosCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GestionProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ControlExistencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InformesyEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ControlExistencias)
                    .addComponent(GestionProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PedidosCompra)
                    .addComponent(InformesyEstadisticas))
                .addContainerGap(368, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ControlExistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ControlExistenciasActionPerformed
    ControlExistenciasMenu newframe = new ControlExistenciasMenu ();    
   newframe.setVisible(true);
     
this.dispose();
    }//GEN-LAST:event_ControlExistenciasActionPerformed

    private void InformesyEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformesyEstadisticasActionPerformed
    MenúInformeyEstaditica newframe = new MenúInformeyEstaditica();    
   newframe.setVisible(true);
     
this.dispose();
    }//GEN-LAST:event_InformesyEstadisticasActionPerformed

    private void GestionProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionProductoActionPerformed
        
     Gestionproductos newframe = new Gestionproductos();    
   newframe.setVisible(true);
     
this.dispose();
        
        
        
        
    }//GEN-LAST:event_GestionProductoActionPerformed

    private void PedidosCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedidosCompraActionPerformed
    MenuPedidosdeCompra  newframe = new MenuPedidosdeCompra ();    
   newframe.setVisible(true);
     
this.dispose();
    }//GEN-LAST:event_PedidosCompraActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ControlExistencias;
    private javax.swing.JButton GestionProducto;
    private javax.swing.JButton InformesyEstadisticas;
    private javax.swing.JButton PedidosCompra;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
