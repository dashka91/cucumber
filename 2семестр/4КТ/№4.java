import java.util.ArrayList;
import java.util.Scanner;

public class VSUET {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        ArrayList<Integer> u = new ArrayList<>();
        u.add(1);
        for (int i = 0, j = 0; u.size() < n;) {
            int y = 2 * u.get(i) + 1;
            int z = 3 * u.get(j) + 1;
            if (y < z) u.add(y);
            if (y > z) u.add(z);
            if (y == z) u.add(y);
            if (y <= z) i++;
            if (z <= y) j++;
        }
        System.out.println(u);
    }
}
