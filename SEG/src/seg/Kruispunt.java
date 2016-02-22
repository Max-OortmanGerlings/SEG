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
        //BOCHTEN
        //Bocht linksboven
        tekenen.drawArc(115, 115, 35, 35, 0, -90);
        //Lijn naar links
        tekenen.drawLine(135, 150, 0, 150);
        //Lijn naar boven
        tekenen.drawLine(150, 133, 150, 0);
        //Bocht linksonder
        tekenen.drawArc(115, 350, 35, 35, 0, 90);
        //Lijn naar benenden
        tekenen.drawLine(150, 367, 150, 525);
        //Lijn naar links
        tekenen.drawLine(135, 350, 0, 350);
        //Bocht rechtsboven
        tekenen.drawArc(350, 115, 35, 35, 180, 90);
        //Lijn naar rechts
        tekenen.drawLine(367, 150, 525, 150);
        //Lijn naar boven
        tekenen.drawLine(350, 133, 350, 0);
        //Bocht rechtsonder
        tekenen.drawArc(350, 350, 35, 35, 180, -90);
        //Lijn naar benenden
        tekenen.drawLine(350, 367, 350, 525);
        //Lijn naar rechts
        tekenen.drawLine(367, 350, 525, 350);

        //RIJBANEN onder ---------------------------------------------------
        //Middelste strook
        tekenen.drawLine(200, 425, 200, 525);
        //Rechter strook
        tekenen.drawLine(300, 425, 300, 455);
        //Linker strook
        tekenen.drawLine(250, 425, 250, 455);
        //Stopstrook
        tekenen.fillRect(200, 420, 150, 5);
        //Onderbroken strook rechts
        for (i = 0; i <= 6; i++) {
            tekenen.drawLine(300, 455 + i * 10, 300, 460 + i * 10);
        }
        //onderbroken strook links
        for (i = 0; i <= 6; i++) {
            tekenen.drawLine(250, 455 + i * 10, 250, 460 + i * 10);
        }
        //Oversteekplaats
        for (i = 0; i <= 19; i++) {
            tekenen.fillRect(154 + i * 10, 400, 4, 10);
        }

        //RIJBANEN boven -------------------------------------------------------
        //Middelste strook
        tekenen.drawLine(300, 85, 300, 0);
        //Rechter strook
        tekenen.drawLine(200, 85, 200, 55);
        //Linker strook
        tekenen.drawLine(250, 85, 250, 55);
        //Stopstrook
        tekenen.fillRect(151, 85, 150, 5);
        //Onderbroken strook rechts
        for (i = 0; i <= 6; i++) {
            tekenen.drawLine(200, 55 - i * 10, 200, 50 - i * 10);
        }
        //onderbroken strook links
        for (i = 0; i <= 9; i++) {
            tekenen.drawLine(250, 55 - i * 10, 250, 50 - i * 10);
        }
        //Oversteekplaats
        for (i = 0; i <= 19; i++) {
            tekenen.fillRect(154 + i * 10, 100, 4, 10);
        }

        //RIJBANEN rechts ---------------------------------------------------
        //Middelste strook
        tekenen.drawLine(425, 250, 525, 250);
        //Rechter strook
        tekenen.drawLine(425, 200, 455, 200);
        //Stopstrook
        tekenen.fillRect(420, 151, 5, 100);
        //Onderbroken strook rechts
        for (i = 0; i <= 6; i++) {
            tekenen.drawLine(455 + i * 10, 200, 460 + i * 10, 200);
        }
        //onderbroken strook links
        for (i = 0; i <= 9; i++) {
            tekenen.drawLine(425 + i * 10, 300, 430 + i * 10, 300);
        }
        //Oversteekplaats
        for (i = 0; i <= 19; i++) {
            tekenen.fillRect(400, 154 + i * 10, 10, 4);
        }

        //RIJBANEN links -----------------------------------------------------
        //Middelste strook
        tekenen.drawLine(85, 250, 0, 250);
        //Rechter strook
        tekenen.drawLine(85, 300, 55, 300);
        //Stopstrook
        tekenen.fillRect(85, 250, 5, 100);
        //Onderbroken strook rechts
        for (i = 0; i <= 6; i++) {
            tekenen.drawLine(55 - i * 10, 300, 50 - i * 10, 300);
        }
        //onderbroken strook links
        for (i = 0; i <= 9; i++) {
            tekenen.drawLine(85 - i * 10, 200, 80 - i * 10, 200);
        }
        //Oversteekplaats
        for (i = 0; i <= 19; i++) {
            tekenen.fillRect(100, 154 + i * 10, 10, 4);
        }
    }
}
