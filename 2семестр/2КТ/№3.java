import java.util.Scanner;
public class Main {
    public static String formatName(String name) {
        if (name == null || name.isEmpty()) {
            return "";
        }
        String lowerName = name.toLowerCase();
        return lowerName.substring(0, 1).toUpperCase() + lowerName.substring(1);
    }
    public static String removeVowels(String s) {
        return s.replaceAll("(?i)[аеёиоуыэюя]", "");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String inputName = scanner.nextLine();
        String formattedName = formatName(inputName);
        System.out.println("Привет, " + formattedName + "!");
        String nameWithoutVowels = removeVowels(formattedName);
        System.out.println("Имя без гласных: " + nameWithoutVowels);
        scanner.close();
    }
}
