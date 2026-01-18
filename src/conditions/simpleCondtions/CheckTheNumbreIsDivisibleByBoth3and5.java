package conditions.simpleCondtions;

public class CheckTheNumbreIsDivisibleByBoth3and5 {
    public static void main(String[] args) {
        int n=12;
        boolean t=false;
        if(n%3==0 && n%5==0){
            t=true;
        }
        System.out.println(t);
    }
}
