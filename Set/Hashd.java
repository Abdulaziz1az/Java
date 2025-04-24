import java.util.HashSet;
import java.util.Set;

public class Hashd {
    public static void main(String[] args) {
        Set<String> h = new HashSet<>();
        
        h.add("Apple");
        h.add("Banana");
        h.add("Apple");
        System.out.println(h);
    }
}
