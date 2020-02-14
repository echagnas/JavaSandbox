package gui;

import javax.swing.*;

public class Board {
    private JButton clicMeButton;
    private JPanel boardView;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Board");
        frame.setContentPane(new Board().boardView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
