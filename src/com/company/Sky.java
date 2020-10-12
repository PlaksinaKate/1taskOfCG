package com.company;

import java.awt.*;

public class Sky implements Drawable {
    private int x, y, width, height;
    private Color c1, c2;
    private Sun s = new Sun(5, 5, 120, 120, new Color(247, 252, 98));
    private Bird bird = new Bird(1500, 500, 20, Color.black);

    @Override
    public void draw(Graphics2D gr) {
        sky(gr, x, y, width, height, c1, c2);
        s.draw(gr);
        bird.draw(gr);
    }

    public static void sky(Graphics2D gr, int x, int y, int width, int height, Color c1, Color c2) {
        //небо
        GradientPaint grad = new GradientPaint(x, y, c1, width, height, c2);
        gr.setPaint(grad);
        gr.fillRect(x, y, width, height);
    }


    public Sky(int x, int y, int width, int height, Color c1, Color c2) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.c1 = c1;
        this.c2 = c2;
    }
}
