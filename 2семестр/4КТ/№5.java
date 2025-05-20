import java.util.Scanner;

public class VSUET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = sc.nextInt();
        System.out.println("fusc(" + n + ") = " + fusc(n));
        sc.close();
    }
    public static int fusc(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
      
        int[] f = new int[n + 2];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                f[i] = f[i / 2]; 
            } else {
                f[i] = f[i / 2] + f[i / 2 + 1];
        }

        return f[n];
    }
}
