package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.company.GameLogicMulti.*;

public class MultiPlayer {
    static JFrame singlePlayerFrame;
    JLabel singlePlayerTitle;
    JButton returnButton,newWordButton;
    JButton qButton,wButton,eButton,rButton,tButton,yButton,uButton,iButton,oButton,pButton;
    JButton aButton,sButton,dButton,fButton,gButton,hButton,jButton,kButton,lButton;
    JButton deleteButton,zButton,xButton,cButton,vButton,bButton,nButton,mButton,enterButton;
    static JTextField wordsPanel1textField1,wordsPanel1textField2,wordsPanel1textField3,wordsPanel1textField4,wordsPanel1textField5;
    static JTextField wordsPanel2textField1,wordsPanel2textField2,wordsPanel2textField3,wordsPanel2textField4,wordsPanel2textField5;
    static JTextField wordsPanel3textField1,wordsPanel3textField2,wordsPanel3textField3,wordsPanel3textField4,wordsPanel3textField5;
    static JTextField wordsPanel4textField1,wordsPanel4textField2,wordsPanel4textField3,wordsPanel4textField4,wordsPanel4textField5;
    static JTextField wordsPanel5textField1,wordsPanel5textField2,wordsPanel5textField3,wordsPanel5textField4,wordsPanel5textField5;
    static JTextField wordsPanel6textField1,wordsPanel6textField2,wordsPanel6textField3,wordsPanel6textField4,wordsPanel6textField5;
    static JTextField resultTextField;
    Font fontResults = new Font("SansSerif",Font.BOLD, 33);
    static int rowNumber = 1;
    static int colNumber = 1;
    static String word;
    static String wordLetter1, wordLetter2, wordLetter3, wordLetter4, wordLetter5;

    MultiPlayer(){

        word = readFile();
        //word = "CIRCA";
        wordLetter1 = word.substring(0,1);
        wordLetter2 = word.substring(1,2);
        wordLetter3 = word.substring(2,3);
        wordLetter4 = word.substring(3,4);
        wordLetter5 = word.substring(4,5);
        System.out.println(word);

        singlePlayerFrame = new JFrame("Wordle");
        singlePlayerFrame.setSize(960, 800);

        singlePlayerTitle = new JLabel("Wordleeee");
        singlePlayerTitle.setBounds(425, 30, 400, 60);
        singlePlayerTitle.setFont(new Font("Serif", Font.PLAIN, 40));

        JPanel wordsPanels = new JPanel();
        wordsPanels.setLayout(new GridLayout(6,1,10,10));
        wordsPanels.setBounds(244,100,472,400);

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

        JPanel wordsPanel2 = new JPanel();

        wordsPanel2textField1 = new JTextField(1); // accepts upto 10 characters
        wordsPanel2textField1.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel2textField1.setEditable(false);
        wordsPanel2textField1.setFont(fontResults);

        wordsPanel2textField2 = new JTextField(1); // accepts upto 10 characters
        wordsPanel2textField2.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel2textField2.setFont(fontResults);
        wordsPanel2textField2.setEditable(false);

        wordsPanel2textField3 = new JTextField(1); // accepts upto 10 characters
        wordsPanel2textField3.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel2textField3.setFont(fontResults);
        wordsPanel2textField3.setEditable(false);

        wordsPanel2textField4 = new JTextField(1); // accepts upto 10 characters
        wordsPanel2textField4.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel2textField4.setFont(fontResults);
        wordsPanel2textField4.setEditable(false);

        wordsPanel2textField5 = new JTextField(1); // accepts upto 10 characters
        wordsPanel2textField5.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel2textField5.setFont(fontResults);
        wordsPanel2textField5.setEditable(false);

        wordsPanel2.add(wordsPanel2textField1);
        wordsPanel2.add(wordsPanel2textField2);
        wordsPanel2.add(wordsPanel2textField3);
        wordsPanel2.add(wordsPanel2textField4);
        wordsPanel2.add(wordsPanel2textField5);

        JPanel wordsPanel3 = new JPanel();

        wordsPanel3textField1 = new JTextField(1); // accepts upto 10 characters
        wordsPanel3textField1.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel3textField1.setEditable(false);
        wordsPanel3textField1.setFont(fontResults);

        wordsPanel3textField2 = new JTextField(1); // accepts upto 10 characters
        wordsPanel3textField2.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel3textField2.setFont(fontResults);
        wordsPanel3textField2.setEditable(false);

        wordsPanel3textField3 = new JTextField(1); // accepts upto 10 characters
        wordsPanel3textField3.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel3textField3.setFont(fontResults);
        wordsPanel3textField3.setEditable(false);

        wordsPanel3textField4 = new JTextField(1); // accepts upto 10 characters
        wordsPanel3textField4.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel3textField4.setFont(fontResults);
        wordsPanel3textField4.setEditable(false);

        wordsPanel3textField5 = new JTextField(1); // accepts upto 10 characters
        wordsPanel3textField5.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel3textField5.setFont(fontResults);
        wordsPanel3textField5.setEditable(false);

        wordsPanel3.add(wordsPanel3textField1);
        wordsPanel3.add(wordsPanel3textField2);
        wordsPanel3.add(wordsPanel3textField3);
        wordsPanel3.add(wordsPanel3textField4);
        wordsPanel3.add(wordsPanel3textField5);

        JPanel wordsPanel4 = new JPanel();

        wordsPanel4textField1 = new JTextField(1); // accepts upto 10 characters
        wordsPanel4textField1.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel4textField1.setEditable(false);
        wordsPanel4textField1.setFont(fontResults);

        wordsPanel4textField2 = new JTextField(1); // accepts upto 10 characters
        wordsPanel4textField2.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel4textField2.setFont(fontResults);
        wordsPanel4textField2.setEditable(false);

        wordsPanel4textField3 = new JTextField(1); // accepts upto 10 characters
        wordsPanel4textField3.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel4textField3.setFont(fontResults);
        wordsPanel4textField3.setEditable(false);

        wordsPanel4textField4 = new JTextField(1); // accepts upto 10 characters
        wordsPanel4textField4.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel4textField4.setFont(fontResults);
        wordsPanel4textField4.setEditable(false);

        wordsPanel4textField5 = new JTextField(1); // accepts upto 10 characters
        wordsPanel4textField5.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel4textField5.setFont(fontResults);
        wordsPanel4textField5.setEditable(false);

        wordsPanel4.add(wordsPanel4textField1);
        wordsPanel4.add(wordsPanel4textField2);
        wordsPanel4.add(wordsPanel4textField3);
        wordsPanel4.add(wordsPanel4textField4);
        wordsPanel4.add(wordsPanel4textField5);

        JPanel wordsPanel5 = new JPanel();

        wordsPanel5textField1 = new JTextField(1); // accepts upto 10 characters
        wordsPanel5textField1.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel5textField1.setEditable(false);
        wordsPanel5textField1.setFont(fontResults);

        wordsPanel5textField2 = new JTextField(1); // accepts upto 10 characters
        wordsPanel5textField2.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel5textField2.setFont(fontResults);
        wordsPanel5textField2.setEditable(false);

        wordsPanel5textField3 = new JTextField(1); // accepts upto 10 characters
        wordsPanel5textField3.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel5textField3.setFont(fontResults);
        wordsPanel5textField3.setEditable(false);

        wordsPanel5textField4 = new JTextField(1); // accepts upto 10 characters
        wordsPanel5textField4.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel5textField4.setFont(fontResults);
        wordsPanel5textField4.setEditable(false);

        wordsPanel5textField5 = new JTextField(1); // accepts upto 10 characters
        wordsPanel5textField5.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel5textField5.setFont(fontResults);
        wordsPanel5textField5.setEditable(false);

        wordsPanel5.add(wordsPanel5textField1);
        wordsPanel5.add(wordsPanel5textField2);
        wordsPanel5.add(wordsPanel5textField3);
        wordsPanel5.add(wordsPanel5textField4);
        wordsPanel5.add(wordsPanel5textField5);

        JPanel wordsPanel6 = new JPanel();

        wordsPanel6textField1 = new JTextField(1); // accepts upto 10 characters
        wordsPanel6textField1.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel6textField1.setEditable(false);
        wordsPanel6textField1.setFont(fontResults);

        wordsPanel6textField2 = new JTextField(1); // accepts upto 10 characters
        wordsPanel6textField2.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel6textField2.setFont(fontResults);
        wordsPanel6textField2.setEditable(false);

        wordsPanel6textField3 = new JTextField(1); // accepts upto 10 characters
        wordsPanel6textField3.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel6textField3.setFont(fontResults);
        wordsPanel6textField3.setEditable(false);

        wordsPanel6textField4 = new JTextField(1); // accepts upto 10 characters
        wordsPanel6textField4.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel6textField4.setFont(fontResults);
        wordsPanel6textField4.setEditable(false);

        wordsPanel6textField5 = new JTextField(1); // accepts upto 10 characters
        wordsPanel6textField5.setHorizontalAlignment(JTextField.CENTER);
        wordsPanel6textField5.setFont(fontResults);
        wordsPanel6textField5.setEditable(false);

        wordsPanel6.add(wordsPanel6textField1);
        wordsPanel6.add(wordsPanel6textField2);
        wordsPanel6.add(wordsPanel6textField3);
        wordsPanel6.add(wordsPanel6textField4);
        wordsPanel6.add(wordsPanel6textField5);

        wordsPanels.add(wordsPanel1);
        wordsPanels.add(wordsPanel2);
        wordsPanels.add(wordsPanel3);
        wordsPanels.add(wordsPanel4);
        wordsPanels.add(wordsPanel5);
        wordsPanels.add(wordsPanel6);

        resultTextField = new JTextField("Test");
        resultTextField.setBounds(280, 530, 400, 60);
        resultTextField.setFont(new Font("Serif", Font.PLAIN, 40));
        resultTextField.setHorizontalAlignment(JTextField.CENTER);
        resultTextField.setEditable(false);
        resultTextField.setVisible(false);

        JPanel keyboardPanel = new JPanel();
        keyboardPanel.setLayout(new GridLayout(3,1,10,10));
        keyboardPanel.setBounds(175,630,600,100);

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
                checkVictory();
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
        returnButton.setBounds(25, 650, 100, 80);

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                singlePlayerFrame.setVisible(false);
                MainMenu.MainMenuFrameSetVisibleTrue();
                singlePlayerFrame.dispose();
                rowNumber =1;
                colNumber =1;
            }
        });
        newWordButton = new JButton("New word");
        newWordButton.setBounds(820, 650, 100, 80);

        newWordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                singlePlayerFrame.dispose();
                SinglePlayer singlePlayer = new SinglePlayer();
                singlePlayerFrame.setVisible(true);
                colNumber =1;
                rowNumber =1;
            }
        });

        singlePlayerFrame.add(singlePlayerTitle);
        singlePlayerFrame.add(wordsPanels);
        singlePlayerFrame.add(resultTextField);
        singlePlayerFrame.add(keyboardPanel);
        singlePlayerFrame.add(returnButton);
        singlePlayerFrame.add(newWordButton);

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
