package loops;

public class CheckPalindromeNumber {
    public static void main(String[] args) {
        int n=123;
        int originalNumber=n;
        int rev=0;
        while(n>0){
            int lastDigit= n%10;
            rev= rev *10+ lastDigit;
            n=n/10;
        }
        if(rev==originalNumber){
            System.out.println("Number is the palindrome");
        }
        else{
            System.out.println("No is not palindrome");
        }
    }
}
