package evenCheck;

import java.util.Scanner;

/**
 *
 * @author Niaz Morshed
 */
public class EvenCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Please enter a number: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean result = isEven(number);
        System.out.println(result);

    }

    public static boolean isEven(int value) {

        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

}
