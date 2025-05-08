public class VSUET {
    public static void main(String[] args) {
        String line = "Hello, world";
        int shift = 3;
        boolean encrypt = true;
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            int index = symbols.indexOf(c);
            if (index != -1) {
                int newIndex;
                if (encrypt) {
                    newIndex = (index + shift) % symbols.length();
                } else {
                    newIndex = (index - shift + symbols.length()) % symbols.length();
                }
                c = symbols.charAt(newIndex);
            }
            result.append(c);
        }
        System.out.println("Результат: " + result);
    }
}
