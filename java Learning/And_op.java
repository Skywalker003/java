import java.util.Scanner;

public class And_op {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String citizenship = sc.next();

        if(age > 18 && citizenship.equalsIgnoreCase("indian")){
            System.out.println("you are elegible to vote");
        }else{
            System.out.println("you are not elegible to vote");
        }
    }
}
