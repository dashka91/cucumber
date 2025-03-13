import java.util.*;
public class UniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку слов:");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));
        System.out.println(String.join(" ", uniqueWords));
    }
}
