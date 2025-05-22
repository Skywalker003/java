/*
public class factorial {
    public static void main(String[] args){
        int num=5;
        int sum=1;
        for (int i=1;i<=num;i++){
             sum*=i;
        }
        System.out.println(sum);
    }
}
 */
public class factorial {
    public static void main(String[] args){
        int num=5;
        int sum=1;
        int res=getFact(num,sum,1);
        System.out.println("fact is "+res);

        }
    static int getFact(int num,int sum,int i){
        if (i>num){
            return sum;
        }
        sum*=i;
        return getFact(num,sum,i+1);
    }
}