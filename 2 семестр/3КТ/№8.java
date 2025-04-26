import java.util.Arrays;
public class VSUET {
    public static void main(String[] args) {
        String input = "56 65 74 100 99 68 86 180 90";
        String sorted = orderWeights(input);
        System.out.println(sorted);
    }
    public static String orderWeights(String str) {
        return Arrays.stream(str.trim().split("\\s+"))
                .sorted((a, b) -> {
                    int sumA = a.chars().map(c -> c - '0').sum();
                    int sumB = b.chars().map(c -> c - '0').sum();
                    if (sumA != sumB) {
                        return Integer.compare(sumA, sumB);
                    } else {
                        return a.compareTo(b);
                    }
                })
                .reduce((x, y) -> x + " " + y)
                .orElse("");
    }
}
