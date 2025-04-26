import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class VSUET {
    static final String ALPH = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

    public static void main(String[] args) throws Exception {
        // 1. Считываем словарь
        String dictionaryText = new String(Files.readAllBytes(Paths.get("fish-text.txt")), "UTF-8").toUpperCase();
        Set<String> dictionary = new HashSet<>();
        for (String word : dictionaryText.split("\\P{IsAlphabetic}+")) {
            if (!word.isEmpty()) {
                dictionary.add(word);
            }
        }
        String encrypted = "ЬЁЁКЛЙЖЭ ЯЁЙЫПЧ, ЙЁЭЁПД, ЬДПФПБЖТ!";
        for (int shift = 0; shift < ALPH.length(); shift++) {
            String decrypted = decrypt(encrypted, shift);
            int countKnownWords = countDictionaryWords(decrypted, dictionary);

            if (countKnownWords >= 3) {
                System.out.println("Возможный сдвиг: " + shift);
                System.out.println("Расшифровка: " + decrypted);
                break;
            }
        }
    }
    public static String decrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            int index = ALPH.indexOf(c);
            if (index != -1) {
                int newIndex = (index - shift + ALPH.length()) % ALPH.length();
                result.append(ALPH.charAt(newIndex));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
    public static int countDictionaryWords(String text, Set<String> dictionary) {
        int count = 0;
        for (String word : text.split("\\P{IsAlphabetic}+")) {
            if (!word.isEmpty() && dictionary.contains(word)) {
                count++;
            }
        }
        return count;
    }
}
