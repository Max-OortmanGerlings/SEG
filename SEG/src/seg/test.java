/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seg;

import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.geom.AffineTransform;

/**
 *
 * @author MAX
 */
public class test extends Applet {

    public void paint(Graphics tekenen) {
        int i;
        int x = 0;
        int y = 0;
        this.resize(1000, 1000);
        //BOCHTEN
        //Bocht linksboven
        tekenen.drawArc(115 + x, 115 + y, 35 + x, 35 + y, 0, -90);
        //Lijn naar links
        tekenen.drawLine(135, 150 + y, 0, 150 + y);
        //Lijn naar boven
        tekenen.drawLine(150, 133 + y, 150, 0 + y);
        //Bocht linksonder
        tekenen.drawArc(115, 350 + y, 35, 35 + y, 0, 90);
        //Lijn naar benenden
        tekenen.drawLine(150, 367 + y, 150, 525 + y);
        //Lijn naar links
        tekenen.drawLine(135, 350 + y, 0, 350 + y);
        //Bocht rechtsboven
        tekenen.drawArc(350, 115 + y, 35, 35 + y, 180, 90);
        //Lijn naar rechts
        tekenen.drawLine(367, 150 + y, 525 + y, 150);
        //Lijn naar boven
        tekenen.drawLine(350, 133 + y, 350, 0 + y);
        //Bocht rechtsonder
        tekenen.drawArc(350, 350 + y, 35, 35 + y, 180, -90);
        //Lijn naar benenden
        tekenen.drawLine(350, 367 + y, 350, 525 + y);
        //Lijn naar rechts
        tekenen.drawLine(367, 350 + y, 525, 350 + y);

        //RIJBANEN onder ---------------------------------------------------
        //Middelste strook
        tekenen.drawLine(200, 425 + y, 200, 525 + y);
        //Rechter strook
        tekenen.drawLine(300, 425 + y, 300, 455 + y);
        //Linker strook
        tekenen.drawLine(250, 425 + y, 250, 455 + y);
        //Stopstrook
        tekenen.fillRect(200, 420 + y, 150, 5 + y);
        //Onderbroken strook rechts
        for (i = 0; i <= 6; i++) {
            tekenen.drawLine(300, (455 + i * 10) + y, 300, (460 + i * 10) + y);
        }
        //onderbroken strook links
        for (i = 0; i <= 6; i++) {
            tekenen.drawLine(250, (455 + i * 10) + y, 250, (460 + i * 10) + y);
        }
        //Oversteekplaats
        for (i = 0; i <= 19; i++) {
            tekenen.fillRect(154 + i * 10, 400 + y, 4, 10 + y);
        }

        //RIJBANEN boven -------------------------------------------------------
        //Middelste strook
        tekenen.drawLine(300, 85 + y, 300, 0 + y);
        //Rechter strook
        tekenen.drawLine(200, 85 + y, 200, 55 + y);
        //Linker strook
        tekenen.drawLine(250, 85 + y, 250, 55 + y);
        //Stopstrook
        tekenen.fillRect(151, 85 + y, 150, 5 + y);
        //Onderbroken strook rechts
        for (i = 0; i <= 6; i++) {
            tekenen.drawLine(200, (55 - i * 10) + y, 200, (50 - i * 10) + y);
        }
        //onderbroken strook links
        for (i = 0; i <= 9; i++) {
            tekenen.drawLine(250, (55 - i * 10) + y, 250, (50 - i * 10) + y);
        }
        //Oversteekplaats
        for (i = 0; i <= 19; i++) {
            tekenen.fillRect(154 + i * 10, 100 + y, 4, 10 + y);
        }

        //RIJBANEN rechts ---------------------------------------------------
        //Middelste strook
        tekenen.drawLine(425, 250 + y, 525, 250 + y);
        //Rechter strook
        tekenen.drawLine(425, 200 + y, 455, 200 + y);
        //Stopstrook
        tekenen.fillRect(420, 151 + y, 5, 100 + y);
        //Onderbroken strook rechts
        for (i = 0; i <= 6; i++) {
            tekenen.drawLine(455 + i * 10, 200 + y, 460 + i * 10, 200 + y);
        }
        //onderbroken strook links
        for (i = 0; i <= 9; i++) {
            tekenen.drawLine(425 + i * 10, 300 + y, 430 + i * 10, 300 + y);
        }
        //Oversteekplaats
        for (i = 0; i <= 19; i++) {
            tekenen.fillRect(400, (154 + i * 10) + y, 10, 4 + y);
        }

        //RIJBANEN links -----------------------------------------------------
        //Middelste strook
        tekenen.drawLine(85, 250 + y, 0, 250 + y);
        //Rechter strook
        tekenen.drawLine(85, 300 + y, 55, 300 + y);
        //Stopstrook
        tekenen.fillRect(85, 250 + y, 5, 100 + y);
        //Onderbroken strook rechts
        for (i = 0; i <= 6; i++) {
            tekenen.drawLine(55 - i * 10, 300 + y, 50 - i * 10, 300 + y);
        }
        //onderbroken strook links
        for (i = 0; i <= 9; i++) {
            tekenen.drawLine(85 - i * 10, 200 + y, 80 - i * 10, 200 + y);
        }
        //Oversteekplaats
        for (i = 0; i <= 19; i++) {
            tekenen.fillRect(100, (154 + i * 10) + y, 10, 4 + y);
        }
        
        int x1 = 220 + x;
        int y1 = 55 + y;
        int[] arrowX = new int[3];
        int[] arrowY = new int[3];
        int n = 3;
        arrowX[0]=0 + x1; arrowX[1]=10 + x1; arrowX[2]=5 + x1;
        arrowY[0]=0 + y1; arrowY[1]=0 + y1; arrowY[2]=10 + y1;
        tekenen.drawLine(5 + x1, 0 + y1, 5 + x1, -15 + y1);
        tekenen.fillPolygon(arrowX, arrowY, n);
        
        int x2 = 55 + x;
        int y2 = 220 + y;
        arrowX[0]=0 + x1; arrowX[1]=10 + x1; arrowX[2]=5 + x1;
        arrowY[0]=0 + y1; arrowY[1]=0 + y1; arrowY[2]=10 + y1;
        tekenen.drawLine(5 + x1, 0 + y1, 5 + x1, -15 + y1);
        tekenen.fillPolygon(arrowX, arrowY, n);
    }

    public static void main(String ad[]) {

        JFrame jp1 = new JFrame();
        test a = new test();
        jp1.getContentPane().add(a, BorderLayout.CENTER);
        jp1.setSize(new Dimension(500, 500));
        jp1.setVisible(true);
    }
}
