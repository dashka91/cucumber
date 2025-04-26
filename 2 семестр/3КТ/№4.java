public class VSUET {
    public static void main(String[] args) {
        int[] dist = {50, 55, 57, 58, 60};
        int t = 175; 
        int k = 3;   
        int bestSum = chooseBestSum(t, k, dist);
        if (bestSum != -1) {
            System.out.println("Максимальная возможная сумма: " + bestSum);
        } else {
            System.out.println("Нет подходящего варианта.");
        }
    }
    public static int chooseBestSum(int t, int k, int[] dist) {
        return search(dist, k, 0, 0, t, 0);
    }
    private static int search(int[] dist, int k, int index, int citiesChosen, int t, int currentSum) {
        if (citiesChosen == k) {
            if (currentSum <= t) {
                return currentSum;
            } else {
                return -1;
            }
        }
        if (index == dist.length) {
            return -1;
        }
        int withCurrent = search(dist, k, index + 1, citiesChosen + 1, t, currentSum + dist[index]);
        int withoutCurrent = search(dist, k, index + 1, citiesChosen, t, currentSum);

        return Math.max(withCurrent, withoutCurrent);
    }
}
