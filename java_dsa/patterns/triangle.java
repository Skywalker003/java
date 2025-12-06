public class triangle {
    public static void main(String[] args){
        int n = 5;
        // int c =1;
        for (int i = 0 ; i<n ; i++){
            for (int j = 0 ; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k = 0 ; k<2*i+1 ; k++){ //k<c
                System.out.print("*");
            }
            //c+=2;
            System.out.println("");
        }
    }
}
