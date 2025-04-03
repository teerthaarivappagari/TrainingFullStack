import java.util.Scanner;
public class ReverseBits {
    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1; 
            result |= (n & 1); 
            n >>= 1; 
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();
        int reversed = reverseBits(num);
        System.out.println("Original number: " + num);
        System.out.println("Reversed bits: " + reversed);
    }
}
