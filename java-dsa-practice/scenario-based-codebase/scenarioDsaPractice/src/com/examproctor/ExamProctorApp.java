package com.examproctor;

import java.util.Scanner;
import java.util.ArrayList;

public class ExamProctorApp {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Question list (shown on screen)
        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question(1,
                "What is Java?",
                new String[]{
                        "A. Programming Language",
                        "B. Operating System",
                        "C. Browser",
                        "D. Database"
                }));

        questions.add(new Question(2,
                "Which data structure follows LIFO?",
                new String[]{
                        "A. Queue",
                        "B. Stack",
                        "C. List",
                        "D. Set"
                }));

        questions.add(new Question(3,
                "Which keyword is used to create object?",
                new String[]{
                        "A. class",
                        "B. static",
                        "C. new",
                        "D. void"
                }));

        questions.add(new Question(4,
                "Which is NOT an OOP concept?",
                new String[]{
                        "A. Inheritance",
                        "B. Polymorphism",
                        "C. Compilation",
                        "D. Encapsulation"
                }));

        questions.add(new Question(5,
                "Which method starts Java program?",
                new String[]{
                        "A. start()",
                        "B. main()",
                        "C. run()",
                        "D. init()"
                }));

        QuestionNavigator navigator = new QuestionNavigator();
        AnswerStore store = new AnswerStore();
        ScoreEvaluator evaluator = new ScoreEvaluator();

        System.out.println("===== ONLINE EXAM STARTED =====");

        // Show questions directly on screen
        for (Question q : questions) {

            navigator.visit(q.id);
            q.display();

            System.out.print("Enter Answer (A/B/C/D): ");
            String ans = sc.next();

            store.save(q.id, ans);
        }

        // Auto-submit exam
        int score = evaluator.evaluate(store.getAnswers());

        System.out.println("\n===== EXAM SUBMITTED =====");
        System.out.println("Final Score: " + score + "/" + evaluator.total());

        sc.close();
    }
}