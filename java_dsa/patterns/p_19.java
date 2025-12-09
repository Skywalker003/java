public class p_19 {
    public static void main(String[] args) {
        int n = 5;
        
        for(int i=0;i<n*2;i++){
            int space = i<n ? i*2 : (n*2-i-1)*2;
            int star = i<n ? n-i : i%n +1;
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            for(int k=0;k<space;k++){
                System.out.print("-");
            }
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
