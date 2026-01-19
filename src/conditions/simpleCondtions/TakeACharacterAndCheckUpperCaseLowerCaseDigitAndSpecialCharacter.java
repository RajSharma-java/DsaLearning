package conditions.simpleCondtions;

public class TakeACharacterAndCheckUpperCaseLowerCaseDigitAndSpecialCharacter {
    public static void main(String[] args) {
        char ch='/';

        if(ch>='A' && ch<='Z'){
            System.out.println("UpperCase");
        } else if (ch >= 'a' && ch<='z'){
            System.out.println("LowerCase");
        } else if (ch>='0' && ch<='9') {
            System.out.println("Digit");
        }
        else {
            System.out.println("Special Character");
        }
    }
}
