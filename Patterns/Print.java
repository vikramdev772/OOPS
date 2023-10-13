// public class Print{
//     public static void main(String[] args) {
//         System.out.println("\n\t Patterns \n");
//         int n = 6;
//         Alpha(n);

//     }
//      private static void Alpha(int  n)}{
//         System.out.println("\n\t Alpha triangle \n");
//         for(int i=0;i<=n;i++){
//             char ch='A'+i;
//             for(int j=0;j<i;j++){
//                 System.out.print("\t"+ch);
//             }
//             System.out.print("\n");
//         }
//     }
// }

public class Print {
    public static void main(String[] args) {
        System.out.println("\n\t Patterns \n");
        int n = 6;
        Alpha(n);
    }

    private static void Alpha(int n) {
        System.out.println("\n\t Alpha triangle \n");
        for (int i = 1; i <=n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j < i; j++) {
                System.out.print("\t" + ch);
            }
            System.out.print("\n");
        }
    }
}
                    OUTPUT:

                     Alpha triangle

        B
        C       C
        D       D       D
        E       E       E       E
        F       F       F       F       F
        G       G       G       G       G       G



        