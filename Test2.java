import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("輸入層數至少為2:");
            int input = sc.nextInt();
            for (int i = 0; i <= input; i++) {
                for (int j = 0; j < input - i; j++) {
                    System.out.print("   ");
                }
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
                if (input < 2) {
                    break;
                }
            }
        }
    }
}