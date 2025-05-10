import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentCourseTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> studentCourses = new HashMap<>();
        while(true)
        {
            System.out.println("add -> Add a course for a student\n"+
            "view -> View all student adn their courses\n"+
            "remove -> Remove a course from a student\n" +
            "exit -> Quit the system");
             System.out.print("Enter option: ");
            String user_input = scanner.nextLine();
            if(user_input.equals("exit"))
            {
                System.out.println("Goodbye");
                break;
            } else if (user_input.equals("add"))
            {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.print("Enter a course: ");
                String course = scanner.nextLine();
                if (studentCourses.containsKey(name))
                {
                    studentCourses.get(name).add(course);
                } else{
                    studentCourses.put(name, new ArrayList<>(List.of(course)));
                }
            } else if (user_input.equals("view"))
            {
                for(Map.Entry <String , List<String>> entry : studentCourses.entrySet()){
                    System.out.println(entry.getKey() + "->" + entry.getValue());
                }
            } else if (user_input.equals("remove"))
            {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.print("Enter a course: ");
                String course = scanner.nextLine();
                if (studentCourses.containsKey(name))
                {
                    studentCourses.get(name).remove(course);
                    System.out.println("course removed" + course);
                 } else {
                    System.out.println("course not found");
                }
                
            }
            
        }
    }
}
