import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();

        // Add students to the list
        student.add(new Student("Abdulaziz", 22, "CS"));
        student.add(new Student("Zara", 21, "Bilogy"));
        student.add(new Student("Mike", 23, "Mathematics"));

        // Looop and print info
        for(Student s : student)
        {
            s.displayInfo();
        }

        // change major for zara
        for (Student s : student)
        {
            if(s.name.equalsIgnoreCase("Zara"))
            {
                s.changeMajor("Cs");
            }
        }

        // caculate average age 
        int totalAge = 0;
        for (Student s : student)
        {
            totalAge += s.age;
        }
        double avgAge = (double) totalAge / student.size();
        System.out.println("Average age: " + avgAge + "\n");

        // Filter by major only CS student
        System.out.println("Student majring in CS:");
        for (Student s : student)
        {
            if(s.major.equalsIgnoreCase("CS"))
            {
                s.displayInfo();
            }
        }
    }
}
