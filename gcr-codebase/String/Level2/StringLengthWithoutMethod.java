// Program to find and return the length of a string without using the length() method

import java.util.Scanner;

public class StringLengthWithoutMethod{

    // User-defined method to find length without using length()
    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.next();

        int userDefinedLength = findLength(text);
        int builtInLength = text.length();
        System.out.println("Length using user-defined method: " + userDefinedLength);
        System.out.println("Length using built-in length(): " + builtInLength);

        input.close();
    }
}
