package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RGBSlider {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RGB Color Mixer");
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel label = new JLabel();
        label.setBounds(150, 20, 100, 100);
        label.setOpaque(true);

        JScrollBar rBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
        JScrollBar gBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
        JScrollBar bBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);

        rBar.setBounds(50, 150, 300, 20);
        gBar.setBounds(50, 180, 300, 20);
        bBar.setBounds(50, 210, 300, 20);

        AdjustmentListener listener = e -> {
            int r = rBar.getValue();
            int g = gBar.getValue();
            int b = bBar.getValue();
            label.setBackground(new Color(r, g, b));
        };

        rBar.addAdjustmentListener(listener);
        gBar.addAdjustmentListener(listener);
        bBar.addAdjustmentListener(listener);

        frame.add(label);
        frame.add(rBar);
        frame.add(gBar);
        frame.add(bBar);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
