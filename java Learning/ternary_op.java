import java.util.Scanner;

public class ternary_op {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = (num % 2 == 0)? "it is even" : "it is odd";
        System.out.println(result);
    }
}
