package ejerciciosScanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;

public class Ejercicio1 extends JPanel {
	JLabel request = new JLabel();
	JTextField texto = new JTextField( 20 );
	JLabel test = new JLabel();
  
  public Ejercicio1() {
    ActionListener al = new ActionListener() {		//We create an action listener, when an action occurs
      public void actionPerformed( ActionEvent evt ) {

	String numero = ( (JTextField)evt.getSource()).getText();

	test.setText(numero);
	
      }
    };
    
    request.setText("Introduzca sú número y pulse enter.");
    
    texto.addActionListener(al);
    
    texto.setToolTipText( "Soy el JCampoDeTexto" );
    
    add( request );
    
    add( texto );
    
    add( test );
  }
  
  public static void main( String args[] ) {
    JFrame ventana = new JFrame( "Ejercicio 1 en Java Swing" );
    
    ventana.addWindowListener( new WindowAdapter() {
      public void windowClosing( WindowEvent evt ){
	System.exit( 0 );
      }
    } );
    ventana.getContentPane().add( new Ejercicio1(),BorderLayout.CENTER );
    ventana.setSize( 300,100 );
    
    ventana.setVisible( true );
  }
} 