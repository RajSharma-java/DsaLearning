package conditions.simpleCondtions;

public class TakeTheCharacterIsVowelOrNot {
    public static void main(String[] args) {
        char ch='k';
        if(ch=='a' || ch=='A' || ch=='i' || ch=='I' || ch=='e' || ch =='E' || ch=='o' || ch=='O'
        || ch=='u' || ch=='U'
        ){
            System.out.println("vowel");
        }
        else {
            System.out.println("constant");
        }
    }
}
