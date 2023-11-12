public class Str {
    public static void main(String[] args) {
        String s1 = "Sharmas";
        String s2 = new String("Sharmas");
        String s3 = new String(s2);
        if(s1.equals(s2)){
            System.out.println("\n\t String are equal ");

        }else{
            System.out.println("\n\t not equal");
        }
        System.out.println(s3);

    }
    
}
