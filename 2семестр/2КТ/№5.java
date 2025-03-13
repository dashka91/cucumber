import java.util.Scanner;
public class SquaredSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало ряда: ");
        int start = scanner.nextInt();
        System.out.print("Введите шаг: ");
        int step = scanner.nextInt();
        System.out.print("Введите количество шагов: ");
        int count = scanner.nextInt();
        scanner.close();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(start + i * step);
            if (i < count - 1) {
                result.append(", ");
            }
        }
        System.out.println(result);
    }
}
