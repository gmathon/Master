import java.util.Scanner;

public class fib {

    public static void main(String[] args) {

        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int check = scanner.nextInt();

        int firstNum = 0, secondNum = 1, finalnum = 0;

        // addition loop until final num is less then check
        while (finalnum < check) {

            finalnum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = finalnum;
        }

        if (check == finalnum) {
            System.out.println(check+" belongs to Fibonacci series");

        } else {
            System.out.println(check+" does not belong to Fibonacci series");

        }

    }
}