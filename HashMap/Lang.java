import java.util.HashMap;
import java.util.Map;

public class Lang {
    public static void main(String[] args) {
        Map<String, String> l = new HashMap<>();
        l.put("Java", "James Gosling");
        l.put("JavaScript", "Brednan Eich");
        l.put("C", "Danis Ritchie");

        // l.containsKey("Java");
        // l.remove("C");
        // l.get("Python");
        
        // for(String lang: l.keySet())
        // {
        //     System.out.println(lang + " " + l.get(lang));
        // }
        if(l.containsKey("Java"))
        {
            System.out.println("java is in the map");
        }
        l.remove("C");
        System.out.println("\"C\" was removed.");

        String creator = l.get("python");
        if(creator == null)
        {
            System.out.println("Pthon is not in the map.");
        } else{
            System.out.println("Python was created by " + creator);
        }

             for(String lang: l.keySet())
        {
            System.out.println(lang + " " + l.get(lang));
        }

    }
}
