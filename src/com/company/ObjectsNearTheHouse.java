package com.company;

import java.awt.*;

public class ObjectsNearTheHouse implements Drawable {
    private int houseX, houseY, houseX2, houseY2;
    private Color stone, nearSwimmingPool, swimmingPool, livingFence, outlineOfLivingFence;

    @Override
    public void draw(Graphics2D gr) {
        stone(gr, houseX, houseY, houseX2, houseY2, stone, nearSwimmingPool);
        swimmingPool(gr, houseX, houseY, houseX2, houseY2, nearSwimmingPool, swimmingPool);
        livingFence(gr, houseX, livingFence, outlineOfLivingFence);
    }

    public static void stone(Graphics2D gr, int houseX, int houseY, int houseX2, int houseY2, Color stone, Color nearSwimmingPool) {
        gr.setColor(stone);
        //камень у входа для большой части дома
        gr.fillPolygon(new int[]{houseX + 400, houseX + 420, houseX2 - 20, houseX2}, new int[]{houseY2, houseY2 - 48, houseY2 - 48, houseY2}, 4);
        //камень у входа для маленькой части дома
        gr.fillPolygon(new int[]{houseX - 10, houseX + 390, houseX + 356, houseX + 24}, new int[]{houseY + 400, houseY + 400, houseY + 361, houseY + 361}, 4);
        //камни спереди дома
        gr.fillPolygon(new int[]{houseX - 10, houseX + 390, houseX + 390, houseX2, houseX2 + 100, houseX - 110}, new int[]{houseY + 405, houseY + 405, houseY2 + 5, houseY2 + 5, houseY2 + 250, houseY2 + 250}, 6);
        //порожки
        gr.setColor(nearSwimmingPool);
        gr.fillRect(houseX - 10, houseY + 400, 400, 5);
        gr.fillRect(houseX + 390, houseY2, 510, 5);

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
        gr.setStroke(new BasicStroke(8));
        gr.drawLine(houseX + 410, houseY + 600, houseX + 410, houseY + 550);
        gr.drawLine(houseX + 426, houseY + 588, houseX + 426, houseY + 540);
        gr.drawLine(houseX + 451, houseY + 603, houseX + 451, houseY + 548);
        gr.drawLine(houseX + 435, houseY + 615, houseX + 435, houseY + 560);
        gr.drawLine(houseX + 410, houseY + 545, houseX + 435, houseY + 560);
        gr.drawLine(houseX + 426, houseY + 535, houseX + 445, houseY + 545);

        //cтупеньки
        gr.drawLine(houseX + 440,houseY + 580, houseX + 451,houseY + 570);
        gr.drawLine(houseX + 440,houseY + 595, houseX + 451,houseY + 585);
        gr.drawLine(houseX + 440,houseY + 610, houseX + 451,houseY + 600);

    }

    public static void livingFence(Graphics2D gr, int houseX, Color livingFence, Color outlineOfLivingFence) {

        int temp = 0;
        int mcA[] = {20, 190, -50, 180, -30, 95, 150, -40, 180};
        int mcB[] = {-10, 170, -30, 95, 150, 50, -22};

        int currentMC[][] = {mcA, mcB};
        for (int i = houseX - 200; i <= 1500; ) {
            for (int j = 400; j <= 1000; j = j + 100) {
                //currentMC[temp%2]; (?)
                gr.setColor(livingFence);
                //gr.fillRect(i, j, 180, 75);
                gr.fillRect(i, j, 181, 150);
                gr.setColor(outlineOfLivingFence);
                gr.setStroke(new BasicStroke(4));
                gr.drawRect(i, j, 181, 150);
                // gr.fillRect(i, j + 75, 180, 75);
                if (temp == 0) {
                    //ограда с левой стороны

                    gr.setColor(livingFence);
                    gr.fillPolygon(new int[]{i, i + currentMC[0][0], i + currentMC[0][1], i + currentMC[0][8], i}, new int[]{j, j + currentMC[0][2], j + currentMC[0][2], j, j}, 5);
                    gr.fillPolygon(new int[]{i + currentMC[0][8], i + currentMC[0][1], i + currentMC[0][1], i + currentMC[0][3], i + currentMC[0][3]}, new int[]{j, j + currentMC[0][2], j + currentMC[0][5], j + currentMC[0][6], j}, 5);

                    gr.setColor(outlineOfLivingFence);
                    gr.setStroke(new BasicStroke(4));
                    gr.drawPolygon(new int[]{i, i + currentMC[0][0], i + currentMC[0][1], i + currentMC[0][8], i}, new int[]{j, j + currentMC[0][2], j + currentMC[0][2], j, j}, 5);
                    gr.drawPolygon(new int[]{i + currentMC[0][3], i + currentMC[0][1], i + currentMC[0][1], i + currentMC[0][3], i + currentMC[0][3]}, new int[]{j, j + currentMC[0][2], j + currentMC[0][5], j + currentMC[0][6], j}, 5);

                    i = i + currentMC[0][7];
                } else {
                    //ограда с правой стороны

                    gr.setColor(livingFence);
                    gr.fillPolygon(new int[]{i, i + currentMC[1][0], i + currentMC[1][1], i + currentMC[1][1], i}, new int[]{j, j + currentMC[1][2], j + currentMC[1][2], j, j}, 5);
                    gr.fillPolygon(new int[]{i, i + currentMC[1][0], i + currentMC[1][0], i, i}, new int[]{j, j + currentMC[1][6], j + currentMC[1][3], j + currentMC[1][4], j}, 5);

                    gr.setColor(outlineOfLivingFence);
                    gr.setStroke(new BasicStroke(4));
                    gr.drawPolygon(new int[]{i, i + currentMC[1][0], i + currentMC[1][1], i + currentMC[1][1], i}, new int[]{j, j + currentMC[1][2], j + currentMC[1][2], j, j}, 5);
                    gr.drawPolygon(new int[]{i, i + currentMC[1][0], i + currentMC[1][0], i, i}, new int[]{j, j + currentMC[1][6], j + currentMC[1][3], j + currentMC[1][4], j}, 5);

                    i = i + currentMC[1][5];
                }
            }
            i = i + 1400;
            temp++;
        }

    }

    public ObjectsNearTheHouse(int houseX, int houseY, int houseX2, int houseY2, Color stone, Color nearSwimmingPool, Color swimmingPool, Color livingFence, Color outlineOfLivingFence) {
        this.houseX = houseX;
        this.houseY = houseY;
        this.houseX2 = houseX2;
        this.houseY2 = houseY2;
        this.stone = stone;
        this.nearSwimmingPool = nearSwimmingPool;
        this.swimmingPool = swimmingPool;
        this.livingFence = livingFence;
        this.outlineOfLivingFence = outlineOfLivingFence;
    }
}
