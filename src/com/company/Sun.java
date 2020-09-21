package com.company;

import java.awt.*;

public class Sun implements Drawable {
    private int x, y, width, height;
    private Color c;

    @Override
    public void draw(Graphics2D gr) {
        sun(gr, x, y, width, height, c);
    }

    public static void sun(Graphics2D gr, int x, int y, int width, int height, Color c) {
        gr.setColor(c);
        gr.fillOval(x, y, width, height);
    }

    public Sun(int x, int y, int width, int height, Color c) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.c = c;
    }
}
