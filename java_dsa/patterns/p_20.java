public class p_20 {
    public static void main(String[] args) {
        int n =5;

        for(int i=1 ;i<=n*2-1 ;i++){

            int space = i<n ? n*2-i*2 : i%n*2 ;
            int star = i<n ? i : n-(i%n);
            for(int j=0 ;j<star ;j++){
                System.out.print("*");
            }
            
            for(int k=0 ;k<space ;k++){
                System.out.print("-");
            }

            for(int j=0 ;j<star ;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
