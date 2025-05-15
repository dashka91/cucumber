import java.util.Scanner;
public class VSUET {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n (0 < n < 100000): ");
        int n = scanner.nextInt();
        if (n <= 0 || n >= 100000) {
            System.out.println("Число должно быть от 1 до 99999 включительно.");
            return;
        }
        if (n % 2 == 0) {
            System.out.println("Ошибка: n должно быть нечетным, чтобы быть разницей квадратов последовательных чисел.");
            return;
        }
        int x = (n + 1) / 2;
        int sq1 = x * x;
        int sq2 = (x - 1) * (x - 1);
        System.out.println("n можно представить как разницу квадратов: " + sq1 + " - " + sq2 + " = " + n);
    }
}
