package conditions.nestedIfAndMultipleConditionas;

public class CheckTheValidTriangle {
    public static void main(String[] args) {

        CheckTheValidTriangle ch= new CheckTheValidTriangle();

        System.out.println( ch.checkValid(1,2,3));
    }

    public boolean checkValid(int a, int b, int c){
        if(a+b> c && a +c> b && b+c > a){
             return  true;
        }
        else {
            return  false;
        }
    }
}

