package GetDateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD-MM-YYYY HH:mm:ss.SSS");
        String formattedDate = d.format(formatter);

        System.out.println("Current Date Time is: ");
        System.out.println(formattedDate);
    }
}
