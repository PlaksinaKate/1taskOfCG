package com.company;

import java.awt.*;

public class ObjectsNearTheHouse implements Drawable {
    private int bigPartOgTheHouseX1, bigPartOgTheHouseX2, bigPartOgTheHouseY2, smallPartOfTheHouseX1, smallPartOfTheHouseX2, smallPartOfTheHouseY2;
    private Color stone, nearLake, lake;

    @Override
    public void draw(Graphics2D gr) {
        stone(gr, smallPartOfTheHouseX1, smallPartOfTheHouseX2, smallPartOfTheHouseY2, bigPartOgTheHouseX1, bigPartOgTheHouseX2, bigPartOgTheHouseY2, stone);
        lake(gr, smallPartOfTheHouseX2, smallPartOfTheHouseY2, bigPartOgTheHouseX1, nearLake, lake);
    }

    public static void stone(Graphics2D gr, int smallPartOfTheHouseX1, int smallPartOfTheHouseX2, int smallPartOfTheHouseY2, int bigPartOgTheHouseX1, int bigPartOgTheHouseX2, int bigPartOgTheHouseY2, Color stone) {
        gr.setColor(stone);
        gr.fillPolygon(new int[]{bigPartOgTheHouseX1, bigPartOgTheHouseX1 + 20, bigPartOgTheHouseX2 - 20, bigPartOgTheHouseX2}, new int[]{bigPartOgTheHouseY2, bigPartOgTheHouseY2 - 48, bigPartOgTheHouseY2 - 48, bigPartOgTheHouseY2}, 4);
        gr.fillPolygon(new int[]{smallPartOfTheHouseX1 - 10, smallPartOfTheHouseX2 + 10, smallPartOfTheHouseX2 - 24, smallPartOfTheHouseX1 + 24}, new int[]{smallPartOfTheHouseY2, smallPartOfTheHouseY2, smallPartOfTheHouseY2 - 39, smallPartOfTheHouseY2 - 39}, 4);
        gr.fillPolygon(new int[]{smallPartOfTheHouseX1 - 10, smallPartOfTheHouseX2 + 10, bigPartOgTheHouseX1 - 10, bigPartOgTheHouseX2 + 10, bigPartOgTheHouseX2 + 100, smallPartOfTheHouseX1 - 110}, new int[]{smallPartOfTheHouseY2 + 5, smallPartOfTheHouseY2 + 5, bigPartOgTheHouseY2 + 5, bigPartOgTheHouseY2 + 5, bigPartOgTheHouseY2 + 250, bigPartOgTheHouseY2 + 250}, 6);
    }

    public static void lake(Graphics2D gr, int smallPartOfTheHouseX2, int smallPartOfTheHouseY2, int bigPartOgTheHouseX1, Color nearLake, Color lake) {
        gr.setColor(nearLake);
        gr.fillOval(bigPartOgTheHouseX1 - 5, smallPartOfTheHouseY2 + 95, smallPartOfTheHouseX2 * 3 / 4 + 10, smallPartOfTheHouseX2 * 3 / 4 + 10);
        gr.setColor(lake);
        gr.fillOval(bigPartOgTheHouseX1, smallPartOfTheHouseY2 + 100, smallPartOfTheHouseX2 * 3 / 4, smallPartOfTheHouseX2 * 3 / 4);

    }

//    public static void livingFence(Graphics2D, int smallPartOfTheHouseX1) {
//        int n = 0;
//        for (int j = 500; j <= 1000; j++) {
//            for (int i = smallPartOfTheHouseX1 - 200; i <= smallPartOfTheHouseX1; i++) {
//                if (n<4) {
//
//
//                }
//            }
//        }
//    }

    public ObjectsNearTheHouse(int bigPartOgTheHouseX1, int bigPartOgTheHouseX2, int bigPartOgTheHouseY2, int smallPartOfTheHouseX1, int smallPartOfTheHouseX2, int smallPartOfTheHouseY2, Color stone, Color nearLake, Color lake) {
        this.bigPartOgTheHouseX1 = bigPartOgTheHouseX1;
        this.bigPartOgTheHouseX2 = bigPartOgTheHouseX2;
        this.bigPartOgTheHouseY2 = bigPartOgTheHouseY2;
        this.smallPartOfTheHouseX1 = smallPartOfTheHouseX1;
        this.smallPartOfTheHouseX2 = smallPartOfTheHouseX2;
        this.smallPartOfTheHouseY2 = smallPartOfTheHouseY2;
        this.stone = stone;
        this.nearLake = nearLake;
        this.lake = lake;
    }
}
