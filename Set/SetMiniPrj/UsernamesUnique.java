import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UsernamesUnique {
    public static void main(String[] args) {
        {
            // input username
            // ouput sort the user name with treeset to make a uniq 
            // use While to to keep asking the user 
            
            Scanner scanner = new Scanner(System.in);
            Set<String> Ts = new TreeSet<>();

            while(true)
            {
                System.out.println("\ntype view to see all the usernames, exit to quit");
                System.out.print(" Ener a Username: ");
                String username = scanner.nextLine();
                if(username.equals("view"))
                {
                    for(String usern: Ts)
                    {
                        System.out.println(usern);
                    }
                }
                else if(username.equals("exit"))
                    break;
                else
                    Ts.add(username);
                
            }
        }
    }
}
