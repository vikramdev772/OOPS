
// For a given String convert each the first letter of each word to upper case


public class CodeNation{
    public static void main(String[] args) {
        System.out.println("\n\t Using toUpperCase() \n");
        String str = "coding is the art of turning imagination into reality";
        // System.out.println("\n\t "+str.toUpperCase()+"\n");
        System.out.println("\n\t"+str);
        System.out.println(str.charAt(7));
        // tup(str);
        // System.out.println("\n\t"+str);
        System.out.println("\n\t"+tup(str));

    }
    public static String  tup(String str ){
        StringBuilder sb = new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                // sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            }else{
                sb.append(str.charAt(i));
            }
        }
        // sb.toString();

        
        return sb.toString();
    }
}