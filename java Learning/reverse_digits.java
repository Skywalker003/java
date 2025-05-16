
/*
import java.util.Scanner;

public class reverse_digits {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int rem =0;
        int reverse = 0;

        while (num!=0){
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num/=10;
        }
        System.out.println(reverse);
    }
}
*/

/*
import java.util.Scanner;

public class reverse_digits {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int rem =0;
        int reverse = 0;


        for(;num!=0;num/=10){
            rem = num % 10;
            reverse = reverse * 10 + rem;
        }
        System.out.println(reverse);
    }
}

 */

/*
import java.util.Scanner;

public class reverse_digits {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int rem =0;
        int reverse = 0;
        System.out.println("the reversed numbers are "+ rev_num(num,reverse));

    }
    static int rev_num(int n,int rev){
        if(n==0) {
            return rev;
        }
        int rem = n % 10;
        rev = rev * 10 + rem;
        return rev_num(n / 10,rev);
    }
}

 */

/*

import java.util.Scanner;

public class reverse_digits {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        rev_num(num);

    }
    static void rev_num(int n){
        if(n==0) {
            return ;
        }
        int rem = n % 10;
        System.out.print(rem);
        rev_num(n / 10);
    }
}

 */

import java.util.Scanner;

public class reverse_digits {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        boolean isNegative = num<0?true:false;
        if (isNegative){
            System.out.print("-");
            num= num * -1;
        }
        rev_num(num);

    }
    static void rev_num(int n){
        if(n==0) {
            return ;
        }
        int rem = n % 10;
        System.out.print(rem);
        rev_num(n / 10);
    }
}

