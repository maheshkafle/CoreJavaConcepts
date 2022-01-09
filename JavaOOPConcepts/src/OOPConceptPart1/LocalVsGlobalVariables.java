package OOPConceptPart1;

public class LocalVsGlobalVariables {

    // Global Variables - Class Variables
    String name = "Tom";
    int age = 26;

    public static void main(String[] args) {

        int i = 10; // local variables - i is local variable for main() i.e scope is available only within this method
        System.out.println(i);

        // As soon as new object is created then a copy of non static method and Global variables is passed to the new object
        LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
        System.out.println(obj.name);
        System.out.println(obj.age);
    }

    // non static method
    public void sum(){
        int i = 15; // i is local variable for sum() - i.e scope is limited to this method
        int j = 20;
        int age = 25;
    }

}
