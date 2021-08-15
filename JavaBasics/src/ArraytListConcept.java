import java.util.ArrayList;

public class ArraytListConcept {

    public static void main(String[] args) {

        ArrayList ar = new ArrayList();

        ar.add(100);
        ar.add(200);
        ar.add(300);
        System.out.println("size: "+ar.size());

        System.out.println("ar.get(0): "+ar.get(0));
        ar.add(400);
        ar.add("Simple");

        System.out.println("Prints all the values in ArrayList");
        for(int i=0; i<ar.size(); i++){
            System.out.println("ar.get("+ i + "): " + ar.get(i));
        }

        // Top Interview Question: Difference between Array and ArrayList
        // How to define ArrayList of only one specific data type

        // 1. ArrayList of Integer Type
        ArrayList <Integer> ar1 = new ArrayList<Integer>();
        ar1.add(20);

        // 2. ArrayList of String Type
        ArrayList <String> ar3 = new ArrayList<String >();
        ar3.add("Hello Work");
        ar3.add("WHat up!");
        ar3.add("Need more vacation");


    }
}

