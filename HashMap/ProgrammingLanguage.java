import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgrammingLanguage {
    public static void main(String[] args) {
        Map<String,String> language = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        language.put("Java", "James Gosling");
        language.put("Python", "Guido Van Rossum");
        language.put("JavaScript", "Brandan Eich");
        language.put("C", "Dennis Ritchie");
        language.put("C++", "Bjarne Stroustrup");
        
        while(true)
        {
            System.out.println("Enter a programing language (or tyepe 'exit' to quit)");
            System.out.print("Enter: ");
            String user_input = scanner.nextLine().trim();

            if(user_input.equalsIgnoreCase("exit"))
            {
                System.out.println("Goodbye");
                break;
            }
            String normalized = capitalize(user_input);
            if(language.containsKey(normalized))
            {
                System.out.println(normalized + " was created by " + language.get(normalized));
            }
            else
            {
                System.out.println("Language not found");
            }
        }
    }
    public static String capitalize(String input)
    {
       if(input.isEmpty()) return input;
       return input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
    }
}
