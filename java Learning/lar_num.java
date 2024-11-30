import java.util.Scanner;

public class lar_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            int current = sc.nextInt();
            largest = Math.max(current,largest);
        }
        System.out.println(largest);
    }
}
