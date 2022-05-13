package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SinglePlayer {
    static JFrame singlePlayerFrame;
    JLabel singlePlayerTitle;
    JButton returnButton;
    SinglePlayer(){
        singlePlayerFrame = new JFrame("Wordle");
        singlePlayerFrame.setSize(960, 1080);

        singlePlayerTitle = new JLabel("Wordle");
        singlePlayerTitle.setBounds(400, 30, 400, 60);
        singlePlayerTitle.setFont(new Font("Serif", Font.PLAIN, 40));

        returnButton = new JButton("Return");
        returnButton.setBounds(360, 600, 200, 80);

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                singlePlayerFrame.setVisible(false);
                MainMenu.FrameSetVisibleTrue();
            }
        });

        singlePlayerFrame.add(singlePlayerTitle);
        singlePlayerFrame.add(returnButton);

        singlePlayerFrame.setLayout(null);
        singlePlayerFrame.setLocationRelativeTo(null);
        singlePlayerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        singlePlayerFrame.setResizable(false);
        singlePlayerFrame.setVisible(false);
    };
    public static void FrameSetVisibleTrue(){
        singlePlayerFrame.setVisible(true);
    }
    public static void FrameSetVisibleFalse(){
        singlePlayerFrame.setVisible(false);
    }
}
