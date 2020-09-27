package com.company;

import java.awt.*;

public class ObjectsNearTheHouse implements Drawable {
    private int houseX, houseY, houseX2, houseY2;
    private Color stone, nearSwimmingPool, swimmingPool, livingFence;

    @Override
    public void draw(Graphics2D gr) {
        stone(gr, houseX, houseY, houseX2, houseY2, stone);
        swimmingPool(gr, houseX, houseY, houseX2, houseY2, nearSwimmingPool, swimmingPool);
        livingFence(gr, houseX, livingFence);
    }

    public static void stone(Graphics2D gr, int houseX, int houseY, int houseX2, int houseY2, Color stone) {
        gr.setColor(stone);
        //камень у входа для большой части дома
        gr.fillPolygon(new int[]{houseX + 400, houseX + 420, houseX2 - 20, houseX2}, new int[]{houseY2, houseY2 - 48, houseY2 - 48, houseY2}, 4);
        //камень у входа для маленькой части дома
        gr.fillPolygon(new int[]{houseX - 10, houseX + 390, houseX + 356, houseX + 24}, new int[]{houseY + 400, houseY + 400, houseY + 361, houseY + 361}, 4);
        //камни спереди дома
        gr.fillPolygon(new int[]{houseX - 10, houseX + 390, houseX + 390, houseX2, houseX2 + 100, houseX - 110}, new int[]{houseY + 405, houseY + 405, houseY2 + 5, houseY2 + 5, houseY2 + 250, houseY2 + 250}, 6);
    }

    public static void swimmingPool(Graphics2D gr, int houseX, int houseY, int houseX2, int houseY2, Color nearSwimmingPool, Color swimmingPool) {
        //тень бассейна
        gr.setColor(nearSwimmingPool);
        gr.fillArc(houseX + 390, houseY + 505, (houseX + 380) * 3 / 4 + 5, (houseX + 380) * 3 / 8 + 5, 0, 180);

        //бассейн
        gr.setColor(swimmingPool);
        gr.fillArc(houseX + 400, houseY + 510, (houseX + 380) * 3 / 4 - 10, (houseX + 380) * 3 / 8, 0, 180);

        //вход в бассейн
        gr.setColor(nearSwimmingPool);
        gr.setStroke(new BasicStroke(10));
        gr.drawLine(houseX + 410, houseY + 600, houseX + 310, houseY + 550);
        gr.drawLine(houseX + 425, houseY + 600, houseX + 425, houseY + 550);
        // gr.drawArc();
    }

    public static void livingFence(Graphics2D gr, int houseX, Color livingFence) {
        gr.setColor(livingFence);
        int temp = 0;
        int mcA[] = {};
        int mcB[] = {};

        int currentMC[][] = {mcA, mcB};
        for (int i = houseX - 200; i <= 1500; ) {
            for (int j = 400; j <= 1000; j = j + 100) {
                //currentMC[temp%2];
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

    public ObjectsNearTheHouse(int houseX, int houseY, int houseX2, int houseY2, Color stone, Color nearSwimmingPool, Color swimmingPool, Color livingFence) {
        this.houseX = houseX;
        this.houseY = houseY;
        this.houseX2 = houseX2;
        this.houseY2 = houseY2;
        this.stone = stone;
        this.nearSwimmingPool = nearSwimmingPool;
        this.swimmingPool = swimmingPool;
        this.livingFence = livingFence;
    }
}
