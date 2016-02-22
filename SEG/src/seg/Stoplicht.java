/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seg;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.awt.*;
/**
 *
 * @author MAX
 */
public class Stoplicht extends Applet implements Runnable {

    private int secs = 15;
    private Thread clock;

    public void destroy() {
        clock.stop();
    }

    public void init() {
        String parameter;

        if (clock == null) {
            clock = new Thread(this);
            clock.start();
        }
    }

    public void paint(Graphics gr) {
        --secs;
        if (secs < 15) {
            gr.setColor(Color.BLACK);
            gr.fillRect(100, 50, 50, 100);
            gr.setColor(Color.GREEN);

            gr.fillOval(113, 119, 25, 25);
        }
        if (secs < 10) {
            gr.setColor(Color.BLACK);
            gr.fillRect(100, 50, 50, 100);
            gr.setColor(Color.ORANGE);
            gr.fillOval(113, 89, 25, 25);

        }
        if (secs < 5) {
            gr.setColor(Color.BLACK);
            gr.fillRect(100, 50, 50, 100);
            gr.setColor(Color.RED);
            gr.fillOval(113, 59, 25, 25);
        }
       if (secs == 0){
           secs = 15;
       }
       
    
    {
          
        gr.drawString(" " +secs, 10, 30);

    }
    }
    public void run() {
        while (true) {
            repaint();
            try {
                clock.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public void start() {
        clock.resume();
    
    }
}
