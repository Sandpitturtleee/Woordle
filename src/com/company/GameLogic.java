package com.company;


import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class GameLogic extends SinglePlayer{
    static int exist = 0;
    static int nextLetter = 0;
    static String s1,s2,s3,s4,s5,all;
    static int s1check,s2check,s3check,s4check,s5check;

    static String readFile(){
        ArrayList<String> words = new ArrayList<>();

        try (Scanner s = new Scanner(new FileReader("resources/words.txt"))) {
            while (s.hasNext()) {
                words.add(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int index = (int)(Math.random() * words.size());
        String word = words.get(index);
        return word;
    }
    static void changeString(int colNumber){
        switch (colNumber) {
            case 1:
                word = "0" + word.substring(1,5);
                break;
            case 2:
                word = word.substring(0,1)+ "0" + word.substring(2,5);
                break;
            case 3:
                word = word.substring(0,2)+ "0" + word.substring(3,5);
                break;
            case 4:
                word = word.substring(0,3)+ "0" + word.substring(4,5);
                break;
            default:
                word = word.substring(0,4)+ "0";
        }
    }

    static void checkVictory(){
        if (checkWord()==1){
            System.out.println("Zwycięstwo");
            checkLetter();
        }
        else {
            checkLetter();
            if(checkWord()==0 && rowNumber==6){
                System.out.println("Porażka");
            }
            rowNumber += 1;
            colNumber = 1;
        }
    }
    static int isSubstring(String s1, String s2){
        int M = s1.length();
        int N = s2.length();

        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++) {
            int j;
 
            /* For current index i, check for
            pattern match */
            for (j = 0; j < M; j++)
                if (s2.charAt(i + j)
                        != s1.charAt(j))
                    break;

            if (j == M) {
                i = i + nextLetter;
                return i;
            }
        }
        nextLetter = 0;
        return -1;
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
        String s1,s2,s3,s4,s5,all;
        switch(rowNumber) {
            case 1:
                s1 = wordsPanel1textField1.getText();
                s2 = wordsPanel1textField2.getText();
                s3 = wordsPanel1textField3.getText();
                s4 = wordsPanel1textField4.getText();
                s5 = wordsPanel1textField5.getText();
                all = s1+s2+s3+s4+s5;
                if (all.equals(wordOryginal))
                    result=1;
                break;
            case 2:
                s1 = wordsPanel2textField1.getText();
                s2 = wordsPanel2textField2.getText();
                s3 = wordsPanel2textField3.getText();
                s4 = wordsPanel2textField4.getText();
                s5 = wordsPanel2textField5.getText();
                all = s1+s2+s3+s4+s5;
                if (all.equals(wordOryginal))
                    result=1;
                break;
            case 3:
                s1 = wordsPanel3textField1.getText();
                s2 = wordsPanel3textField2.getText();
                s3 = wordsPanel3textField3.getText();
                s4 = wordsPanel3textField4.getText();
                s5 = wordsPanel3textField5.getText();
                all = s1+s2+s3+s4+s5;
                if (all.equals(wordOryginal))
                    result=1;
                break;
            case 4:
                s1 = wordsPanel4textField1.getText();
                s2 = wordsPanel4textField2.getText();
                s3 = wordsPanel4textField3.getText();
                s4 = wordsPanel4textField4.getText();
                s5 = wordsPanel4textField5.getText();
                all = s1+s2+s3+s4+s5;
                if (all.equals(wordOryginal))
                    result=1;
                break;
            case 5:
                s1 = wordsPanel5textField1.getText();
                s2 = wordsPanel5textField2.getText();
                s3 = wordsPanel5textField3.getText();
                s4 = wordsPanel5textField4.getText();
                s5 = wordsPanel5textField5.getText();
                all = s1+s2+s3+s4+s5;
                if (all.equals(wordOryginal))
                    result=1;
                break;
            default:
                s1 = wordsPanel6textField1.getText();
                s2 = wordsPanel6textField2.getText();
                s3 = wordsPanel6textField3.getText();
                s4 = wordsPanel6textField4.getText();
                s5 = wordsPanel6textField5.getText();
                all = s1+s2+s3+s4+s5;
                if (all.equals(wordOryginal))
                    result=1;
                else
                    result=0;
        }
        return result;
    }
    static void checkRepeat(){
        s1check = isSubstring(s1, wordOryginal);
        s2check = isSubstring(s2, wordOryginal);
        s3check = isSubstring(s3, wordOryginal);
        s4check = isSubstring(s4, wordOryginal);
        s5check = isSubstring(s5, wordOryginal);
        if (s2check == s1check){
            nextLetter+=1;
            s2check = isSubstring(s2,wordOryginal);
        }
        if (s3check == s1check){
            nextLetter+=2;
            s3check = isSubstring(s3,wordOryginal);
        }else if (s3check == s2check){
            nextLetter+=1;
            s3check = isSubstring(s3,wordOryginal);
        }
        if (s4check == s1check){
            nextLetter+=3;
            s4check = isSubstring(s4,wordOryginal);
        }else if(s4check == s2check){
            nextLetter+=2;
            s4check = isSubstring(s4,wordOryginal);
        }else if(s4check == s3check){
            nextLetter+=1;
            s4check = isSubstring(s4,wordOryginal);
        }
        if (s5check == s1check){
            nextLetter+=4;
            s5check = isSubstring(s5,wordOryginal);
        }else if(s5check == s2check){
            nextLetter+=3;
            s5check = isSubstring(s5,wordOryginal);
        }else if(s5check == s3check){
            nextLetter+=2;
            s5check = isSubstring(s5,wordOryginal);
        }else if(s5check == s4check){
            nextLetter+=1;
            s5check = isSubstring(s5,wordOryginal);
        }
    }
    static void checkLetter(){
        int s1number = 0, s2number = 1,s3number = 2, s4number = 3,s5number = 4;
        String word1;
        switch (rowNumber) {
            case 1 -> {
                s1 = wordsPanel1textField1.getText();
                s2 = wordsPanel1textField2.getText();
                s3 = wordsPanel1textField3.getText();
                s4 = wordsPanel1textField4.getText();
                s5 = wordsPanel1textField5.getText();
                s1check = isSubstring(s1, wordOryginal);
                s2check = isSubstring(s2, wordOryginal);
                s3check = isSubstring(s3, wordOryginal);
                s4check = isSubstring(s4, wordOryginal);
                s5check = isSubstring(s5, wordOryginal);
                //checkRepeat();
                System.out.println(s1check);
                System.out.println(s2check);
                System.out.println(s3check);
                System.out.println(s4check);
                System.out.println(s5check + "\n");
                if (s1check == -1) {
                    wordsPanel1textField1.setBackground(Color.GRAY);
                } else if (s1check == s1number) {
                    wordsPanel1textField1.setBackground(Color.GREEN);
                    changeString(1);
                } else {
                    wordsPanel1textField1.setBackground(Color.yellow);
                }
                if (s2check == -1) {
                    wordsPanel1textField2.setBackground(Color.GRAY);
                } else if (s2check == s2number) {
                    wordsPanel1textField2.setBackground(Color.GREEN);
                    changeString(2);
                } else {
                    wordsPanel1textField2.setBackground(Color.yellow);
                }
                if (s3check == -1) {
                    wordsPanel1textField3.setBackground(Color.GRAY);
                } else if (s3check == s3number) {
                    wordsPanel1textField3.setBackground(Color.GREEN);
                    changeString(3);
                } else {
                    wordsPanel1textField3.setBackground(Color.yellow);
                }
                if (s4check == -1) {
                    wordsPanel1textField4.setBackground(Color.GRAY);
                } else if (s4check == s4number) {
                    wordsPanel1textField4.setBackground(Color.GREEN);
                    changeString(4);
                } else {
                    wordsPanel1textField4.setBackground(Color.yellow);
                }
                if (s5check == -1) {
                    wordsPanel1textField5.setBackground(Color.GRAY);
                } else if (s5check == s5number) {
                    wordsPanel1textField5.setBackground(Color.GREEN);
                    changeString(5);
                    System.out.println(word);
                } else {
                    wordsPanel1textField5.setBackground(Color.yellow);
                }
            }
            case 2 -> {
                s1 = wordsPanel2textField1.getText();
                s2 = wordsPanel2textField2.getText();
                s3 = wordsPanel2textField3.getText();
                s4 = wordsPanel2textField4.getText();
                s5 = wordsPanel2textField5.getText();
                s1check = isSubstring(s1, wordOryginal);
                s2check = isSubstring(s2, wordOryginal);
                s3check = isSubstring(s3, wordOryginal);
                s4check = isSubstring(s4, wordOryginal);
                s5check = isSubstring(s5, wordOryginal);
                //checkRepeat();
                System.out.println(s1check);
                System.out.println(s2check);
                System.out.println(s3check);
                System.out.println(s4check);
                System.out.println(s5check);
                if (s1check == -1) {
                    wordsPanel2textField1.setBackground(Color.GRAY);
                } else if (s1check == s1number) {
                    wordsPanel2textField1.setBackground(Color.GREEN);
                    changeString(1);
                } else {
                    wordsPanel2textField1.setBackground(Color.yellow);
                }
                if (s2check == -1) {
                    wordsPanel2textField2.setBackground(Color.GRAY);
                } else if (s2check == s2number) {
                    wordsPanel2textField2.setBackground(Color.GREEN);
                    changeString(2);
                } else {
                    wordsPanel2textField2.setBackground(Color.yellow);
                }
                if (s3check == -1) {
                    wordsPanel2textField3.setBackground(Color.GRAY);
                } else if (s3check == s3number) {
                    wordsPanel2textField3.setBackground(Color.GREEN);
                    changeString(3);
                } else {
                    wordsPanel2textField3.setBackground(Color.yellow);
                }
                if (s4check == -1) {
                    wordsPanel2textField4.setBackground(Color.GRAY);
                } else if (s4check == s4number) {
                    wordsPanel2textField4.setBackground(Color.GREEN);
                    changeString(4);
                } else {
                    wordsPanel2textField4.setBackground(Color.yellow);
                }
                if (s5check == -1) {
                    wordsPanel2textField5.setBackground(Color.GRAY);
                } else if (s5check == s5number) {
                    wordsPanel2textField5.setBackground(Color.GREEN);
                    changeString(5);
                    System.out.println(word);
                } else {
                    wordsPanel2textField5.setBackground(Color.yellow);
                }
            }
            case 3 -> {
                s1 = wordsPanel3textField1.getText();
                s2 = wordsPanel3textField2.getText();
                s3 = wordsPanel3textField3.getText();
                s4 = wordsPanel3textField4.getText();
                s5 = wordsPanel3textField5.getText();
                s1check = isSubstring(s1, wordOryginal);
                s2check = isSubstring(s2, wordOryginal);
                s3check = isSubstring(s3, wordOryginal);
                s4check = isSubstring(s4, wordOryginal);
                s5check = isSubstring(s5, wordOryginal);
                //checkRepeat();
                System.out.println(s1check);
                System.out.println(s2check);
                System.out.println(s3check);
                System.out.println(s4check);
                System.out.println(s5check + "\n");
                if (s1check == -1) {
                    wordsPanel3textField1.setBackground(Color.GRAY);
                } else if (s1check == s1number) {
                    wordsPanel3textField1.setBackground(Color.GREEN);
                    changeString(1);
                } else {
                    wordsPanel3textField1.setBackground(Color.yellow);
                }
                if (s2check == -1) {
                    wordsPanel3textField2.setBackground(Color.GRAY);
                } else if (s2check == s2number) {
                    wordsPanel3textField2.setBackground(Color.GREEN);
                    changeString(2);
                } else {
                    wordsPanel3textField2.setBackground(Color.yellow);
                }
                if (s3check == -1) {
                    wordsPanel3textField3.setBackground(Color.GRAY);
                } else if (s3check == s3number) {
                    wordsPanel3textField3.setBackground(Color.GREEN);
                    changeString(3);
                } else {
                    wordsPanel3textField3.setBackground(Color.yellow);
                }
                if (s4check == -1) {
                    wordsPanel3textField4.setBackground(Color.GRAY);
                } else if (s4check == s4number) {
                    wordsPanel3textField4.setBackground(Color.GREEN);
                    changeString(4);
                } else {
                    wordsPanel3textField4.setBackground(Color.yellow);
                }
                if (s5check == -1) {
                    wordsPanel3textField5.setBackground(Color.GRAY);
                } else if (s5check == s5number) {
                    wordsPanel3textField5.setBackground(Color.GREEN);
                    changeString(5);
                    System.out.println(word);
                } else {
                    wordsPanel3textField5.setBackground(Color.yellow);
                }
            }
            case 4 -> {
                s1 = wordsPanel4textField1.getText();
                s2 = wordsPanel4textField2.getText();
                s3 = wordsPanel4textField3.getText();
                s4 = wordsPanel4textField4.getText();
                s5 = wordsPanel4textField5.getText();
                s1check = isSubstring(s1, wordOryginal);
                s2check = isSubstring(s2, wordOryginal);
                s3check = isSubstring(s3, wordOryginal);
                s4check = isSubstring(s4, wordOryginal);
                s5check = isSubstring(s5, wordOryginal);
                //checkRepeat();
                System.out.println(s1check);
                System.out.println(s2check);
                System.out.println(s3check);
                System.out.println(s4check);
                System.out.println(s5check + "\n");
                if (s1check == -1) {
                    wordsPanel4textField1.setBackground(Color.GRAY);
                } else if (s1check == s1number) {
                    wordsPanel4textField1.setBackground(Color.GREEN);
                    changeString(1);
                } else {
                    wordsPanel4textField1.setBackground(Color.yellow);
                }
                if (s2check == -1) {
                    wordsPanel4textField2.setBackground(Color.GRAY);
                } else if (s2check == s2number) {
                    wordsPanel4textField2.setBackground(Color.GREEN);
                    changeString(2);
                } else {
                    wordsPanel4textField2.setBackground(Color.yellow);
                }
                if (s3check == -1) {
                    wordsPanel4textField3.setBackground(Color.GRAY);
                } else if (s3check == s3number) {
                    wordsPanel4textField3.setBackground(Color.GREEN);
                    changeString(3);
                } else {
                    wordsPanel4textField3.setBackground(Color.yellow);
                }
                if (s4check == -1) {
                    wordsPanel4textField4.setBackground(Color.GRAY);
                } else if (s4check == s4number) {
                    wordsPanel4textField4.setBackground(Color.GREEN);
                    changeString(4);
                } else {
                    wordsPanel4textField4.setBackground(Color.yellow);
                }
                if (s5check == -1) {
                    wordsPanel4textField5.setBackground(Color.GRAY);
                } else if (s5check == s5number) {
                    wordsPanel4textField5.setBackground(Color.GREEN);
                    changeString(5);
                    System.out.println(word);
                } else {
                    wordsPanel4textField5.setBackground(Color.yellow);
                }
            }
            case 5 -> {
                s1 = wordsPanel5textField1.getText();
                s2 = wordsPanel5textField2.getText();
                s3 = wordsPanel5textField3.getText();
                s4 = wordsPanel5textField4.getText();
                s5 = wordsPanel5textField5.getText();
                s1check = isSubstring(s1, wordOryginal);
                s2check = isSubstring(s2, wordOryginal);
                s3check = isSubstring(s3, wordOryginal);
                s4check = isSubstring(s4, wordOryginal);
                s5check = isSubstring(s5, wordOryginal);
                //checkRepeat();
                System.out.println(s1check);
                System.out.println(s2check);
                System.out.println(s3check);
                System.out.println(s4check);
                System.out.println(s5check + "\n");
                if (s1check == -1) {
                    wordsPanel5textField1.setBackground(Color.GRAY);
                } else if (s1check == s1number) {
                    wordsPanel5textField1.setBackground(Color.GREEN);
                    changeString(1);
                } else {
                    wordsPanel5textField1.setBackground(Color.yellow);
                }
                if (s2check == -1) {
                    wordsPanel5textField2.setBackground(Color.GRAY);
                } else if (s2check == s2number) {
                    wordsPanel5textField2.setBackground(Color.GREEN);
                    changeString(2);
                } else {
                    wordsPanel5textField2.setBackground(Color.yellow);
                }
                if (s3check == -1) {
                    wordsPanel5textField3.setBackground(Color.GRAY);
                } else if (s3check == s3number) {
                    wordsPanel5textField3.setBackground(Color.GREEN);
                    changeString(3);
                } else {
                    wordsPanel5textField3.setBackground(Color.yellow);
                }
                if (s4check == -1) {
                    wordsPanel5textField4.setBackground(Color.GRAY);
                } else if (s4check == s4number) {
                    wordsPanel5textField4.setBackground(Color.GREEN);
                    changeString(4);
                } else {
                    wordsPanel5textField4.setBackground(Color.yellow);
                }
                if (s5check == -1) {
                    wordsPanel5textField5.setBackground(Color.GRAY);
                } else if (s5check == s5number) {
                    wordsPanel5textField5.setBackground(Color.GREEN);
                    changeString(5);
                    System.out.println(word);
                } else {
                    wordsPanel5textField5.setBackground(Color.yellow);
                }
            }
            default -> {
                s1 = wordsPanel6textField1.getText();
                s2 = wordsPanel6textField2.getText();
                s3 = wordsPanel6textField3.getText();
                s4 = wordsPanel6textField4.getText();
                s5 = wordsPanel6textField5.getText();
                s1check = isSubstring(s1, wordOryginal);
                s2check = isSubstring(s2, wordOryginal);
                s3check = isSubstring(s3, wordOryginal);
                s4check = isSubstring(s4, wordOryginal);
                s5check = isSubstring(s5, wordOryginal);
                //checkRepeat();
                System.out.println(s1check);
                System.out.println(s2check);
                System.out.println(s3check);
                System.out.println(s4check);
                System.out.println(s5check + "\n");
                if (s1check == -1) {
                    wordsPanel6textField1.setBackground(Color.GRAY);
                } else if (s1check == s1number) {
                    wordsPanel6textField1.setBackground(Color.GREEN);
                    changeString(1);
                } else {
                    wordsPanel6textField1.setBackground(Color.yellow);
                }
                if (s2check == -1) {
                    wordsPanel6textField2.setBackground(Color.GRAY);
                } else if (s2check == s2number) {
                    wordsPanel6textField2.setBackground(Color.GREEN);
                    changeString(2);
                } else {
                    wordsPanel6textField2.setBackground(Color.yellow);
                }
                if (s3check == -1) {
                    wordsPanel6textField3.setBackground(Color.GRAY);
                } else if (s3check == s3number) {
                    wordsPanel6textField3.setBackground(Color.GREEN);
                    changeString(3);
                } else {
                    wordsPanel6textField3.setBackground(Color.yellow);
                }
                if (s4check == -1) {
                    wordsPanel6textField4.setBackground(Color.GRAY);
                } else if (s4check == s4number) {
                    wordsPanel6textField4.setBackground(Color.GREEN);
                    changeString(4);
                } else {
                    wordsPanel6textField4.setBackground(Color.yellow);
                }
                if (s5check == -1) {
                    wordsPanel6textField5.setBackground(Color.GRAY);
                } else if (s5check == s5number) {
                    wordsPanel6textField5.setBackground(Color.GREEN);
                    changeString(5);
                    System.out.println(word);
                } else {
                    wordsPanel6textField5.setBackground(Color.yellow);
                }
            }
        }

    }

}

// This code is contributed by JaideepPyne.