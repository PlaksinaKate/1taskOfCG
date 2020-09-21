package com.company;

import javafx.scene.paint.Stop;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

import static java.awt.Color.*;

public class DrawPanel extends JPanel {
    private Sky sky = new Sky(0, 0, 1500, 500, new Color(233, 234, 255), new Color(120, 124, 232));
    private Ground ground = new Ground(0, 500, 1500, 500, new Color(98, 252, 108), new Color(64, 168, 48));
    private Home home = new Home(400, 780, 300, 700, 800, 1300, 250, 750, new Color(84, 61, 61), new Color(41, 29, 29), new Color(39, 40, 35), new Color(252, 255, 199), new Color(255, 255, 153));

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        sky.draw(gr);
        ground.draw(gr);
        home.draw(gr);
    }


    public static void home(Graphics2D gr) {
        gr.setPaint(new GradientPaint(390, 90, new Color(84, 61, 61), 1090, 390, new Color(41, 29, 29)));
        gr.fillPolygon(new int[]{390, 420, 1000, 1090}, new int[]{300, 100, 100, 300}, 4);

        gr.setColor(new Color(91, 83, 83));
        gr.fillPolygon(new int[]{390, 790, 890, 290}, new int[]{705, 705, 1000, 1000}, 4);


        gr.setColor(new Color(39, 40, 35));
        gr.fillPolygon(new int[]{790, 790, 1050, 1310, 1310}, new int[]{750, 250, 0, 250, 750}, 5);
        gr.fillPolygon(new int[]{390, 390, 600, 790, 790}, new int[]{700, 300, 90, 300, 700}, 5);


        gr.setColor(new Color(252, 255, 199));
        gr.fillPolygon(new int[]{800, 800, 1050, 1300, 1300}, new int[]{750, 250, 10, 250, 750}, 5);
        gr.fillPolygon(new int[]{400, 400, 600, 780, 780}, new int[]{700, 300, 100, 300, 700}, 5);

        gr.setColor(new Color(41, 29, 29));
        gr.fillPolygon(new int[]{420, 600, 760}, new int[]{300, 120, 300}, 3);


        // внутренний свет
        gr.setColor(new Color(255, 255, 153));
        gr.fillRect(424, 299, 332, 361);
        gr.fillPolygon(new int[]{820, 1050, 1280, 1280, 820}, new int[]{250, 28, 250, 700, 700}, 5);


        gr.setColor(new Color(41, 29, 29));
        gr.setStroke(new BasicStroke(4));
        gr.drawPolygon(new int[]{424, 580, 580, 424}, new int[]{299, 299, 660, 660}, 4);
        gr.drawLine(756, 299, 756, 660);
        gr.drawLine(756, 660, 580, 660);
        gr.drawPolygon(new int[]{820, 1050, 1280}, new int[]{250, 28, 250}, 3);
        gr.drawPolygon(new int[]{820, 1020, 1020, 820}, new int[]{250, 250, 700, 700}, 4);
        gr.drawPolygon(new int[]{1020, 1280, 1280, 1020}, new int[]{250, 250, 700, 700}, 4);

        // камни
        gr.setColor(new Color(91, 83, 83));
        gr.fillPolygon(new int[]{800, 820, 1280, 1300}, new int[]{750, 702, 702, 750}, 4);
        gr.fillPolygon(new int[]{800, 1300, 1400, 700}, new int[]{755, 755, 1000, 1000}, 4);
        gr.fillPolygon(new int[]{390, 790, 756, 424}, new int[]{700, 700, 661, 661}, 4);

        //тени на стены


    }
}
