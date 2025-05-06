import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ShopingCartSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> itemQuantity = new TreeMap<>();
        Map<String, Double> itemPrice = new  TreeMap<>();

        while(true)
        {
            System.out.println("add --> Add/update item\n" + "remove --> Remove item\n"
            +"view --> Show all items\n" + "total --> Calculate total cost\n" + "exit --> Quit");
            System.out.println("Enter -->: ");
            String userInput = scanner.nextLine();

            if (userInput.equals("exit"))
            {
                System.out.println("Thank you for you shoping/n"+ "Havae good day");
                break;
            } else if (userInput.equals("add"))
            {
                System.out.print("Enter item: ");
                String item = scanner.nextLine();
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                System.out.print("Enter item price: ");
                double price = scanner.nextDouble();
                scanner.nextLine();
                itemQuantity.put(item, quantity);
                itemPrice.put(item, price);
               
            } else  if (userInput.equals("total")){
                double total = 0;
                for (String item : itemQuantity.keySet())
                {
                    int quantity = itemQuantity.get(item);
                    double price = itemPrice.get(item);
                    total += quantity * price;
                }
                System.out.println("Total cost: $" + total);
            } else if (userInput.equals("view"))
            {
                for (String item : itemQuantity.keySet())
                {
                    int quantity = itemQuantity.get(item);
                    double price = itemPrice.get(item);
                    double subtotal = quantity * price;
                    System.out.println(item + " -> Qty: " + quantity+ ", Price: $" + price 
                    + ", subtotal:  $" + subtotal);
                }
            } else if(userInput.equals("remove"))
            {
                System.out.print("Enter iteme to remove: ");
                String itemToremove = scanner.nextLine();
                if(itemQuantity.containsKey(itemToremove))
                {
                    itemQuantity.remove(itemToremove);
                    itemPrice.remove(itemToremove);
                    System.out.println(itemToremove + " was removed from the cart.");
                } else {
                    System.out.println("Item not found in cart.");
                }
            } else {
                System.out.println("Invalid input.");
            }
        }
    }
}
