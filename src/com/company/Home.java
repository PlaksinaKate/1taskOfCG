package com.company;

import java.awt.*;

public class Home implements Drawable {
    private int houseX, houseY, houseX2, houseY2;
    private Color roof1, roof2, darkPartOfTheHouse, brightWall, innerLight;

    @Override
    public void draw(Graphics2D gr) {
        roof(gr, houseX, houseY, roof1, roof2);
        darkPartOfTheHouse1(gr, houseX, houseY, houseX2, houseY2, darkPartOfTheHouse);
        brightWall(gr, houseX, houseY, houseX2, houseY2, brightWall);
        darkPartOfTheHouse2(gr, houseX, houseY, houseX2, darkPartOfTheHouse);
        text(gr, houseX, houseY);
        innerLight(gr, houseX, houseY, houseX2, houseY2, innerLight);
        windowFrames(gr, houseX, houseY, houseX2, houseY2, darkPartOfTheHouse);

    }

    public static void roof(Graphics2D gr, int houseX, int houseY, Color roof1, Color roof2) {

        gr.setPaint(new GradientPaint(houseX - 10, houseY - 210, roof1, houseX + 690, houseY + 90, roof2));
        gr.fillPolygon(new int[]{houseX - 10, houseX + 20, houseX + 600, houseX + 690}, new int[]{houseY, houseY / 2 - 50, houseY / 2 - 50, houseY}, 4);
    }

    public static void darkPartOfTheHouse1(Graphics2D gr, int houseX, int houseY, int houseX2, int houseY2, Color darkPartOfTheHouse) {
        gr.setColor(darkPartOfTheHouse);
        gr.fillPolygon(new int[]{houseX + 390, houseX + 390, (houseX2 - houseX) * 3 / 4 + houseX - 20, houseX2 + 10, houseX2 + 10}, new int[]{houseY2, houseY - 50, houseY - 300, houseY - 50, houseY2}, 5);
        gr.fillPolygon(new int[]{houseX - 10, houseX - 10, (houseX2 - houseX) / 4 + houseX - 20, houseX + 390, houseX + 390}, new int[]{houseY2 - 50, houseY, houseY - 210, houseY, houseY2 - 50}, 5);

    }

    public static void brightWall(Graphics2D gr, int houseX, int houseY, int houseX2, int houseY2, Color brightWall) {
        gr.setColor(brightWall);
        gr.fillPolygon(new int[]{houseX + 400, houseX + 400, (houseX2 - houseX) * 3 / 4 + houseX - 20, houseX2, houseX2}, new int[]{houseY2, houseY - 50, houseY - 290, houseY - 50, houseY2}, 5);
        gr.fillPolygon(new int[]{houseX, houseX, (houseX2 - houseX) / 4 + houseX - 20, houseX + 380, houseX + 380}, new int[]{houseY + 400, houseY, houseY - 200, houseY, houseY + 400}, 5);

    }

    public static void darkPartOfTheHouse2(Graphics2D gr, int houseX, int houseY, int houseX2, Color darkPartOfTheHouse) {
        gr.setColor(darkPartOfTheHouse);
        gr.fillPolygon(new int[]{houseX + 20, (houseX2 - houseX) / 4 + houseX - 20, houseX + 360}, new int[]{houseY, houseY / 2 - 30, houseY}, 3);

    }

    public static void text(Graphics2D gr, int houseX, int houseY) {
        gr.setColor(Color.WHITE);
        gr.drawString("Золотая молодеж ФКН", houseX + 50, houseY - 10);

    }

    public static void innerLight(Graphics2D gr, int houseX, int houseY, int houseX2, int houseY2, Color innerLight) {
        gr.setColor(innerLight);
        gr.fillRect(houseX + 24, houseY - 1, houseX - 68, houseY + 61);
        gr.fillPolygon(new int[]{houseX + 420, (houseX2 - houseX) * 3 / 4 + houseX - 20, houseX2 - 20, houseX2 - 20, houseX + 420}, new int[]{houseY - 50, houseY - 270, houseY - 50, houseY2 - 50, houseY2 - 50}, 5);


    }

    public static void windowFrames(Graphics2D gr, int houseX, int houseY, int houseX2, int houseY2, Color darkPartOfTheHouse) {
        gr.setColor(darkPartOfTheHouse);
        gr.setStroke(new BasicStroke(4));
        int i = (houseX2 - houseX) / 4 + houseX - 40;
        gr.drawPolygon(new int[]{houseX + 24, i, i, houseX + 24}, new int[]{houseY - 1, houseY - 1, houseY + 360, houseY + 360}, 4);
        gr.drawLine(houseX + 356, houseY - 1, houseX + 356, houseY + 360);
        gr.drawLine(houseX + 356, houseY + 360, houseX + 160, houseY + 360);

        int i1 = (houseX2 - houseX) * 3 / 4 + houseX ;
        gr.drawPolygon(new int[]{houseX + 420, i1 - 20, houseX2 - 20}, new int[]{houseY - 50, houseY - 270, houseY - 50}, 3);
        gr.drawPolygon(new int[]{houseX + 420, i1 - 60, i1 - 60, houseX + 420}, new int[]{houseY - 50, houseY - 50, houseY2 - 50, houseY2 - 50}, 4);
        gr.drawPolygon(new int[]{i1 - 60, houseX2 - 20, houseX2 - 20, i1 - 60}, new int[]{houseY - 50, houseY - 50, houseY2 - 50, houseY2 - 50}, 4);


    }


    public Home(int houseX, int houseY, int houseX2, int houseY2, Color roof1, Color roof2, Color darkPartOfTheHouse, Color brightWall, Color innerLight) {
        this.houseX = houseX;
        this.houseY = houseY;
        this.houseX2 = houseX2;
        this.houseY2 = houseY2;
        this.roof1 = roof1;
        this.roof2 = roof2;
        this.darkPartOfTheHouse = darkPartOfTheHouse;
        this.brightWall = brightWall;
        this.innerLight = innerLight;
    }
}
