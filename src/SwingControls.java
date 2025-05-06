package src;

import javax.swing.*;

class SwingControls {
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing Controls");
        f.setSize(400, 300);
        f.setLayout(null);

        JLabel label = new JLabel("Enter Name:");
        label.setBounds(30, 30, 100, 20);

        JTextField textField = new JTextField();
        textField.setBounds(140, 30, 150, 20);

        JButton button = new JButton("Submit");
        button.setBounds(140, 60, 100, 30);

        JCheckBox cb = new JCheckBox("I agree");
        cb.setBounds(140, 100, 100, 20);

        String[] items = {"Java", "C++", "Python"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.setBounds(140, 130, 100, 20);

        f.add(label);
        f.add(textField);
        f.add(button);
        f.add(cb);
        f.add(comboBox);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
