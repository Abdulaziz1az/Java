// Abdulaziz Abdirisak 4/24/25 
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("Abdulaziz");
        lst.add("Abdirisak");
        lst.add("Mike");
        lst.add("Abdulaziz");
        lst.add("Mike");
        lst.add("Abdirisak");
        Set<String> hashlst = new HashSet<>(lst);
        System.out.println(hashlst);


    }
}
