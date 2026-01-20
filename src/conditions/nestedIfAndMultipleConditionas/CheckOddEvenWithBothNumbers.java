package conditions.nestedIfAndMultipleConditionas;

public class CheckOddEvenWithBothNumbers {
    public static void main(String[] args) {
        int a=13;
        int b=20;
        if(a%2==0 && b%2==0){
            System.out.println("Even 1");
        } else if (a%2!=0 && b%2!=0) {
            System.out.println("Odd 1");
        } else if (a%2==0 || b%2==0) {
            System.out.println("One is odd and one is Even");
        }
    }
}
