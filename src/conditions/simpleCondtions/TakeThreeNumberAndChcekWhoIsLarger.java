package conditions.simpleCondtions;

public class TakeThreeNumberAndChcekWhoIsLarger {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        int c=15;
        if(a>b && a>c){
            System.out.println("A is larger");
        } else if (b>a && b>c) {
            System.out.println("B is larger");
        }
        else {
            System.out.println("C is larger");
        }
    }
}
