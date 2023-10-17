import java.util.ArrayList;

public class ReverseList {
    public static void main(String[] args) {
        System.out.println("\n\t Reverse ArrayList \n");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("\n\t The list : " + list);
        System.out.print("\n\t Size of list : " + list.size());

        for (int i = list.size() - 1; i >= 0; i--) {
            // Access the element using list.get(i) and print or manipulate as needed
            System.out.print("\n\t Element at index " + i + ": " + list.get(i));
        }

        // If you want to reverse the original list, you need to create a new list
        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        System.out.println("\n\t Reversed list : " + reversedList);
    }
}
                output:

                
         Reverse ArrayList 


         The list : [2, 3, 4, 5]

         Size of list : 4
         Element at index 3: 5
         Element at index 2: 4
         Element at index 1: 3
         Element at index 0: 2
         Reversed list : [5, 4, 3, 2]




         