package mathAndNumberLogic;

public class PerfectSquare {

    public static void main(String[] args) {
        int n=4;
        boolean isPrefect=false;

        for(int i=1; i<=n; i++){
            if(i*i==n){
              isPrefect=true;
              break;
            }
            else {
            isPrefect=false;

            }

        }
        if(isPrefect){
            System.out.println("perfect");
        }
        else {
            System.out.println("not perfect");
        }
    }
}
