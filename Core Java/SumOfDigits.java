import java.util.Scanner;
public class SumOfDigits {
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10; 
            num /= 10; 
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        int result = sumOfDigits(number);
        System.out.println("Sum of digits: " + result);
    }
}
