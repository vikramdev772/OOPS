public class Gcd {
    public static void main(String[] args) {
        System.out.println("\n\t GCD of two numbers \n");
        System.out.println("\n\t Eulidean algorithm \n");
        int a=8,b=2;
        System.out.println("\n\t numbers a : "+a+" b : "+b);
        int r= g(a,b);
        System.out.println("\n\t GCD of two nums : "+r);

    }
    public static int  g(int a,int b) {
        
        while(a>0&&b>0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
        // if(a==0){
        //     return a;
        // }else{
        //     return b;
        // }
            return a+b;
        
    }
    
}
                            output:


                             GCD of two numbers 


         Eulidean algorithm


         numbers a : 8 b : 2

         GCD of two nums : 2






         