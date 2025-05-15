import java.util.Scanner;
public class VSUET {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество палочек: ");
        long n = scanner.nextLong();
        int moves = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
            moves++;
        }
        if (moves % 2 == 1) {
            System.out.println("Победил Саша!");
        } else {
            System.out.println("Победила Таня!");
        }
    }
}
