import java.math.BigInteger;
public class VSUET {
    public static void main(String[] args) {
        int i = 10000;
        BigInteger fibN = fib(i);
        System.out.println("F(" + i + ") = " + fibN);
        int[] result = MostFrequent(fibN.toString());
        System.out.println("Цифра " + result[1] + " встречается " + result[0] + " раз(а).");
    }

    public static BigInteger fib(int n) {
        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            BigInteger temp = b;
            b = b.add(a);
            a = temp;
        }
        return b;
    }
    public static int[] MostFrequent(String number) {
        int[] count = new int[10];
        for (char c : number.toCharArray()) {
            count[c - '0']++;
        }
        int maxCount = -1;
        int maxDigit = -1;
        for (int digit = 0; digit <= 9; digit++) {
            if (count[digit] > maxCount || (count[digit] == maxCount && digit > maxDigit)) {
                maxCount = count[digit];
                maxDigit = digit;
            }
        }
        return new int[] { maxCount, maxDigit };
    }
}
