package com.company;
import java.util.Random;
import java.io.*;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Random randomizer = new Random();
        Scanner input = new Scanner(System.in);
        int choice = randomizer.nextInt();
        String selection;
        String[][] QuestionList;
        QuestionList = new String[4][3];
        QuestionList[0][0] = "My Question \nA: Answer One\nB: Answer Two\nC: Answer Three";
        QuestionList[0][1] = "A";
        QuestionList[1][0] = "My Question2 \nA: Answer One\nB: Answer Two\nC: Answer Three";
        QuestionList[1][1] = "B";

        int round = 0;
        int score = 0;
        while (round < QuestionList.length){
            System.out.println(QuestionList[choice][0]);
            selection = input.nextLine();
            if (selection.equals(QuestionList[choice][1])){
                score++;
                System.out.println("Correct!");
            }

else{ System.out.println("Incorrect, the answer was " + QuestionList[choice][1]); }
        }

    }
}
