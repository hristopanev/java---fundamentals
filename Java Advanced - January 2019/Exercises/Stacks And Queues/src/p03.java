import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();

        int commandsCount = Integer.parseInt(scanner.nextLine());

        while (commandsCount-- > 0){
            String[] tokens = scanner.nextLine().split("\\s+");

            String command = tokens[0];

            switch (command){
                case "1":
                    int number = Integer.parseInt(tokens[1]);
                    stack.push(number);
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    int max = Collections.max(stack);
                    System.out.println(max);
                    break;
            }
        }
    }
}
