package loops;

public class FactorialNumber {
    public static void main(String[] args) {
        int n =5;
        int res=1;
        while(n>0){
            res=res*n;
            n= n-1;
        }
        System.out.println(res);

    }
}
