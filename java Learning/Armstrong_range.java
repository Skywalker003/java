/*
import java.util.Scanner;

public class Armstrong_range {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number range");
        System.out.print("Low:");
        int low =sc.nextInt();
        System.out.print("High:");
        int high =sc.nextInt();

        for (int i=low;i<=high;i++){
            int temp = i;
            int sum = 0;
            int digits = String.valueOf(i).length();
            while (temp!=0){
                int rem = temp % 10;
                sum += (int) Math.pow(rem,digits);
                temp/=10;
            }
            if (i==sum){
                System.out.print(i + " ");
            }
        }

    }
}
 */

import java.util.*;
public class Armstrong_range {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number range");
        System.out.print("Low:");
        int low =sc.nextInt();
        System.out.print("High:");
        int high =sc.nextInt();

        for (int i=low;i<=high;i++){
            int temp = i;
            int sum = 0;
            int digits = String.valueOf(i).length();
            int res = isArmstrong(i,sum,temp,digits);

            if (i==res){
                System.out.print(i + " ");
            }
        }

    }

    static int isArmstrong(int num,int sum,int temp,int digits){
        if (temp==0){
            return sum;
        }
        int rem = temp % 10;
        sum = sum +(int) Math.pow(rem,digits);

        return isArmstrong(num,sum,temp/10,digits);
    }
}
