import java.io.*;
import java.util.Scanner;

public class Calculator {
    static final String FILE = "history.txt";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        loadHistory();

        while (true) {
            System.out.print("> ");
            String input = in.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) break;
            if (input.equalsIgnoreCase("history")) {
                loadHistory();
                continue;
            }

            try {
                double result = calculate(input);
                String record = input + " = " + result;
                System.out.println(record);
                saveHistory(record);
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    static double calculate(String expr) throws Exception {
        expr = expr.replaceAll("\\s+", "");
        expr = evaluateAbs(expr);
        expr = expr.replaceAll("//", "§");

        //обрабатываем по приоритету вручную
        String[] tokens = expr.split("(?<=[+\\-*/%^§])|(?=[+\\-*/%^§])");
        return evalTokens(tokens);
    }

    static String evaluateAbs(String expr) throws Exception {
        while (expr.contains("|")) {
            int start = expr.indexOf("|");
            int end = expr.indexOf("|", start + 1);
            if (end == -1) throw new Exception("Неверный модуль");
            double val = calculate(expr.substring(start + 1, end));
            expr = expr.substring(0, start) + Math.abs(val) + expr.substring(end + 1);
        }
        return expr;
    }

    static double evalTokens(String[] tokens) throws Exception {
        for (int p = 3; p >= 1; p--) {
            for (int i = 0; i < tokens.length; i++) {
                if (tokens[i] == null) continue;
                if (priority(tokens[i]) == p) {
                    double a = Double.parseDouble(tokens[i - 1]);
                    double b = Double.parseDouble(tokens[i + 1]);
                    double r = switch (tokens[i]) {
                        case "+" -> a + b;
                        case "-" -> a - b;
                        case "*" -> a * b;
                        case "/" -> a / b;
                        case "%" -> a % b;
                        case "^" -> Math.pow(a, b);
                        case "§" -> (long)a / (long)b;
                        default -> throw new Exception("Неизвестный оператор: " + tokens[i]);
                    };
                    tokens[i - 1] = Double.toString(r);
                    tokens[i] = tokens[i + 1] = null;
                }
            }
        }

        for (String t : tokens)
            if (t != null)
                return Double.parseDouble(t);
        throw new Exception("Ошибка вычисления");
    }

    static int priority(String op) {
        return switch (op) {
            case "^" -> 3;
            case "*", "/", "%", "§" -> 2;
            case "+", "-" -> 1;
            default -> 0;
        };
    }

    static void saveHistory(String line) {
        try (FileWriter w = new FileWriter(FILE, true)) {
            w.write(line + "\n");
        } catch (IOException e) {
            System.out.println("Ошибка записи истории");
        }
    }

    static void loadHistory() {
        try (BufferedReader r = new BufferedReader(new FileReader(FILE))) {
            String line;
            System.out.println("История:");
            while ((line = r.readLine()) != null) System.out.println(line);
        } catch (IOException e) {
            System.out.println("История пуста.");
        }
    }
}
