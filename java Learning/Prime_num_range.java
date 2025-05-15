public class Prime_num_range {
    public static void main(String[] args) {
        int low = 2;
        int high = 10;

        for (int i = low; i <= high; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    static boolean isPrime(int n){
        if(n<2){
            return false;
        }

        for(int i = 2 ; i<n ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
