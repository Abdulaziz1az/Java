import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Map<String, Boolean> library = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("add -> Add a book to the library\n" +
            "checkout -> Mark a book as checked out\n"+
            "return -> Mark a book as returned\n"+
            "view -> Show all books and their status\n" +
            "exit -> Quit");
            System.out.print("Enter: ");
            String user_input = scanner.nextLine();
            if (user_input.equals("exit"))
            {
                System.out.println("Good bye");
                break;
            }
            else if(user_input.equals("add"))
            {
                System.out.print("Enter Book: ");
                String book = scanner.nextLine();
                library.put(book, true);
            } else if(user_input.equals("checkout"))
            {
                System.out.print("Enter book");
                String bookCheckout = scanner.nextLine();
                if (library.containsKey(bookCheckout))
                {
                      library.put(bookCheckout, false);
                      System.out.println(bookCheckout + " has been checked out");
                } else {
                    System.out.println("Book not fond in library");
                }
            } else if (user_input.equals("return"))
            {
                System.out.print("Enter book");
                String returnBook = scanner.nextLine();
                if (library.containsKey(returnBook))
                {
                     library.put(returnBook, true);
                     System.out.println(returnBook + " has been returned.");
                } else {
                    System.out.println("Book not found in library.");
                }
            } else if (user_input.equals("view"))
            {
                for(Map.Entry <String, Boolean> entry : library.entrySet())
                {
                    String status = entry.getValue() ? "Available" : "Checked out";
                    System.out.println(entry.getKey() + " -> " + status);
                }
            }
        }
    }
}
