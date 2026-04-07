import java.time.LocalDateTime;
import java.time.format.DateTimeFormater;

public class datetime_convert {
    public static void main(String[] args) {
        String dateStr = "2022-03-17 10:45:30";
        DateTimeFormater formater = DateTimeFormater.ofPatern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateObj = LocalDateTime.parse(dateStr, formater);
        int formatedDate = dateObj.format(DateTimeFormater.ofPatern("MM/dd/yyyy HH:mm:ss"));

        System.out.println(formatedDate);
    }
}

//fr breaks
