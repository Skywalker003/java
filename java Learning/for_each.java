import java.util.Scanner;

public class for_each {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        boolean found = false;

        System.out.println("Enter the key value");
        int key = sc.nextInt();

        for (int num : arr){

            if (num==key){
                found = true ;
                break;
            }
        }
        if (found){
            System.out.println("key is found");
        }else {
            System.out.println("key is not found");
        }
    }
}
