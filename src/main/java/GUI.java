
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ArmandoLluen <armando.lluen.g@uni.pe>
 */
public class GUI extends javax.swing.JFrame {
    Verificador verificador = new Verificador();
    Nombres nombres = new Nombres();
    Cliente50 terreno;
    Servidor50 jugador;
    /**
     * Creates new form GUI
     */
    public GUI() {
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
        ipText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        puertoText = new javax.swing.JTextField();
        conectarBoton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pantalla = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        conexionLabel = new javax.swing.JLabel();
        CerrarBoton = new javax.swing.JButton();
        startBoton = new javax.swing.JButton();
        cambiarBoton = new javax.swing.JButton();
        izquierdaBoton = new javax.swing.JButton();
        abajoBoton = new javax.swing.JButton();
        derechaBoton = new javax.swing.JButton();
        centroBoton = new javax.swing.JButton();
        arribaBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GUI.this.keyReleased(evt);
            }
        });

        jLabel1.setText("IP:");

        ipText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipTextActionPerformed(evt);
            }
        });

        jLabel2.setText("Puerto");

        puertoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puertoTextActionPerformed(evt);
            }
        });

        conectarBoton.setText("Conectar");
        conectarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarBotonActionPerformed(evt);
            }
        });

        pantalla.setColumns(20);
        pantalla.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        pantalla.setRows(5);
        pantalla.setFocusable(false);
        jScrollPane1.setViewportView(pantalla);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel3.setText("Battle Chopper");

        jLabel4.setText("Jugador A");

        conexionLabel.setText("No conectado");

        CerrarBoton.setText("Cerrar");
        CerrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarBotonActionPerformed(evt);
            }
        });

        startBoton.setText("Start");
        startBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBotonActionPerformed(evt);
            }
        });

        cambiarBoton.setText("cambiar IP");
        cambiarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarBotonActionPerformed(evt);
            }
        });

        izquierdaBoton.setText("<");
        izquierdaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izquierdaBotonActionPerformed(evt);
            }
        });

        abajoBoton.setText("v");
        abajoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abajoBotonActionPerformed(evt);
            }
        });

        derechaBoton.setText(">");
        derechaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaBotonActionPerformed(evt);
            }
        });

        centroBoton.setText("0");
        centroBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centroBotonActionPerformed(evt);
            }
        });

        arribaBoton.setText("^");
        arribaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ipText, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(puertoText, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(conectarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(jLabel3)))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(conexionLabel)
                            .addComponent(jLabel4))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(izquierdaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(abajoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(centroBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(derechaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(arribaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cambiarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(startBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CerrarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(conexionLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(puertoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(conectarBoton)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startBoton)
                        .addGap(18, 18, 18)
                        .addComponent(cambiarBoton)
                        .addGap(18, 18, 18)
                        .addComponent(CerrarBoton)
                        .addGap(27, 27, 27)
                        .addComponent(arribaBoton)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(izquierdaBoton)
                            .addComponent(derechaBoton)
                            .addComponent(centroBoton))
                        .addGap(18, 18, 18)
                        .addComponent(abajoBoton)))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ipTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipTextActionPerformed

    private void puertoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puertoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puertoTextActionPerformed

    private void conectarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarBotonActionPerformed
        // TODO add your handling code here
        String IP = ipText.getText();
        String puerto = puertoText.getText();
        if(Verificador.verificarIp(IP) && Verificador.verificarPuerto(puerto)){
            try{
                //terreno = new Cliente50(IP, puerto);
                conexionLabel.setText("conectado");
                ipText.setEnabled(false);
                puertoText.setEnabled(false);
                conectarBoton.setEnabled(false);
                pantalla.setText(nombres.pantalla_inicio);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "No se pudo establecer Conexion");
            }
        }else{
            conexionLabel.setText("No conectado");
            JOptionPane.showMessageDialog(null, "IP o puerto no validos");
        }
    }//GEN-LAST:event_conectarBotonActionPerformed

    private void CerrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarBotonActionPerformed

    private void startBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBotonActionPerformed
        // TODO add your handling code here:
        if(!conectarBoton.isEnabled()){
            //comienza el juego
            startBoton.setEnabled(false);
            this.setFocusTraversalKeysEnabled(true);
        }
    }//GEN-LAST:event_startBotonActionPerformed

    private void cambiarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarBotonActionPerformed
        // TODO add your handling code here:
        ipText.setEnabled(true);
        puertoText.setEnabled(true);
        conectarBoton.setEnabled(true);
    }//GEN-LAST:event_cambiarBotonActionPerformed

    private void izquierdaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izquierdaBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_izquierdaBotonActionPerformed

    private void abajoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abajoBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abajoBotonActionPerformed

    private void derechaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derechaBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_derechaBotonActionPerformed

    private void centroBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centroBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_centroBotonActionPerformed

    private void arribaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaBotonActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_arribaBotonActionPerformed

    private void keyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyReleased
        // TODO add your handling code here:
        
        int keyCode = evt.getKeyCode();
        
        switch (keyCode) {
            case KeyEvent.VK_W:
                JOptionPane.showMessageDialog(null, "boton arriba");
                System.out.println("boton arriba");
                break;
            case KeyEvent.VK_S:
                JOptionPane.showMessageDialog(null, "boton abajo");
                break;
            case KeyEvent.VK_A:
                JOptionPane.showMessageDialog(null, "boton izquierda");
                break;
            case KeyEvent.VK_D:
                JOptionPane.showMessageDialog(null, "boton derecha");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_keyReleased

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarBoton;
    private javax.swing.JButton abajoBoton;
    private javax.swing.JButton arribaBoton;
    private javax.swing.JButton cambiarBoton;
    private javax.swing.JButton centroBoton;
    private javax.swing.JButton conectarBoton;
    private javax.swing.JLabel conexionLabel;
    private javax.swing.JButton derechaBoton;
    private javax.swing.JTextField ipText;
    private javax.swing.JButton izquierdaBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea pantalla;
    private javax.swing.JTextField puertoText;
    private javax.swing.JButton startBoton;
    // End of variables declaration//GEN-END:variables
}
