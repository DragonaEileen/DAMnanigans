package ejerciciosScanner;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;


public class java1418 extends JPanel {
  static Object objetos[][] = {
    { "AWT-Clon",Ejercicio1.class },
    //{ "Bordes",java1402.class },
    //{ "Botones",java1404.class },
    //{ "Grupo de Botones",java1406.class },
    //{ "Listas y Combo",java1407.class },
    //{ "Barras",java1413.class },
    //{ "Arbol",java1414.class },
    //{ "Tabla",java1416.class },
  };

  static JPanel creaPanel( Class clase ) {
    String titulo = clase.getName();
    titulo = titulo.substring( titulo.lastIndexOf('.') + 1 );
    JPanel panel = null;
    try {
      panel = (JPanel)clase.newInstance();
    } catch( Exception e ) {
      System.out.println( e );
    }
    panel.setBorder( new TitledBorder( titulo ) );
    return( panel );
  }

  public java1418() {
    setLayout( new BorderLayout() );
    JTabbedPane pestana = new JTabbedPane();
    for( int i=0; i < objetos.length; i++ ) {
      pestana.addTab( (String)objetos[i][0],
        creaPanel( (Class)objetos[i][1] ) );
    }
    add( pestana,BorderLayout.CENTER );
    pestana.setSelectedIndex( objetos.length/2 );
  }

  public static void main( String args[] ) {
    JFrame frame = new JFrame( "Tutorial de Java, Swing" );
    frame.addWindowListener( new WindowAdapter() {
      public void windowClosing( WindowEvent evt ) {
        System.exit( 0 );
      }
    } );
    frame.getContentPane().add( new java1418(),BorderLayout.CENTER );
    frame.setSize( 460,350 );
    frame.setVisible( true );
  }
} 