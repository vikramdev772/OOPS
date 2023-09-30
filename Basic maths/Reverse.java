public class Reverse {
        public static void main(String[] args) {
            System.out.println("\n\t Reverse Number \n");
            int n=678;
            System.out.println("\n\t The num : "+n);
            int rev=0;
            while(n>0){
                int ld=n%10;
                rev=(rev*10)+ld;// rev=0*10+ld ==> rev=ld*10+newLd;
                n=n/10;
            }
            System.out.println("\n\t Reverse num : "+rev);
        }    
}

