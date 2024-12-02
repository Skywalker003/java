import java.util.Scanner;

public class rev_arr {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arr size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the arr values");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int[] rev = new int[n];
        for (int i = n-1 ; i>=0 ; i--){
            rev[n-1-i] = arr[i];
        }
        /*
        for (int i = 0; i < n; i++) {
            rev[i] = arr[n - 1 - i]; // Copy elements from end of the original array
        }
         */

        for (int i = 0 ; i<n ; i++){
            System.out.print(" " +rev[i]);
        }
    }
}
