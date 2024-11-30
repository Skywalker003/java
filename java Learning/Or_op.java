import java.util.Scanner;

public class Or_op {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String organisation = sc.next();

        if(organisation.equalsIgnoreCase("zoho")  || organisation.equalsIgnoreCase("guvi")){
            System.out.println("you are permitted");
        }else{
            System.out.println("you are not permitted");
        }
    }
}
