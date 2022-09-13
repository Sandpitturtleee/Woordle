package com.company;


import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class GameLogicMulti extends MultiPlayer {
    static String s1,s2,s3,s4,s5,all;
    static int score1;
    static int score2;
    static ArrayList<String> words = new ArrayList<>();
    static String getWord(){
        try {
            DBConnector conne = new DBConnector();
            Connection conn = conne.connect();
            Statement st = conn.createStatement();
            String sql1 = "Select * from word";
            ResultSet result  = st.executeQuery(sql1);
            while(result.next()){
                word = result.getString("word");
            }
            st.close();

        } catch (SQLException ex) {

        }
        return word;
    }
    static void checkVictory(){
        //checkWordList(words);
        if (checkWord()==1){
            System.out.println("Zwycięstwo");
            checkLetter();
            //VictoryFrameSetVisibleTrue();
            //singlePlayerFrame.dispose();
            resultTextField.setVisible(true);
            resultTextField.setText("Victory!!!");
            rowNumber =1;
            colNumber =1;
        }
        else {
            checkLetter();
            if (checkWord() == 0 && rowNumber == 6) {
                System.out.println("Porażka");
                //LossFrameSetVisibleTrue();
                //singlePlayerFrame.dispose();
                resultTextField.setVisible(true);
                resultTextField.setText("You lost: "+word);
                rowNumber = 1;
                colNumber = 1;
            }
            rowNumber += 1;
            colNumber = 1;
        }
    }
    static void addLetter(String letter) {
        switch (rowNumber) {
            case 1:
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
                break;
            case 2:
                switch (colNumber) {
                    case 1:
                        wordsPanel2textField1.setText(letter);
                        break;
                    case 2:
                        wordsPanel2textField2.setText(letter);
                        break;
                    case 3:
                        wordsPanel2textField3.setText(letter);
                        break;
                    case 4:
                        wordsPanel2textField4.setText(letter);
                        break;
                    default:
                        wordsPanel2textField5.setText(letter);
                }
                break;
            case 3:
                switch (colNumber) {
                    case 1:
                        wordsPanel3textField1.setText(letter);
                        break;
                    case 2:
                        wordsPanel3textField2.setText(letter);
                        break;
                    case 3:
                        wordsPanel3textField3.setText(letter);
                        break;
                    case 4:
                        wordsPanel3textField4.setText(letter);
                        break;
                    default:
                        wordsPanel3textField5.setText(letter);
                }
                break;
            case 4:
                switch (colNumber) {
                    case 1:
                        wordsPanel4textField1.setText(letter);
                        break;
                    case 2:
                        wordsPanel4textField2.setText(letter);
                        break;
                    case 3:
                        wordsPanel4textField3.setText(letter);
                        break;
                    case 4:
                        wordsPanel4textField4.setText(letter);
                        break;
                    default:
                        wordsPanel4textField5.setText(letter);
                }
                break;
            case 5:
                switch (colNumber) {
                    case 1:
                        wordsPanel5textField1.setText(letter);
                        break;
                    case 2:
                        wordsPanel5textField2.setText(letter);
                        break;
                    case 3:
                        wordsPanel5textField3.setText(letter);
                        break;
                    case 4:
                        wordsPanel5textField4.setText(letter);
                        break;
                    default:
                        wordsPanel5textField5.setText(letter);
                }
                break;
            default:
                switch (colNumber) {
                    case 1:
                        wordsPanel6textField1.setText(letter);
                        break;
                    case 2:
                        wordsPanel6textField2.setText(letter);
                        break;
                    case 3:
                        wordsPanel6textField3.setText(letter);
                        break;
                    case 4:
                        wordsPanel6textField4.setText(letter);
                        break;
                    default:
                        wordsPanel6textField5.setText(letter);
                }
        }
    }
    static int checkWord(){
        int result =0;
        switch(rowNumber) {
            case 1:
                s1 = wordsPanel1textField1.getText();
                s2 = wordsPanel1textField2.getText();
                s3 = wordsPanel1textField3.getText();
                s4 = wordsPanel1textField4.getText();
                s5 = wordsPanel1textField5.getText();
                all = s1+s2+s3+s4+s5;
                if (all.equals(word))
                    result=1;
                break;
            case 2:
                s1 = wordsPanel2textField1.getText();
                s2 = wordsPanel2textField2.getText();
                s3 = wordsPanel2textField3.getText();
                s4 = wordsPanel2textField4.getText();
                s5 = wordsPanel2textField5.getText();
                all = s1+s2+s3+s4+s5;
                if (all.equals(word))
                    result=1;
                break;
            case 3:
                s1 = wordsPanel3textField1.getText();
                s2 = wordsPanel3textField2.getText();
                s3 = wordsPanel3textField3.getText();
                s4 = wordsPanel3textField4.getText();
                s5 = wordsPanel3textField5.getText();
                all = s1+s2+s3+s4+s5;
                if (all.equals(word))
                    result=1;
                break;
            case 4:
                s1 = wordsPanel4textField1.getText();
                s2 = wordsPanel4textField2.getText();
                s3 = wordsPanel4textField3.getText();
                s4 = wordsPanel4textField4.getText();
                s5 = wordsPanel4textField5.getText();
                all = s1+s2+s3+s4+s5;
                if (all.equals(word))
                    result=1;
                break;
            case 5:
                s1 = wordsPanel5textField1.getText();
                s2 = wordsPanel5textField2.getText();
                s3 = wordsPanel5textField3.getText();
                s4 = wordsPanel5textField4.getText();
                s5 = wordsPanel5textField5.getText();
                all = s1+s2+s3+s4+s5;
                if (all.equals(word))
                    result=1;
                break;
            default:
                s1 = wordsPanel6textField1.getText();
                s2 = wordsPanel6textField2.getText();
                s3 = wordsPanel6textField3.getText();
                s4 = wordsPanel6textField4.getText();
                s5 = wordsPanel6textField5.getText();
                all = s1+s2+s3+s4+s5;
                if (all.equals(word))
                    result=1;
                else
                    result=0;
        }
        return result;
    }
    static void checkLetter(){
        switch (rowNumber) {
            case 1 -> {
                s1 = wordsPanel1textField1.getText();
                s2 = wordsPanel1textField2.getText();
                s3 = wordsPanel1textField3.getText();
                s4 = wordsPanel1textField4.getText();
                s5 = wordsPanel1textField5.getText();

                if (Objects.equals(s1, wordLetter1)||Objects.equals(s1, "0")) {
                    wordsPanel1textField1.setBackground(Color.GREEN);
                    wordLetter1 = "0";
                } else {
                    if (Objects.equals(s1, wordLetter2) || Objects.equals(s1, wordLetter3) || Objects.equals(s1, wordLetter4) || Objects.equals(s1, wordLetter5)){
                        wordsPanel1textField1.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel1textField1.setBackground(Color.GRAY);
                    }
                }

                if (Objects.equals(s2, wordLetter2)||Objects.equals(s2, "0")) {
                    wordsPanel1textField2.setBackground(Color.GREEN);
                    wordLetter2 = "0";
                } else {
                    if (Objects.equals(s2, wordLetter1) || Objects.equals(s2, wordLetter3) || Objects.equals(s2, wordLetter4) || Objects.equals(s2, wordLetter5)){
                        wordsPanel1textField2.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel1textField2.setBackground(Color.GRAY);
                    }
                }

                if (Objects.equals(s3, wordLetter3)||Objects.equals(s3, "0")) {
                    wordsPanel1textField3.setBackground(Color.GREEN);
                    wordLetter3 = "0";
                } else {
                    if (Objects.equals(s3, wordLetter2) || Objects.equals(s3, wordLetter1) || Objects.equals(s3, wordLetter4) || Objects.equals(s3, wordLetter5)){
                        wordsPanel1textField3.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel1textField3.setBackground(Color.GRAY);
                    }
                }

                if (Objects.equals(s4, wordLetter4)||Objects.equals(s4, "0")) {
                    wordsPanel1textField4.setBackground(Color.GREEN);
                    wordLetter4 = "0";
                } else {
                    if (Objects.equals(s4, wordLetter2) || Objects.equals(s4, wordLetter3) || Objects.equals(s4, wordLetter1) || Objects.equals(s4, wordLetter5)){
                        wordsPanel1textField4.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel1textField4.setBackground(Color.GRAY);
                    }
                }

                if (Objects.equals(s5, wordLetter5)||Objects.equals(s5, "0")) {
                    wordsPanel1textField5.setBackground(Color.GREEN);
                    wordLetter5 = "0";
                } else {
                    if (Objects.equals(s5, wordLetter2) || Objects.equals(s5, wordLetter3) || Objects.equals(s5, wordLetter4) || Objects.equals(s5, wordLetter1)){
                        wordsPanel1textField5.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel1textField5.setBackground(Color.GRAY);
                    }
                }
            }
            case 2 -> {
                s1 = wordsPanel2textField1.getText();
                s2 = wordsPanel2textField2.getText();
                s3 = wordsPanel2textField3.getText();
                s4 = wordsPanel2textField4.getText();
                s5 = wordsPanel2textField5.getText();
                if (Objects.equals(s1, wordLetter1)||Objects.equals(wordLetter1, "0")) {
                    wordsPanel2textField1.setBackground(Color.GREEN);
                    wordLetter1 = "0";
                } else {
                    if (Objects.equals(s1, wordLetter2) || Objects.equals(s1, wordLetter3) || Objects.equals(s1, wordLetter4) || Objects.equals(s1, wordLetter5)){
                        wordsPanel2textField1.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel2textField1.setBackground(Color.GRAY);
                    }
                }
                if (Objects.equals(s2, wordLetter2)||Objects.equals(wordLetter2, "0")) {
                    wordsPanel2textField2.setBackground(Color.GREEN);
                    wordLetter2 = "0";
                } else {
                    if (Objects.equals(s2, wordLetter1) || Objects.equals(s2, wordLetter3) || Objects.equals(s2, wordLetter4) || Objects.equals(s2, wordLetter5)){
                        wordsPanel2textField2.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel2textField2.setBackground(Color.GRAY);
                    }
                }
                if (Objects.equals(s3, wordLetter3)||Objects.equals(wordLetter3, "0")) {
                    wordsPanel2textField3.setBackground(Color.GREEN);
                    wordLetter3 = "0";
                } else {
                    if (Objects.equals(s3, wordLetter2) || Objects.equals(s3, wordLetter1) || Objects.equals(s3, wordLetter4) || Objects.equals(s3, wordLetter5)){
                        wordsPanel2textField3.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel2textField3.setBackground(Color.GRAY);
                    }
                }
                if (Objects.equals(s4, wordLetter4)||Objects.equals(wordLetter4, "0")) {
                    wordsPanel2textField4.setBackground(Color.GREEN);
                    wordLetter4 = "0";
                } else {
                    if (Objects.equals(s4, wordLetter2) || Objects.equals(s4, wordLetter3) || Objects.equals(s4, wordLetter1) || Objects.equals(s4, wordLetter5)){
                        wordsPanel2textField4.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel2textField4.setBackground(Color.GRAY);
                    }
                }
                if (Objects.equals(s5, wordLetter5)||Objects.equals(wordLetter5, "0")) {
                    wordsPanel2textField5.setBackground(Color.GREEN);
                    wordLetter5 = "0";
                } else {
                    if (Objects.equals(s5, wordLetter2) || Objects.equals(s5, wordLetter3) || Objects.equals(s5, wordLetter4) || Objects.equals(s5, wordLetter1)){
                        wordsPanel2textField5.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel2textField5.setBackground(Color.GRAY);
                    }
                }
            }
            case 3 -> {
                s1 = wordsPanel3textField1.getText();
                s2 = wordsPanel3textField2.getText();
                s3 = wordsPanel3textField3.getText();
                s4 = wordsPanel3textField4.getText();
                s5 = wordsPanel3textField5.getText();
                if (Objects.equals(s1, wordLetter1)||Objects.equals(wordLetter1, "0")) {
                    wordsPanel3textField1.setBackground(Color.GREEN);
                    wordLetter1 = "0";
                } else {
                    if (Objects.equals(s1, wordLetter2) || Objects.equals(s1, wordLetter3) || Objects.equals(s1, wordLetter4) || Objects.equals(s1, wordLetter5)){
                        wordsPanel3textField1.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel3textField1.setBackground(Color.GRAY);
                    }
                }
                if (Objects.equals(s2, wordLetter2)||Objects.equals(wordLetter2, "0")) {
                    wordsPanel3textField2.setBackground(Color.GREEN);
                    wordLetter2 = "0";
                } else {
                    if (Objects.equals(s2, wordLetter1) || Objects.equals(s2, wordLetter3) || Objects.equals(s2, wordLetter4) || Objects.equals(s2, wordLetter5)){
                        wordsPanel3textField2.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel3textField2.setBackground(Color.GRAY);
                    }
                }
                if (Objects.equals(s3, wordLetter3)||Objects.equals(wordLetter3, "0")) {
                    wordsPanel3textField3.setBackground(Color.GREEN);
                    wordLetter3 = "0";
                } else {
                    if (Objects.equals(s3, wordLetter2) || Objects.equals(s3, wordLetter1) || Objects.equals(s3, wordLetter4) || Objects.equals(s3, wordLetter5)){
                        wordsPanel3textField3.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel3textField3.setBackground(Color.GRAY);
                    }
                }
                if (Objects.equals(s4, wordLetter4)||Objects.equals(wordLetter4, "0")) {
                    wordsPanel3textField4.setBackground(Color.GREEN);
                    wordLetter4 = "0";
                } else {
                    if (Objects.equals(s4, wordLetter2) || Objects.equals(s4, wordLetter3) || Objects.equals(s4, wordLetter1) || Objects.equals(s4, wordLetter5)){
                        wordsPanel3textField4.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel3textField4.setBackground(Color.GRAY);
                    }
                }
                if (Objects.equals(s5, wordLetter5)||Objects.equals(wordLetter5, "0")) {
                    wordsPanel3textField5.setBackground(Color.GREEN);
                    wordLetter5 = "0";
                } else {
                    if (Objects.equals(s5, wordLetter2) || Objects.equals(s5, wordLetter3) || Objects.equals(s5, wordLetter4) || Objects.equals(s5, wordLetter1)){
                        wordsPanel3textField5.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel3textField5.setBackground(Color.GRAY);
                    }
                }
            }
            case 4 -> {
                s1 = wordsPanel4textField1.getText();
                s2 = wordsPanel4textField2.getText();
                s3 = wordsPanel4textField3.getText();
                s4 = wordsPanel4textField4.getText();
                s5 = wordsPanel4textField5.getText();
                if (Objects.equals(s1, wordLetter1)||Objects.equals(wordLetter1, "0")) {
                    wordsPanel4textField1.setBackground(Color.GREEN);
                    wordLetter1 = "0";
                } else {
                    if (Objects.equals(s1, wordLetter2) || Objects.equals(s1, wordLetter3) || Objects.equals(s1, wordLetter4) || Objects.equals(s1, wordLetter5)){
                        wordsPanel4textField1.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel4textField1.setBackground(Color.GRAY);
                    }
                }
                if (Objects.equals(s2, wordLetter2)||Objects.equals(wordLetter2, "0")) {
                    wordsPanel4textField2.setBackground(Color.GREEN);
                    wordLetter2 = "0";
                } else {
                    if (Objects.equals(s2, wordLetter1) || Objects.equals(s2, wordLetter3) || Objects.equals(s2, wordLetter4) || Objects.equals(s2, wordLetter5)){
                        wordsPanel4textField2.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel4textField2.setBackground(Color.GRAY);
                    }
                }
                if (Objects.equals(s3, wordLetter3)||Objects.equals(wordLetter3, "0")) {
                    wordsPanel4textField3.setBackground(Color.GREEN);
                    wordLetter3 = "0";
                } else {
                    if (Objects.equals(s3, wordLetter2) || Objects.equals(s3, wordLetter1) || Objects.equals(s3, wordLetter4) || Objects.equals(s3, wordLetter5)){
                        wordsPanel4textField3.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel4textField3.setBackground(Color.GRAY);
                    }
                }
                if (Objects.equals(s4, wordLetter4)||Objects.equals(wordLetter4, "0")) {
                    wordsPanel4textField4.setBackground(Color.GREEN);
                    wordLetter4 = "0";
                } else {
                    if (Objects.equals(s4, wordLetter2) || Objects.equals(s4, wordLetter3) || Objects.equals(s4, wordLetter1) || Objects.equals(s4, wordLetter5)){
                        wordsPanel4textField4.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel4textField4.setBackground(Color.GRAY);
                    }
                }
                if (Objects.equals(s5, wordLetter5)||Objects.equals(wordLetter5, "0")) {
                    wordsPanel4textField5.setBackground(Color.GREEN);
                    wordLetter5 = "0";
                } else {
                    if (Objects.equals(s5, wordLetter2) || Objects.equals(s5, wordLetter3) || Objects.equals(s5, wordLetter4) || Objects.equals(s5, wordLetter1)){
                        wordsPanel4textField5.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel4textField5.setBackground(Color.GRAY);
                    }
                }
            }
            case 5 -> {
                s1 = wordsPanel5textField1.getText();
                s2 = wordsPanel5textField2.getText();
                s3 = wordsPanel5textField3.getText();
                s4 = wordsPanel5textField4.getText();
                s5 = wordsPanel5textField5.getText();
                if (Objects.equals(s1, wordLetter1)||Objects.equals(wordLetter1, "0")) {
                    wordsPanel5textField1.setBackground(Color.GREEN);
                    wordLetter1 = "0";
                } else {
                    if (Objects.equals(s1, wordLetter2) || Objects.equals(s1, wordLetter3) || Objects.equals(s1, wordLetter4) || Objects.equals(s1, wordLetter5)){
                        wordsPanel5textField1.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel5textField1.setBackground(Color.GRAY);
                    }
                }
                if (Objects.equals(s2, wordLetter2)||Objects.equals(wordLetter2, "0")) {
                    wordsPanel5textField2.setBackground(Color.GREEN);
                    wordLetter2 = "0";
                } else {
                    if (Objects.equals(s2, wordLetter1) || Objects.equals(s2, wordLetter3) || Objects.equals(s2, wordLetter4) || Objects.equals(s2, wordLetter5)){
                        wordsPanel5textField2.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel5textField2.setBackground(Color.GRAY);
                    }
                }
                if (Objects.equals(s3, wordLetter3)||Objects.equals(wordLetter3, "0")) {
                    wordsPanel5textField3.setBackground(Color.GREEN);
                    wordLetter3 = "0";
                } else {
                    if (Objects.equals(s3, wordLetter2) || Objects.equals(s3, wordLetter1) || Objects.equals(s3, wordLetter4) || Objects.equals(s3, wordLetter5)){
                        wordsPanel5textField3.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel5textField3.setBackground(Color.GRAY);
                    }
                }
                if (Objects.equals(s4, wordLetter4)||Objects.equals(wordLetter4, "0")) {
                    wordsPanel5textField4.setBackground(Color.GREEN);
                    wordLetter4 = "0";
                } else {
                    if (Objects.equals(s4, wordLetter2) || Objects.equals(s4, wordLetter3) || Objects.equals(s4, wordLetter1) || Objects.equals(s4, wordLetter5)){
                        wordsPanel5textField4.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel5textField4.setBackground(Color.GRAY);
                    }
                }
                if (Objects.equals(s5, wordLetter5)||Objects.equals(wordLetter5, "0")) {
                    wordsPanel5textField5.setBackground(Color.GREEN);
                    wordLetter5 = "0";
                } else {
                    if (Objects.equals(s5, wordLetter2) || Objects.equals(s5, wordLetter3) || Objects.equals(s5, wordLetter4) || Objects.equals(s5, wordLetter1)){
                        wordsPanel5textField5.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel5textField5.setBackground(Color.GRAY);
                    }
                }
            }
            default -> {
                s1 = wordsPanel6textField1.getText();
                s2 = wordsPanel6textField2.getText();
                s3 = wordsPanel6textField3.getText();
                s4 = wordsPanel6textField4.getText();
                s5 = wordsPanel6textField5.getText();
                if (Objects.equals(s1, wordLetter1)||Objects.equals(wordLetter1, "0")) {
                    wordsPanel6textField1.setBackground(Color.GREEN);
                    wordLetter1 = "0";
                } else {
                    if (Objects.equals(s1, wordLetter2) || Objects.equals(s1, wordLetter3) || Objects.equals(s1, wordLetter4) || Objects.equals(s1, wordLetter5)){
                        wordsPanel6textField1.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel6textField1.setBackground(Color.GRAY);
                    }
                }
                if (Objects.equals(s2, wordLetter2)||Objects.equals(wordLetter2, "0")) {
                    wordsPanel6textField2.setBackground(Color.GREEN);
                    wordLetter2 = "0";
                } else {
                    if (Objects.equals(s2, wordLetter1) || Objects.equals(s2, wordLetter3) || Objects.equals(s2, wordLetter4) || Objects.equals(s2, wordLetter5)){
                        wordsPanel6textField2.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel6textField2.setBackground(Color.GRAY);
                    }
                }
                if (Objects.equals(s3, wordLetter3)||Objects.equals(wordLetter3, "0")) {
                    wordsPanel6textField3.setBackground(Color.GREEN);
                    wordLetter3 = "0";
                } else {
                    if (Objects.equals(s3, wordLetter2) || Objects.equals(s3, wordLetter1) || Objects.equals(s3, wordLetter4) || Objects.equals(s3, wordLetter5)){
                        wordsPanel6textField3.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel6textField3.setBackground(Color.GRAY);
                    }
                }
                if (Objects.equals(s4, wordLetter4)||Objects.equals(wordLetter4, "0")) {
                    wordsPanel6textField4.setBackground(Color.GREEN);
                    wordLetter4 = "0";
                } else {
                    if (Objects.equals(s4, wordLetter2) || Objects.equals(s4, wordLetter3) || Objects.equals(s4, wordLetter1) || Objects.equals(s4, wordLetter5)){
                        wordsPanel6textField4.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel6textField4.setBackground(Color.GRAY);
                    }
                }
                if (Objects.equals(s5, wordLetter5)||Objects.equals(wordLetter5, "0")) {
                    wordsPanel6textField5.setBackground(Color.GREEN);
                    wordLetter5 = "0";
                } else {
                    if (Objects.equals(s5, wordLetter2) || Objects.equals(s5, wordLetter3) || Objects.equals(s5, wordLetter4) || Objects.equals(s5, wordLetter1)){
                        wordsPanel6textField5.setBackground(Color.YELLOW);
                    }else{
                        wordsPanel6textField5.setBackground(Color.GRAY);
                    }
                }
            }
        }

    }
    static void checkWordList(ArrayList words){
        switch(rowNumber) {
            case 1:
                s1 = wordsPanel1textField1.getText();
                s2 = wordsPanel1textField2.getText();
                s3 = wordsPanel1textField3.getText();
                s4 = wordsPanel1textField4.getText();
                s5 = wordsPanel1textField5.getText();
                all = s1+s2+s3+s4+s5;
                for (int i=0;i<words.size();i++){
                    if (all != words.get(i)){
                        resultTextField.setVisible(true);
                        resultTextField.setText("Word not in a word list");
                    }
                }
                break;
            case 2:
                s1 = wordsPanel2textField1.getText();
                s2 = wordsPanel2textField2.getText();
                s3 = wordsPanel2textField3.getText();
                s4 = wordsPanel2textField4.getText();
                s5 = wordsPanel2textField5.getText();
                all = s1+s2+s3+s4+s5;

                break;
            case 3:
                s1 = wordsPanel3textField1.getText();
                s2 = wordsPanel3textField2.getText();
                s3 = wordsPanel3textField3.getText();
                s4 = wordsPanel3textField4.getText();
                s5 = wordsPanel3textField5.getText();
                all = s1+s2+s3+s4+s5;

                break;
            case 4:
                s1 = wordsPanel4textField1.getText();
                s2 = wordsPanel4textField2.getText();
                s3 = wordsPanel4textField3.getText();
                s4 = wordsPanel4textField4.getText();
                s5 = wordsPanel4textField5.getText();
                all = s1+s2+s3+s4+s5;

                break;
            case 5:
                s1 = wordsPanel5textField1.getText();
                s2 = wordsPanel5textField2.getText();
                s3 = wordsPanel5textField3.getText();
                s4 = wordsPanel5textField4.getText();
                s5 = wordsPanel5textField5.getText();
                all = s1+s2+s3+s4+s5;

                break;
            default:
                s1 = wordsPanel6textField1.getText();
                s2 = wordsPanel6textField2.getText();
                s3 = wordsPanel6textField3.getText();
                s4 = wordsPanel6textField4.getText();
                s5 = wordsPanel6textField5.getText();
                all = s1+s2+s3+s4+s5;
        }
    }

}

