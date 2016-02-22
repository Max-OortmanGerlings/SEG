/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seg;
import javax.swing.JApplet;
import java.awt.Graphics;

/**
 *
 * @author MAX
 */
public class Weg extends JApplet {
    public void paint(Graphics wegdeel){
        int i;
        //RIJBANEN onder
        //Middelste strook
        wegdeel.drawLine(100, 75, 100, 175);
        //Rechter strook
        wegdeel.drawLine(150, 75, 150, 105);
        //Stopstrook
        wegdeel.fillRect(100, 70, 100, 5);
        //Onderbroken strook rechts
        for(i = 0; i <=6; i++){
            wegdeel.drawLine(150, 105 + i*10, 150, 110 + i*10);
        }
        //onderbroken strook links
        for(i = 0; i <=9; i++){
            wegdeel.drawLine(50, 75 + i*10, 50, 80 + i*10);
        }
        //Oversteekplaats
        for(i = 0; i <= 19; i++){
            wegdeel.fillRect(4 + i*10, 50 ,4, 10);
        }
        
    }
}
