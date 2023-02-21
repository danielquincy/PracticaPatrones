package com.patterns.creationals.abstract_factory.caso1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinButton implements Button{

    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;

    @Override
    public void paint() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("S.O Windows");
        label.setOpaque(true);
        label.setBackground(new Color(25, 139, 193));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        frame.setBackground(new Color(17, 130, 175));
        panel.add(label);
        button = new JButton("Salir");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });
        panel.add(button);

        frame.setSize(320, 200);
        frame.setVisible(true);
    }

}
