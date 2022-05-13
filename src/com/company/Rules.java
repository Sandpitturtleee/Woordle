package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules {
    static JFrame rulesFrame;
    JLabel rulesTitle;
    JButton returnButton;
    Rules(){
        rulesFrame = new JFrame("Wordle");
        rulesFrame.setSize(960, 1080);

        rulesTitle = new JLabel("Woooordle");
        rulesTitle.setBounds(400, 30, 400, 60);
        rulesTitle.setFont(new Font("Serif", Font.PLAIN, 40));

        returnButton = new JButton("Return");
        returnButton.setBounds(360, 600, 200, 80);

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rulesFrame.setVisible(false);
                MainMenu.FrameSetVisibleTrue();
            }
        });

        rulesFrame.add(rulesTitle);
        rulesFrame.add(returnButton);

        rulesFrame.setLayout(null);
        rulesFrame.setLocationRelativeTo(null);
        rulesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rulesFrame.setResizable(false);
        rulesFrame.setVisible(false);
    };
    public static void FrameSetVisibleTrue(){
        rulesFrame.setVisible(true);
    }
    public static void FrameSetVisibleFalse(){
        rulesFrame.setVisible(false);
    }
}
