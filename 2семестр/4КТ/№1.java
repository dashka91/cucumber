import java.util.Scanner;

public class VSUET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 1 до 9999: ");
        int num = sc.nextInt();
        if (num < 1 || num > 9999) {
            System.out.println("Число должно быть в диапазоне от 1 до 9999.");
        } else {
            System.out.println("Римское представление: " + Roman(num));
        }
        sc.close();
    }

    public static String Roman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }
        return roman.toString();
    }
}
