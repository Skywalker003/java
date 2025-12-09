public class p_22 {
    public static void main(String[] args) {
        int n=4;
        for(int i = 0;i<n*2-1 ; i++){
            
            for(int j =0; j<n*2-1;j++){
                int top= i;
                int left = j;
                int right = n*2-2-j;
                int bottom = n*2-2-i;
                
                System.out.print(n-Math.min(Math.min(top,bottom),Math.min(right,left)));
            }
            System.out.println();
        }
    }
}
