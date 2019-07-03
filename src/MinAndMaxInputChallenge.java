import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }

            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Max number: " + max + " , min number: " + min + ".");
        scanner.close();
    }
}
