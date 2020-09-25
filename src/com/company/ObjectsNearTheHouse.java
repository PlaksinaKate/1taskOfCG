package com.company;

import java.awt.*;

public class ObjectsNearTheHouse implements Drawable {
    private int bigPartOgTheHouseX1, bigPartOgTheHouseX2, bigPartOgTheHouseY2, smallPartOfTheHouseX1, smallPartOfTheHouseX2, smallPartOfTheHouseY2;
    private Color stone, nearSwimmingPool, swimmingPool, livingFence;

    @Override
    public void draw(Graphics2D gr) {
        stone(gr, smallPartOfTheHouseX1, smallPartOfTheHouseX2, smallPartOfTheHouseY2, bigPartOgTheHouseX1, bigPartOgTheHouseX2, bigPartOgTheHouseY2, stone);
        swimmingPool(gr, smallPartOfTheHouseX2, smallPartOfTheHouseY2, bigPartOgTheHouseX1, nearSwimmingPool, swimmingPool);
        livingFence(gr, smallPartOfTheHouseX1, livingFence);
    }

    public static void stone(Graphics2D gr, int smallPartOfTheHouseX1, int smallPartOfTheHouseX2, int smallPartOfTheHouseY2, int bigPartOgTheHouseX1, int bigPartOgTheHouseX2, int bigPartOgTheHouseY2, Color stone) {
        gr.setColor(stone);
        //камень у входа для большой части дома
        gr.fillPolygon(new int[]{bigPartOgTheHouseX1, bigPartOgTheHouseX1 + 20, bigPartOgTheHouseX2 - 20, bigPartOgTheHouseX2}, new int[]{bigPartOgTheHouseY2, bigPartOgTheHouseY2 - 48, bigPartOgTheHouseY2 - 48, bigPartOgTheHouseY2}, 4);
        //камень у входа для маленькой части дома
        gr.fillPolygon(new int[]{smallPartOfTheHouseX1 - 10, smallPartOfTheHouseX2 + 10, smallPartOfTheHouseX2 - 24, smallPartOfTheHouseX1 + 24}, new int[]{smallPartOfTheHouseY2, smallPartOfTheHouseY2, smallPartOfTheHouseY2 - 39, smallPartOfTheHouseY2 - 39}, 4);
        //камни спереди дома
        gr.fillPolygon(new int[]{smallPartOfTheHouseX1 - 10, smallPartOfTheHouseX2 + 10, bigPartOgTheHouseX1 - 10, bigPartOgTheHouseX2 + 10, bigPartOgTheHouseX2 + 100, smallPartOfTheHouseX1 - 110}, new int[]{smallPartOfTheHouseY2 + 5, smallPartOfTheHouseY2 + 5, bigPartOgTheHouseY2 + 5, bigPartOgTheHouseY2 + 5, bigPartOgTheHouseY2 + 250, bigPartOgTheHouseY2 + 250}, 6);
    }

    public static void swimmingPool(Graphics2D gr, int smallPartOfTheHouseX2, int smallPartOfTheHouseY2, int bigPartOgTheHouseX1, Color nearSwimmingPool, Color swimmingPool) {
        //тень бассейна
        gr.setColor(nearSwimmingPool);
        gr.fillOval(bigPartOgTheHouseX1 - 10, smallPartOfTheHouseY2 + 95, smallPartOfTheHouseX2 * 3 / 4 + 20, smallPartOfTheHouseX2 * 3 / 4 + 10);
        //бассейн
        gr.setColor(swimmingPool);
        gr.fillOval(bigPartOgTheHouseX1, smallPartOfTheHouseY2 + 100, smallPartOfTheHouseX2 * 3 / 4, smallPartOfTheHouseX2 * 3 / 4);

    }

    public static void livingFence(Graphics2D gr, int smallPartOfTheHouseX1, Color livingFence) {
        gr.setColor(livingFence);
        int temp = 0;
        for (int i = smallPartOfTheHouseX1 - 200; i <= 1500; ) {
            for (int j = 400; j <= 1000; j = j + 100) {
                if (temp == 0) {
                    //ограда с левой стороны
                    gr.setColor(livingFence);
                    gr.fillRect(i, j, 180, 75);
                    gr.fillRect(i, j + 75, 180, 75);
                    gr.fillPolygon(new int[]{i, i + 20, i + 190, i + 190, i}, new int[]{j, j - 50, j - 50, j, j}, 5);
                    gr.fillPolygon(new int[]{i + 180, i + 190, i + 190, i + 180, i + 180}, new int[]{j, j - 30, j + 95, j + 150, j}, 5);

                    i = i - 40;
                } else {
                    //ограда с правой стороны
                    gr.setColor(livingFence);
                    gr.fillRect(i, j, 180, 75);
                    gr.fillRect(i, j + 75, 180, 75);
                    gr.fillPolygon(new int[]{i, i - 10, i + 170, i + 170, i}, new int[]{j, j - 30, j - 30, j, j}, 5);
                    gr.fillPolygon(new int[]{i, i - 10, i - 10, i, i}, new int[]{j, j - 30, j + 95, j + 150, j}, 5);

                    i = i + 50;
                }
            }
            i = i + 1400;
            temp++;
        }

    }

    public ObjectsNearTheHouse(int bigPartOgTheHouseX1, int bigPartOgTheHouseX2, int bigPartOgTheHouseY2, int smallPartOfTheHouseX1, int smallPartOfTheHouseX2, int smallPartOfTheHouseY2, Color stone, Color nearSwimmingPool, Color swimmingPool, Color livingFence) {
        this.bigPartOgTheHouseX1 = bigPartOgTheHouseX1;
        this.bigPartOgTheHouseX2 = bigPartOgTheHouseX2;
        this.bigPartOgTheHouseY2 = bigPartOgTheHouseY2;
        this.smallPartOfTheHouseX1 = smallPartOfTheHouseX1;
        this.smallPartOfTheHouseX2 = smallPartOfTheHouseX2;
        this.smallPartOfTheHouseY2 = smallPartOfTheHouseY2;
        this.stone = stone;
        this.nearSwimmingPool = nearSwimmingPool;
        this.swimmingPool = swimmingPool;
        this.livingFence = livingFence;
    }
}
