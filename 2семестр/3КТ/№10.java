import java.util.Random;
import java.util.Scanner;

public class VSUET{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int[] code = {rnd.nextInt(10), rnd.nextInt(10), rnd.nextInt(10), rnd.nextInt(10)};
        int tries = 0;
        while (tries < 20) {
            System.out.println("Попытка #" + (tries + 1) + ": введите 4 числа через пробел:");
            int[] guess = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
            int match = 0;
            boolean[] usedCode = new boolean[4];
            boolean[] usedGuess = new boolean[4];

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (!usedCode[i] && !usedGuess[j] && code[i] == guess[j]) {
                        match++;
                        usedCode[i] = usedGuess[j] = true;
                        break;
                    }
                }
            }
            if (match == 4) {
                System.out.println("Вы угадали!");
                break;
            } else {
                System.out.println("Совпадений: " + match);
            }
            tries++;
        }
        if (tries == 20) {
            System.out.print("Вы проиграли! Код был: ");
            for (int x : code) System.out.print(x + " ");
            System.out.println();
        }
        sc.close();
    }
}
