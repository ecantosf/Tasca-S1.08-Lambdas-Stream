package lambdassteam;

import java.util.Arrays;
import java.util.List;

public class DataGenerator {

    public static List<String> getCountriesList() {
        return Arrays.asList(
                "Congo", "France", "Germany", "Haiti", "Jordan",
                "Korea", "Morocco", "Portugal", "Slovakia", "Sweden"
        );
    }

    public static List<String> getMonthList() {
        return Arrays.asList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        );
    }

    public static List<Object> getMixedList() {
        return Arrays.asList(42, "Hi", 7, "World", "Java", 123, "Programming");
    }

    public static String getstringToReverse() {
        return "catala";
    }

}
