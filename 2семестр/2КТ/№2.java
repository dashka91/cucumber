import java.util.Scanner;
public class Main {
    public static String formatName(String name) {
        if (name == null || name.isEmpty()) {
            return "";
        }
        name = name.toLowerCase(); 
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя:");
        String inputName = scanner.nextLine();

        String formattedName = formatName(inputName);
        System.out.println("Привет, " + formattedName + "!");
        scanner.close();
    }
}
