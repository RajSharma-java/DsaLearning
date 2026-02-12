package loops;

public class ProductOfDigit {
    public static void main(String[] args) {
        int n=45;
        int res=1;

        while (n>0){
            int lastDigit= n%10; // getting reminder
            res= res* lastDigit;
            n= n/10; // remove last digit
        }
        System.out.println(res);
    }
}
