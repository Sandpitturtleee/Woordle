package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiPlayer {
    static JFrame multiPlayerFrame;
    JLabel multiPlayerTitle;
    JButton returnButton;
    MultiPlayer(){
        multiPlayerFrame = new JFrame("Wordle");
        multiPlayerFrame.setSize(960, 1080);

        multiPlayerTitle = new JLabel("Wordle");
        multiPlayerTitle.setBounds(400, 30, 400, 60);
        multiPlayerTitle.setFont(new Font("Serif", Font.PLAIN, 40));

        returnButton = new JButton("Return");
        returnButton.setBounds(360, 600, 200, 80);

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                multiPlayerFrame.setVisible(false);
                MainMenu.FrameSetVisibleTrue();
            }
        });

        multiPlayerFrame.add(multiPlayerTitle);
        multiPlayerFrame.add(returnButton);

        multiPlayerFrame.setLayout(null);
        multiPlayerFrame.setLocationRelativeTo(null);
        multiPlayerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        multiPlayerFrame.setResizable(false);
        multiPlayerFrame.setVisible(false);
    };
    public static void FrameSetVisibleTrue(){
        multiPlayerFrame.setVisible(true);
    }
    public static void FrameSetVisibleFalse(){
        multiPlayerFrame.setVisible(false);
    }
}
