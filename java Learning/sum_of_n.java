//for loop
/*
public class sum_of_n {
    public static void main(String[] args){
        int num = 10;
        int sum = 0;
        for (int i = 1; i <= num ; i++) {
            sum += i;
        }
        System.out.println("sum of n natural number is " + sum);
    }
}
*/

// sum of n natural formula
/*
public class sum_of_n {
    public static void main(String[] args){
        int num = 11;

        int sum = num*(num+1)/2;
        System.out.println("sum of n natural number is " + sum);
    }
}
*/

// recursive
public class sum_of_n {
    public static void main(String[] args){
        int num = 10;
        int sum = getSum(num);

        System.out.println("sum of n natural number is " + sum);
    }
    static int getSum(int num){
        if(num==0){
            return num;
        }else {
            return num + getSum(num-1);
        }
    }
}