/*
import java.util.Scanner;

public class Prime_num {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int count = 0;

        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;
            }
        }

        if(count==2){
            System.out.println("it is a prime number");
        }else {
            System.out.println("it is not a prime number");
        }
    }
}
 */

/*
import java.util.Scanner;

public class Prime_num {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        boolean isPrime = true;

        if(num<2){
            System.out.println("it is not a prime number");
        }
        else{
            for(int i=2; i<num; i++){ //i<=num/2 is more efficient , i<=Math.sqrt(num) is much more efficient
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }

            String res = isPrime?"it is a prime number":"it is not a prime number";
            System.out.println(res);
            }
    }
}
 */

import java.util.Scanner;

public class Prime_num {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int i = 2;
        boolean isPrime = checkPrime(num,i);

        String res = isPrime?" is prime": " is not prime";
        System.out.println(num + res);

        }

        public static boolean checkPrime(int num,int i){
            if(num<2){
                return false;
            }
            if(num==i){
                return true;
            }
            if(num%i==0){
                return false;
            }

            i+=1;
            return checkPrime(num,i);
    }
}