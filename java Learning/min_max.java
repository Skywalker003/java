import java.util.Scanner;

public class min_max {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the arr");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the arr values");

        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0 ; i < n ; i++){
            if (max<arr[i]){
                max = arr[i];
            }
            if (min>arr[i]){
                min = arr[i];
            }
        }

        System.out.println("the min value  is : " + min + " and the max value is : " + max);
    }
}
