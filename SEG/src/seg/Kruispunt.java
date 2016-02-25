/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seg;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author MAX
 */
public class Kruispunt extends JApplet {

    public void paint(Graphics tekenen) {
        int i;
        int x = 0;
        int y = 0;
        this.resize(1000, 1000);
        //PIJLEN VARIABELENs
        int[] arrowX;
        int[] arrowY;
        int n = 3;
        arrowX = new int[3];
        arrowY = new int[3];
        int y1 = 55 + y;
        int y2 = 445 + y;
        int x1 = 220 + x;
        int x2 = 165 + x;
        int x3 = 275 + x;
        int x4 = 330 + x;
 
        //BOCHTEN
        //Bocht linksboven
        tekenen.drawArc(115 + x, 115 + y, 35, 35, 0, -90);
        //Lijn naar links
        tekenen.drawLine(135 + x, 150 + y, 0 + x, 150 + y);
        //Lijn naar boven
        tekenen.drawLine(150 + x, 133 + y, 150 + x, 0 + y);
        //Bocht linksonder
        tekenen.drawArc(115 + x, 350 + y, 35, 35, 0, 90);
        //Lijn naar benenden
        tekenen.drawLine(150 + x, 367 + y, 150 + x, 525 + y);
        //Lijn naar links
        tekenen.drawLine(135 + x, 350 + y, 0 + x, 350 + y);
        //Bocht rechtsboven
        tekenen.drawArc(350 + x, 115 + y, 35, 35, 180, 90);
        //Lijn naar rechts
        tekenen.drawLine(367 + x, 150 + y, 525 + x, 150 + y);
        //Lijn naar boven
        tekenen.drawLine(350 + x, 133 + y, 350 + x, 0 + y);
        //Bocht rechtsonder
        tekenen.drawArc(350 + x, 350 + y, 35, 35, 180, -90);
        //Lijn naar benenden
        tekenen.drawLine(350 + x, 367 + y, 350 + x, 525 + y);
        //Lijn naar rechts
        tekenen.drawLine(367 + x, 350 + y, 525 + x, 350 + y);

        
        
        //RIJBANEN onder ---------------------------------------------------
        //Middelste strook
        tekenen.drawLine(200 + x, 425 + y, 200 + x, 525 + y);
        //Rechter strook
        tekenen.drawLine(300 + x, 425 + y, 300 + x, 455 + y);
        //Linker strook
        tekenen.drawLine(250 + x, 425 + y, 250 + x, 455 + y);
        //Stopstrook
        tekenen.fillRect(200 + x, 420 + y, 150, 5);
        //Onderbroken strook rechts
        for (i = 0; i <= 6; i++) {
            tekenen.drawLine(300 + x, (455 + i * 10) + y, 300 + x, (460 + i * 10) + y);
        }
        //onderbroken strook links
        for (i = 0; i <= 6; i++) {
            tekenen.drawLine(250 + x, (455 + i * 10) + y, 250 + x, (460 + i * 10) + y);
        }
        //Oversteekplaats
        for (i = 0; i <= 19; i++) {
            tekenen.fillRect((154 + i * 10)  + x, 400 + y, 4, 10);
        }
        
        //PIJL NAAR BOVEN
        arrowX[0]=0 + x3 -5; arrowX[1]=10 + x3 -5; arrowX[2]=5 + x3 -5;
        arrowY[0]=10 + y2; arrowY[1]=10 + y2; arrowY[2]=0 + y2;
        tekenen.drawLine(5 + x3 -5, 10 + y2, 5 + x3 -5, 25 + y2);
        tekenen.fillPolygon(arrowX, arrowY, n);

        //PIJL NAAR LINKS
        arrowX[0]=0 + x1; arrowX[1]=10 + x1; arrowX[2]=10 + x1;
        arrowY[0]=5 + y2; arrowY[1]=0 + y2; arrowY[2]=10 + y2;
        tekenen.drawLine(10 + x1, 5 + y2, 15 + x1, 5 + y2);
        tekenen.drawLine(15 + x1, 5 + y2, 15 + x1, 25 + y2);
        tekenen.fillPolygon(arrowX, arrowY, n);
        
        //PIJL NAAR RECHST
        arrowX[0]=10 + x4; arrowX[1]=0 + x4; arrowX[2]=0 + x4;
        arrowY[0]=5 + y2; arrowY[1]=0 + y2; arrowY[2]=10 + y2;
        tekenen.drawLine(0 + x4, 5 + y2, -5 + x4, 5 + y2);
        tekenen.drawLine(-5 + x4, 5 + y2, -5 + x4, 25 + y2);
        tekenen.fillPolygon(arrowX, arrowY, n);
        
        

        //RIJBANEN boven -------------------------------------------------------
        //Middelste strook
        tekenen.drawLine(300 + x, 85 + y, 300 + x, 0 + y);
        //Rechter strook
        tekenen.drawLine(200 + x, 85 + y, 200 + x, 55 + y);
        //Linker strook
        tekenen.drawLine(250 + x, 85 + y, 250 + x, 55 + y);
        //Stopstrook
        tekenen.fillRect(151 + x, 85 + y, 150, 5);
        //Onderbroken strook rechts
        for (i = 0; i <= 6; i++) {
            tekenen.drawLine(200 + x, (55 - i * 10) + y, 200 + x, (50 - i * 10) + y);
        }
        //onderbroken strook links
        for (i = 0; i <= 6; i++) {
            tekenen.drawLine(250 + x, (55 - i * 10) + y, 250 + x, (50 - i * 10) + y);
        }
        //Oversteekplaats
        for (i = 0; i <= 19; i++) {
            tekenen.fillRect((154 + i * 10) + x, 100 + y, 4, 10);
        }
        
        //PIJL NAAR BENEDEN
        arrowX[0]=0 + x1; arrowX[1]=10 + x1; arrowX[2]=5 + x1;
        arrowY[0]=0 + y1; arrowY[1]=0 + y1; arrowY[2]=10 + y1;
        tekenen.drawLine(5 + x1, 0 + y1, 5 + x1, -15 + y1);
        tekenen.fillPolygon(arrowX, arrowY, n);
        
        //PIJL NAAR RECHTS
        arrowX[0]=0 + x2; arrowX[1]=10 + x2; arrowX[2]=10 + x2;
        arrowY[0]=5 + y1; arrowY[1]=0 + y1; arrowY[2]=10 + y1;
        tekenen.drawLine(10 + x2, 5 + y1, 15 + x2, 5 + y1);
        tekenen.drawLine(15 + x2, 5+ y1, 15 + x2, -15 + y1);
        tekenen.fillPolygon(arrowX, arrowY, n);
        
        //PIJL NAAR LINKS
        arrowX[0]=10 + x3; arrowX[1]=0 + x3; arrowX[2]=0 + x3;
        arrowY[0]=5 + y1; arrowY[1]=0 + y1; arrowY[2]=10 + y1;
        tekenen.drawLine(0 + x3, 5 + y1, -5 + x3, 5 + y1);
        tekenen.drawLine(-5 + x3, 5+ y1, -5 + x3, -15 + y1);
        tekenen.fillPolygon(arrowX, arrowY, n);
        
        //RIJBANEN rechts ---------------------------------------------------
        //Middelste strook
        tekenen.drawLine(425 + x, 250 + y, 525 + x, 250 + y);
        //Rechter strook
        tekenen.drawLine(425 + x, 200 + y, 455 + x, 200 + y);
        //Stopstrook
        tekenen.fillRect(420 + x, 151 + y, 5, 100);
        //Onderbroken strook rechts
        for (i = 0; i <= 6; i++) {
            tekenen.drawLine((455 + i * 10) + x, 200 + y, (460 + i * 10) + x, 200 + y);
        }
        //onderbroken strook links
        for (i = 0; i <= 9; i++) {
            tekenen.drawLine((425 + i * 10) + x, 300 + y, (430 + i * 10) + x, 300 + y);
        }
        //Oversteekplaats
        for (i = 0; i <= 19; i++) {
            tekenen.fillRect(400 + x, (154 + i * 10) + y, 10, 4);
        }

        
        
        //RIJBANEN links -----------------------------------------------------
        //Middelste strook
        tekenen.drawLine(85 + x, 250 + y, 0 + x, 250 + y);
        //Rechter strook
        tekenen.drawLine(85 + x, 300 + y, 55 + x, 300 + y);
        //Stopstrook
        tekenen.fillRect(85 + x, 250 + y, 5, 100);
        //Onderbroken strook rechts
        for (i = 0; i <= 6; i++) {
            tekenen.drawLine((55 - i * 10) + x, 300 + y, (50 - i * 10) + x, 300 + y);
        }
        //onderbroken strook links
        for (i = 0; i <= 9; i++) {
            tekenen.drawLine((85 - i * 10) + x, 200 + y, (80 - i * 10) + x, 200 + y);
        }
        //Oversteekplaats
        for (i = 0; i <= 19; i++) {
            tekenen.fillRect(100 + x, (154 + i * 10) + y, 10, 4);
        }

    }
}
