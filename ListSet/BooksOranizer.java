import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BooksOranizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listBooks = new ArrayList<>();

        while(true)
        {
            System.out.println("Enter add, delete, search, show, exit");
            String user_input = scanner.nextLine().trim().toLowerCase(); 
            
            if(user_input.equals("add"))
            {
                System.out.print("Enter book name: ");
                String booName = scanner.nextLine();
                listBooks.add(booName);
            }
            else if(user_input.equals("delete"))
            {
                System.out.print("Enter the book to delet: ");
                String bookToDelete = scanner.nextLine();
                if(listBooks.contains(bookToDelete))
                {
                    listBooks.remove(bookToDelete);
                    System.out.println("Book Deleted");
                }
                else{
                    System.out.println("The Book is not in the list");
                }
            }
            else if(user_input.equals("search"))
            {
                System.out.print("Enter a book to search: ");
                String searchingBook  = scanner.nextLine();
                if(listBooks.contains(searchingBook))
                {
                    System.out.println("Found it");
                }
                else
                {
                    System.out.println("Not Found");
                }
            }
            else if(user_input.equals("exit"))
            {
                System.out.println("Goodbye");
                break;
            }
            else if(user_input.equals("show"))
            {
                System.out.println("Books " + listBooks);
            }
            else
                System.out.println("Invalid input");
        }
        Set<String> uniqeBooks = new TreeSet<>(listBooks);
        System.out.println("Unique Sorted Books: " + uniqeBooks);
    }
}
