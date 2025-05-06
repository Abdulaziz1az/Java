import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LeaderboardSystem {
    public static void main(String[] args) {
        Map<String, Integer> leaderboard = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("add -> add/update a player's score or view \n" 
            + "view -> Show leadeboard \n" + "exit -> Quit the program");
            System.out.print("Enter your option: ");
           String user_input = scanner.nextLine();
           if(user_input.equals("exit"))
           {
            System.out.println("Goodbye");
            break;
           }
           else if (user_input.equals("add"))
           {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter score: ");
            int score = scanner.nextInt();
            scanner.nextLine();
            leaderboard.put(name, score);
           
            leaderboard.put(name, score);
            System.out.println(name + " was added/updated with score " + score);
           }
           else if(user_input.equals("view"))
           {
            System.out.println(leaderboard);
           }

        }
    }
}
