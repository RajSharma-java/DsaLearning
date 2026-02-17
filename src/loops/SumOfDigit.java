package loops;

public class SumOfDigit {
    public static void main(String[] args) {
        int n=123;
        int sum=0;
        while(n>0){
            int lastDigit= n%10;
            sum+=lastDigit;
            n=n/10;
        }
        System.out.println("sum of "+n+"number is= "+ sum);
    }
}
