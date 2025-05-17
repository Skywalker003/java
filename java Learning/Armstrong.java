
/*
public class Armstrong {
    public static void main(String[] args){
        int num=407;
        int temp = num;
        int sum = 0;
        int rem;

        while (temp!=0){
            rem = temp % 10;
            sum = sum +(int) Math.pow(rem,String.valueOf(num).length());
            temp/=10;
        }
        String res = (num==sum)? " is armstrong":" is not a armstrong";
        System.out.println(num + res);
    }
}
 */

public class Armstrong {
    public static void main(String[] args){
        int num=407;
        int temp = num;
        int sum = 0;
        int res = isArmstrong(num,sum,temp);
        String check = (num==res)? " is armstrong":" is not a armstrong";
        System.out.println(num + check);
    }

    static int isArmstrong(int num,int sum,int temp){
        if (temp==0){
            return sum;
        }
        int rem = temp % 10;
        sum = sum +(int) Math.pow(rem,String.valueOf(num).length());

        return isArmstrong(num,sum,temp/10);
    }
}
