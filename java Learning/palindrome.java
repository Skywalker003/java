
/*import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        String rev = sb.toString();

        if (rev.equalsIgnoreCase(str)){
            System.out.println("it is palindrome");
        }else {
            System.out.println("it is not a palindrome");
        }
    }
}

 */

import java.util.*;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the num");
        int num = sc.nextInt();

        int rev = 0;
        int res = get_rev(num,rev);
        String isPalindrome = (check_rev(num,res))?"it is palindrome" : "it is not a palindrome";
        System.out.println(res);
        System.out.println(isPalindrome);

    }
    static int get_rev(int num,int rev){
        if(num==0){
            return rev;
        }
        int rem = num % 10;
        rev = rev * 10 +rem;
        return get_rev(num/10,rev);
    }
    static boolean check_rev(int num,int res){
        return num == res;
    }
}