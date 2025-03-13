import java.util.Scanner;
public class SquaredSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        scanner.close();
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);
        for (int i = start; i <= end; i += start) {
            System.out.println(i * i);
        }
    }
}
