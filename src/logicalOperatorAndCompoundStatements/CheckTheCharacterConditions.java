package logicalOperatorAndCompoundStatements;

public class CheckTheCharacterConditions
{
    public static void main(String[] args) {
        char ch='1';
        if(ch>='a' && ch<='a' || ch>='A' && ch<='Z'){
            System.out.println("letter");
        } else if (ch>='0' && ch<='9') {
            System.out.println("digit");

        }
        else {
            System.out.println("neither");
        }
    }

}
