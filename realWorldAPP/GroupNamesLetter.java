import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GroupNamesLetter {
    public static void main(String[] args) {
        Map<Character, List<String>> grouped = new TreeMap<>();
        grouped.put('A',new ArrayList<>(List.of("Abdulaziz")));
        String[] names = {"Abdulaziz", "Alice", "Bob", "Bryan", "Charlie", "Clara", "David"};
        for(int i = 0; i < names.length; i++)
        {
            String name = names[i];
            char letter = name.charAt(0);
            if (grouped.containsKey(letter))
            {
                grouped.get(letter).add(name);
            } else {
                grouped.put(letter, new ArrayList<>(List.of(name)));
            }
        }
        System.out.println(grouped);
    }
}
