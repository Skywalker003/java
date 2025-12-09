public class p_20 {
    public static void main(String[] args) {
        int n =5;
        //int space =n*2-2

        for(int i=1 ;i<=n*2-1 ;i++){

            int space = i<n ? n*2-i*2 : i%n*2 ; // space -=2 : space+=2;
            int star = i<n ? i : n-(i%n);//2*n-i
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
