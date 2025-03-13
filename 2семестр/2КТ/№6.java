import java.util.*;
public class MemoryCell {
    private PriorityQueue<Integer> memory;
    public MemoryCell() {
        memory = new PriorityQueue<>();
    }
    public void addNumber(int num) {
        if (memory.size() < 3) {
            memory.add(num);
        } else {
            if (num > memory.peek()) {
                memory.poll();
                memory.add(num);
            }
        }
    }
    public List<Integer> getNumbers() {
        return new ArrayList<>(memory);
    }
    public static void main(String[] args) {
        MemoryCell cell = new MemoryCell();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа ('exit' для выхода):");
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            cell.addNumber(num);
            System.out.println("Текущие числа в памяти: " + cell.getNumbers());
        }
    }
}
