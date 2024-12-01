import java.util.Scanner;

public class avg_mark {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        int sum = 0;

        System.out.println("Enter the marks of " + n + " students:");
        for (int i = 0 ; i < n ; i++){
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
        double avg = (double) sum /n;
        System.out.println("the avg mark is " + avg);
    }
}
