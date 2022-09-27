/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class ventana extends javax.swing.JFrame{

		private class HiloTiempo2 extends Thread{
			
			public void run()
			{
				int cont = 0;
				while(true)
				{
					lblTiempo.setText("Tiempo :"+cont);
				
				
				try
				{
					Thread.sleep(1500);
				} catch(InterruptedException ex) {
					Logger.getLogger(ventana.class.getName()).log(Level.SEVERE,null,ex);
				}
				cont++;
			}
	}
}

//HiloTiempo miHilo;
Thread miThread;
HiloTiempo2 miOtroHilo;


public ventana() {
	initComponents();
	
	//miHilo = new HiloTiempo();
	miThread = new Thread(miThread);
	miOtroHilo = new HiloTiempo2();
	
	miThread.start();
	miOtroHilo.start();;
}

@SuppressWarnings("unchecked")

private void initComponents() {
	cajero = new javax.swing.JLabel();
	personaje = new javax.swing.JLabel();
    lblTiempo = new javax.swing.JLabel();
    
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(0,0,204));
    setMinimumSize(new java.awt.Dimension(2360,2480));
    addKeyListener(new java.awt.event.KeyAdapter() {
    		public void keyPressed(java.awt.event.KeyEvent evt) {
    		fomKeyPressed(evt);
    		}
    });
    
    getContentPane().setLayout(new org.netbeans.lib.avtextra.AbsoluteLayout());
    
    cajero.setIcon(new javax.swing.ImageIcon(getClass().getResource("Cajero.jpg")));
    getContentPane().add(cajero, new org.netbeans.lib.avtextra.AbsoluteConstraints(520,130,220,170));
    
    personaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("Cajero.jpg")));
    getContentPane().add(personaje, new org.netbeans.lib.avtextra.AbsoluteConstraints(10,130,-1,-1));
    
    lblTiempo.setText("Tiempo: ");
    getContentPane().add(lblTiempo, new org.netbeans.lib.avtextra.AbsoluteConstraints(290,370,150,-1));
    
    pack();
}

     private void fomKeyPressed(java.awt.event.KeyEvent evt){
    	 
    	 int x = personaje.getX();
    	 int y = personaje.getY();
    	 
    	 if(evt.getKeyChar()=='a')
    	 {
    		 x = x - 2;
    		 personaje.setLocation(x,y);
    	 }
    	 
    	 if(evt.getKeyChar()=='d')
    	 {
    		 x = x + 10;
    		 personaje.setLocation(x,y);
    	 }
     }
     
     public static void main(String[] args) {
    	 java.awt.EventQueue.invokeLater(new Runnable() {
    		 public void run() {
    			 new ventana().setVisible(true);
    		 }
    	 });
     }
     
     private javax.swing.JLabel cajero;
     private javax.swing.JLabel lblTiempo;
     private javax.swing.JLabel personaje;
     
}


