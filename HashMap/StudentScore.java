import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.sql.rowset.spi.SyncFactoryException;

public class StudentScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> students  = new LinkedHashMap<>();
        students.put("Abdulaziz", 77);
        students.put("Zara", 92);
        students.put("John", 78);
        students.put("Mike", 88);
        while(true)
        {
            System.out.println("Enter a student name to see score, add, delete");
            System.out.print("Enter Student Name: ");
            String user_input = scanner.nextLine().trim();
            if (user_input.equalsIgnoreCase("exit"))
            {
                System.out.println("Goodbye.");
                break;
            }
            else if(user_input.equalsIgnoreCase("add")){
                System.out.print("Enter name: ");
                String studentName = scanner.nextLine();
                System.out.print("Enter the score: ");
                int score = scanner.nextInt();
                scanner.nextLine();
                students.put(studentName, score);
                System.out.println("Student have been added");
            } else if(user_input.equalsIgnoreCase("delete")){
                System.out.print("Enter Student Name:");
               String studentName = scanner.nextLine();
                if(students.containsKey(studentName))
                {
                    students.remove(studentName);
                    System.out.println(studentName + "has been removed.");
                } else{
                    System.out.println("Student is not in the list");
                }
            }else if (students.containsKey(user_input))
            {
                System.out.println(user_input + "'s score: " + students.get(user_input));
            }else{
                System.out.println("Student not found");
            }
            
        }
        Map<String, Integer> studentsO = new TreeMap<>(students);
        System.out.println("Insertion Order: " + students);
        System.out.println("Sorted: " + studentsO);

    }
}
