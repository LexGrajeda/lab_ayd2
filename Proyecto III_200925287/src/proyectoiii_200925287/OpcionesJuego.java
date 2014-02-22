package proyectoiii_200925287;

import java.io.*;

public class OpcionesJuego extends javax.swing.JFrame {

 public OpcionesJuego()
 {

     initComponents();
     jMenuItem4.setText("Salir");

    
       
 }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Opciones de Juego");
        setBounds(new java.awt.Rectangle(140, 50, 960, 610));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(960, 610));
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("BankGothic Lt BT", 0, 18));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ataques de Unidades");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 270, 240, 50);

        jLabel6.setFont(new java.awt.Font("BankGothic Lt BT", 0, 18));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Posicionamiento de Unidades");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 100, 330, 50);

        jButton1.setFont(new java.awt.Font("BankGothic Lt BT", 0, 11));
        jButton1.setText("Posicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 170, 110, 21);

        jButton2.setFont(new java.awt.Font("BankGothic Lt BT", 0, 11));
        jButton2.setText("Ataque");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(280, 350, 90, 21);

        jLabel7.setFont(new java.awt.Font("BankGothic Lt BT", 0, 18));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jugador 1");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(210, 10, 190, 50);

        jButton3.setFont(new java.awt.Font("BankGothic Lt BT", 0, 11));
        jButton3.setText("Crear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(190, 500, 110, 21);

        jLabel8.setFont(new java.awt.Font("BankGothic Lt BT", 0, 18));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Crear Unidades");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(150, 430, 190, 50);

        jButton4.setFont(new java.awt.Font("BankGothic Lt BT", 0, 11));
        jButton4.setText("Crear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(720, 500, 110, 21);

        jLabel9.setFont(new java.awt.Font("BankGothic Lt BT", 0, 18));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" Crear Unidades");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(680, 430, 190, 50);

        jButton5.setFont(new java.awt.Font("BankGothic Lt BT", 0, 11));
        jButton5.setText("Ataque");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(800, 350, 90, 21);

        jLabel3.setFont(new java.awt.Font("BankGothic Lt BT", 0, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ataques de Unidades");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(660, 270, 240, 50);

        jButton6.setFont(new java.awt.Font("BankGothic Lt BT", 0, 11));
        jButton6.setText("Posicionar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(720, 170, 110, 21);

        jLabel10.setFont(new java.awt.Font("BankGothic Lt BT", 0, 18));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" Posicionamiento de Unidades");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(640, 100, 330, 50);

        jLabel11.setFont(new java.awt.Font("BankGothic Lt BT", 0, 18));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Jugador 2");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(740, 10, 190, 50);

        jButton7.setFont(new java.awt.Font("BankGothic Lt BT", 0, 11));
        jButton7.setText("Moverse");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(670, 350, 90, 21);

        jButton8.setFont(new java.awt.Font("BankGothic Lt BT", 0, 11));
        jButton8.setText("Moverse");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(150, 350, 90, 21);

        jLabel68.setFont(new java.awt.Font("BankGothic Md BT", 0, 14));
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel68);
        jLabel68.setBounds(400, 570, 40, 14);

        jLabel69.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Seg");
        getContentPane().add(jLabel69);
        jLabel69.setBounds(360, 570, 30, 14);

        jLabel66.setFont(new java.awt.Font("BankGothic Md BT", 0, 14));
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel66);
        jLabel66.setBounds(310, 570, 40, 14);

        jLabel67.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("T");
        getContentPane().add(jLabel67);
        jLabel67.setBounds(280, 570, 30, 14);

        jLabel65.setFont(new java.awt.Font("BankGothic Md BT", 0, 14));
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel65);
        jLabel65.setBounds(230, 570, 40, 14);

        jLabel64.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Sol");
        getContentPane().add(jLabel64);
        jLabel64.setBounds(200, 570, 30, 14);

        jLabel18.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("En Fabrica");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(110, 570, 80, 14);

        jLabel70.setFont(new java.awt.Font("BankGothic Md BT", 0, 14));
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel70);
        jLabel70.setBounds(920, 570, 40, 14);

        jLabel71.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Seg");
        getContentPane().add(jLabel71);
        jLabel71.setBounds(880, 570, 30, 14);

        jLabel72.setFont(new java.awt.Font("BankGothic Md BT", 0, 14));
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel72);
        jLabel72.setBounds(830, 570, 40, 14);

        jLabel73.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("T");
        getContentPane().add(jLabel73);
        jLabel73.setBounds(800, 570, 30, 14);

        jLabel74.setFont(new java.awt.Font("BankGothic Md BT", 0, 14));
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel74);
        jLabel74.setBounds(750, 570, 40, 14);

        jLabel75.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("Sol");
        getContentPane().add(jLabel75);
        jLabel75.setBounds(720, 570, 30, 14);

        jLabel19.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("En Fabrica");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(630, 570, 80, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/FondoPP.jpg"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(1170, 527));
        jLabel1.setPreferredSize(new java.awt.Dimension(1175, 527));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -100, 1000, 700);

        jMenu1.setMnemonic('a');
        jMenu1.setText("Archivo");

        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Abrir");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Guardar");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu3.setMnemonic('j');
        jMenu3.setText("Juego");

        jMenuItem5.setText("Reiniciar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Pausar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Continuar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu2.setMnemonic('m');

        jMenuItem8.setText("Historial de Juegos");
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Top Tiempos");
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu4.setMnemonic('x');
        jMenu4.setText("Ayuda");

        jMenuItem10.setText("Acerca del Juego");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("Creditos");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        Tablero.jLabel27.setVisible(false);
        Tablero.jLabel26.setVisible(true);
        Tablero.AtacandoUnidadJugador1 = true;

    }//GEN-LAST:event_jButton2ActionPerformed
private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    
        Tablero.hilo.suspend();
        Tablero.issuspended = true;
        Tablero.play.setVisible(true);

    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:

    Tablero.jPanelPosiciones.setVisible(true);
    Tablero.jPanelCreacion.setVisible(false);
    Tablero.jLabel27.setVisible(false);
    Tablero.jLabel26.setVisible(true);

   
           
    }//GEN-LAST:event_jButton1ActionPerformed

private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
    // TODO add your handling code here:

    new Creditos().setVisible(true);

}//GEN-LAST:event_jMenuItem11ActionPerformed

private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    // TODO add your handling code here:

    Tablero.reiniciarpartida();
   
}//GEN-LAST:event_jMenuItem5ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    // TODO add your handling code here:

    Tablero.jPanelCreacion.setVisible(true);
    Tablero.jPanelPosiciones.setVisible(false);
    Tablero.jLabel27.setVisible(true);
    Tablero.jLabel26.setVisible(false);

}//GEN-LAST:event_jButton3ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    // TODO add your handling code here:

    Tablero.jPanelCreacion2.setVisible(true);
    Tablero.jPanelPosiciones2.setVisible(false);
    Tablero.jLabel26.setVisible(false);
    Tablero.jLabel27.setVisible(true);

}//GEN-LAST:event_jButton4ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    // TODO add your handling code here:

    Tablero.jLabel26.setVisible(false);
    Tablero.jLabel27.setVisible(true);
    Tablero.AtacandoUnidadJugador2 = true;

}//GEN-LAST:event_jButton5ActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    // TODO add your handling code here:

    Tablero.jPanelPosiciones2.setVisible(true);
    Tablero.jPanelCreacion2.setVisible(false);
    Tablero.jLabel26.setVisible(false);
    Tablero.jLabel27.setVisible(true);

 
}//GEN-LAST:event_jButton6ActionPerformed

private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed

        try
    	{
    	Runtime rt = Runtime.getRuntime();
	rt.exec("C:\\Archivos de Programa\\Adobe\\Reader 9.0\\Reader\\AcroRd32.exe"+" "+"Manual de Usuario.pdf");

    	}
    	catch (IOException ex)
    	{

    	}

}//GEN-LAST:event_jMenuItem10ActionPerformed

private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    // TODO add your handling code here:

    System.exit(0);

}//GEN-LAST:event_jMenuItem4ActionPerformed

private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    // TODO add your handling code here:

    Tablero.jLabel26.setVisible(false);
    Tablero.jLabel27.setVisible(true);
    Tablero.SelecUnidadJugador2Mover = true;

}//GEN-LAST:event_jButton7ActionPerformed

private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    // TODO add your handling code here:

    Tablero.jLabel27.setVisible(false);
    Tablero.jLabel26.setVisible(true);
    Tablero.SelecUnidadJugador1Mover = true;

}//GEN-LAST:event_jButton8ActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    // TODO add your handling code here:

   Tablero.nombresjugadores();

   jButton1.enable(true);
   jButton6.enable(true);

}//GEN-LAST:event_jMenuItem1ActionPerformed
/*
private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jMenuItem6ActionPerformed

private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jMenuItem7ActionPerformed
 */
 private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:

   Tablero.hilo.resume();
   Tablero.issuspended = false;

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton5;
    public static javax.swing.JButton jButton6;
    public static javax.swing.JButton jButton7;
    public static javax.swing.JButton jButton8;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel64;
    public static javax.swing.JLabel jLabel65;
    public static javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    public static javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    public static javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    public static javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JMenu jMenu1;
    public static javax.swing.JMenu jMenu2;
    public static javax.swing.JMenu jMenu3;
    public static javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JMenuItem jMenuItem10;
    public static javax.swing.JMenuItem jMenuItem11;
    public static javax.swing.JMenuItem jMenuItem2;
    public static javax.swing.JMenuItem jMenuItem3;
    public static javax.swing.JMenuItem jMenuItem4;
    public static javax.swing.JMenuItem jMenuItem5;
    public static javax.swing.JMenuItem jMenuItem6;
    public static javax.swing.JMenuItem jMenuItem7;
    public static javax.swing.JMenuItem jMenuItem8;
    public static javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}