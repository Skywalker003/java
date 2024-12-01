public class random {
    public static void main(String[] args){
        int i = 0;
        while (i >= 0){
            int randomnum = (int) (Math.random() * 10 + 1);
            if (randomnum == 5 ) {
                break;
            }
            if (randomnum % 4 == 0){
                System.out.print("  hehe");
                continue;
            }

            System.out.print(" " + randomnum);
        }
    }
}
