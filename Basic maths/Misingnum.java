import java.lang.reflect.Array;
import java.util.Arrays;

public class Misingnum {
    public static void main(String[] args) {
        System.out.println("\n\t Find the missing number in array \n");
        int arr[]={1,3,4,5};
        int sum=0;
        System.out.print("\n\t Array : [ ");
        for(int elements : arr){
            System.out.print("\t"+elements);
            sum+=elements;

        }
        System.out.print(" ]\n");
        // for(int i=0;i<arr.length;i++){
        //     sum+=i;
        //     System.out.println(i);
        // }
        System.out.println("\n\t Sum of the array is : "+sum);
        Missing(arr,sum);

    }
    private static int Missing(int a[],int as){
        
        int n=a.length;
        // int as=n*(n+1)/2;//Actual sum of the array :
        System.out.println("\n\t Actual sum of the array is : "+as);
        int s=0;
        System.out.print("\n\t Expected Array : [");
        for(int i=1;i<=n+1;i++){
            for(int e:a){
                // s+=e;//s=s+e;
                
            }
            s=s+i;
            System.out.print("\t"+i);
        }
        System.out.print(" ]\n");
        
        System.out.println("\n\t sum of expected array : "+s);
        
        System.out.println("\n\t The missing value : "+(s-as));
        return s-as;
        
    }
    
}
                                output:

                                 Find the missing number in array


         Array : [      1       3       4       5 ]

         Sum of the array is : 13

         Actual sum of the array is : 13

         Expected Array : [     1       2       3       4       5 ]

         sum of expected array : 15

         The missing value : 2






         