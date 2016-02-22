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
public class Vierstoplichten extends Applet implements Runnable {

    private int secs = 120;
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
        //* Stoplicht 1
        if (secs < 120) {
            gr.setColor(Color.BLACK);
            gr.fillRect(100, 150, 50, 100);
            gr.setColor(Color.GREEN);
            gr.fillOval(113, 159, 25, 25);

        }
        if (secs < 75) {
            gr.setColor(Color.BLACK);
            gr.fillRect(100, 150, 50, 100);
            gr.setColor(Color.ORANGE);
            gr.fillOval(113, 189, 25, 25);

        }
        if (secs < 65) {
            gr.setColor(Color.BLACK);
            gr.fillRect(100, 150, 50, 100);
            gr.setColor(Color.RED);
            gr.fillOval(113, 219, 25, 25);

        }
        if (secs == 0) {
            gr.setColor(Color.BLACK);
            gr.fillRect(100, 150, 50, 100);
            gr.fillRect(400, 150, 50, 100);          
            gr.fillRect(220, 50, 100, 50);           
            gr.fillRect(219, 290, 100, 50);
            gr.setColor(Color.RED);
            gr.fillOval(113, 219, 25, 25);
            gr.fillOval(413, 159, 25, 25);
            gr.fillOval(229, 63, 25, 25);
            gr.fillOval(289, 305, 25, 25);
            
            secs = 120;
        }
        //* Stoplicht 2 --------------------------------------------------------------------
        if (secs < 120) {
            gr.setColor(Color.BLACK);
            gr.fillRect(400, 150, 50, 100);
            gr.setColor(Color.GREEN);
            gr.fillOval(413, 219, 25, 25);

        }
        if (secs < 75) {
            gr.setColor(Color.BLACK);
            gr.fillRect(400, 150, 50, 100);
            gr.setColor(Color.ORANGE);
            gr.fillOval(413, 189, 25, 25);

        }
        if (secs < 65) {
            gr.setColor(Color.BLACK);
            gr.fillRect(400, 150, 50, 100);
            gr.setColor(Color.RED);
            gr.fillOval(413, 159, 25, 25);
        }
        //* Stoplicht 3 --------------------------------------------------------------------
     
        if (secs < 120) {
            gr.setColor(Color.BLACK);
            gr.fillRect(220, 50, 100, 50);
            gr.setColor(Color.RED);
            gr.fillOval(229, 63, 25, 25);

        }
        if (secs < 65) {
            gr.setColor(Color.BLACK);
            gr.fillRect(220, 50, 100, 50);
            gr.setColor(Color.GREEN);
            gr.fillOval(289, 63, 25, 25);
        }
        if (secs < 10) {
            gr.setColor(Color.BLACK);
            gr.fillRect(220, 50, 100, 50);
            gr.setColor(Color.ORANGE);
            gr.fillOval(259, 63, 25, 25);

        }
//* Stoplicht 4 --------------------------------------------------------------
        if (secs < 120) {
            gr.setColor(Color.BLACK);
            gr.fillRect(219, 290, 100, 50);
            gr.setColor(Color.RED);
            gr.fillOval(289, 305, 25, 25);
        }
        
          if (secs < 65) {
            gr.setColor(Color.BLACK);
            gr.fillRect(219, 290, 100, 50);
            gr.setColor(Color.GREEN);
            gr.fillOval(229, 305, 25, 25);

          }
        if (secs < 10) {
            gr.setColor(Color.BLACK);
            gr.fillRect(219, 290, 100, 50);
            gr.setColor(Color.ORANGE);
            gr.fillOval(259, 305, 25, 25);

        }
        {

            gr.drawString(" " + secs, 10, 30);

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
