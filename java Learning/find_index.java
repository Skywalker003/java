import java.util.Scanner;

public class find_index {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the arr length");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int index = -1;

        System.out.println("Enter the key value");
        int key = sc.nextInt();

        System.out.println("Enter the arr values");
        for (int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0 ; i<n ; i++){

            if (arr[i]==key){
                index = i ;
                break;
            }
        }
        System.out.println("the index of key value is " + index);
    }
}
