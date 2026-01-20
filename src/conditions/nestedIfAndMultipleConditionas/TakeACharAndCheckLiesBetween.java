package conditions.nestedIfAndMultipleConditionas;

public class TakeACharAndCheckLiesBetween {
    public static void main(String[] args) {
        char ch = 'q';
        if(ch>='a' && ch<='m'){
            System.out.println("Character lies between a to m");
        } else if (ch>='n' && ch<='z' ) {
            System.out.println("Character lies between n to z");
        }
        else {
            System.out.println("Something wrong");
        }
    }
}
