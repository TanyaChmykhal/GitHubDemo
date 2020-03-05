import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public enum Season {
        AUTUMN, SPRING, SUMMER, WINTER
    }
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String month = reader.readLine();

        switch (month) {
            case "December":
            case "January":
            case "February":
                Season season;
                season = Season.WINTER;
                System.out.println(season);
                break;
            case "March":
            case "April":
            case "May":
                season = Season.SPRING;
                System.out.println(season);
                break;
            case "June":
            case "Jule":
            case "August":
                season = Season.SUMMER;
                System.out.println(season);
                break;
            case "September":
            case "October":
            case "November":
                season = Season.AUTUMN;
                System.out.println(season);
                break;
            default:
                System.out.println("No this month");
        }
    }
}
