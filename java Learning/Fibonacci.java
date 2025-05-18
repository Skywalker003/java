
/*
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        int prev=0;
        int cur=1;
        int next;

        System.out.print(prev+" "+cur+ " ");

        for (int i =2;i<=num;i++){
            next=prev+cur;
            prev=cur;
            cur=next;
            System.out.print(next+" ");
        }
    }
}

 */

/*
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num =sc.nextInt();
        int prev=0;
        int cur=1;
        int next=0;

        System.out.print(prev+","+cur);
        get_fibonacci(num-2,prev,cur,next);
    }

    static void get_fibonacci(int num,int prev,int cur,int next){
        if (num>0){
            next=prev+cur;
            prev=cur;
            cur=next;
            System.out.print(","+next);
            get_fibonacci(num-1,prev,cur,next);
        }
    }
}
*/


import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        get_fibonacci(n);

    }
    static void get_fibonacci(int n){
        int f[] = new int[n+1];
        f[0]=0;
        f[1]=1;
        System.out.print(f[0]+","+f[1]);

        for (int i =2;i<n;i++){
            f[i]=f[i-1] + f[i-2];
            System.out.print(","+ f[i]);
        }
    }
}
