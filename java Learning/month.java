import java.util.Scanner;

public class month {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month){
            case 1:
                System.out.println("jan 31 days");
                break;
            case 2:
                System.out.println("feb 28 days");
                break;
            case 3:
                System.out.println("mar 31 days");
                break;
            case 4:
                System.out.println("apr 30 days");
                break;
            case 5:
                System.out.println("may 31 days");
                break;
            case 6:
                System.out.println("jun 30 days");
                break;
            case 7:
                System.out.println("jul 31 days");
                break;
            case 8:
                System.out.println("aug 31 days");
                break;
            case 9:
                System.out.println("sep 30 days");
                break;
            case 10:
                System.out.println("oct 31 days");
                break;
            case 11:
                System.out.println("nov 30 days");
                break;
            case 12:
                System.out.println("dec 31 days");
                break;
            default:
                System.out.println("the month num should be 1 to 12");
        }
    }
}
