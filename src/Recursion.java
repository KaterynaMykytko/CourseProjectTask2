import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();

        reverseNumber(number);
    }

    public static void reverseNumber(int number) {
        int result1 = number % 10;
        System.out.print(result1);
        int result2 = number / 10;
        if (result2 != 0) {
            reverseNumber(result2);
        }
    }
}

