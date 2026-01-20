package conditions.nestedIfAndMultipleConditionas;

public class TakeTheHourAndPrintMoringAfterNoonAndEveningAndGoodNight {
    public static void main(String[] args) {
        int h = 3;
        if (h >= 5 && h <= 11) {
            System.out.println("Good Morning!!");
        } else if (h > 11 && h <= 15) {
            System.out.println("Good AfterNoon");
        } else if (h>=15 && h<21){
            System.out.println("Good Evening!!");
        } else if (h>21 && h<=23) {
            System.out.println("Good night");
        }
        else {
            System.out.println("Night Time");
        }
    }
}
