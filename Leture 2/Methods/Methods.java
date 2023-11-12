public class Methods {
    public static void main(String[] args) {
        System.out.println("\n\t Methods (Functions) \n");
        System.out.println("\n\t Method Overloading , Function Overriding \n");
        int n=9;
        System.out.println("\n\t The number n : "+n);
        int arr[]={1,2,3,4,5,6};
        System.out.print("\n\t The Array element arr : [ ");
        for(int element : arr){
            System.out.print(" "+element+" ");
        }
        System.out.print(" ]");
        System.out.println("\n");

        Overloading ol = new Overloading();

        System.out.println("\n\t Method Overloading here");
        ol.learn(n);
        ol.learn(arr);
        ol.code();

        System.out.println("\n");
        System.out.println("\t Method Overriding here ");
        Overiding og = new Overiding();
        og.code();
        System.out.println("\n\t THE END \n");

    }
}
                   