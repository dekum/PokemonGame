import java.util.Scanner;
import java.util.InputMismatchException;
public class ValidateIntInput {
    private int value;
    private int value1;
    private String cancel;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    ValidateIntInput() {


        Scanner scanner = new Scanner(System.in);
        value = -1;
        // set value initially to a number outside the range we want

        // loop, while the value is below


        while (value < 0 || value > 5) {
            try {

                System.out.print("Enter a number within the range:");
                value = scanner.nextInt();
            }

            // if the user types in anything but an integer,
            // it will 'throw' this 'exception'.
            catch (InputMismatchException ime) {
                System.err.println("Incorrect entry.");
                // clear the keyboard buffer
                scanner.nextLine();
            }
        }

        System.out.println("Your entry is:" + value);

    }

    ValidateIntInput(int lowScopre, int highScope) {


        Scanner scanner = new Scanner(System.in);
        value = -1500;
        // set value initially to a number outside the range we want

        // loop, while the value is below


        while (value < lowScopre || value > highScope) {
            try {

                System.out.print("Enter a number within the range:");
                value = scanner.nextInt();
            }

            // if the user types in anything but an integer,
            // it will 'throw' this 'exception'.
            catch (InputMismatchException ime) {
                System.err.println("Incorrect entry.");
                // clear the keyboard buffer
                scanner.nextLine();
            }
        }


            System.out.println("Your entry is:" + value);

        }


}
