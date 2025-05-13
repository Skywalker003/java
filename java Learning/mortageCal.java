import java.util.*;
import java.text.*;

public class mortageCal {
    public static void main(String[] args){
        //int p = 10000;
        final byte months_in_year = 12;
        final  byte percent =100;
        int principle;
        float annual_interest;
        float monthly_interest;
        int no_of_year;
        int no_of_month;

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("enter the principle: ");
            principle = sc.nextInt();
            if(principle>=1000 && principle<=1_000_000){
                break;
            }
            System.out.println("enter the principle between 1000 and 1,000,000");
        }

        while (true) {
            System.out.println("enter the rate of interest");
            annual_interest = sc.nextFloat();
            if(annual_interest>=1 && annual_interest<=30){
                monthly_interest = annual_interest / percent / months_in_year;
                break;
            }
            System.out.println("enter the interest betwwen 1 and 30");
        }

        while(true) {
            System.out.println("enter the number of years");
            no_of_year = sc.nextInt();
            if(no_of_year>=1 && no_of_year<=30){
                no_of_month = no_of_year * months_in_year;
                break;
            }
            System.out.println("enter the number of years between 1 and 30");
        }

        float mortgage = (float) (principle * ((monthly_interest * Math.pow(1 + monthly_interest, no_of_month)) / (Math.pow(1 + monthly_interest, no_of_month) - 1)));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("the mortgage is " + mortgageFormatted);
    }
}
