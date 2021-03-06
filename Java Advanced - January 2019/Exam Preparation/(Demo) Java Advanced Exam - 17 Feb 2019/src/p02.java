import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputLine = Integer.parseInt(reader.readLine());
        Map<String, List<String>> exel = new LinkedHashMap<>();

        String[] input = reader.readLine().split(", ");

        System.out.println(String.join(" | ", input));

        while (inputLine-- > 1){
            String[] tokens = reader.readLine().split(", ");
            ArrayList<String> list = new ArrayList<>();

            for (int i = 1; i < tokens.length; i++) {
                if (i <= tokens.length - 1){
                    list.add(" | ");
                }
                list.add(tokens[i]);
            }
            exel.put(tokens[0], list);
        }



        String[] commands = reader.readLine().split("\\s+");

        if ("sort".equalsIgnoreCase(commands[0])){
            exel.entrySet().stream()
                    .sorted(Comparator.comparing(Map.Entry::getKey))
                    .forEach(x -> System.out.printf("%s%s%n", x.getKey(), String.join("", x.getValue())));

//            for (Map.Entry<String, List<String>> entry : exel.entrySet()) {
//                System.out.printf("%s%s%n", entry.getKey(), String.join("", entry.getValue()));
//            }
        }else if ("filter".equalsIgnoreCase(commands[0])){
            exel.entrySet().stream()
                    .filter(a -> a.getKey().contains(commands[2]))
                    .forEach(x -> System.out.printf("%s%s%n", x.getKey(), String.join("", x.getValue())));
        }else if ("hide".equalsIgnoreCase(commands[0])){
            exel.entrySet().stream()
                    .filter(a -> !a.getKey().contains(commands[1]))
                    .forEach(x -> System.out.printf("%s%s%n", x.getKey(), String.join("", x.getValue())));
        }
    }
}
