package proyectoiii_200925287;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Tablero extends javax.swing.JFrame implements ActionListener {
     // para los turnos
    static boolean TurnoJugador1;
    static boolean TurnoJugador2;
    // listas
    static public listajugadores listaJugador2;
    static public metales listametales;
    static public listajugadores listaJugador1;
    // para guardar los nombres
    static public String Jugador1;
    static public String Jugador2;

    metales reiniciarmetales;
    listajugadores reiniciarlistajugadores;
    nodo reiniciarnodo;

    JLabel jLabel4 = new JLabel();
    // Fuente para los Botones por que no me deja ver el Numero de Unidades
    Font K = new Font("BankGothic Lt BT",1,3);

    public static matriz tablerobotones[][]; // Mi Matriz de Botones

    static int postempmovimientox;  // variable temporal que maneja las posiciones de los jugadores
    static int postempmovimientoy;

    // para verificar el posicionamiento de Unidades del jugador 1
    static public boolean SelecUnidadJugador1Mover;
    static public boolean MoviendoUnidadJugador1;
    static boolean PosicionandoSoldadoJugador1;
    static public boolean PosicionandoTanqueJugador1;
    static public boolean PosicionandoSegadorJugador1;
    static public boolean AtacandoUnidadJugador1;
   
    // para verificar el posicionamiento de Unidades del jugador 2
    static public boolean PosicionandoSoldadoJugador2;
    static public boolean PosicionandoSegadorJugador2;
    static public boolean PosicionandoTanqueJugador2;
    static public boolean SelecUnidadJugador2Mover;
    static public boolean MoviendoUnidadJugador2;
    static public boolean AtacandoUnidadJugador2;

    // variables del jugador
    static public boolean AtacandoSoldadoJugador1;
    static public boolean AtacandoSegadorJugador1;
    static public boolean AtacandoTanqueJugador1;
    static public int contadorMetalesJugador1;
    static public int contadorMetalesJugador2;
    static public boolean AtacandoSoldadoJugador2;
    static public boolean AtacandoSegadorJjugador2;
    static public boolean atacando_tanque_jugador2;

public Tablero() {
  initComponents();

  // Matriz de Botones
  tablerobotones = new matriz[10][10];

  for(int i = 0; i < tablerobotones.length; i++)
  {
     for(int j = 0; j < tablerobotones[i].length; j++)
        {
          tablerobotones[i][j] = new matriz();
        }

  }   
   // listas
   listametales = new metales();
   listaJugador1 = new listajugadores();
   listaJugador2 = new listajugadores();

   TurnoJugador1 = false;
   TurnoJugador2 = false;

   //variables de posicion
   PosicionandoSoldadoJugador1 = false;
   PosicionandoSegadorJugador1 = false;
   PosicionandoTanqueJugador1 = false;
   SelecUnidadJugador1Mover = false;
   MoviendoUnidadJugador1 = false;
   AtacandoUnidadJugador1 = false;
   PosicionandoSoldadoJugador2 = false;
   PosicionandoSegadorJugador2 = false;
   PosicionandoTanqueJugador2 = false;
   SelecUnidadJugador2Mover = false;
   MoviendoUnidadJugador2 = false;
   AtacandoUnidadJugador1 = false;
 
play.setVisible(false);
jLabel27.setVisible(false);
pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/pause.png")));
stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/stop.png")));

agregartableroaPanel(); // La Matriz de Botones

jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/Fondo2.JPG")));
jLabel4.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
jLabel4.setDoubleBuffered(true);
jPanel1.add(jLabel4);
jLabel4.setBounds(0, 0, 960, 700);
}
        // Contador
     static int hora = 0, min =0, seg =0;
     static public Thread hilo = new Thread()
    {
        public void run()
        {
            try
            {
                while(true)
                {
                    if(seg==59) { seg=0; min++; }
                    if(min==59) { min=0; hora++; }
                    seg++;

                    jLabel24.setText(hora+":"+min+":"+seg);

                    hilo.sleep(1000);
                }
            } catch (java.lang.InterruptedException ie) { System.out.println(ie.getMessage()); }
        }
    };

    static public boolean issuspended = false;
    static public boolean stoped = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel25 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanelPosiciones = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanelCreacion = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanelPosiciones2 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanelCreacion2 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        stop = new javax.swing.JButton();
        play = new javax.swing.JButton();
        pause = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelJugadorEnTurno = new javax.swing.JLabel();

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/Turno 2 Us.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Battle Craft");
        setMinimumSize(getMaximumSize());
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel29.setFont(new java.awt.Font("BankGothic Md BT", 0, 14));
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel29);
        jLabel29.setBounds(1120, 450, 40, 14);

        jLabel62.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Metales:");
        getContentPane().add(jLabel62);
        jLabel62.setBounds(1100, 420, 80, 20);

        jLabel24.setFont(new java.awt.Font("BankGothic Lt BT", 0, 18));
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel24);
        jLabel24.setBounds(1180, 580, 90, 20);

        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(140, 20, 960, 700);

        jPanelPosiciones.setLayout(null);

        jLabel32.setFont(new java.awt.Font("BankGothic Lt BT", 0, 10)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/Segador.png"))); // NOI18N
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        jPanelPosiciones.add(jLabel32);
        jLabel32.setBounds(10, 280, 110, 70);

        jLabel6.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Segadores:");
        jPanelPosiciones.add(jLabel6);
        jLabel6.setBounds(0, 250, 80, 20);

        jLabel31.setFont(new java.awt.Font("BankGothic Lt BT", 0, 10)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/tanqueGT.png"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanelPosiciones.add(jLabel31);
        jLabel31.setBounds(0, 170, 130, 60);

        jLabel12.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tanques:");
        jPanelPosiciones.add(jLabel12);
        jLabel12.setBounds(0, 130, 70, 30);

        jLabel2.setFont(new java.awt.Font("BankGothic Lt BT", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/soldado.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanelPosiciones.add(jLabel2);
        jLabel2.setBounds(10, 50, 130, 80);

        jLabel11.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Soldados:");
        jPanelPosiciones.add(jLabel11);
        jLabel11.setBounds(0, 30, 80, 14);

        jLabel37.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14));
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("a Posicionarse");
        jPanelPosiciones.add(jLabel37);
        jLabel37.setBounds(0, 0, 120, 20);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/Fondo.JPG"))); // NOI18N
        jPanelPosiciones.add(jLabel36);
        jLabel36.setBounds(0, 0, 120, 380);

        getContentPane().add(jPanelPosiciones);
        jPanelPosiciones.setBounds(10, 30, 120, 380);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/Turno 2 Us.png"))); // NOI18N
        getContentPane().add(jLabel27);
        jLabel27.setBounds(1180, 370, 90, 90);

        jPanelCreacion.setMaximumSize(new java.awt.Dimension(1350, 927));
        jPanelCreacion.setMinimumSize(new java.awt.Dimension(1350, 927));
        jPanelCreacion.setLayout(null);

        jLabel38.setFont(new java.awt.Font("BankGothic Lt BT", 0, 10)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/Segador.png"))); // NOI18N
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });
        jPanelCreacion.add(jLabel38);
        jLabel38.setBounds(10, 280, 120, 70);

        jLabel39.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Segadores:");
        jPanelCreacion.add(jLabel39);
        jLabel39.setBounds(0, 250, 80, 20);

        jLabel41.setFont(new java.awt.Font("BankGothic Lt BT", 0, 10)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/tanqueGT.png"))); // NOI18N
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });
        jPanelCreacion.add(jLabel41);
        jLabel41.setBounds(10, 170, 120, 60);

        jLabel42.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Tanques:");
        jPanelCreacion.add(jLabel42);
        jLabel42.setBounds(0, 130, 70, 30);

        jLabel44.setFont(new java.awt.Font("BankGothic Lt BT", 0, 10)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/soldado.png"))); // NOI18N
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });
        jPanelCreacion.add(jLabel44);
        jLabel44.setBounds(10, 50, 120, 80);

        jLabel45.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Soldados:");
        jPanelCreacion.add(jLabel45);
        jLabel45.setBounds(0, 30, 80, 14);

        jLabel47.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14));
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("a Crearse");
        jPanelCreacion.add(jLabel47);
        jLabel47.setBounds(0, 0, 120, 20);

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/Fondo.JPG"))); // NOI18N
        jPanelCreacion.add(jLabel48);
        jLabel48.setBounds(0, 0, 120, 380);

        getContentPane().add(jPanelCreacion);
        jPanelCreacion.setBounds(10, 30, 120, 380);

        jPanelPosiciones2.setLayout(null);

        jLabel33.setFont(new java.awt.Font("BankGothic Lt BT", 0, 10)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/Segador.png"))); // NOI18N
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        jPanelPosiciones2.add(jLabel33);
        jLabel33.setBounds(10, 280, 120, 70);

        jLabel14.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Segadores:");
        jPanelPosiciones2.add(jLabel14);
        jLabel14.setBounds(0, 250, 80, 20);

        jLabel34.setFont(new java.awt.Font("BankGothic Lt BT", 0, 10)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/tanqueGT.png"))); // NOI18N
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        jPanelPosiciones2.add(jLabel34);
        jLabel34.setBounds(10, 170, 130, 60);

        jLabel16.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Tanques:");
        jPanelPosiciones2.add(jLabel16);
        jLabel16.setBounds(0, 130, 70, 30);

        jLabel17.setFont(new java.awt.Font("BankGothic Lt BT", 0, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/soldado.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanelPosiciones2.add(jLabel17);
        jLabel17.setBounds(10, 50, 130, 80);

        jLabel22.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Soldados:");
        jPanelPosiciones2.add(jLabel22);
        jLabel22.setBounds(0, 30, 80, 14);

        jLabel50.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14));
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("a Posicionarse");
        jPanelPosiciones2.add(jLabel50);
        jLabel50.setBounds(0, 0, 120, 20);

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/Fondo.JPG"))); // NOI18N
        jPanelPosiciones2.add(jLabel51);
        jLabel51.setBounds(0, 0, 120, 380);

        jLabel30.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Metales:");
        jPanelPosiciones2.add(jLabel30);
        jLabel30.setBounds(-10, 370, 80, 20);

        getContentPane().add(jPanelPosiciones2);
        jPanelPosiciones2.setBounds(1120, 40, 120, 380);

        jPanelCreacion2.setLayout(null);

        jLabel35.setFont(new java.awt.Font("BankGothic Lt BT", 0, 10)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/Segador.png"))); // NOI18N
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        jPanelCreacion2.add(jLabel35);
        jLabel35.setBounds(10, 280, 120, 70);

        jLabel52.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Segadores:");
        jPanelCreacion2.add(jLabel52);
        jLabel52.setBounds(0, 250, 80, 20);

        jLabel54.setFont(new java.awt.Font("BankGothic Lt BT", 0, 10)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/tanqueGT.png"))); // NOI18N
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
        });
        jPanelCreacion2.add(jLabel54);
        jLabel54.setBounds(10, 170, 120, 60);

        jLabel55.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Tanques:");
        jPanelCreacion2.add(jLabel55);
        jLabel55.setBounds(0, 130, 70, 30);

        jLabel57.setFont(new java.awt.Font("BankGothic Lt BT", 0, 10)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/soldado.png"))); // NOI18N
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel57MouseClicked(evt);
            }
        });
        jPanelCreacion2.add(jLabel57);
        jLabel57.setBounds(10, 50, 120, 80);

        jLabel58.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Soldados:");
        jPanelCreacion2.add(jLabel58);
        jLabel58.setBounds(0, 30, 80, 14);

        jLabel60.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14));
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("a Crearse");
        jPanelCreacion2.add(jLabel60);
        jLabel60.setBounds(0, 0, 120, 20);

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/Fondo.JPG"))); // NOI18N
        jPanelCreacion2.add(jLabel61);
        jLabel61.setBounds(0, 0, 120, 380);

        getContentPane().add(jPanelCreacion2);
        jPanelCreacion2.setBounds(1120, 40, 120, 380);

        jLabel18.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("En Juego");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(140, 0, 80, 14);

        jLabel8.setFont(new java.awt.Font("BankGothic Lt BT", 0, 18));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tiempo");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1110, 580, 80, 14);

        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });
        getContentPane().add(stop);
        stop.setBounds(1140, 670, 60, 60);

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/play2.png"))); // NOI18N
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });
        getContentPane().add(play);
        play.setBounds(1200, 610, 60, 60);

        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });
        getContentPane().add(pause);
        pause.setBounds(1140, 610, 60, 60);

        jLabel7.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Metales:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 420, 80, 20);

        jLabel28.setFont(new java.awt.Font("BankGothic Md BT", 0, 14));
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel28);
        jLabel28.setBounds(100, 420, 40, 14);

        jLabel49.setFont(new java.awt.Font("BankGothic Md BT", 0, 14));
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Unidades");
        getContentPane().add(jLabel49);
        jLabel49.setBounds(1130, 10, 80, 14);

        jLabel63.setFont(new java.awt.Font("BankGothic Md BT", 0, 14));
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Unidades");
        getContentPane().add(jLabel63);
        jLabel63.setBounds(10, 10, 80, 14);

        jLabel64.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Sol");
        getContentPane().add(jLabel64);
        jLabel64.setBounds(230, 0, 30, 14);

        jLabel65.setFont(new java.awt.Font("BankGothic Md BT", 0, 14));
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel65);
        jLabel65.setBounds(260, 0, 40, 14);

        jLabel66.setFont(new java.awt.Font("BankGothic Md BT", 0, 14));
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel66);
        jLabel66.setBounds(340, 0, 40, 14);

        jLabel67.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("T");
        getContentPane().add(jLabel67);
        jLabel67.setBounds(310, 0, 30, 14);

        jLabel68.setFont(new java.awt.Font("BankGothic Md BT", 0, 14));
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel68);
        jLabel68.setBounds(430, 0, 40, 14);

        jLabel69.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Seg");
        getContentPane().add(jLabel69);
        jLabel69.setBounds(390, 0, 30, 14);

        jLabel70.setFont(new java.awt.Font("BankGothic Md BT", 0, 14));
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel70);
        jLabel70.setBounds(1070, 0, 40, 14);

        jLabel71.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Seg");
        getContentPane().add(jLabel71);
        jLabel71.setBounds(1030, 0, 30, 14);

        jLabel72.setFont(new java.awt.Font("BankGothic Md BT", 0, 14));
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel72);
        jLabel72.setBounds(980, 0, 40, 14);

        jLabel73.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("T");
        getContentPane().add(jLabel73);
        jLabel73.setBounds(950, 0, 30, 14);

        jLabel74.setFont(new java.awt.Font("BankGothic Md BT", 0, 14));
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel74);
        jLabel74.setBounds(900, 0, 40, 14);

        jLabel75.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("Sol");
        getContentPane().add(jLabel75);
        jLabel75.setBounds(870, 0, 30, 14);

        jLabel76.setFont(new java.awt.Font("BankGothic Md BT", 0, 12));
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("En Juego");
        getContentPane().add(jLabel76);
        jLabel76.setBounds(780, 0, 80, 14);

        jLabel13.setFont(new java.awt.Font("BankGothic Md BT", 0, 18));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Usuario 1");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 660, 110, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/dus1.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 530, 100, 130);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/Turno Us 1.png"))); // NOI18N
        getContentPane().add(jLabel26);
        jLabel26.setBounds(20, 460, 90, 90);

        jLabel9.setFont(new java.awt.Font("BankGothic Md BT", 0, 18));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Usuario 2");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1130, 560, 110, 14);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/d us2.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1140, 440, 100, 130);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoiii_200925287/Fondo.JPG"))); // NOI18N
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jLabel1.setDoubleBuffered(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 750);

        jLabelJugadorEnTurno.setForeground(new java.awt.Color(254, 254, 254));
        jLabelJugadorEnTurno.setText("Jugador en turno");
        getContentPane().add(jLabelJugadorEnTurno);
        jLabelJugadorEnTurno.setBounds(0, 0, 83, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private  void agregartableroaPanel()
{
  for(int i = 0; i < tablerobotones.length; i++)
   {
    for(int j = 0; j < tablerobotones[i].length; j++)
    {
     tablerobotones[i][j].setBounds((95*i),(69*j),95,69);
     tablerobotones[i][j].setVisible(true);
     tablerobotones[i][j].addActionListener((ActionListener) this);
     tablerobotones[i][j].setFont(K);
     tablerobotones[i][j].posicionx = i;
     tablerobotones[i][j].posiciony = j;
     jPanel1.add(tablerobotones[i][j]);
    }
   }
}
 static public void reiniciarpartida()
 {
    inicializacion();
    hilo.start();
    metales reiniciarmetales = new metales();
    listajugadores reiniciarlistajugadores = new listajugadores();
    nodo reiniciarnodo = new nodo();
    

}

  static public void analisis2_reiniciarpartida()
 {
    inicializacion();
    hilo.start();
    metales reiniciarmetales = new metales();
    listajugadores reiniciarlistajugadores = new listajugadores();
    nodo reiniciarnodo = new nodo();
    

}
  
static public void nombresjugadores()
{
    Jugador1 = JOptionPane.showInputDialog(jPanel1, "NOMBRE DEL JUGADOR 1", "Jugador 1" );

    Jugador2 = JOptionPane.showInputDialog(jPanel1, "NOMBRE DEL JUGADOR 2", "Jugador 2" );

    if (Jugador1 == null)
        {
            Jugador1 = "Jugador 1";
        }

    if (Jugador2 == null)
        {
            Jugador2 = "Jugador 2";
        }
    inicializacion();
}

// Para Tirar los Metales
static public void inicializacion() {

   JOptionPane.showMessageDialog(jPanel1, "SE DEBEN COLOCAR LAS PIEZAS INICIALMENTE ");
   jLabel13.setText(Jugador1);
   jLabel9.setText(Jugador2);
   hilo.start();
while(metales.contador_metales < 25)
{
   listametales.insertarmetales();
}
   listametales.imagenesmetales();

   jLabel2.setText("20");
   jLabel31.setText("10");
   jLabel32.setText("5");
   jLabel17.setText("20");
   jLabel34.setText("10");
   jLabel33.setText("5");
   TurnoJugador1 = true;
   TurnoJugador2 = true;
}

public void crearsoldadojugador1(){
   if(contadorMetalesJugador1 > 0)
   {
     int soldados_disponibles =  Integer.parseInt(jLabel2.getText());
     soldados_disponibles += 1;
     jLabel2.setText(Integer.toString(soldados_disponibles));
     contadorMetalesJugador1--;
     jLabel28.setText(Integer.toString(contadorMetalesJugador1));
     JOptionPane.showMessageDialog(jPanel1, "HA CREADO UN SOLDADO");
   }
   else{     JOptionPane.showMessageDialog(jPanel1, "NO TIENE SUFICIENTES METALES");
       }
}

public void creartanquegtjugador1(){
   int resta_metales_prueba = contadorMetalesJugador1 - 2;
   if(resta_metales_prueba >= 0)
   {
     int tanques_disponibles =  Integer.parseInt(jLabel31.getText());
     tanques_disponibles += 1;
     jLabel31.setText(Integer.toString(tanques_disponibles));
     contadorMetalesJugador1 -= 2;
     jLabel28.setText(Integer.toString(contadorMetalesJugador1));
     JOptionPane.showMessageDialog(jPanel1, "HA CREADO UN TANQUEGT");

    }
   else{
         JOptionPane.showMessageDialog(jPanel1, "NO TIENE SUFICIENTES METALES");
       }
}

public void crearsegadorjugador1(){
   int resta_metales_prueba = contadorMetalesJugador1 - 3;
   if(resta_metales_prueba >= 0)
   {
     int robots_disponibles =  Integer.parseInt(jLabel32.getText());
     robots_disponibles += 1;
     jLabel32.setText(Integer.toString(robots_disponibles));
     contadorMetalesJugador1 -= 3;
     jLabel28.setText(Integer.toString(contadorMetalesJugador1));
     JOptionPane.showMessageDialog(jPanel1, "HA CREADO UN SEGADOR");
    }
   else{
         JOptionPane.showMessageDialog(jPanel1, "NO TIENE SUFICIENTES METALES");
       }
}

public void crearsoldadojugador2(){
   if(contadorMetalesJugador2 > 0)
   {
     int soldados_disponibles =  Integer.parseInt(jLabel17.getText());
     soldados_disponibles += 1;
     jLabel17.setText(Integer.toString(soldados_disponibles));
     contadorMetalesJugador2--;
     jLabel29.setText(Integer.toString(contadorMetalesJugador2));
     JOptionPane.showMessageDialog(jPanel1, "HA CREADO UN SOLDADOS");
   }
   else{
         JOptionPane.showMessageDialog(jPanel1, "NO TIENE SUFICIENTES METALES");
       }
}

public void creartanquegtjugador2(){
   int resta_metales_prueba = contadorMetalesJugador2 - 2;
   if(resta_metales_prueba >= 0)
   {
     int tanques_disponibles =  Integer.parseInt(jLabel34.getText());
     tanques_disponibles += 1;
     jLabel34.setText(Integer.toString(tanques_disponibles));
     contadorMetalesJugador2 -= 2;
     jLabel29.setText(Integer.toString(contadorMetalesJugador2));
     JOptionPane.showMessageDialog(jPanel1, "HA CREADO UN TANQUEGT");
   }
   else{
         JOptionPane.showMessageDialog(jPanel1, "NO TIENE SUFICIENTES METALES");
       }
}

public void crearsegadorjugador2(){
   int resta_metales_prueba = contadorMetalesJugador2 - 3;
   if(resta_metales_prueba >= 0)
   {
      int robots_disponibles =  Integer.parseInt(jLabel33.getText());
      robots_disponibles += 1;
      jLabel33.setText(Integer.toString(robots_disponibles));
      contadorMetalesJugador2 -= 3;
      jLabel29.setText(Integer.toString(contadorMetalesJugador2));
      JOptionPane.showMessageDialog(jPanel1, "HA CREADO UN SEGADOR");
   }
   else{
        JOptionPane.showMessageDialog(jPanel1, "NO TIENE SUFICIENTES METALES");
       }
}

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseActionPerformed
        // TODO add your handling code here:
         hilo.suspend();
        issuspended = true;
        play.setVisible(true);
    }//GEN-LAST:event_pauseActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        // TODO add your handling code here:
      hilo.stop();
      play.setVisible(true);
      stoped = true;
      jLabel24.setText(null);
    }//GEN-LAST:event_stopActionPerformed
 
    
    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        // TODO add your handling code here:
   if(!issuspended)
        {
            hilo.start();
             
        }
   else
     {
            hilo.resume();
            issuspended = false;
      if(!stoped)
          {
            hilo.start();
          }
      else
          {
            hilo.start();
            stoped = true;
          }
     }
    }//GEN-LAST:event_playActionPerformed


        private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
            // TODO add your handling code here:
            crearsoldadojugador1();
        }//GEN-LAST:event_jLabel44MouseClicked

        private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
            // TODO add your handling code here:
            crearsegadorjugador1();
        }//GEN-LAST:event_jLabel38MouseClicked

        private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
            // TODO add your handling code here:
            creartanquegtjugador1();
        }//GEN-LAST:event_jLabel41MouseClicked

        private void jLabel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseClicked
            // TODO add your handling code here:
            crearsoldadojugador2();
        }//GEN-LAST:event_jLabel57MouseClicked

        private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked
            // TODO add your handling code here:
             creartanquegtjugador2();
        }//GEN-LAST:event_jLabel54MouseClicked

        private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
            // TODO add your handling code here:
             crearsegadorjugador2();
        }//GEN-LAST:event_jLabel35MouseClicked

        private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
            // TODO add your handling code here:
            JOptionPane.showMessageDialog(jPanel1, "POSICIONAR EN LAS DOS FILAS DE ARRIBA");
            PosicionandoSoldadoJugador1 = true;
        }//GEN-LAST:event_jLabel2MouseClicked

        private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
            // TODO add your handling code here:
            JOptionPane.showMessageDialog(jPanel1, "POSICIONAR EN LAS DOS FILAS DE ARRIBA");
            PosicionandoTanqueJugador1 = true;
        }//GEN-LAST:event_jLabel31MouseClicked

        private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
            // TODO add your handling code here:
            JOptionPane.showMessageDialog(jPanel1, "POSICIONAR EN LAS DOS FILAS DE ARRIBA");
            PosicionandoSegadorJugador1 = true;
        }//GEN-LAST:event_jLabel32MouseClicked

        private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
            // TODO add your handling code here:
         JOptionPane.showMessageDialog(jPanel1, "POSICIONAR EN LAS DOS FILAS DE ABAJO");
        PosicionandoSoldadoJugador2 = true;
        }//GEN-LAST:event_jLabel17MouseClicked

        private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
            // TODO add your handling code here:
            JOptionPane.showMessageDialog(jPanel1, "POSICIONAR EN LAS DOS FILAS DE ABAJO");
            PosicionandoTanqueJugador2 = true;
        }//GEN-LAST:event_jLabel34MouseClicked

        private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
            // TODO add your handling code here:
            JOptionPane.showMessageDialog(jPanel1, "POSICIONAR EN LAS DOS FILAS DE ABAJO");
            PosicionandoSegadorJugador2 = true;
        }//GEN-LAST:event_jLabel33MouseClicked

// ACCIONES PARA EL TABLERO
public void actionPerformed(java.awt.event.ActionEvent e)
{

   // Recorrido de Botones para Ver Cual se Presiona
   for(int i = 0; i < tablerobotones.length; i++)
   {
      for(int j = 0; j < tablerobotones[i].length; j++)
         {



                                                    // PARA BOTON POSICIONAR JUGADOR 1

  if(e.getSource() == tablerobotones[i][j] && TurnoJugador1 == true && j < 2 && PosicionandoSoldadoJugador1 == true && (!tablerobotones[i][j].unidad.equals("segador")) && (!tablerobotones[i][j].unidad.equals("tanque")))
  {
      // los soldados que se ingresaran
      int num_soldados = Integer.parseInt(JOptionPane.showInputDialog(jPanel1, " CUANTOS UNIDADES POSICIONARA"));
      // soldados que hay disponibles
      int numero_cuenta_soldados = Integer.parseInt(jLabel2.getText());
     
      if(num_soldados <= numero_cuenta_soldados && num_soldados > 0)
      {
        numero_cuenta_soldados = numero_cuenta_soldados - num_soldados;
        jLabel2.setText(Integer.toString(numero_cuenta_soldados));
        listaJugador1.insertarunidadjugadores(Jugador1, i, j, "soldado", num_soldados, 1, "normal");
        listaJugador1.generar_imagen_unidad_boton();
        PosicionandoSoldadoJugador1 = false;
       }
      else
      {
        JOptionPane.showMessageDialog(jPanel1,"COMPRUEBE EL NUMERO DE UNIDADES");
        PosicionandoSoldadoJugador1 = false;
        return;
      }
   }


  else if(e.getSource() == tablerobotones[i][j] && TurnoJugador1 == true && j < 2 && PosicionandoTanqueJugador1 == true && (!tablerobotones[i][j].unidad.equals("soldado")) && (!tablerobotones[i][j].unidad.equals("segador")))
  {
      int num_tanques = Integer.parseInt(JOptionPane.showInputDialog(jPanel1, " CUANTOS UNIDADES POSICIONARA"));
      int numero_cuenta_tanques = Integer.parseInt(jLabel31.getText());
      if(num_tanques <= numero_cuenta_tanques && num_tanques > 0){
        numero_cuenta_tanques = numero_cuenta_tanques - num_tanques;
        jLabel31.setText(Integer.toString(numero_cuenta_tanques));
        listaJugador1.insertarunidadjugadores(Jugador1, i, j, "tanque", num_tanques, 2, "normal");
        listaJugador1.generar_imagen_unidad_boton();
        PosicionandoTanqueJugador1 = false;
      }
      else
      {
        JOptionPane.showMessageDialog(jPanel1,"COMPRUEBE EL NUMERO DE UNIDADES");
        PosicionandoTanqueJugador1 = false;
        return;
      }
  }


  else if(e.getSource() == tablerobotones[i][j] && TurnoJugador1 == true && j < 2 && PosicionandoSegadorJugador1 == true && (!tablerobotones[i][j].unidad.equals("soldado")) && (!tablerobotones[i][j].unidad.equals("tanque")))
  {
      int num_robots = Integer.parseInt(JOptionPane.showInputDialog(jPanel1, " CUANTOS UNIDADES POSICIONARA"));
      int numero_cuenta_robots = Integer.parseInt(jLabel32.getText());
      if(num_robots <= numero_cuenta_robots && num_robots > 0)
      {
        numero_cuenta_robots = numero_cuenta_robots - num_robots;
        jLabel32.setText(Integer.toString(numero_cuenta_robots));
        listaJugador1.insertarunidadjugadores(Jugador1, i, j, "segador", num_robots, 5, "normal");
        listaJugador1.generar_imagen_unidad_boton();
        PosicionandoSegadorJugador1 = false;
       }
      else
      {
        JOptionPane.showMessageDialog(jPanel1,"COMPRUEBE EL NUMERO DE UNIDADES");
        PosicionandoSegadorJugador1 = false;
        return;
       }
   }



                                                        //  PARA BOTON MOVER JUGADOR 1

  if(e.getSource() == tablerobotones[i][j] && TurnoJugador1 == true && SelecUnidadJugador1Mover == true){

     // Posicion del boton que se presiona
     postempmovimientox = i;
     postempmovimientoy = j;
     MoviendoUnidadJugador1 = true;
     // Indicar que unidad se Mueve
     JOptionPane.showMessageDialog(jPanel1, "SELECCIONE LA POSICION" + " " + tablerobotones[i][j].unidad);
     SelecUnidadJugador1Mover = false;
  }
  else if(e.getSource() == tablerobotones[i][j] && TurnoJugador1 == true && MoviendoUnidadJugador1 == true)
  {
     if((tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy + 1) || (tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy - 1)
       || (tablerobotones[i][j].posicionx == postempmovimientox + 1) && (tablerobotones[i][j].posiciony == postempmovimientoy) || (tablerobotones[i][j].posicionx == postempmovimientox - 1) && (tablerobotones[i][j].posiciony == postempmovimientoy)
       || (tablerobotones[i][j].posicionx == postempmovimientox + 1) && (tablerobotones[i][j].posiciony == postempmovimientoy + 1) || (tablerobotones[i][j].posicionx == postempmovimientox - 1) && (tablerobotones[i][j].posiciony == postempmovimientoy - 1)
       || (tablerobotones[i][j].posicionx == postempmovimientox + 1) && (tablerobotones[i][j].posiciony == postempmovimientoy - 1) || (tablerobotones[i][j].posicionx == postempmovimientox - 1) && (tablerobotones[i][j].posiciony == postempmovimientoy + 1)
       )
     {
      // la unidad se compara con la unidad a mover o si la casilla esta vacia
      if(tablerobotones[i][j].unidad.equals(tablerobotones[postempmovimientox][postempmovimientoy].unidad) || tablerobotones[i][j].unidad.equals(""))
      {
        if(!tablerobotones[i][j].unidad.equals("")){
          // Cantidad de unidades que estaba en el boton anterior
         int cant_unid_bot_anterior = tablerobotones[postempmovimientox][postempmovimientoy].cantidad;
         listaJugador1.limpiarunidadjugadores(postempmovimientox, postempmovimientoy);
         listaJugador1.eliminarunidadjugadores(postempmovimientox, postempmovimientoy);
         listaJugador1.modificarposicionllenaunidadjugadores(i, j, cant_unid_bot_anterior);
         listaJugador1.generar_imagen_unidad_boton();
         MoviendoUnidadJugador1 = false;
      }
      else
      {
         listaJugador1.modificarposicionesunidadjugadores(postempmovimientox, postempmovimientoy, i, j);
         listaJugador1.generar_imagen_unidad_boton();
         MoviendoUnidadJugador1 = false;
      }
      
      }  // Si se posiciona sobre un Metal
      else if(tablerobotones[i][j].unidad.equals("metal"))
      {
        listametales.eliminarmetales(i, j);
        listaJugador1.modificarposicionesunidadjugadores(postempmovimientox, postempmovimientoy, i, j);
        listaJugador1.generar_imagen_unidad_boton();
        contadorMetalesJugador1++;
        jLabel28.setText(Integer.toString(contadorMetalesJugador1));  //Contador de Metales
        MoviendoUnidadJugador1 = false;
      }
      else
      {
        JOptionPane.showMessageDialog(jPanel1, "LA CASILLA A LA QUE SE VA A MOVER DEBE SER DE LA MISMA UNIDAD");
      }
      }
      else
      {
        JOptionPane.showMessageDialog(jPanel1, "NO SE PUEDE MOVER MAS DE UNA POSICION");
      }
    }




                                                    // PARA BOTON ATACAR JUGADOR 1

  if(e.getSource() == tablerobotones[i][j] && TurnoJugador1 == true && AtacandoUnidadJugador1 == true)
  {
    if((!tablerobotones[i][j].unidad.equals("")) && (!tablerobotones[i][j].unidad.equals("metal")))
    {


        if(tablerobotones[i][j].unidad.equals("soldado"))
       {
         postempmovimientox = i;
         postempmovimientoy = j;
         AtacandoSoldadoJugador1 = true;
         AtacandoUnidadJugador1 = false;
         JOptionPane.showMessageDialog(jPanel1, "SELECCIONE LA UNIDAD A ATACAR");
        }


        else if(tablerobotones[i][j].unidad.equals("tanque"))
      {
        postempmovimientox = i;
        postempmovimientoy = j;
        AtacandoTanqueJugador1 = true;
        AtacandoUnidadJugador1 = false;
        JOptionPane.showMessageDialog(jPanel1, "SELECCIONE LA UNIDAD A ATACAR");
      }


        else if(tablerobotones[i][j].unidad.equals("segador"))
     {
        postempmovimientox = i;
        postempmovimientoy = j;
        AtacandoSegadorJugador1 = true;
        AtacandoUnidadJugador1 = false;
        JOptionPane.showMessageDialog(jPanel1, "SELECCIONE LA UNIDAD A ATACAR");
      }
     }
    else
    {
       JOptionPane.showMessageDialog(jPanel1, "NO PUEDE SELECCIONAR ESA CASILLA");
       return;
    }
  }



                                            //ATAQUE SOLDADO DE SOLA UNA CASILLA EN LINEA RECTA JUGADOR 1

  else if(e.getSource() == tablerobotones[i][j] && TurnoJugador1 == true && AtacandoSoldadoJugador1 == true)
  {
    if((tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy + 1))
    {


        if(tablerobotones[i][j].jugador.equals(Jugador2) && tablerobotones[i][j].unidad.equals("soldado"))
     {
      if(tablerobotones[i][j].estado.equals("normal"))
      {
         int soldados_atacados = tablerobotones[i][j].cantidad;
         int resultado_ataque = soldados_atacados - 1;
         if(resultado_ataque <= 0)
         {
         listaJugador2.limpiarunidadjugadores(i, j);
         listaJugador2.eliminarunidadjugadores(i, j);
         listaJugador2.generar_imagen_unidad_boton();
         AtacandoSoldadoJugador1 = false;
         }
         else
         {
         listaJugador2.modificarposicionllenaunidadjugadores(i, j, (-1));
         listaJugador2.generar_imagen_unidad_boton();
         AtacandoSoldadoJugador1 = false;
         }
      }
     }


        else if(tablerobotones[i][j].jugador.equals(Jugador2) && tablerobotones[i][j].unidad.equals("tanque"))
     {
       if(tablerobotones[i][j].estado.equals("normal"))
       {
         int tanques_atacados = tablerobotones[i][j].cantidad;
         int resultado_ataque = tanques_atacados - 1;
         if(resultado_ataque <= 0)
         {
         listaJugador2.limpiarunidadjugadores(i, j);
         listaJugador2.eliminarunidadjugadores(i, j);
         listaJugador2.generar_imagen_unidad_boton();
         AtacandoSoldadoJugador1 = false;
         }
         else
         {
         listaJugador2.modificarposicionllenaunidadjugadores(i, j, (-1));
         listaJugador2.generar_imagen_unidad_boton();
         AtacandoSoldadoJugador1 = false;
         }

       }
     }


     else if(tablerobotones[i][j].jugador.equals(Jugador2) && tablerobotones[i][j].unidad.equals("segador"))
     {
       if(tablerobotones[i][j].estado.equals("normal"))
       {
         int robots_atacados = tablerobotones[i][j].cantidad;
         int resultado_ataque = robots_atacados - 1;
         if(resultado_ataque <= 0)
         {
         listaJugador2.limpiarunidadjugadores(i, j);
         listaJugador2.eliminarunidadjugadores(i, j);
         listaJugador2.generar_imagen_unidad_boton();
         AtacandoSoldadoJugador1 = false;
         }
         else
         {
         listaJugador2.modificarposicionllenaunidadjugadores(i, j, (-1));
         listaJugador2.generar_imagen_unidad_boton();
         AtacandoSoldadoJugador1 = false;
         }
        }
     }
     else
     {
        JOptionPane.showMessageDialog(jPanel1, "TIENE QUE SER UNA CASILLA HACIA ADELANTE");
     }
   }
  }


  
  
                                                    // ATAQUE DE TANQUEGT 4 CASILLAS LINEA RECTA JUGADOR 1

  else if(e.getSource() == tablerobotones[i][j] && TurnoJugador1 == true && AtacandoTanqueJugador1 == true)
  {
    if((tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy + 1) || (tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy + 2)
    || (tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy + 3) || (tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy + 4))
    {


        if(tablerobotones[i][j].jugador.equals(Jugador2) && tablerobotones[i][j].unidad.equals("soldado"))
      {
        if(tablerobotones[i][j].estado.equals("normal"))
        {
          int soldados_atacados = tablerobotones[i][j].cantidad;
          int resultado_ataque = soldados_atacados - 2;
         if(resultado_ataque <= 0)
          {
          listaJugador2.limpiarunidadjugadores(i, j);
          listaJugador2.eliminarunidadjugadores(i, j);
          listaJugador2.generar_imagen_unidad_boton();
          AtacandoTanqueJugador1 = false;
          }
         else
          {
          listaJugador2.modificarposicionllenaunidadjugadores(i, j, (-2));
          listaJugador2.generar_imagen_unidad_boton();
          AtacandoTanqueJugador1 = false;
          }
        }
      }


        else if(tablerobotones[i][j].jugador.equals(Jugador2) && tablerobotones[i][j].unidad.equals("tanque"))
      {
        if(tablerobotones[i][j].estado.equals("normal"))
        {
          int tanques_atacados = tablerobotones[i][j].cantidad;
          int resultado_ataque = tanques_atacados - 2;
          if(resultado_ataque <= 0)
          {
           listaJugador2.limpiarunidadjugadores(i, j);
           listaJugador2.eliminarunidadjugadores(i, j);
           listaJugador2.generar_imagen_unidad_boton();
           AtacandoTanqueJugador1 = false;
          }
          else
          {
           listaJugador2.modificarposicionllenaunidadjugadores(i, j, (-2));
           listaJugador2.generar_imagen_unidad_boton();
           AtacandoTanqueJugador1 = false;
          }
        }
      }


        else if(tablerobotones[i][j].jugador.equals(Jugador2) && tablerobotones[i][j].unidad.equals("segador"))
      {
         if(tablerobotones[i][j].estado.equals("normal"))
         {
          int robots_atacados = tablerobotones[i][j].cantidad;
          int resultado_ataque = robots_atacados - 2;
          if(resultado_ataque <= 0)
          {
           listaJugador2.limpiarunidadjugadores(i, j);
           listaJugador2.eliminarunidadjugadores(i, j);
           listaJugador2.generar_imagen_unidad_boton();
           AtacandoTanqueJugador1 = false;
          }
          else
          {
           listaJugador2.modificarposicionllenaunidadjugadores(i, j, (-2));
           listaJugador2.generar_imagen_unidad_boton();
           AtacandoTanqueJugador1 = false;
          }
         }
      }
     }
   }





                                                // ATAQUE SEGADOR A DOS CASILLAS EN CUALQUIER DIRECCION JUGADOR 1

  else if(e.getSource() == tablerobotones[i][j] && TurnoJugador1 == true && AtacandoSegadorJugador1 == true)
  {
      if((tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy + 1) || (tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy - 1)
        || (tablerobotones[i][j].posicionx == postempmovimientox + 1) && (tablerobotones[i][j].posiciony == postempmovimientoy) || (tablerobotones[i][j].posicionx == postempmovimientox - 1) && (tablerobotones[i][j].posiciony == postempmovimientoy)
        || (tablerobotones[i][j].posicionx == postempmovimientox + 1) && (tablerobotones[i][j].posiciony == postempmovimientoy + 1) || (tablerobotones[i][j].posicionx == postempmovimientox - 1) && (tablerobotones[i][j].posiciony == postempmovimientoy - 1)
        || (tablerobotones[i][j].posicionx == postempmovimientox + 1) && (tablerobotones[i][j].posiciony == postempmovimientoy - 1) || (tablerobotones[i][j].posicionx == postempmovimientox - 1) && (tablerobotones[i][j].posiciony == postempmovimientoy + 1)
        || (tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy + 2) || (tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy - 2)
        || (tablerobotones[i][j].posicionx == postempmovimientox + 2) && (tablerobotones[i][j].posiciony == postempmovimientoy) || (tablerobotones[i][j].posicionx == postempmovimientox - 2) && (tablerobotones[i][j].posiciony == postempmovimientoy)
        || (tablerobotones[i][j].posicionx == postempmovimientox + 2) && (tablerobotones[i][j].posiciony == postempmovimientoy + 2) || (tablerobotones[i][j].posicionx == postempmovimientox - 2) && (tablerobotones[i][j].posiciony == postempmovimientoy - 2)
        || (tablerobotones[i][j].posicionx == postempmovimientox + 2) && (tablerobotones[i][j].posiciony == postempmovimientoy - 2) || (tablerobotones[i][j].posicionx == postempmovimientox - 2) && (tablerobotones[i][j].posiciony == postempmovimientoy + 2))
        {


          if(tablerobotones[i][j].jugador.equals(Jugador2) && tablerobotones[i][j].unidad.equals("soldado"))
        {
          if(tablerobotones[i][j].estado.equals("normal"))
          {
            int soldados_atacados = tablerobotones[i][j].cantidad;
            int resultado_ataque = soldados_atacados - 5;
            if(resultado_ataque <= 0)
            {
             listaJugador2.limpiarunidadjugadores(i, j);
             listaJugador2.eliminarunidadjugadores(i, j);
             listaJugador2.generar_imagen_unidad_boton();
             AtacandoSegadorJugador1 = false;
            }
            else
            {
             listaJugador2.modificarposicionllenaunidadjugadores(i, j, (-5));
             listaJugador2.generar_imagen_unidad_boton();
             AtacandoSegadorJugador1 = false;
            }
          }
         }


          else if(tablerobotones[i][j].jugador.equals(Jugador2) && tablerobotones[i][j].unidad.equals("tanque"))
        {
         if(tablerobotones[i][j].estado.equals("normal"))
         {
           int tanques_atacados = tablerobotones[i][j].cantidad;
           int resultado_ataque = tanques_atacados - 5;
           if(resultado_ataque <= 0)
           {
            listaJugador2.limpiarunidadjugadores(i, j);
            listaJugador2.eliminarunidadjugadores(i, j);
            listaJugador2.generar_imagen_unidad_boton();
            AtacandoSegadorJugador1 = false;
           }
           else
           {
            listaJugador2.modificarposicionllenaunidadjugadores(i, j, (-5));
            listaJugador2.generar_imagen_unidad_boton();
            AtacandoSegadorJugador1 = false;
           }
         }
        }


          else if(tablerobotones[i][j].jugador.equals(Jugador2) && tablerobotones[i][j].unidad.equals("segador"))
        {
          if(tablerobotones[i][j].estado.equals("normal"))
          {
            int robots_atacados = tablerobotones[i][j].cantidad;
            int resultado_ataque = robots_atacados - 5;
            if(resultado_ataque <= 0)
            {
             listaJugador2.limpiarunidadjugadores(i, j);
             listaJugador2.eliminarunidadjugadores(i, j);
             listaJugador2.generar_imagen_unidad_boton();
             AtacandoSegadorJugador1 = false;
            }
            else
            {
             listaJugador2.modificarposicionllenaunidadjugadores(i, j, (-5));
             listaJugador2.generar_imagen_unidad_boton();
             AtacandoSegadorJugador1 = false;
            }
          }
        }
      }
      else
      {
        JOptionPane.showMessageDialog(jPanel1, "LA UBICACION DE ATAQUE ES 1 O 2 CASILLAS");
      }
  }





                                               // PARA BOTON POSICIONAR JUGADOR 2

  if(e.getSource() == tablerobotones[i][j] && TurnoJugador2 == true && j > 7 && PosicionandoSoldadoJugador2 == true && (!tablerobotones[i][j].unidad.equals("segador")) && (!tablerobotones[i][j].unidad.equals("tanque")))
   {
     int num_soldados = Integer.parseInt(JOptionPane.showInputDialog(jPanel1, " CUANTOS UNIDADES POSICIONARA"));
     int numero_cuenta_soldados = Integer.parseInt(jLabel17.getText());
     if(num_soldados <= numero_cuenta_soldados && num_soldados > 0)
     {
       numero_cuenta_soldados = numero_cuenta_soldados - num_soldados;
       jLabel17.setText(Integer.toString(numero_cuenta_soldados));
       listaJugador2.insertarunidadjugadores(Jugador2, i, j, "soldado", num_soldados, 1, "normal");
       listaJugador2.generar_imagen_unidad_boton();
       PosicionandoSoldadoJugador2 = false;
      }
     else
     {
       JOptionPane.showMessageDialog(jPanel1,"COMPRUEBE EL NUMERO DE UNIDADES");
       PosicionandoSoldadoJugador2 = false;
       return;
     }
    }


   else if(e.getSource() == tablerobotones[i][j] && TurnoJugador2 == true && j > 2 && PosicionandoTanqueJugador2 == true && (!tablerobotones[i][j].unidad.equals("soldado")) && (!tablerobotones[i][j].unidad.equals("segador")))
   {
     int num_tanques = Integer.parseInt(JOptionPane.showInputDialog(jPanel1, " CUANTOS UNIDADES POSICIONARA"));
     int numero_cuenta_tanques = Integer.parseInt(jLabel34.getText());
     if(num_tanques <= numero_cuenta_tanques && num_tanques > 0)
     {
       numero_cuenta_tanques = numero_cuenta_tanques - num_tanques;
       jLabel34.setText(Integer.toString(numero_cuenta_tanques));
       listaJugador2.insertarunidadjugadores(Jugador2, i, j, "tanque", num_tanques, 2, "normal");
       listaJugador2.generar_imagen_unidad_boton();
       PosicionandoTanqueJugador2 = false;
     }
     else
     {
       JOptionPane.showMessageDialog(jPanel1,"COMPRUEBE EL NUMERO DE UNIDADES");
       PosicionandoTanqueJugador2 = false;
       return;
     }
   }


   else if(e.getSource() == tablerobotones[i][j] && TurnoJugador2 == true && j > 2 && PosicionandoSegadorJugador2 == true && (!tablerobotones[i][j].unidad.equals("soldado")) && (!tablerobotones[i][j].unidad.equals("tanque")))
   {
      int num_robots = Integer.parseInt(JOptionPane.showInputDialog(jPanel1, " CUANTOS UNIDADES POSICIONARA"));
      int numero_cuenta_robots = Integer.parseInt(jLabel33.getText());
      if(num_robots <= numero_cuenta_robots && num_robots > 0)
      {
        numero_cuenta_robots = numero_cuenta_robots - num_robots;
        jLabel33.setText(Integer.toString(numero_cuenta_robots));
        listaJugador2.insertarunidadjugadores(Jugador2, i, j, "segador", num_robots, 5, "normal");
        listaJugador2.generar_imagen_unidad_boton();
        PosicionandoSegadorJugador2 = false;
      }
      else
      {
        JOptionPane.showMessageDialog(jPanel1,"COMPRUEBE EL NUMERO DE UNIDADES");
        PosicionandoSegadorJugador2 = false;
        return;
      }
   }
                                                
  
  
   
                                                    //PARA BOTON MOVER JUGADOR 2

  if(e.getSource() == tablerobotones[i][j] && TurnoJugador2 == true && SelecUnidadJugador2Mover == true)
  {
      postempmovimientox = i;
      postempmovimientoy = j;
      MoviendoUnidadJugador2 = true;
      JOptionPane.showMessageDialog(jPanel1, "SELECCIONE LA POSICION" + " " + tablerobotones[i][j].unidad);
      SelecUnidadJugador2Mover = false;
  }
  else if(e.getSource() == tablerobotones[i][j] && TurnoJugador2 == true && MoviendoUnidadJugador2 == true)
  {
      if((tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy + 1) || (tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy - 1)
          || (tablerobotones[i][j].posicionx == postempmovimientox + 1) && (tablerobotones[i][j].posiciony == postempmovimientoy) || (tablerobotones[i][j].posicionx == postempmovimientox - 1) && (tablerobotones[i][j].posiciony == postempmovimientoy)
          || (tablerobotones[i][j].posicionx == postempmovimientox + 1) && (tablerobotones[i][j].posiciony == postempmovimientoy + 1) || (tablerobotones[i][j].posicionx == postempmovimientox - 1) && (tablerobotones[i][j].posiciony == postempmovimientoy - 1)
          || (tablerobotones[i][j].posicionx == postempmovimientox + 1) && (tablerobotones[i][j].posiciony == postempmovimientoy - 1) || (tablerobotones[i][j].posicionx == postempmovimientox - 1) && (tablerobotones[i][j].posiciony == postempmovimientoy + 1))
      {
       if(tablerobotones[i][j].unidad.equals(tablerobotones[postempmovimientox][postempmovimientoy].unidad) || tablerobotones[i][j].unidad.equals(""))
       {
          if(!tablerobotones[i][j].unidad.equals(""))
          {
            int cant_unid_bot_anterior = tablerobotones[postempmovimientox][postempmovimientoy].cantidad;
            listaJugador2.limpiarunidadjugadores(postempmovimientox, postempmovimientoy);
            listaJugador2.eliminarunidadjugadores(postempmovimientox, postempmovimientoy);
            listaJugador2.modificarposicionllenaunidadjugadores(i, j, cant_unid_bot_anterior);
            listaJugador2.generar_imagen_unidad_boton();
            MoviendoUnidadJugador2 = false;
           }
          else
          {
           listaJugador2.modificarposicionesunidadjugadores(postempmovimientox, postempmovimientoy, i, j);
           listaJugador2.generar_imagen_unidad_boton();
           MoviendoUnidadJugador2 = false;
          }
       }
       else if(tablerobotones[i][j].unidad.equals("metal"))
       {
           listametales.eliminarmetales(i, j);
           listaJugador2.modificarposicionesunidadjugadores(postempmovimientox, postempmovimientoy, i, j);
           listaJugador2.generar_imagen_unidad_boton();
           contadorMetalesJugador2++;
           jLabel29.setText(Integer.toString(contadorMetalesJugador2));
           MoviendoUnidadJugador2 = false;
        }
       else
       {
           JOptionPane.showMessageDialog(jPanel1, "LA CASILLA A LA QUE SE VA A MOVER DEBE SER DE LA MISMA UNIDAD");
       }
     }
      else
      {
           JOptionPane.showMessageDialog(jPanel1, "NO SE PUEDE MOVER MAS DE UNA POSICION");
      }
     }



                                                //PARA BOTON ATAQUE JUGADOR 2

  if(e.getSource() == tablerobotones[i][j] && TurnoJugador2 == true && AtacandoUnidadJugador2 == true)
   {
     if((!tablerobotones[i][j].unidad.equals("")) && (!tablerobotones[i][j].unidad.equals("metal")))
     {


         if(tablerobotones[i][j].unidad.equals("soldado"))
      {
        postempmovimientox = i;
        postempmovimientoy = j;
        AtacandoSoldadoJugador2 = true;
        AtacandoUnidadJugador2 = false;
        JOptionPane.showMessageDialog(jPanel1, "SELECCIONE LA UNIDAD A ATACAR");
      }


      else if(tablerobotones[i][j].unidad.equals("tanque"))
      {
        postempmovimientox = i;
        postempmovimientoy = j;
        atacando_tanque_jugador2 = true;
        AtacandoUnidadJugador2 = false;
      }


      else if(tablerobotones[i][j].unidad.equals("segador"))
      {
        postempmovimientox = i;
        postempmovimientoy = j;
        AtacandoSegadorJjugador2 = true;
        AtacandoUnidadJugador2 = false;
        JOptionPane.showMessageDialog(jPanel1, "SELECCIONE LA UNIDAD A ATACAR");
      }
     }
     else
     {
         JOptionPane.showMessageDialog(jPanel1, "NO PUEDE SELECCIONAR ESA CASILLA");
         return;
     }
   }



                                     //ATAQUE DE SOLDADO UNA CASILLA EN LINEA RECTA JUGADOR 2

  else if(e.getSource() == tablerobotones[i][j] && TurnoJugador2 == true && AtacandoSoldadoJugador2 == true)
   {

    if((tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy - 1))
    {


        if(tablerobotones[i][j].jugador.equals(Jugador1) && tablerobotones[i][j].unidad.equals("soldado"))
      {
       if(tablerobotones[i][j].estado.equals("normal"))
       {
         int soldados_atacados = tablerobotones[i][j].cantidad;
         int resultado_ataque = soldados_atacados - 1;
         if(resultado_ataque <= 0)
         {
           listaJugador1.limpiarunidadjugadores(i, j);
           listaJugador1.eliminarunidadjugadores(i, j);
           listaJugador1.generar_imagen_unidad_boton();
           AtacandoSoldadoJugador2 = false;
         }
         else
         {
          listaJugador1.modificarposicionllenaunidadjugadores(i, j, (-1));
          listaJugador1.generar_imagen_unidad_boton();
          AtacandoSoldadoJugador2 = false;
         }
       }
      }


        else if(tablerobotones[i][j].jugador.equals(Jugador1) && tablerobotones[i][j].unidad.equals("tanque"))
      {
       if(tablerobotones[i][j].estado.equals("normal"))
       {
         int tanques_atacados = tablerobotones[i][j].cantidad;
         int resultado_ataque = tanques_atacados - 1;
         if(resultado_ataque <= 0)
         {
           listaJugador1.limpiarunidadjugadores(i, j);
           listaJugador1.eliminarunidadjugadores(i, j);
           listaJugador1.generar_imagen_unidad_boton();
           AtacandoSoldadoJugador2 = false;
         }
         else
         {
           listaJugador1.modificarposicionllenaunidadjugadores(i, j, (-1));
           listaJugador1.generar_imagen_unidad_boton();
           AtacandoSoldadoJugador2 = false;
         }
       }
      }


        else if(tablerobotones[i][j].jugador.equals(Jugador1) && tablerobotones[i][j].unidad.equals("segador"))
      {
        if(tablerobotones[i][j].estado.equals("normal"))
        {
          int robots_atacados = tablerobotones[i][j].cantidad;
          int resultado_ataque = robots_atacados - 1;
          if(resultado_ataque <= 0)
          {
            listaJugador1.limpiarunidadjugadores(i, j);
            listaJugador1.eliminarunidadjugadores(i, j);
            listaJugador1.generar_imagen_unidad_boton();
            AtacandoSoldadoJugador2 = false;
          }
          else
          {
            listaJugador1.modificarposicionllenaunidadjugadores(i, j, (-1));
            listaJugador1.generar_imagen_unidad_boton();
            AtacandoSoldadoJugador2 = false;
          }
        }
       }
      else
      {
        JOptionPane.showMessageDialog(jPanel1, "TIENE QUE SER UNA CASILLA HACIA ADELANTE");
      }
    }
 }



                                            // ATAQUE TANGUEGT 4 CASILLAS EN LINEA RECTA JUGADOR 2

  else if(e.getSource() == tablerobotones[i][j] && TurnoJugador2 == true && atacando_tanque_jugador2 == true)
    {
        if((tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy - 1) || (tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy - 2)
        || (tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy - 3) || (tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy - 4))
        {


            if(tablerobotones[i][j].jugador.equals(Jugador1) && tablerobotones[i][j].unidad.equals("soldado"))
         {
           if(tablerobotones[i][j].estado.equals("normal"))
           {
             int soldados_atacados = tablerobotones[i][j].cantidad;
             int resultado_ataque = soldados_atacados - 2;
             if(resultado_ataque <= 0)
              {
                listaJugador1.limpiarunidadjugadores(i, j);
                listaJugador1.eliminarunidadjugadores(i, j);
                listaJugador1.generar_imagen_unidad_boton();
                atacando_tanque_jugador2 = false;
              }
              else
              {
                listaJugador1.modificarposicionllenaunidadjugadores(i, j, (-2));
                listaJugador1.generar_imagen_unidad_boton();
                atacando_tanque_jugador2 = false;
              }
           }
         }


            else if(tablerobotones[i][j].jugador.equals(Jugador1) && tablerobotones[i][j].unidad.equals("tanque"))
         {
           if(tablerobotones[i][j].estado.equals("normal"))
           {
             int tanques_atacados = tablerobotones[i][j].cantidad;
             int resultado_ataque = tanques_atacados - 2;
             if(resultado_ataque <= 0)
             {
               listaJugador1.limpiarunidadjugadores(i, j);
               listaJugador1.eliminarunidadjugadores(i, j);
               listaJugador1.generar_imagen_unidad_boton();
               atacando_tanque_jugador2 = false;
             }
             else
             {
               listaJugador1.modificarposicionllenaunidadjugadores(i, j, (-2));
               listaJugador1.generar_imagen_unidad_boton();
               atacando_tanque_jugador2 = false;
              }
            }
          }


            else if(tablerobotones[i][j].jugador.equals(Jugador1) && tablerobotones[i][j].unidad.equals("segador"))
         {
          if(tablerobotones[i][j].estado.equals("normal"))
          {
            int robots_atacados = tablerobotones[i][j].cantidad;
            int resultado_ataque = robots_atacados - 2;
            if(resultado_ataque <= 0)
            {
              listaJugador1.limpiarunidadjugadores(i, j);
              listaJugador1.eliminarunidadjugadores(i, j);
              listaJugador1.generar_imagen_unidad_boton();
              atacando_tanque_jugador2 = false;
            }
            else
            {
              listaJugador1.modificarposicionllenaunidadjugadores(i, j, (-2));
              listaJugador1.generar_imagen_unidad_boton();
              atacando_tanque_jugador2 = false;
            }
          }
        }
      }
    }




                                            // ATAQUE SEGADOR EN CUALQUIER DIRECCION 2 CASILLAS JUGADOR 2
 
  else if(e.getSource() == tablerobotones[i][j] && TurnoJugador2 == true && AtacandoSegadorJjugador2 == true)
 {
      if((tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy + 1) || (tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy - 1)
      || (tablerobotones[i][j].posicionx == postempmovimientox + 1) && (tablerobotones[i][j].posiciony == postempmovimientoy) || (tablerobotones[i][j].posicionx == postempmovimientox - 1) && (tablerobotones[i][j].posiciony == postempmovimientoy)
      || (tablerobotones[i][j].posicionx == postempmovimientox + 1) && (tablerobotones[i][j].posiciony == postempmovimientoy + 1) || (tablerobotones[i][j].posicionx == postempmovimientox - 1) && (tablerobotones[i][j].posiciony == postempmovimientoy - 1)
      || (tablerobotones[i][j].posicionx == postempmovimientox + 1) && (tablerobotones[i][j].posiciony == postempmovimientoy - 1) || (tablerobotones[i][j].posicionx == postempmovimientox - 1) && (tablerobotones[i][j].posiciony == postempmovimientoy + 1)
      || (tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy + 2) || (tablerobotones[i][j].posicionx == postempmovimientox) && (tablerobotones[i][j].posiciony == postempmovimientoy - 2)
      || (tablerobotones[i][j].posicionx == postempmovimientox + 2) && (tablerobotones[i][j].posiciony == postempmovimientoy) || (tablerobotones[i][j].posicionx == postempmovimientox - 2) && (tablerobotones[i][j].posiciony == postempmovimientoy)
      || (tablerobotones[i][j].posicionx == postempmovimientox + 2) && (tablerobotones[i][j].posiciony == postempmovimientoy + 2) || (tablerobotones[i][j].posicionx == postempmovimientox - 2) && (tablerobotones[i][j].posiciony == postempmovimientoy - 2)
      || (tablerobotones[i][j].posicionx == postempmovimientox + 2) && (tablerobotones[i][j].posiciony == postempmovimientoy - 2) || (tablerobotones[i][j].posicionx == postempmovimientox - 2) && (tablerobotones[i][j].posiciony == postempmovimientoy + 2))
      {


          if(tablerobotones[i][j].jugador.equals(Jugador1) && tablerobotones[i][j].unidad.equals("soldado"))
        {
         if(tablerobotones[i][j].estado.equals("normal"))
         {
          int soldados_atacados = tablerobotones[i][j].cantidad;
          int resultado_ataque = soldados_atacados - 5;
          if(resultado_ataque <= 0)
          {
            listaJugador1.limpiarunidadjugadores(i, j);
            listaJugador1.eliminarunidadjugadores(i, j);
            listaJugador1.generar_imagen_unidad_boton();
            AtacandoSegadorJjugador2 = false;
          }
          else
          {
            listaJugador1.modificarposicionllenaunidadjugadores(i, j, (-5));
            listaJugador1.generar_imagen_unidad_boton();
            AtacandoSegadorJjugador2 = false;
          }
         }
        }


          else if(tablerobotones[i][j].jugador.equals(Jugador1) && tablerobotones[i][j].unidad.equals("tanque"))
        {
          if(tablerobotones[i][j].estado.equals("normal"))
          {
            int tanques_atacados = tablerobotones[i][j].cantidad;
            int resultado_ataque = tanques_atacados - 5;
            if(resultado_ataque <= 0)
            {
              listaJugador1.limpiarunidadjugadores(i, j);
              listaJugador1.eliminarunidadjugadores(i, j);
              listaJugador1.generar_imagen_unidad_boton();
              AtacandoSegadorJjugador2 = false;
            }
            else
            {
              listaJugador1.modificarposicionllenaunidadjugadores(i, j, (-5));
              listaJugador1.generar_imagen_unidad_boton();
              AtacandoSegadorJjugador2 = false;
            }
          }
        }


          else if(tablerobotones[i][j].jugador.equals(Jugador1) && tablerobotones[i][j].unidad.equals("segador"))
        {
         if(tablerobotones[i][j].estado.equals("normal"))
         {
           int robots_atacados = tablerobotones[i][j].cantidad;
           int resultado_ataque = robots_atacados - 5;
           if(resultado_ataque <= 0)
           {
             listaJugador1.limpiarunidadjugadores(i, j);
             listaJugador1.eliminarunidadjugadores(i, j);
             listaJugador1.generar_imagen_unidad_boton();
             AtacandoSegadorJjugador2 = false;
           }
           else
           {
             listaJugador1.modificarposicionllenaunidadjugadores(i, j, (-5));
             listaJugador1.generar_imagen_unidad_boton();
             AtacandoSegadorJjugador2 = false;
           }
          }
        }
      }
      else
      {
        JOptionPane.showMessageDialog(jPanel1, "TIENE QUE SER UNA CASILLA HACIA ADELANTE");
      }
     }

   }
 }

}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    public static javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    public static javax.swing.JLabel jLabel26;
    public static javax.swing.JLabel jLabel27;
    public static javax.swing.JLabel jLabel28;
    public static javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    public static javax.swing.JLabel jLabel31;
    public static javax.swing.JLabel jLabel32;
    public static javax.swing.JLabel jLabel33;
    public static javax.swing.JLabel jLabel34;
    public static javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    public static javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    public static javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    public static javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    public static javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    public static javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
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
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jLabelJugadorEnTurno;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanelCreacion;
    public static javax.swing.JPanel jPanelCreacion2;
    public static javax.swing.JPanel jPanelPosiciones;
    public static javax.swing.JPanel jPanelPosiciones2;
    public static javax.swing.JButton pause;
    public static javax.swing.JButton play;
    public static javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables
}