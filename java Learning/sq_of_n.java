import java.util.Scanner;

public class sq_of_n {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("till what sq number do u want to print");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0 ; i<n ; i++){
            arr[i] = (i+1) * (i+1);
        }

        for (int i = 0 ; i<n ; i++){
            System.out.println(arr[i]);
        }
    }
}
