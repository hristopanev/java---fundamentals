import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> children = new ArrayDeque<>();
        Collections.addAll(children, names);

        while (children.size() > 1){

            for (int i = 0; i < n - 1; i++) {
                String currentChild = children.poll();
                children.offer(currentChild);
            }

            String child = children.poll();
            System.out.println("Removed " + child);
        }
        String lastChild = children.poll();
        System.out.println("Last is " + lastChild);
    }
}
