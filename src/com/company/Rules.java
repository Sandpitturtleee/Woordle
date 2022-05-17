package com.company;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;


public class Rules {
    static JFrame rulesFrame;
    JLabel rulesTitle,picLabel;
    JButton returnButton;
    JPanel jPanel ;
    Rules() throws IOException {
        rulesFrame = new JFrame("Wordle");
        rulesFrame.setSize(960, 1080);
        rulesFrame.setLayout(null);

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
        URL image = Main.class.getClassLoader().getResource("rules.PNG");
        ImageIcon icon = new ImageIcon(image);
        JLabel label = new JLabel(icon);
        JPanel panel = new JPanel();
        panel.setBounds(244,100,472,469);

        panel.add(label);


        rulesFrame.add(rulesTitle,BorderLayout.NORTH);
        rulesFrame.add(panel,BorderLayout.CENTER);
        rulesFrame.add(returnButton,BorderLayout.SOUTH);


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
