import java.util.*;
public class VSUET {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), start = sc.nextInt() - 1;
        List<Integer> players = new ArrayList<>();
        for (int i = 1; i <= n; i++) players.add(i);
        List<Integer> result = new ArrayList<>();
        int index = start;

        while (!players.isEmpty()) {
            index = (index + 2) % players.size();
            result.add(players.remove(index));
        }

        System.out.println(result);
        sc.close();
    }
}
