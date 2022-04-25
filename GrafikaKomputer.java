/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikakomputer;

import java.awt.geom.Point2D;

/**
 *
 * @author Administrator
 */
public class GrafikaKomputer extends javax.swing.JFrame{
    public GrafikaKomputer(){
        init(); 
    }
    final void init(){
        setTitle("Grafika Komputer Kamis");
        setSize( new java.awt.Dimension(2000, 750));
        setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(new MyPanel());
        //add(new Drawing());
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new GrafikaKomputer();
    }
}