package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomizer = new Random();
        System.out.println("\t Quiz game ,with random questions ");
        System.out.println("\t Player score start with 0 points,if you answer wrong the game ends");
        System.out.println("\t Firstly,choose a category you would want to answer!");
        String[][] categoryJava = {
                {"When was Java created?", "1995", "1987", "1999", "1993"},
                {"Who created Java?", "James Gosling", "Michael Jackson", "Bjarne Stroustrup", "Rasmus Lerdorf"},
                {"What was the original name of Java?","Oak","Simula","Autocode","LISP"},
                {"How many Java developers are in the world?","1.9 million","90 million","900 thousand","900 million"}
        };
        Question[] questions = {
                new Question(categoryJava[0][0],"1"),
                new Question(categoryJava[1][0],"1"),
                new Question(categoryJava[2][0],"1"),
                new Question(categoryJava[3][0],"1")
        };
        Collections.shuffle(Arrays.asList(questions));
        int score = 0;
        int random;
        for (int i = 0; i < questions.length; i++) {
            random = randomizer.nextInt(categoryJava.length);
            System.out.println(questions[random].prompt);
            String answer = input.nextLine();
            if (!answer.equals(questions[i].answer)) {
                System.out.println("Sorry try again");
                break;

            } else {
                score++;
                System.out.println("You got " + score + "/" + questions.length + " points");
            }
        }
    }
    public class QuestionAndAnswers {
        private String[] questions;
        private int correctAnswer;
        //getters, setters, constructors
    }
}






