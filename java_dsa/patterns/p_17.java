public class p_17 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){

            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }

            for(char k='A';k<'A'+i;k++){
                System.out.print(k);
            }
            for(char k=(char)('A'+i-2);k>='A';k--){
                System.out.print(k);
            }

            System.out.println();
        }
    }
}
