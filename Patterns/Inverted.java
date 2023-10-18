public class Inverted {
    public static void main(String[] args) {
        System.out.println("\n\t Inverted Triangle \n");
        int n=7;
        for(int i=n;i>0;i--){
            for(int j=n;j>=i;j--){
                System.out.print("\t "+j);
            }
            System.out.print("\n");
        }
    }
}
                    Inverted Triangle

         7
         7       6
         7       6       5
         7       6       5       4
         7       6       5       4       3
         7       6       5       4       3       2
         7       6       5       4       3       2       1


         