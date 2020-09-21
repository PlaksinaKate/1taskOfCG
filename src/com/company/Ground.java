package com.company;

import java.awt.*;

public class Ground implements Drawable {
    private int x, y, width, height;
    private Color ground, lawn;

    @Override
    public void draw(Graphics2D gr) {
        ground(gr, x, y, width, height, ground);
        lawn(gr, width, height, lawn);
    }

    public static void ground(Graphics2D gr, int x, int y, int width, int height, Color ground) {
        gr.setColor(ground);
        gr.fillRect(x, y, width, height);
    }

    public static void lawn(Graphics2D gr, int width, int height, Color lawn) {
        gr.setColor(lawn);
        gr.setStroke(new BasicStroke(1.0f));
        for (int n = 0; n <= height; n = n + 5) {
            for (int i = 0; i <= width; i = i + 4) {
                gr.drawLine(i, height + n, i, height - 3 + n);
            }

        }
    }

    public Ground(int x, int y, int width, int height, Color ground, Color lawn) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.ground = ground;
        this.lawn = lawn;
    }
}
