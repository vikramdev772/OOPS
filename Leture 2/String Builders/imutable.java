public class imutable {
    public static void main(String[] args) {
        String s="Vikram ";
        s="Ram";
        s.concat("ram");
        System.out.println(s);
        s=s.concat("Ram");
        System.out.println(s);
        


        
    }
    
}
