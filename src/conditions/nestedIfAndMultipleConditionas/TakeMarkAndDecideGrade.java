package conditions.nestedIfAndMultipleConditionas;

public class TakeMarkAndDecideGrade {
    public static void main(String[] args) {

        int m=80;
        if(m>=0 && m<= 20){
            System.out.println("F");
        } else if (m>20 && m<=40) {
            System.out.println("D");

        }
        else if (m>40 && m<= 60){
            System.out.println("C");
        } else if (m>60 && m<= 80) {
            System.out.println("B");

        }
        else {
            System.out.println("A");
        }

        }
    }

