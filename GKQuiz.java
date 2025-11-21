import java.util.*;
import java.io.*;

public class GKQuiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== HIGH SCHOOL GENERAL KNOWLEDGE QUIZ =====");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Questions
        String[] questions = {
            "1. What is the capital of Bangladesh?",
            "2. Who discovered America?",
            "3. Which planet is known as the Red Planet?",
            "4. Who is known as the Father of the Computer?",
            "5. What is the national flower of Bangladesh?",
            "6. Which gas do plants absorb?",
            "7. Who wrote 'Gitanjali'?",
            "8. How many continents are there in the world?",
            "9. What is H2O commonly known as?",
            "10. Which is the largest ocean?"
        };

        // Options
        String[][] options = {
            {"a) Dhaka", "b) Chittagong", "c) Khulna", "d) Sylhet"},
            {"a) Vasco da Gama", "b) Christopher Columbus", "c) Newton", "d) Einstein"},
            {"a) Earth", "b) Venus", "c) Mars", "d) Jupiter"},
            {"a) Charles Babbage", "b) Elon Musk", "c) Bill Gates", "d) Alan Turing"},
            {"a) Rose", "b) Jasmine", "c) Water Lily", "d) Sunflower"},
            {"a) Oxygen", "b) Nitrogen", "c) Carbon Dioxide", "d) Hydrogen"},
            {"a) Nazrul Islam", "b) Jasimuddin", "c) Tagore", "d) Sarat Chandra"},
            {"a) 5", "b) 6", "c) 7", "d) 8"},
            {"a) Water", "b) Salt", "c) Sugar", "d) Acid"},
            {"a) Atlantic", "b) Indian", "c) Arctic", "d) Pacific"}
        };

        // Correct answers
        char[] answers = { 'a','b','c','a','c','c','c','c','a','d' };

        int score = 0;

        // Quiz loop
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            for (String op : options[i]) {
                System.out.println(op);
            }

            System.out.print("Your answer: ");
            char ans = Character.toLowerCase(sc.next().charAt(0));

            if (ans == answers[i]) {
                System.out.println("✔ Correct!");
                score++;
            } else {
                System.out.println("✘ Wrong! Correct answer was: " + answers[i]);
            }
        }

        System.out.println("\n===== QUIZ FINISHED =====");
        System.out.println("Name: " + name);
        System.out.println("Score: " + score + " out of " + questions.length);

        // Save to file
        try (FileWriter fw = new FileWriter("scores.txt", true)) {
            fw.write(name + " - Score: " + score + "/" + questions.length + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file!");
        }

        System.out.println("Your score has been saved to scores.txt");
    }
}

