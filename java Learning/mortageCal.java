import java.util.*;
import java.text.*;

public class mortageCal {
    public static void main(String[] args){
        //int p = 10000;
        final byte months_in_year = 12;
        final  byte percent =100;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the principle: ");
        int principle = sc.nextInt();

        System.out.println("enter the rate of interest");
        float annual_interest = sc.nextFloat();
        float monthly_interest = annual_interest/percent/months_in_year;

        System.out.println("enter the number of years");
        int no_of_year = sc.nextInt();
        int no_of_month = no_of_year*months_in_year;

        float mortgage = (float) (principle * ((monthly_interest * Math.pow(1 + monthly_interest, no_of_month)) / (Math.pow(1 + monthly_interest, no_of_month) - 1)));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("the mortgage is " + mortgageFormatted);
    }
}
