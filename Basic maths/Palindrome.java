public class Palindrome {
    public static void main(String[] args) {
        System.out.println("\n\t Palindrome of number \n");
        int n=122;
        System.out.println("\n\t Number : "+n);
        int rev=0;
        int duplicate = n;
        while(n>0){
            int ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;

        }
        if(duplicate == rev){
            System.out.println("\n\t True it is a palindrome num :"+duplicate+" rev :"+rev+"\n");
        }else{
        System.out.println("\n\t False it is not palindrome num : "+duplicate+" != rev : "+rev+"\n");
        }
    }
    
}

                output:

                 Palindrome of number


         Number : 122

         False it is not palindrome num : 122 != rev : 221



         
