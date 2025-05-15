/*
import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int sum =0;


        while (num!=0){
            sum+=num%10;
            num=num/10;
        }
        System.out.println("the sum of digits is "+ sum);
    }
}
 */

/*
import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num =sc.nextInt();
        int sum =SumOfNum(num);

        System.out.println("the sum of digits is "+ sum);

    }

    static int SumOfNum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + SumOfNum(n/10);
    }
}

 */

/*
import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num =sc.nextInt();
        int sum =0;

        System.out.println("the sum of digits is "+ SumOfNum(num,sum));

    }

    static int SumOfNum(int n, int sum){
        if(n==0){
            return sum;
        }
        sum +=n%10;
        return SumOfNum(n/10,sum);
    }
}
*/

import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        String num =sc.next();
        int sum =0;

        System.out.println("the sum of digits is "+ SumOfNum(num));

    }

    static int SumOfNum(String num){
        int sum =0;
        for(int i =0;i<num.length();i++){
            sum=sum + num.charAt(i)-48;
        }
        return sum;
    }
}
