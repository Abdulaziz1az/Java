import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class TaskManger {
    public static void main(String[] args) {
        ArrayList<String> Tasks = new ArrayList<>();
        Stack<String> T = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("\n--- Task Manger ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Undo Last Action");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter task number: ");
                    String task = scanner.nextLine();
                    Tasks.add(task);
                    T.push("add:"+task);
                    break;

                    case 2:
                    if(Tasks.isEmpty())
                    {
                        System.out.println("No task found.");
                    } else{
                        System.out.println("Tasks");
                        for(int i = 0; i < Tasks.size(); i++)
                        {
                            System.out.println((i + 1)+ ". " + Tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    if(Tasks.isEmpty())
                    {
                        System.out.println("No tasks to remove.");
                    } else{
                        System.out.println("Which task number do you want to remove");
                        for(int i = 0; i < Tasks.size(); i++)
                        {
                            System.out.println((i + 1) + ". " + Tasks.get(i));
                        }
                        int removeIndex = scanner.nextInt() -1;
                        scanner.nextLine();

                        if (removeIndex >= 0 && removeIndex < Tasks.size()){
                            String remove = Tasks.remove(removeIndex);
                            T.push("remove:" + remove);
                        }
                    }
                    break;
                case 4:
                    if(T.isEmpty())
                    {
                        System.out.println("Nothing to undo");
                    }else{
                        String action = T.pop();
                        if (action.startsWith("add:"))
                        {
                            String taskToRemove = action.substring(4);
                            Tasks.remove(taskToRemove);
                            System.out.println("Undo: Remove '" + taskToRemove + "'");
                        
                        } else if (action.startsWith("remove:")){
                            String taskToAdd = action.substring(7);
                            Tasks.add(taskToAdd);
                            System.out.println("Undo: Re-added'" + taskToAdd + "'");
                        }
                    } 
                    break;
                case 5:
                    System.out.println("Goodbye! ");
                    return;
                default:
                System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
