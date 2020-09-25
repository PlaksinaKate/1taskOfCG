package com.company;

import java.awt.*;

public class Home implements Drawable {
    private int smallPartOfTheHouseX1, smallPartOfTheHouseX2, smallPartOfTheHouseY1, smallPartOfTheHouseY2, bigPartOgTheHouseX1, bigPartOgTheHouseX2, bigPartOgTheHouseY1, bigPartOgTheHouseY2;
    private Color roof1, roof2, darkPartOfTheHouse, brightWall, innerLight;

    @Override
    public void draw(Graphics2D gr) {
        home(gr, smallPartOfTheHouseX1, smallPartOfTheHouseX2, smallPartOfTheHouseY1, smallPartOfTheHouseY2, bigPartOgTheHouseX1, bigPartOgTheHouseX2, bigPartOgTheHouseY1, bigPartOgTheHouseY2, roof1, roof2, darkPartOfTheHouse, brightWall, innerLight);
    }

    public static void home(Graphics2D gr, int smallPartOfTheHouseX1, int smallPartOfTheHouseX2, int smallPartOfTheHouseY1, int smallPartOfTheHouseY2, int bigPartOgTheHouseX1, int bigPartOgTheHouseX2, int bigPartOgTheHouseY1, int bigPartOgTheHouseY2, Color roof1, Color roof2, Color darkPartOfTheHouse, Color brightWall, Color innerLight) {
        int middleOfASmallPartOfTheHouse = (smallPartOfTheHouseX2 - smallPartOfTheHouseX1) / 2 + smallPartOfTheHouseX1; //середина маленькой части дома
        int middleOfABigPartOfTheHouse = (bigPartOgTheHouseX2 - bigPartOgTheHouseX1) / 2 + bigPartOgTheHouseX1; //середина большой части дома

        //крыша дома
        gr.setPaint(new GradientPaint(smallPartOfTheHouseX1 - 10, smallPartOfTheHouseY1 - 210, roof1, smallPartOfTheHouseX2 + 310, smallPartOfTheHouseY1 + 90, roof2));
        gr.fillPolygon(new int[]{smallPartOfTheHouseX1 - 10, smallPartOfTheHouseX1 + 20, smallPartOfTheHouseX2 + 220, smallPartOfTheHouseX2 + 310}, new int[]{smallPartOfTheHouseY1, smallPartOfTheHouseY1 / 2 - 50, smallPartOfTheHouseY1 / 2 - 50, smallPartOfTheHouseY1}, 4);


//темные стены дома
        gr.setColor(darkPartOfTheHouse);
        gr.fillPolygon(new int[]{bigPartOgTheHouseX1 - 10, bigPartOgTheHouseX1 - 10, middleOfABigPartOfTheHouse, bigPartOgTheHouseX2 + 10, bigPartOgTheHouseX2 + 10}, new int[]{bigPartOgTheHouseY2, bigPartOgTheHouseY1, bigPartOgTheHouseY1 - 250, bigPartOgTheHouseY1, bigPartOgTheHouseY2}, 5);
        gr.fillPolygon(new int[]{smallPartOfTheHouseX1 - 10, smallPartOfTheHouseX1 - 10, middleOfASmallPartOfTheHouse, smallPartOfTheHouseX2 + 10, smallPartOfTheHouseX2 + 10}, new int[]{smallPartOfTheHouseY2, smallPartOfTheHouseY1, smallPartOfTheHouseY1 - 210, smallPartOfTheHouseY1, smallPartOfTheHouseY2}, 5);

//светлые стены
        gr.setColor(brightWall);
        gr.fillPolygon(new int[]{bigPartOgTheHouseX1, bigPartOgTheHouseX1, middleOfABigPartOfTheHouse, bigPartOgTheHouseX2, bigPartOgTheHouseX2}, new int[]{bigPartOgTheHouseY2, bigPartOgTheHouseY1, bigPartOgTheHouseY1 - 240, bigPartOgTheHouseY1, bigPartOgTheHouseY2}, 5);
        gr.fillPolygon(new int[]{smallPartOfTheHouseX1, smallPartOfTheHouseX1, middleOfASmallPartOfTheHouse, smallPartOfTheHouseX2, smallPartOfTheHouseX2}, new int[]{smallPartOfTheHouseY2, smallPartOfTheHouseY1, smallPartOfTheHouseY1 - 200, smallPartOfTheHouseY1, smallPartOfTheHouseY2}, 5);
//темная часть маленькой част дома
        gr.setColor(darkPartOfTheHouse);
        gr.fillPolygon(new int[]{smallPartOfTheHouseX1 + 20, middleOfASmallPartOfTheHouse, smallPartOfTheHouseX2 - 20}, new int[]{smallPartOfTheHouseY1, smallPartOfTheHouseY1 / 2 - 30, smallPartOfTheHouseY1}, 3);


        // внутренний свет
        gr.setColor(innerLight);
        gr.fillRect(smallPartOfTheHouseX1 + 24, smallPartOfTheHouseY1 - 1, smallPartOfTheHouseX1 - 68, smallPartOfTheHouseY1 + 61);
        gr.fillPolygon(new int[]{bigPartOgTheHouseX1 + 20, middleOfABigPartOfTheHouse, bigPartOgTheHouseX2 - 20, bigPartOgTheHouseX2 - 20, bigPartOgTheHouseX1 + 20}, new int[]{bigPartOgTheHouseY1, bigPartOgTheHouseY1 - 222, bigPartOgTheHouseY1, bigPartOgTheHouseY2 - 50, bigPartOgTheHouseY2 - 50}, 5);


        gr.setColor(darkPartOfTheHouse);
        gr.setStroke(new BasicStroke(4));
        gr.drawPolygon(new int[]{smallPartOfTheHouseX1 + 24, middleOfASmallPartOfTheHouse - 20, middleOfASmallPartOfTheHouse - 20, smallPartOfTheHouseX1 + 24}, new int[]{smallPartOfTheHouseY1 - 1, smallPartOfTheHouseY1 - 1, smallPartOfTheHouseY2 - 40, smallPartOfTheHouseY2 - 40}, 4);
        gr.drawLine(smallPartOfTheHouseX2 - 24, smallPartOfTheHouseY1 - 1, smallPartOfTheHouseX2 - 24, smallPartOfTheHouseY2 - 40);
        gr.drawLine(smallPartOfTheHouseX2 - 24, smallPartOfTheHouseY2 - 40, smallPartOfTheHouseX2 - 220, smallPartOfTheHouseY2 - 40);

        gr.drawPolygon(new int[]{bigPartOgTheHouseX1 + 20, middleOfABigPartOfTheHouse, bigPartOgTheHouseX2 - 20}, new int[]{bigPartOgTheHouseY1, bigPartOgTheHouseY1 / 2 - 97, bigPartOgTheHouseY1}, 3);
        gr.drawPolygon(new int[]{bigPartOgTheHouseX1 + 20, middleOfABigPartOfTheHouse - 30, middleOfABigPartOfTheHouse - 30, bigPartOgTheHouseX1 + 20}, new int[]{bigPartOgTheHouseY1, bigPartOgTheHouseY1, bigPartOgTheHouseY2 - 50, bigPartOgTheHouseY2 - 50}, 4);
        gr.drawPolygon(new int[]{middleOfABigPartOfTheHouse - 30, bigPartOgTheHouseX2 - 20, bigPartOgTheHouseX2 - 20, middleOfABigPartOfTheHouse - 30}, new int[]{bigPartOgTheHouseY1, bigPartOgTheHouseY1, bigPartOgTheHouseY2 - 50, bigPartOgTheHouseY2 - 50}, 4);


    }

    public Home(int smallPartOfTheHouseX1, int smallPartOfTheHouseX2, int smallPartOfTheHouseY1, int smallPartOfTheHouseY2, int bigPartOgTheHouseX1, int bigPartOgTheHouseX2, int bigPartOgTheHouseY1, int bigPartOgTheHouseY2, Color roof1, Color roof2, Color darkPartOfTheHouse, Color brightWall, Color innerLight) {
        this.smallPartOfTheHouseX1 = smallPartOfTheHouseX1;
        this.smallPartOfTheHouseX2 = smallPartOfTheHouseX2;
        this.smallPartOfTheHouseY1 = smallPartOfTheHouseY1;
        this.smallPartOfTheHouseY2 = smallPartOfTheHouseY2;
        this.bigPartOgTheHouseX1 = bigPartOgTheHouseX1;
        this.bigPartOgTheHouseX2 = bigPartOgTheHouseX2;
        this.bigPartOgTheHouseY1 = bigPartOgTheHouseY1;
        this.bigPartOgTheHouseY2 = bigPartOgTheHouseY2;
        this.roof1 = roof1;
        this.roof2 = roof2;
        this.darkPartOfTheHouse = darkPartOfTheHouse;
        this.brightWall = brightWall;
        this.innerLight = innerLight;
    }

}
