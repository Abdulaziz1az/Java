import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();

        // Add students to the list
        student.add(new Student("Abdulaziz", 22, "CS"));
        student.add(new Student("Zara", 21, "Bilogy"));
        student.add(new Student("Mike", 23, "Mathematics"));

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
        
        List<Person> people = new ArrayList<>();

        people.add(new Student("Abdulaziz", 22,"CS"));
        people.add(new Teacher("Ms. Ahmed", 35, "Math"));
        people.add(new Student("Abdirisak", 22,"Bilogy"));
        people.add(new Teacher("Mr. Omar", 35, "History"));

        int studentCount = 0;
        int teacherCount = 0;
        
        for (Person p : people){
            p.displayInfo();
            p.printRole();
            if (p instanceof Student)
            {
                studentCount++;
            } else{
                teacherCount++;
            }
        }
        System.out.println("Total Students: " + studentCount);
        System.out.println("Total Teachers: " + teacherCount);

        List<Indentifiable> ids = new ArrayList<>();
        ids.add(new Student("Abdulaziz", 22, "CS"));
        ids.add(new Teacher("Zara", 35, "Math"));

        for (Indentifiable i : ids)
        {
            i.printID();
        }
    }
}
