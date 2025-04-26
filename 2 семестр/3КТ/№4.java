import java.util.ArrayList;
import java.util.List;
public class VSUET {
    public static void main(String[] args) {
        int[] distances = {50, 55, 57, 58, 60};
        int t = 175; 
        int k = 3;
        Integer bestSum = chooseBestSum(t, k, dist);
        if (bestSum != null) {
            System.out.println("Максимальная возможная сумма: " + bestSum);
        } else {
            System.out.println("Нет подходящего варианта.");
        }
    }
    public static Integer chooseBestSum(int t, int k, int[] dist) {
        List<List<Integer>> combinations = new ArrayList<>();
        combine(distances, k, 0, new ArrayList<>(), combinations);
        Integer best = null;
        for (List<Integer> comb : combinations) {
            int sum = 0;
            for (int d : comb) {
                sum += d;
            }
            if (sum <= t) {
                if (best == null || sum > best) {
                    best = sum;
                }
            }
        }
        return best;
    }
    private static void combine(int[] arr, int k, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            current.add(arr[i]);
            combine(arr, k, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
