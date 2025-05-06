import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class wordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ener a sentence: ");
        String user_input = scanner.nextLine();
        String[] words = user_input.split(" ");
        
        Map<String, Integer>  wordCount = new HashMap<>();

        for(int i = 0; i < words.length; i++)
        {
            if(wordCount.containsKey(words[i]))
            {
                int count = wordCount.get(words[i]);
                wordCount.put(words[i], count + 1);
            }
            else
            {
                wordCount.put(words[i], 1);
            }
        }
        System.out.println(wordCount);
    }
}
