package conditions.simpleCondtions;

public class TakeTheTempratureValueAndChcekColdWarmAndHot {
    public static void main(String[] args) {
        int temp=-1;
        if(temp<=15){
            System.out.println("cold");
        } else if (temp>15 && temp<=30) {
            System.out.println("warm");

        }
        else {
            System.out.println("hot");
        }
    }
}
