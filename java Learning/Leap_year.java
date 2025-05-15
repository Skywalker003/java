/*
import java.util.*;
public class Leap_year {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the year");
     int year=sc.nextInt();
     if(year%400==0){
         System.out.println("it is a leap year");
     }else if (year%4==0 && year%100!=0){
         System.out.println("it is a leap year");
     }else {
         System.out.println("it is not a leap year");
     }
    }
}
*/

/*
import java.util.*;
public class Leap_year {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int year=sc.nextInt();
        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println("it is a leap year");
        }else {
            System.out.println("it is not a leap year");
        }
    }
}
 */

/*
import java.util.*;
public class Leap_year {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int year=sc.nextInt();

        String res = (year%400==0 || (year%4==0 && year%100!=0))?"it is a leap year":"it is not a leap year";
        System.out.println(res);
    }
}
 */

import java.util.*;
public class Leap_year {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int year=sc.nextInt();

        String res = (year%400==0 || (year%4==0 && year%100!=0))?"it is a leap year":"it is not a leap year";
        System.out.println(res);
    }
}