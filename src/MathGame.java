/**
* This is a simple math game for grades 3-5.
*
* @author Tom Campbell
*/

import java.util.Random;
import java.util.Scanner;

public class MathGame {
    static int askQuestion() {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int x = rand.nextInt(1,13);
        int y = rand.nextInt(1,13);
        int correct = 0;
        if (x > y) {
            System.out.printf("What is %2d - %2d? %n", x, y);
            correct = x - y;
        } else {
            System.out.printf("What is %2d + %2d? %n", x, y);
            correct = x + y;
        }
        int response = input.nextInt();
        //input.close();
        if (response == correct) {
            System.out.printf("That's correct! %n");
            return 1;
        } else {
            System.out.printf("That's not quite right. %n");
            return 0;
        }
    }
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 10; i++) {
            int result = askQuestion();
            count += result;
        }
        if (count >= 8) {
            System.out.printf("You got %2d out of 9. Congratulations! %n", count);
        } else {
            System.out.printf("You got %2d out of 9. %n", count);
        }
    }
}
