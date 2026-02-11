package mathAndNumberLogic;

public class MultipleOf7andLastDigitIs7 {
    public static void main(String[] args) {
        int n=427;
        int lastDigit=0;
        int num= n%10;
        lastDigit=+num;

        int rem=n%7;

        if(rem==0 && lastDigit==7){
            System.out.println("Number is the multiple of 7 and last digit is 7");
        }
        else {
            System.out.println("not multiple");
        }


    }


}
