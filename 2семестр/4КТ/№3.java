import java.util.Random;
import java.util.Scanner;

public class VSUET {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[][] array = new int[n][n];
        Random rnd = new Random();
        for (int i = 0; i < n * n; i++)
            array[i / n][i % n] = rnd.nextInt(100) + 1;
        for (int[] row : array) {
            for (int num : row) System.out.printf("%3d ", num);
            System.out.println();
        }
        System.out.println();
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) System.out.print(array[top][i] + " ");
            top++;
            for (int i = top; i <= bottom; i++) System.out.print(array[i][right] + " ");
            right--;
            if (top <= bottom) for (int i = right; i >= left; i--) System.out.print(array[bottom][i] + " ");
            bottom--;
            if (left <= right) for (int i = bottom; i >= top; i--) System.out.print(array[i][left] + " ");
            left++;
        }
    }
}
