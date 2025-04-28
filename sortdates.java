import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SortDates {
    public static void main(String[] args) {
        List<String> dates = Arrays.asList(
            "28-04-2025",
            "15-03-2022",
            "01-01-2024",
            "05-05-2021"
        );

        List<Date> dateList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        // Parse the dates
        for (String dateStr : dates) {
            try {
                Date date = sdf.parse(dateStr);
                dateList.add(date);
            } catch (ParseException e) {
                System.out.println("Invalid date format: " + dateStr);
            }
        }

        // Sort the dates
        Collections.sort(dateList);

        // Print sorted dates
        System.out.println("Sorted dates:");
        for (Date date : dateList) {
            System.out.println(sdf.format(date));
        }
    }
}