package logicalPrograms;
import java.util.Scanner;

public class EvenOddNumber {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("number is zero cant define even or odd");
        } else if (number % 2 == 0) {
            System.out.println("given number is even");
        } else {
            System.out.println("given number is odd");
        }

    }
}
