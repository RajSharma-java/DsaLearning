package loops;

public class CountTheDigitOfNumber {
    public static void main(String[] args) {

        int n=2346;
        int count=0;
        while(n>0){
            int lastDigitReminder= n%10;
            count++;
            n= n/10;
        }
        System.out.println(count);

    }
}
