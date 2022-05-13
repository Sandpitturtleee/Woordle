package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu {
    static JFrame mainMenuFrame;
    JLabel mainMenuTitle;
    JButton singlePlayer,multiPlayer,rules;
    MainMenu(){
        mainMenuFrame = new JFrame("Wordle");
        mainMenuFrame.setSize(960, 1080);

        mainMenuTitle = new JLabel("Wordle");
        mainMenuTitle.setBounds(400, 30, 400, 60);
        mainMenuTitle.setFont(new Font("Serif", Font.PLAIN, 40));

        singlePlayer = new JButton("Single-player");
        singlePlayer.setBounds(360, 400, 200, 80);

        multiPlayer = new JButton("Multiplayer");
        multiPlayer.setBounds(360, 500, 200, 80);

        rules = new JButton("Rules");
        rules.setBounds(360, 600, 200, 80);

        singlePlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenuFrame.setVisible(false);
                SinglePlayer.FrameSetVisibleTrue();
            }
        });
        multiPlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenuFrame.setVisible(false);
                MultiPlayer.FrameSetVisibleTrue();
            }
        });
        rules.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenuFrame.setVisible(false);
                Rules.FrameSetVisibleTrue();
            }
        });
        mainMenuFrame.add(mainMenuTitle);
        mainMenuFrame.add(singlePlayer);
        mainMenuFrame.add(multiPlayer);
        mainMenuFrame.add(rules);

        mainMenuFrame.setLayout(null);
        mainMenuFrame.setLocationRelativeTo(null);
        mainMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMenuFrame.setResizable(false);
        mainMenuFrame.setVisible(true);
    };
    public static void FrameSetVisibleTrue(){
        mainMenuFrame.setVisible(true);
    }
    public static void FrameSetVisibleFalse(){
        mainMenuFrame.setVisible(false);
    }
}
