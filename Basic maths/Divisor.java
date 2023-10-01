public class Divisor {
    public static void main(String[] args) {
        System.out.println("\n\t Print all Divisiors \n");
        int n=9;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i);
                if((n/i)!=1){
                    System.out.print(n/i);
                }
            }

        }
    }
}



