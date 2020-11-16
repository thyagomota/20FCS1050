/*
 * CS 1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 34 - StarPanel
 */

import javax.swing.*;
import java.awt.*;

public class StarPanel extends JPanel {

    private int shadeOfGray;
    static final int STAR_SIZE = 2;
    static final int MAX_COLOR = 255;

    StarPanel(Star star) {
        setSize(StarPanel.STAR_SIZE, StarPanel.STAR_SIZE);
        setLocation(new Point(star.getGUIX(), star.getGUIY()));
        // FIXME: rewrite the expression for the shadeOfGray
        this.shadeOfGray = 255;
    }

    public void paintComponent(Graphics g) {
        g.setColor(new Color(this.shadeOfGray, this.shadeOfGray, this.shadeOfGray));
        g.fillOval(0, 0, StarPanel.STAR_SIZE, StarPanel.STAR_SIZE);
    }
}
