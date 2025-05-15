import java.util.Scanner;

public class VSUET{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        StringBuilder result = new StringBuilder();

        String[] sentences = text.split("(?<=\\.)\\s*");
        for (String sentence : sentences) {
            String[] words = sentence.split("\\s+");
            for (String word : words) {
                if (word.length() > 1 && Character.isLetter(word.charAt(0))) {
                    result.append(word.substring(1)).append(word.charAt(0)).append("ауч ");
                } else {
                    result.append(word).append(" ");
                }
            }
            result.append(". ");
        }
        System.out.println(result.toString().trim());
        sc.close();
    }
}
