//for loop
/*
public class sum_of_n_in_range {
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        int sum = 0;
        for (int i = a; i <=b ; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }
}
*/

//using formula n*(n+1)/2
/*
public class sum_of_n_in_range {
    public static  void main(String[] args){
        int a = 2;
        int b = 5;
        int sum = b*(b+1)/2 - (a+1)*a/2 + a;

        System.out.println("sum of num in given range are " + sum );

    }
}
 */

//recursion

public class sum_of_n_in_range {
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        int sum = getSum(0,a,b);

        System.out.println("sum of num in given range " + sum);
    }

    static int getSum(int sum , int a , int b){
        if (a>b){
            return sum;
        }
        else {
            return a + getSum(sum, a+1, b);
        }
    }
}