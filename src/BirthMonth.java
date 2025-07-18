import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = 0;

        System.out.print("Enter your birth month number (1-12): ");

        if (in.hasNextInt()) {
            month = in.nextInt();
            in.nextLine();

            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is " + month);
            } else {
                System.out.println("You entered an incorrect month value: " + month);
            }
        } else {
            String trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
        }
    }
}