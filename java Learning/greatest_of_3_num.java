//else if
/*
public class greatest_of_3_num {
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        int c = 15;

        if (a>b && a>c){
            System.out.println("greatest num is " + a);
        } else if (b>a && b>c) {
            System.out.println("greatest num is " + b);
        } else if (c>a && c>b) {
            System.out.println("greatest num is " + c);
        } else {
            System.out.println("all three are equal");
        }
    }
}
*/

//ternary
/*
public class greatest_of_3_num {
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        int c = 15;
        int greatest;
        int result;



        if (a == b && b == c){
            System.out.println("all three are equal");
        }
        else{
            greatest = a>b ? a : b;
            result = c>greatest ? c : greatest ;
            System.out.println(result + " is the greatest num");
        }
    }
}
*/


// in-built math function

public class greatest_of_3_num {
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        int c = 15;

        if (a == b && b == c){
            System.out.println("all three are equal");
        }
        else{
            int greatest = Math.max(a,b);
            int result = Math.max(greatest,c);
            System.out.println(result + " is the greatest num");
        }
    }
}