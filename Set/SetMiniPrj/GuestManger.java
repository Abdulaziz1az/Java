import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

public class GuestManger {
    public static void main(String[] args) {
        Set<String> RSVP = new HashSet<>();
        Set<String> Attendance = new HashSet<>();

        RSVP.add("Mike");
        RSVP.add("Abdulaziz");
        RSVP.add("John");
        RSVP.add("Adam");

        Attendance.add("Abdulaziz");
        Attendance.add("John");
        Attendance.add("Abdirisak");
        Attendance.add("Sara");

        Set<String> UnexpectedGuest = new HashSet<>(Attendance);
        Set<String> PerfectGuest = new HashSet<>(RSVP);
        Set<String>DidNotShowUpGuest = new HashSet<>(RSVP);
        UnexpectedGuest.removeAll(RSVP);
        PerfectGuest.retainAll(Attendance);
        DidNotShowUpGuest.removeAll(Attendance);

        System.out.println("Did't Show Up: " + DidNotShowUpGuest);
        System.out.println("Unexpected Guests: " + UnexpectedGuest);
        System.out.println("Prefect Guests: "  + PerfectGuest);


    }
}
