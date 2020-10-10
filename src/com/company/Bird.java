package com.company;

import java.awt.*;

public class Bird implements Drawable {
    private int width,height;
    private Color bird;
    @Override
    public void draw(Graphics2D gr) {
        bird(gr, width, height, bird);
    }
    public static void bird(Graphics2D gr, int width, int height, Color bird) {
        gr.setColor(bird);
        int num = 0;
        while (num < 20) {
            int i = (int) (Math.random() * width);
            int j = (int) (Math.random() * height);
            gr.fillPolygon(new int[]{i, i + 15, i + 30, i + 15}, new int[]{j + 15, j + 30, j + 15, j + 25}, 4);
            num++;
        }
    }

    public Bird(int width, int height, Color bird) {
        this.width = width;
        this.height = height;
        this.bird = bird;
    }
}
