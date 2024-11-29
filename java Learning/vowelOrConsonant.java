import java.util.Scanner;

public class vowelOrConsonant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);

        switch (letter){
            case 'a','e','i','o','u':
                System.out.println("it is a vowel");
                break;
            default:
                System.out.println("it is a consonant");
        }
    }
}
