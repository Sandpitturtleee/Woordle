package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AskForWord {
    static JFrame askForWordFrame;
    JLabel askForWordTitle, askForWordText;
    static JTextField resultTextField;
    JButton returnButton;
    Font fontResults = new Font("SansSerif",Font.BOLD, 33);
    static JTextField wordsPanel1textField1,wordsPanel1textField2,wordsPanel1textField3,wordsPanel1textField4,wordsPanel1textField5;
    JButton qButton,wButton,eButton,rButton,tButton,yButton,uButton,iButton,oButton,pButton;
    JButton aButton,sButton,dButton,fButton,gButton,hButton,jButton,kButton,lButton;
    JButton deleteButton,zButton,xButton,cButton,vButton,bButton,nButton,mButton,enterButton;
    static int rowNumber = 1;
    static int colNumber = 1;
    static String word;
    static String wordLetter1, wordLetter2, wordLetter3, wordLetter4, wordLetter5;
    AskForWord(){
        askForWordFrame = new JFrame("Wordle");
        askForWordFrame.setSize(960, 800);

        askForWordTitle = new JLabel("Wordle");
        askForWordTitle.setBounds(400, 30, 400, 60);
        askForWordTitle.setFont(new Font("Serif", Font.PLAIN, 40));

        askForWordText = new JLabel("Five letter word for an opponent to quess: ");
        askForWordText.setBounds(320, 200, 400, 60);
        askForWordText.setFont(new Font("Serif", Font.PLAIN, 20));

        JPanel wordsPanels = new JPanel();
        wordsPanels.setLayout(new GridLayout(1,1,10,10));
        wordsPanels.setBounds(244,300,472,70);

        JPanel wordsPanel1 = new JPanel();

        wordsPanel1textField1 = new JTextField(1); // accepts upto 10 characters
        wordsPanel1textField1.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel1textField1.setEditable(false);
        wordsPanel1textField1.setFont(fontResults);

        wordsPanel1textField2 = new JTextField(1); // accepts upto 10 characters
        wordsPanel1textField2.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel1textField2.setFont(fontResults);
        wordsPanel1textField2.setEditable(false);

        wordsPanel1textField3 = new JTextField(1); // accepts upto 10 characters
        wordsPanel1textField3.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel1textField3.setFont(fontResults);
        wordsPanel1textField3.setEditable(false);

        wordsPanel1textField4 = new JTextField(1); // accepts upto 10 characters
        wordsPanel1textField4.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel1textField4.setFont(fontResults);
        wordsPanel1textField4.setEditable(false);

        wordsPanel1textField5 = new JTextField(1); // accepts upto 10 characters
        wordsPanel1textField5.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel1textField5.setFont(fontResults);
        wordsPanel1textField5.setEditable(false);

        wordsPanel1.add(wordsPanel1textField1);
        wordsPanel1.add(wordsPanel1textField2);
        wordsPanel1.add(wordsPanel1textField3);
        wordsPanel1.add(wordsPanel1textField4);
        wordsPanel1.add(wordsPanel1textField5);

        wordsPanels.add(wordsPanel1);

        resultTextField = new JTextField("Test");
        resultTextField.setBounds(280, 400, 400, 60);
        resultTextField.setFont(new Font("Serif", Font.PLAIN, 40));
        resultTextField.setHorizontalAlignment(JTextField.CENTER);
        resultTextField.setEditable(false);
        resultTextField.setVisible(false);

        JPanel keyboardPanel = new JPanel();
        keyboardPanel.setLayout(new GridLayout(3,1,10,10));
        keyboardPanel.setBounds(175,500,600,100);

        JPanel keyboardPanel1 = new JPanel();
        keyboardPanel1.setLayout(new GridLayout(1,10,10,10));
        keyboardPanel1.setBounds(244,500,600,30);

        JPanel keyboardPanel2 = new JPanel();
        keyboardPanel2.setLayout(new GridLayout(1,9,10,10));
        keyboardPanel2.setBounds(244,500,500,30);

        JPanel keyboardPanel3 = new JPanel();
        keyboardPanel3.setLayout(new GridLayout(1,9,10,10));
        keyboardPanel3.setBounds(244,500,500,30);

        qButton = new JButton("Q");
        qButton.setBounds(25, 800, 100, 20);

        qButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("Q");
                colNumber +=1;
            }
        });
        wButton = new JButton("W");
        wButton.setBounds(25, 800, 100, 20);

        wButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("W");
                colNumber +=1;
            }
        });
        eButton = new JButton("E");
        eButton.setBounds(25, 800, 100, 20);

        eButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("E");
                colNumber +=1;
            }
        });
        rButton = new JButton("R");
        rButton.setBounds(25, 800, 100, 20);

        rButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("R");
                colNumber +=1;
            }
        });
        tButton = new JButton("T");
        tButton.setBounds(25, 800, 100, 20);

        tButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("T");
                colNumber +=1;
            }
        });
        yButton = new JButton("Y");
        yButton.setBounds(25, 800, 100, 20);

        yButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("Y");
                colNumber +=1;
            }
        });
        uButton = new JButton("U");
        uButton.setBounds(25, 800, 100, 20);

        uButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("U");
                colNumber +=1;
            }
        });
        iButton = new JButton("I");
        iButton.setBounds(25, 800, 100, 20);

        iButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("I");
                colNumber +=1;
            }
        });
        oButton = new JButton("O");
        oButton.setBounds(25, 800, 100, 20);

        oButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("O");
                colNumber +=1;
            }
        });
        pButton = new JButton("P");
        pButton.setBounds(25, 800, 100, 20);

        pButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("P");
                colNumber +=1;
            }
        });
        aButton = new JButton("A");
        aButton.setBounds(25, 800, 100, 20);

        aButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("A");
                colNumber +=1;
            }
        });
        sButton = new JButton("S");
        sButton.setBounds(25, 800, 100, 20);

        sButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("S");
                colNumber +=1;
            }
        });
        dButton = new JButton("D");
        dButton.setBounds(25, 800, 100, 20);

        dButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("D");
                colNumber +=1;
            }
        });
        fButton = new JButton("F");
        fButton.setBounds(25, 800, 100, 20);

        fButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("F");
                colNumber +=1;
            }
        });
        gButton = new JButton("G");
        gButton.setBounds(25, 800, 100, 20);

        gButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("G");
                colNumber +=1;
            }
        });
        hButton = new JButton("H");
        hButton.setBounds(25, 800, 100, 20);

        hButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("H");
                colNumber +=1;
            }
        });
        jButton = new JButton("J");
        jButton.setBounds(25, 800, 100, 20);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("J");
                colNumber +=1;
            }
        });
        kButton = new JButton("K");
        kButton.setBounds(25, 800, 100, 20);

        kButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("K");
                colNumber +=1;
            }
        });
        lButton = new JButton("L");
        lButton.setBounds(25, 800, 100, 20);

        lButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("L");
                colNumber +=1;
            }
        });
        deleteButton = new JButton("Del");
        deleteButton.setBounds(25, 800, 100, 20);

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colNumber -=1;
                addLetter("");
            }
        });
        zButton = new JButton("Z");
        zButton.setBounds(25, 800, 100, 20);

        zButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("Z");
                colNumber +=1;
            }
        });
        xButton = new JButton("X");
        xButton.setBounds(25, 800, 100, 20);

        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("X");
                colNumber +=1;
            }
        });
        cButton = new JButton("C");
        cButton.setBounds(25, 800, 100, 20);

        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("C");
                colNumber +=1;
            }
        });
        vButton = new JButton("V");
        vButton.setBounds(25, 800, 100, 20);

        vButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("V");
                colNumber +=1;
            }
        });
        bButton = new JButton("B");
        bButton.setBounds(25, 800, 100, 20);

        bButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("B");
                colNumber +=1;
            }
        });
        nButton = new JButton("N");
        nButton.setBounds(25, 800, 100, 20);

        nButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("N");
                colNumber +=1;
            }
        });
        mButton = new JButton("M");
        mButton.setBounds(25, 800, 100, 80);

        mButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLetter("M");
                colNumber +=1;
            }
        });
        enterButton = new JButton("Ent");
        enterButton.setBounds(25, 800, 100, 80);

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendWord();
            }
        });

        keyboardPanel1.add(qButton);
        keyboardPanel1.add(wButton);
        keyboardPanel1.add(eButton);
        keyboardPanel1.add(rButton);
        keyboardPanel1.add(tButton);
        keyboardPanel1.add(yButton);
        keyboardPanel1.add(uButton);
        keyboardPanel1.add(iButton);
        keyboardPanel1.add(oButton);
        keyboardPanel1.add(pButton);
        keyboardPanel2.add(aButton);
        keyboardPanel2.add(sButton);
        keyboardPanel2.add(dButton);
        keyboardPanel2.add(fButton);
        keyboardPanel2.add(gButton);
        keyboardPanel2.add(hButton);
        keyboardPanel2.add(jButton);
        keyboardPanel2.add(kButton);
        keyboardPanel2.add(lButton);
        keyboardPanel3.add(enterButton);
        keyboardPanel3.add(zButton);
        keyboardPanel3.add(xButton);
        keyboardPanel3.add(cButton);
        keyboardPanel3.add(vButton);
        keyboardPanel3.add(bButton);
        keyboardPanel3.add(nButton);
        keyboardPanel3.add(mButton);
        keyboardPanel3.add(deleteButton);

        keyboardPanel.add(keyboardPanel1);
        keyboardPanel.add(keyboardPanel2);
        keyboardPanel.add(keyboardPanel3);

        returnButton = new JButton("Return");
        returnButton.setBounds(360, 650, 200, 80);


        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                askForWordFrame.setVisible(false);
                MainMenu.MainMenuFrameSetVisibleTrue();
                colNumber = 1;
            }
        });

        askForWordFrame.add(askForWordTitle);
        askForWordFrame.add(askForWordText);
        askForWordFrame.add(wordsPanels);
        askForWordFrame.add(resultTextField);
        askForWordFrame.add(keyboardPanel);
        askForWordFrame.add(returnButton);

        askForWordFrame.setLayout(null);
        askForWordFrame.setLocationRelativeTo(null);
        askForWordFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        askForWordFrame.setResizable(false);
        askForWordFrame.setVisible(false);
    };
    static void addLetter(String letter) {
            resultTextField.setVisible(false);
                switch (colNumber) {
                    case 1:
                        wordsPanel1textField1.setText(letter);
                        break;
                    case 2:
                        wordsPanel1textField2.setText(letter);
                        break;
                    case 3:
                        wordsPanel1textField3.setText(letter);
                        break;
                    case 4:
                        wordsPanel1textField4.setText(letter);
                        break;
                    default:
                        wordsPanel1textField5.setText(letter);
                }
    }
    static void sendWord(){
        String s1,s2,s3,s4,s5,all;
        s1 = wordsPanel1textField1.getText();
        s2 = wordsPanel1textField2.getText();
        s3 = wordsPanel1textField3.getText();
        s4 = wordsPanel1textField4.getText();
        s5 = wordsPanel1textField5.getText();
        all = s1+s2+s3+s4+s5;
        if (all.length()==5){
            System.out.println(all);
            try {
                DBConnector conne = new DBConnector();
                Connection conn = conne.connect();
                Statement st = conn.createStatement();
                String sql = "TRUNCATE word";
                // Execute deletion
                st.executeUpdate(sql);
                // Use DELETE
                sql = "DELETE FROM word";
                // Execute deletion
                st.executeUpdate(sql);
                String insert="insert into word values('"+all+"')";
                st.executeUpdate(insert);
                st.close();
            } catch (SQLException ex) {

            }
            askForWordFrame.setVisible(false);
            MultiPlayer multiPlayer = new MultiPlayer();
            MultiPlayer.FrameSetVisibleTrue();
        }
        else{
            resultTextField.setVisible(true);
            resultTextField.setText("Type in 5 letter word");
        }



    }
    public static void FrameSetVisibleTrue(){
        askForWordFrame.setVisible(true);
    }
    public static void FrameSetVisibleFalse(){
        askForWordFrame.setVisible(false);
    }
}
