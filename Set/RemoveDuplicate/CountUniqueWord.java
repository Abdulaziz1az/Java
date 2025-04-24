// Abdulaziz Abdirisak 4/24/25 
// This program Counts Unique words and words size.
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountUniqueWord {
    public static void main(String[] args) {
        Set<String> wordHSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String userInput = scanner.nextLine();
        String [] words = userInput.split(" ");

        for(String word : words)
        {
            wordHSet.add(word);
        }
        System.out.println("Toatal word: " + words.length);
        System.out.println("Unique word list: " + wordHSet.size());
        
    }
}
