package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private Sky sky = new Sky(0, 0, 1500, 500, new Color(233, 234, 255), new Color(120, 124, 232));
    private Ground ground = new Ground(0, 500, 1500, 500, new Color(98, 252, 108), new Color(64, 168, 48));
    private Home home = new Home(400, 300, 1300, 750, new Color(84, 61, 61), new Color(41, 29, 29), new Color(39, 40, 35), new Color(252, 255, 199), new Color(255, 255, 153));
    private ObjectsNearTheHouse objectsNearTheHouse = new ObjectsNearTheHouse(400, 300, 1300, 750, new Color(119, 136, 153), new Color(112, 128, 144), new Color(135, 206, 235), new Color(85, 220, 36));

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        sky.draw(gr);
        ground.draw(gr);
        home.draw(gr);
        objectsNearTheHouse.draw(gr);

    }
}
