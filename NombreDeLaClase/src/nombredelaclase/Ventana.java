/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombredelaclase;

/**
 *
 * @author Oscar
 */
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ventana extends javax.swing.JFrame{
    
    private class HiloTiempo2 extends Thread
    {
        @Override
        public void run()
        {
            int cont=0;
            while(true)
            {
                lblTiempo.setText("tiempo: "+cont);
                try {
                    Thread.sleep(1500);
                } catch(InterruptedException ex){
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
                cont++;
            }
        }
    }
    
    HiloTiempo2 miHilo;
    Thread miThread;
    HiloTiempo2 miOtroHilo;
    
    public Ventana()
    {
        initComponents();
        miHilo=new HiloTiempo2();
        miThread = new Thread(miThread);
        miOtroHilo = new HiloTiempo2();
        
        miThread.start();
        miOtroHilo.start();;
    }
    
    @SuppressWarnings("Unchecked")
    
    private void initComponents()
    {
        cajero = new javax.swing.JLabel();
        personaje = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));
        setMinimumSize(new java.awt.Dimension(1360,2480));
        
        addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
                formKeyPressed(evt);
            }
        });
        
       getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        cajero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nombredelaclase/cajero.jpg")));
        getContentPane().add(cajero,new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));
        
        personaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nombredelaclase/Personaje.png")));
        getContentPane().add(personaje,new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        
        lblTiempo.setText("tiempo: ");
        getContentPane().add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 310, 150, -1));
        
        pack();
    }
    
    private void formKeyPressed(java.awt.event.KeyEvent evt)
    {
        int x=personaje.getX();
        int y=personaje.getY();
        if(evt.getKeyChar()=='a')
        {
         x=x-2;
         personaje.setLocation(x,y);
        }
        if(evt.getKeyChar()=='d')
        {
            x=x+10;
            personaje.setLocation(x,y);
        }
    }
    
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
            new Ventana().setVisible(true);
                    }
        });
    }
    
    private javax.swing.JLabel cajero;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel personaje;
}
