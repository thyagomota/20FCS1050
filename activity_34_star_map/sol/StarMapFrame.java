/*
 * CS 1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 34 - StarMapFrame
 */

import javax.swing.*;
import java.awt.*;

public class StarMapFrame extends JFrame {

    static final int WIDTH = 640;
    static final int HEIGHT = WIDTH;
    static final int TITLE_HEIGHT = 25;

    StarMapFrame() {
        setTitle("Star Map");
        setSize(StarMapFrame.WIDTH, StarMapFrame.HEIGHT + StarMapFrame.TITLE_HEIGHT);
        getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void add(StarPanel starPanel) {
        getContentPane().add(starPanel);
    }
}
