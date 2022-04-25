/*
 * SHA NIA SIAHAAN
 * 2001020021
 */

package grafikakomputer;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class MyPanel extends javax.swing.JPanel {

    public MyPanel() {
        init();
    }
    final void init(){
        setPreferredSize(new java.awt.Dimension(1000, 500));
    }
    @Override
    public void paint(java.awt.Graphics g){
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(5));
        g2.setColor(Color.decode("#33374b"));
        
        //BACKGROUND
        GeneralPath pathBackground = new GeneralPath();
        pathBackground.moveTo(0,750);
        pathBackground.lineTo(0, 0);
        pathBackground.lineTo(1365, 0);
        pathBackground.lineTo(1365, 750);
        pathBackground.lineTo(0, 750);
        
        g2.setPaint(new GradientPaint(0, 30, Color.decode("#2E56B5"), 0, 350, Color.decode("#70ABDA")));
        g2.fill(pathBackground);
       
        //BULAN
        g2.setPaint(Color.decode("#CCE3D9"));
        g2.fillOval(690, 90, 120, 120);
        g2.setPaint(Color.decode("#FFFDDC"));
        g2.fillOval(700, 100, 100, 100);
                
        //BINTANG
        g2.fillOval(70, 70, 2, 2);
        g2.fillOval(50, 100, 3, 3);
        g2.fillOval(150, 30, 3, 3);
        g2.fillOval(150, 30, 3, 3);
        g2.fillOval(200, 120, 4, 4);
        g2.fillOval(240, 55, 2, 2);
        g2.fillOval(300, 30, 2, 2);
        g2.fillOval(350, 150, 2, 2);
        g2.fillOval(400, 65, 2, 2);
        g2.fillOval(450, 150, 3, 3);
        g2.fillOval(490, 200, 2, 2);
        g2.fillOval(550, 240, 3, 3);
        g2.fillOval(550, 50, 3, 3);
        g2.fillOval(600, 180, 2, 2);
        g2.fillOval(650, 70, 3, 3);
        g2.fillOval(600, 65, 2, 2);
        g2.fillOval(800, 220, 4, 4);
        g2.fillOval(900, 75, 2, 2);
        g2.fillOval(950, 200, 3, 3);
        g2.fillOval(950, 50, 2, 2);
        g2.fillOval(970, 150, 4, 4);
        g2.fillOval(1000, 180, 2, 2);
        g2.fillOval(1100, 50, 3, 3);
        g2.fillOval(1150, 100, 3, 3);
        g2.fillOval(1200, 150, 3, 3);
        g2.fillOval(1250, 100, 2, 2);
        g2.fillOval(1240, 50, 2, 2);
                      
        //BUKIT
        GeneralPath path9 = new GeneralPath();
        path9.moveTo(600, 750);
        path9.lineTo(600, 300);
        path9.curveTo(900, 300, 1200, 170, 1365, 200);
        path9.lineTo(1365, 750);
        path9.closePath();
        
        g2.setPaint(new GradientPaint(00, 120, Color.decode("#0C688B"), 10, 420, Color.decode("#042D55")));
        g2.fill(path9);

        GeneralPath path8 = new GeneralPath();
        path8.moveTo(0, 750);
        path8.lineTo(0, 150);
        path8.curveTo(250, 100, 300, 200, 450, 250);
        path8.curveTo(550, 300, 750, 210, 900, 350);
        path8.lineTo(900, 750);
        path8.closePath();
        
        g2.setPaint(new GradientPaint(0, 150, Color.decode("#0C688B"), 10, 350, Color.decode("#042D55")));
        g2.fill(path8);

        GeneralPath path7 = new GeneralPath();
        path7.moveTo(0, 750);
        path7.lineTo(0, 300);
        path7.curveTo(400, 100, 450, 550, 1100, 300);
        path7.lineTo(1100, 750);
        path7.closePath();
        
        g2.setPaint(new GradientPaint(0, 80, Color.decode("#DEF2FA"), 10, 400, Color.decode("#6CB2E4")));
        g2.fill(path7);

        GeneralPath path6 = new GeneralPath();
        path6.moveTo(100,750);
        path6.lineTo(100, 380);
        path6.curveTo(900, 450, 980, 180, 1365, 300);
        path6.lineTo(1365, 750);
        path6.closePath();
        
        g2.setPaint(new GradientPaint(0, 20, Color.decode("#DEF2FA"), 10, 460, Color.decode("#8CC3EC")));
        g2.fill(path6);
        
        g2.setColor(Color.decode("#4A73B8"));
        int w[] = {200, 210, 220};
        int y[] = {360, 320, 360};
        int z = w.length;
        g2.fillPolygon(w, y, z);
        
        GeneralPath path5 = new GeneralPath();
        path5.moveTo(0, 750);
        path5.lineTo(0, 420);
        path5.curveTo(250, 250, 350, 400, 650, 430);
        path5.curveTo(800, 430, 1050 , 300, 1365, 370);
        path5.lineTo(1365, 750);
        path5.closePath();
        
        g2.setPaint(new GradientPaint(0, 300, Color.decode("#D3EDFE"), 10, 550, Color.decode("#89C1E9")));
        g2.fill(path5);
        
        g2.setColor(Color.decode("#4F8CC2"));
        int q[] = {700, 710, 720};
        int r[] = {520, 480, 520};
        int s = q.length;
        g2.fillPolygon(q, r, s);
        
        g2.setColor(Color.decode("#4A73B8"));
        int t[] = {740, 750, 760};
        int u[] = {510, 460, 510};
        int v = t.length;
        g2.fillPolygon(t, u, v);
        
        GeneralPath path4 = new GeneralPath();
        path4.moveTo(300, 750);
        path4.lineTo(300, 620);
        path4.curveTo(900, 500, 1000, 300, 1365, 400);
        path4.lineTo(1365, 750);
        path4.closePath();
        
        g2.setPaint(new GradientPaint(10, 400, Color.decode("#DEF2FA"), 0, 600, Color.decode("#89C1E9")));;
        g2.fill(path4);
        
        g2.setColor(Color.decode("#F87217"));
        int n[] = {480, 490, 500};
        int o[] = {540, 500, 540};
        int p = n.length;
        g2.fillPolygon(n, o, p);
        
        GeneralPath path3 = new GeneralPath();
        path3.moveTo(0, 750);
        path3.lineTo(0, 500);
        path3.curveTo(350, 350, 500, 700, 1365, 550);
        path3.lineTo(1365,750);
        path3.closePath();
        
        g2.setPaint(new GradientPaint(10, 450, Color.decode("#FFE989"), 0, 600, Color.decode("#FAC91A")));;
        g2.fill(path3);
        
        g2.setColor(Color.decode("#F87217"));
        int h[] = {700, 710, 720};
        int i[] = {650, 620, 650};
        int j = h.length;
        g2.fillPolygon(h, i, j);
        
        g2.setColor(Color.decode("#FBAB10"));
        int k[] = {900, 910, 920};
        int l[] = {560, 520, 560};
        int m = k.length;
        g2.fillPolygon(k, l, m);
                        
        GeneralPath path2 = new GeneralPath();
        path2.moveTo(200, 750);
        path2.curveTo(700, 800, 900, 400, 1365, 500);
        path2.lineTo(1365, 750);
        path2.closePath();
        
        g2.setPaint(new GradientPaint(5, 450, Color.decode("#FFE989"), 0, 700, Color.decode("#FAC91A")));;
        g2.fill(path2);
        
        g2.setColor(Color.decode("#F87217"));
        int a[] = {300, 310, 320};
        int b[] = {606, 576, 606};
        int c = a.length;
        g2.fillPolygon(a, b, c);
        
        g2.setColor(Color.decode("#FBAB10"));
        int d[] = {200, 210, 220};
        int e[] = {602, 572, 602};
        int f = d.length;
        g2.fillPolygon(d, e, f);
                                        
        GeneralPath path1 = new GeneralPath();
        path1.moveTo(0, 750);
        path1.lineTo(0, 600);
        path1.curveTo(300, 550, 600, 700, 1200, 750);
        path1.closePath(); 
       
        g2.setPaint(new GradientPaint(10, 570, Color.decode("#FFE989"), 0, 750, Color.decode("#FAC91A")));
        g2.fill(path1);
        
        
    }
}
