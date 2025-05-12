public class FizzBuzz {
    public static void main(String[] args){
        int number= 2;
        if(number%5==0 && number%3==0){
            System.out.println("FizzBuzz");
        } else if (number%3==0) {
            System.out.println("Buzz");
        } else if (number%5==0) {
            System.out.println("Fizz");
        }else {
            System.out.println(number);
        }
    }
}
