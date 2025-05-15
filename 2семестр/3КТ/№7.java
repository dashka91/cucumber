import java.util.Scanner;
public class VSUET {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество палочек: ");
        long n = scanner.nextLong();
        long tanyaSticks = 0;
        boolean tanya = true;

        while (n > 0) {
            if (tanya) {
                if (n % 2 == 0) {
                    long take = n / 2;
                    tanyaSticks += take;
                    n -= take;
                } else {
                    tanyaSticks += 1;
                    n -= 1;
                }
            } else {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n -= 1;
                }
            }
            tanya = !tanya; 
        }
        System.out.println("Таня собрала " + tanyaSticks + " палочек.");
    }
}
