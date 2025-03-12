public class Main {
    public static boolean isSuffix(String str, String suffix) {
        return str.endsWith(suffix);
    }

    public static void main(String[] args) {
        System.out.println(isSuffix("def", "ef"));  
        System.out.println(isSuffix("def", "s"));   
        System.out.println(isSuffix("hel", "el"));
        System.out.println(isSuffix("test", "es"));
    }
}
