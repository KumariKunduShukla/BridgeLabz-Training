// Program of online quiz application

import java.util.Scanner;

public class OnlineQuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. Java is a  language?",
            "2. Which keyword is used to create object?",
            "3. Size of int in Java?",
            "4. Which loop runs at least once?",
            "5. Java was developed by?"
        };

        String[] options = {
            "a) Low level  b) High level",
            "a) new        b) create",
            "a) 2 bytes    b) 4 bytes",
            "a) for        b) do-while",
            "a) Google     b) Sun Microsystems"
        };

        char[] answers = {'b', 'a', 'b', 'b', 'b'};

        int score = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("\n" + questions[i]);
            System.out.println(options[i]);
            System.out.print("Enter answer (a/b): ");

            char userAnswer = sc.next().charAt(0);

            switch (userAnswer) {
                case 'a':
                case 'b':
                    if (userAnswer == answers[i]) {
                        score++;
                        System.out.println("Correct Answer");
                    } else {
                        System.out.println("Wrong Answer");
                    }
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }

        System.out.println("\nYour Score: " + score + "/5");

        sc.close();
    }
}

   
   
   
   
   
   