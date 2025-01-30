import java.util.Scanner;
public class QuizApp {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
            "1. What is the capital of France?",
            "2. Who is the president of the USA?",
            "3. What is the largest ocean on Earth?",
        };
        String[][] options = {
            {"A. Paris", "B. London", "C. Rome", "D. Berlin"},
            {"A. Donald Trump", "B. Joe Biden", "C. Barack Obama", "D. George Bush"},
            {"A. Atlantic Ocean", "B. Indian Ocean", "C. Arctic Ocean", "D. Pacific Ocean"},
        };
         String[] answers = {"A", "B", "D"}; 

        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer (A/B/C/D): ");
            String userAnswer = scanner.nextLine().toUpperCase();

            if (userAnswer.equals(answers[i])) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong! The correct answer was " + answers[i]);
            }
            System.out.println();
        }
        System.out.println("Your total score: " + score + "/" + questions.length);
        scanner.close();
    }
}