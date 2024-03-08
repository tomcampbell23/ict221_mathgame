/**
* This is a simple math game for grades 3-5.
*
* @author Tom Campbell
*/

import java.util.Random;
import java.util.Scanner;

public class MathGame {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int count = 0;
        for (int i = 1; i < 10; i++) {
            int x = rand.nextInt(1,13);
            int y = rand.nextInt(1,13);
            System.out.printf("What is %2d + %2d? %n", x, y);
            int response = input.nextInt();
            int correct = x + y;
            if (response == correct) {
                System.out.printf("That's correct! %n");
                count += 1;
            } else {
                System.out.printf("That's not quite right. %n");
            }
        }
        input.close();
        if (count >= 8) {
            System.out.printf("You got %2d out of 9. Congratulations! %n", count);
        } else {
            System.out.printf("You got %2d out of 9. %n", count);
        }
    }
}
