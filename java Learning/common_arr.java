import java.util.ArrayList;
import java.util.Scanner;

public class common_arr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size for first arr");
        int a_size =sc.nextInt();

        int[] a = new int[a_size];

        System.out.println("Enter the size for second arr");
        int b_size =sc.nextInt();

        int[] b = new int[b_size];

        System.out.println("Enter the values for first arr");
        for (int i = 0;i < a_size ; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the values for second arr");
        for (int i = 0;i < b_size ; i++){
            b[i] = sc.nextInt();
        }

        ArrayList<Integer> result = new ArrayList<>();
        for( int i = 0 ; i<a_size ; i++){
            for (int j = 0 ; j<b_size ; j++){
                if (a[i] == b[j]){
                    result.add(a[i]);
                }
            }
        }

        for (int common : result){
            System.out.println("common values are " + common);
        }
    }
}
