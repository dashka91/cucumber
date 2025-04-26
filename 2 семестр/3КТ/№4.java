import java.util.Scanner;
public class VSUET {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int number = scanner.nextInt(); // Ввод числа n
        System.out.print("Введите степень w: ");
        int startPower = scanner.nextInt();

        int original = number;
        int sum = 0;
        int power = startPower;

        String digits = Integer.toString(number);
        for (int i = 0; i < digits.length(); i++) {
            int d = digits.charAt(i) - '0';
            sum += Math.pow(d, power);
            power++;
        }
        boolean possible = false;
        for (int s = 1; s <= 64; s++) {
            if (original * s == sum) {
                possible = true;
                System.out.println("Возможно! " + original + " * " + s + " = " + sum);
                break;
            }
        }
        if (!possible) {
            System.out.println("Невозможно.");
        }
    }
}
