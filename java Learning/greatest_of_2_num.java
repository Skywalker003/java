//else if
/*
public class greatest_of_2_num {
    public static void main(String[] args){
        int a = 5;
        int b = 10;

        if (a>b){
            System.out.println("greatest num is " + a);
        } else if (a<b) {
            System.out.println("greatest num is " + b);
        }
        else {
            System.out.println("both are equal");
        }
    }
}
*/

//ternary
/*
public class greatest_of_2_num {
    public static void main(String[] args){
        int a = 5;
        int b = 10;

        if (a == b){
            System.out.println("both are equal");
        }
        else{
            int greatest = a>b ? a : b ;
            System.out.println(greatest);
        }

    }
}
*/

// in-built math function
public class greatest_of_2_num {
    public static void main(String[] args){
        int a = 5;
        int b = 10;

        if (a == b){
            System.out.println("both are equal");
        }
        else{
            System.out.println(Math.max(a,b) + " is greater");
        }

    }
}