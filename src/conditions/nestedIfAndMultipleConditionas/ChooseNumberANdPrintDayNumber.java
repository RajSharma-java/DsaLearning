package conditions.nestedIfAndMultipleConditionas;

public class ChooseNumberANdPrintDayNumber {
    public static void main(String[] args) {
        int n = 12;
        if (n == 1) {
            System.out.println("Sunday");
        }
        else  if (n == 2) {
            System.out.println("Monday");
        }
        else if (n == 3) {
            System.out.println("Tuesday");
        }
        else if (n == 4) {
            System.out.println("Wednesday");
        }
        else  if (n == 5) {
            System.out.println("Thursday");
        }
        else  if (n == 6) {
            System.out.println("Friday");
        }
        else  if (n == 7) {
            System.out.println("Saturday");
        }
        else{
            System.out.println("Choose number lies between 1 to 7");
        }
    }
}

