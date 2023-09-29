
public class Main {
    public static void main(String[] args) {
        System.out.println("\n\t Constructor in java \n");
        System.out.println(
                "\n\t it is used to create the instance of the class\n\tConstructor are almost similar to methods (functions )\n\t Expect for two things. \n\t its name is the same as the class Name \n\t * it has no return type .");
        System.out.println("\n\t it refered to as special methods \n");
        Create con = new Create();//Create() constructor is called .
        Types non = new Types(); //Non Parameterized
        Params p = new Params(5, 6);//Parameterized
        


    }
}

class Create {
    Create() {

        System.out.println("\n\t Create constructor is called \n");
    }

}
