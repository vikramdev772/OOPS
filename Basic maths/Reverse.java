import java.lang.reflect.Array;
import java.util.Arrays;

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
            char a[] = {1,2,3,4};
            System.out.println("\n\t Array : "+Arrays.toString(a));
            rev(a);

        }    
        public static void rev(char[] arr) {
            char s=0,e=arr.length;
            for(int i=0;i<e;i++){
                char temp=arr[i];
                arr[i]=arr[e];
                arr[e]=temp;
                e--;
            }
            System.out.println("\n\t Reverse : "+arr);
            
            
        }
}

                    // output:

                    //     Reverse Number


                    //     The num : 678

                    //     Reverse num : 876



                    output:

                     Reverse num : 876

         Array : [☺, ☻, ♥, ♦]
                        