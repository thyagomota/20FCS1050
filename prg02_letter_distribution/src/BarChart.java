/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: a model of a simple bar chart with a title, values, and labels
 */

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class BarChart extends JPanel {

    private static final String FONT_NAME         = "SansSerif";
    private static final int    TITLE_FONT_SIZE   = 48;
    private static final int    LABELS_FONT_SIZE  = 20;
    private static final int    VALUES_FONT_SIZE  = 8;
    private static final int    MIN_VALUE_DISPLAY = 1; // in %
    private static final String COLOR_PALETTE     = "gray.palette";

    private String   title;
    private double[] values;
    private String[] labels;
    private ArrayList<Color> colors;

    public BarChart(String title, String[] labels, double[] values) {
        this.title  = title;
        this.labels = labels;
        this.values = values;
        loadColors();
    }

    private void loadColors() {
        Scanner palette = null;
        try {
            palette = new Scanner(new FileInputStream(COLOR_PALETTE));
        }
        catch(FileNotFoundException ex) {
            String defaultPalette = "255,0,0\n0,255,0\n0,0,255";
            palette = new Scanner(new ByteArrayInputStream(defaultPalette.getBytes()));
        }
        colors = new ArrayList<>();
        while (palette.hasNext()) {
            String rgb[] = palette.nextLine().strip().split(",");
            if (rgb.length != 3)
                continue;
            int red = Integer.parseInt(rgb[0]);
            int green = Integer.parseInt(rgb[1]);
            int blue = Integer.parseInt(rgb[2]);
            Color color = new Color(red, green, blue);
            colors.add(color);
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // if no values were informed, then nothing to do
        if (values == null || values.length == 0)
            return;

        // compute min/max values from values
        double minValue = 0;
        double maxValue = 0;
        for (int i = 0; i < values.length; i++) {
            if (minValue > values[i])
                minValue = values[i];
            if (maxValue < values[i])
                maxValue = values[i];
        }

        // font settings
        Font titleFont = new Font(FONT_NAME, Font.BOLD, TITLE_FONT_SIZE);
        FontMetrics titleFontMetrics = g.getFontMetrics(titleFont);
        Font labelFont = new Font(FONT_NAME, Font.PLAIN, LABELS_FONT_SIZE);
        FontMetrics labelFontMetrics = g.getFontMetrics(labelFont);
        Font valueFont = new Font(FONT_NAME, Font.PLAIN, VALUES_FONT_SIZE);
        FontMetrics valueFontMetrics = g.getFontMetrics(valueFont);

        // dimension has the panel's size based on its container
        Dimension d = getSize();

        // barWidth is computed based on the width of the panel and the number of values to be displayed
        int barWidth = d.width / values.length;

        // top is how height bars can go based on the title's height
        int top = titleFontMetrics.getHeight();

        // bottom is how low bars can go based on the label's height
        int bottom = labelFontMetrics.getHeight();

        // draw title centralized
        int titleWidth = titleFontMetrics.stringWidth(title);
        int y = titleFontMetrics.getAscent();
        int x = (d.width - titleWidth) / 2;
        g.setFont(titleFont);
        g.drawString(title, x, y);

        // scale is the ratio between the bar maximum height in pixel and actual values
        double scale = (d.height - top - bottom) / (maxValue - minValue);
        y = d.height - labelFontMetrics.getDescent();
        g.setFont(labelFont);

        // draw bars
        for (int i = 0, colorIndex = 0; i < values.length; i++) {
            int valueX = i * barWidth + 1;
            int valueY = top;
            int height = (int) (values[i] * scale);
            if (values[i] >= 0)
                valueY += (int) ((maxValue - values[i]) * scale);
            else {
                valueY += (int) (maxValue * scale);
                height = -height;
            }
            g.setColor(colors.get(colorIndex));
            colorIndex = (colorIndex + 1) % colors.size();
            g.fillRect(valueX, valueY, barWidth - 2, height);
            g.setColor(Color.black);
            g.drawRect(valueX, valueY, barWidth - 2, height);
            int labelWidth = labelFontMetrics.stringWidth(labels[i]);
            x = i * barWidth + (barWidth - labelWidth) / 2;
            g.drawString(labels[i], x, y);
            if (values[i] >= MIN_VALUE_DISPLAY) {
                String valueStr = String.format("%.0f", values[i]) + "%";
                int valueWidth = valueFontMetrics.stringWidth(valueStr);
                x = i * barWidth + (barWidth - valueWidth) / 2;
                g.drawString(valueStr, x, d.height - height);
            }
        }
    }

    public static void main(String[] argv) {
        JFrame f = new JFrame();
        f.setSize(1024, 768);

        String[] labels = { "Item 1", "Item 2", "Item 3", "Item 4"};
        double[] values = { 15, 25, 30, 80 };

        f.getContentPane().add(new BarChart("Title", labels, values));

        WindowListener wndCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        f.addWindowListener(wndCloser);
        f.setVisible(true);
    }
}