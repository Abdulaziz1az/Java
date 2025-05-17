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
            if(s.getName()!= null && s.getName().equalsIgnoreCase("Zara"))
            {
                s.changeMajor("Cs");
            }
        }

        // caculate average age 
        int totalAge = 0;
        for (Student s : student)
        {
            totalAge += s.getAge();
        }
        double avgAge = (double) totalAge / student.size();
        System.out.println("Average age: " + avgAge + "\n");

        // Filter by major only CS student
        System.out.println("Student majring in CS:");
        for (Student s : student)
        {
            if(s.getMajor().equalsIgnoreCase("CS"))
            {
                s.displayInfo();
            }
        }

        student.get(0).setAge(-5);
        student.get(0).setAge(22);
        
        for (Person p : student){
            p.displayInfo();
        }
    }
}
