import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int current;

        do {
            current = sc.nextInt();
            sum += current;
        } while (current >= 0);

        System.out.println("sum of all num 1" + sum);
    }
}