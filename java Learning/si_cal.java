import java.util.*;
public class si_cal {

    public static void main(String[] args){
       /* int p = 100;
        int r = 5;
        int t = 2;*/

        Scanner sc = new Scanner (System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        int si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
    }
}
