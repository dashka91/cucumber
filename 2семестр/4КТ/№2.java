import java.util.Scanner;
public class VSUET {
    public static void main(String[] args) {
        String roman = new Scanner(System.in).nextLine().toUpperCase();
        int sum = 0;
        for (int i = 0; i < roman.length(); i++) {
            int current = romanValue(roman.charAt(i));
            int next = (i < roman.length() - 1) ? romanValue(roman.charAt(i + 1)) : 0;
            sum += (current < next) ? -current : current;
        }
        System.out.println(sum);
    }
    public static int romanValue(char c) {
        return "IVXLCDM".indexOf(c) % 7 % 4 == 0 ? (int) Math.pow(10, "IXCM".indexOf(c) / 2) :
               (int) Math.pow(10, "IVXLCDM".indexOf(c) / 2) * 5;
    }
}
