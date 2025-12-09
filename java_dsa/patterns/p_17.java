public class p_17 {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){

            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            /*
            for(char k='A';k<'A'+i;k++){
                System.out.print(k);
            }
            for(char k=(char)('A'+i-2);k>='A';k--){
                System.out.print(k);
            }
            */
           char ch = 'A';
           int bp = ((i*2)+1)/2;
            for(int k=1;k<=i*2+1;k++){
                System.out.print(ch);
                if(k<=bp){
                    ch++;
                }else{
                    ch--;
                }
            }
            System.out.println();
        }
    }
}
