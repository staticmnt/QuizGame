package com.company;
import java.util.*;
class Question {

    String prompt;
    String answer;
    public Question(String prompt, String answer){
        this.prompt = prompt;
        this.answer = answer;
    }
}
public class QuizTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte category;
        System.out.println(" Player score start with 0 points out of 4,if you answer wrong the game ends");
        System.out.println("\t Firstly,choose a category you would want to answer!");
        System.out.println("1.Java\n\t2.Cars\n\t\t3.Animals");
        category = input.nextByte();
        switch (category) {
            case 1:
                categoryJava();
                break;
            case 2:
                categoryCars();
                break;
            case 3:
                categoryAnimals();
                break;
            default:
                System.out.println("Please don't try me!");
        }
    }

    public static void categoryJava() {
        Scanner input = new Scanner(System.in);
        Random randomizer = new Random();
        String[][] categoryJava = {
                {"When was Java created?", "1995", "1987", "1999", "1993"},
                {"Who created Java?", "Bjarne Stroustrup", "Michael Jackson", "James Gosling", "Rasmus Lerdorf"},
                {"What was the original name of Java?", "LISP", "Simula", "Autocode", "Oak"},
                {"How many Java developers are in the world?", "1.9 million", "90 million", "900 thousand", "900 million"}
        };
        Question[] questions = {
                new Question(categoryJava[0][0], "1"),
                new Question(categoryJava[1][0], "3"),
                new Question(categoryJava[2][0], "4"),
                new Question(categoryJava[3][0], "2")
        };
        byte score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            for (int j = 1; j < categoryJava[0].length; j++) {
                System.out.println(j + "." + categoryJava[i][j]);
            }

            String answer = input.nextLine();
            if (!answer.equals(questions[i].answer)) {
                System.out.println("Nice try :)");
                break;
            } else {
                score++;
                System.out.println("You got " + score + "/" + questions.length + " points!");
                if (score == 4) {
                    System.out.println("Congratulations,you won the matrix!");
                }
            }
            System.out.println();
        }
    }

    public static void categoryCars() {
        Scanner input = new Scanner(System.in);
        String[][] categoryCars = {
                {"Where is the Ferrari Factory and Museum?", "Detroit", "Berlin", "Paris", "Maranello"},
                {"What year did BMW build their first electric car, the BMW 1602e?", "1999", "1972", "2005", "2011"},
                {"What was the first Japanese car to be introduced in the United States?", "Nissan 300zx", "Toyota Soarer", "Honda Accord", "Subaru Impreza"},
                {"Which was the first automobile company to provide seat belts as an option?", "General Motors", "Nash Motors", "Mercedes-Benz", "Tatra"}
        };
        Question[] questions = {
                new Question(categoryCars[0][0], "4"),
                new Question(categoryCars[1][0], "2"),
                new Question(categoryCars[2][0], "3"),
                new Question(categoryCars[3][0], "2")
        };
        byte score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            for (int j = 1; j < categoryCars[0].length; j++) {
                System.out.println(j + "." + categoryCars[i][j]);
            }
            String answer = input.nextLine();
            if (!answer.equals(questions[i].answer)) {
                System.out.println("Nope,try again!");
                break;
            } else {
                score++;
                System.out.println("You got " + score + "/" + questions.length + " points!");
                if (score == 4) {
                    System.out.println("Congratulations,you win some virtual fuel!");
                }
            }
            System.out.println();
        }
    }

    public static void categoryAnimals() {
        Scanner input = new Scanner(System.in);
        String[][] categoryAnimals = {
                {"A snail can sleep for how many years?", "1 year", "3 years", "5 years", "10 years"},
                {"Which species never sleeps?", "Ants", "Cockroaches", "Bullfrogs", "Flies"},
                {"Which animal has the longest lifespan?", "Turtles", "Dolphins", "Dinosaurs", "Whales"},
                {"How many more times a dog can hear than the humans?", "Two times", "Three times", "Four times", "Five times"}
        };
        Question[] questions = {
                new Question(categoryAnimals[0][0], "2"),
                new Question(categoryAnimals[1][0], "3"),
                new Question(categoryAnimals[2][0], "4"),
                new Question(categoryAnimals[3][0], "2")
        };
        byte score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            for (int j = 1; j < categoryAnimals[0].length; j++) {
                System.out.println(j + "." + categoryAnimals[i][j]);
            }
            String answer = input.nextLine();
            if (!answer.equals(questions[i].answer)) {
                System.out.println("Try again,maybe next time!");
                break;
            } else {
                score++;
                System.out.println("You got " + score + "/" + questions.length + " points!");
                if (score == 4) {
                    System.out.println("Congratulations,you win an virtual dog!");
                }
                System.out.println();
            }
        }
    }
}