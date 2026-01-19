package conditions.nestedIfAndMultipleConditionas;

public class CheckOneOfTwoNumberIsMultipleOrNot {
    public static void main(String[] args) {
        int a=20;
        int b=15;
        boolean t= false;
        if(a%b==0 || b% a==0){
            t=true;
        }
        else {
            t= false;
        }
        System.out.println(t);

    }
}
