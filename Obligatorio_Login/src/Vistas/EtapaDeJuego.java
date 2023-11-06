package Vistas;

import Logica.Juego;
import Logica.exceptions.InvalidPlayerTurnException;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import javax.swing.JButton;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class EtapaDeJuego extends javax.swing.JFrame 
{
    private AniadirNombresJugadores aniadirJugadores = new AniadirNombresJugadores();
    ArrayList<String> temp = new ArrayList<>();
    String[] pids;
    Juego juego;
    ArrayList<JButton> botonesCartas = new ArrayList<JButton>();
    ArrayList<String> idsCartas;
    PopUp ventana;
    
    public EtapaDeJuego(){}
    
    public EtapaDeJuego(ArrayList<String> idsJugadores) {
        initComponents();
        temp = idsJugadores;
        pids = temp.toArray(new String[temp.size()]);
        juego = new Juego(pids);
        populateArrayList();
        juego.Empezar(juego);
        setPidName();
        btnMazoCartaSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PNGs/small/" + juego.GetImagenCartaSuperior())));
        setButtonIcons();
    }
     public void setPidName(){
         String jugadorActual = juego.GetJugadorActual();
         pidNameLabel.setText("Cartas de " + jugadorActual);
     }
     
     public void setPidName(String jugadorActual){
         pidNameLabel.setText("Cartas de " + jugadorActual);
     }
     
     public void setButtonIcons(){
         String listaString = juego.GetManoJugador(juego.GetJugadorActual()).stream().map(Object::toString).collect(Collectors.joining(","));
         String[] nombreCartas = listaString.split(",");
         idsCartas = new ArrayList<>(Arrays.asList(nombreCartas));
         for(int i =0; i < idsCartas.size(); i++){
             botonesCartas.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PNGs/small/" + idsCartas.get(i) + ".png")));
         }
         for(int i = 0; i < idsCartas.size(); i++){
             botonesCartas.get(i).setIcon(null);
         }
     }
     
    public void populateArrayList() {
        botonesCartas.add(jButton1);
        botonesCartas.add(jButton2);
        botonesCartas.add(jButton3);
        botonesCartas.add(jButton4);
        botonesCartas.add(jButton5);
        botonesCartas.add(jButton6);
        botonesCartas.add(jButton7);
        botonesCartas.add(jButton8);
        botonesCartas.add(jButton9);
        botonesCartas.add(jButton10);
        botonesCartas.add(jButton11);
        botonesCartas.add(jButton12);
        botonesCartas.add(jButton13);
        botonesCartas.add(jButton14);
        botonesCartas.add(jButton15);

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton16 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        pidNameLabel = new javax.swing.JLabel();
        btnRobarCarta = new javax.swing.JButton();
        btnMazoCartaSuperior = new javax.swing.JButton();
        btnUltimaCartaTirada = new javax.swing.JButton();

        jButton16.setText("jButton16");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Uno");

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setRequestFocusEnabled(false);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("jButton7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("jButton8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("jButton9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("jButton10");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("jButton11");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("jButton12");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("jButton13");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("jButton14");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("jButton15");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        pidNameLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 48)); // NOI18N

        btnRobarCarta.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        btnRobarCarta.setText("Robar carta");
        btnRobarCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRobarCartaActionPerformed(evt);
            }
        });

        btnMazoCartaSuperior.setText("jButton18");

        btnUltimaCartaTirada.setText("jButton19");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pidNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(636, 636, 636)
                                .addComponent(btnRobarCarta))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMazoCartaSuperior)
                        .addGap(18, 18, 18)
                        .addComponent(btnUltimaCartaTirada)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMazoCartaSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btnUltimaCartaTirada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pidNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(btnRobarCarta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1331, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRobarCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRobarCartaActionPerformed
        JLabel mensaje = new JLabel(juego.GetJugadorActual() + " robó una carta");
        mensaje.setFont(new Font("Arial", Font.BOLD,48));
        JOptionPane.showMessageDialog(null,mensaje);
        try{
            juego.EnviarRobo(juego.GetJugadorActual());
        }
        catch(InvalidPlayerTurnException ex){
            Logger.getLogger(EtapaDeJuego.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        this.setPidName(juego.GetJugadorActual());
        this.setButtonIcons();
    }//GEN-LAST:event_btnRobarCartaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(idsCartas.get(0) != null){
            int index = 0;
            String idCarta = idsCartas.get(0);
            ventana = new PopUp(idCarta,juego,index,botonesCartas,this,btnMazoCartaSuperior);
            ventana.setBounds(750,40,700,800);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(idsCartas.get(1) != null){
            int index = 1;
            String idCarta = idsCartas.get(1);
            ventana = new PopUp(idCarta,juego,index,botonesCartas,this,btnMazoCartaSuperior);
            ventana.setBounds(750,40,700,800);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(idsCartas.get(2) != null){
            int index = 2;
            String idCarta = idsCartas.get(2);
            ventana = new PopUp(idCarta,juego,index,botonesCartas,this,btnMazoCartaSuperior);
            ventana.setBounds(750,40,700,800);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(idsCartas.get(3) != null){
            int index = 3;
            String idCarta = idsCartas.get(3);
            ventana = new PopUp(idCarta,juego,index,botonesCartas,this,btnMazoCartaSuperior);
            ventana.setBounds(750,40,700,800);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(idsCartas.get(4) != null){
            int index = 4;
            String idCarta = idsCartas.get(4);
            ventana = new PopUp(idCarta,juego,index,botonesCartas,this,btnMazoCartaSuperior);
            ventana.setBounds(750,40,700,800);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(idsCartas.get(5) != null){
            int index = 5;
            String idCarta = idsCartas.get(5);
            ventana = new PopUp(idCarta,juego,index,botonesCartas,this,btnMazoCartaSuperior);
            ventana.setBounds(750,40,700,800);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(idsCartas.get(6) != null){
            int index = 6;
            String idCarta = idsCartas.get(6);
            ventana = new PopUp(idCarta,juego,index,botonesCartas,this,btnMazoCartaSuperior);
            ventana.setBounds(750,40,700,800);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(idsCartas.get(7) != null){
            int index = 7;
            String idCarta = idsCartas.get(7);
            ventana = new PopUp(idCarta,juego,index,botonesCartas,this,btnMazoCartaSuperior);
            ventana.setBounds(750,40,700,800);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(idsCartas.get(8) != null){
            int index = 8;
            String idCarta = idsCartas.get(8);
            ventana = new PopUp(idCarta,juego,index,botonesCartas,this,btnMazoCartaSuperior);
            ventana.setBounds(750,40,700,800);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(idsCartas.get(9) != null){
            int index = 9;
            String idCarta = idsCartas.get(9);
            ventana = new PopUp(idCarta,juego,index,botonesCartas,this,btnMazoCartaSuperior);
            ventana.setBounds(750,40,700,800);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if(idsCartas.get(10) != null){
            int index = 10;
            String idCarta = idsCartas.get(10);
            ventana = new PopUp(idCarta,juego,index,botonesCartas,this,btnMazoCartaSuperior);
            ventana.setBounds(750,40,700,800);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if(idsCartas.get(11) != null){
            int index = 11;
            String idCarta = idsCartas.get(11);
            ventana = new PopUp(idCarta,juego,index,botonesCartas,this,btnMazoCartaSuperior);
            ventana.setBounds(750,40,700,800);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if(idsCartas.get(12) != null){
            int index = 12;
            String idCarta = idsCartas.get(12);
            ventana = new PopUp(idCarta,juego,index,botonesCartas,this,btnMazoCartaSuperior);
            ventana.setBounds(750,40,700,800);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if(idsCartas.get(13) != null){
            int index = 13;
            String idCarta = idsCartas.get(13);
            ventana = new PopUp(idCarta,juego,index,botonesCartas,this,btnMazoCartaSuperior);
            ventana.setBounds(750,40,700,800);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if(idsCartas.get(14) != null){
            int index = 14;
            String idCarta = idsCartas.get(14);
            ventana = new PopUp(idCarta,juego,index,botonesCartas,this,btnMazoCartaSuperior);
            ventana.setBounds(750,40,700,800);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

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
            java.util.logging.Logger.getLogger(EtapaDeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EtapaDeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EtapaDeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EtapaDeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EtapaDeJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMazoCartaSuperior;
    private javax.swing.JButton btnRobarCarta;
    private javax.swing.JButton btnUltimaCartaTirada;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pidNameLabel;
    // End of variables declaration//GEN-END:variables
}
