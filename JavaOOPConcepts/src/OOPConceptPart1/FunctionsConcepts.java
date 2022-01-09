package OOPConceptPart1;

public class FunctionsConcepts {

    public static void main(String[] args) {

        // main method never has any return type
        FunctionsConcepts obj = new FunctionsConcepts();
        // obj is object reference/variableW
        // after line no. 8 copy of all non static methods is given to obj object reference variable

        obj.test();
        String s = obj.qa();
        System.out.println(s);

        int divisor = obj.division(30,10);
        System.out.println(divisor);
    }

    // Below all methods are non static methods

    // void -> it doesn't have any return type
    //return type -> void
    public void test(){
        System.out.println("test method");
    }

    // return type -> String
    // no input, some output
    public String qa(){
        System.out.println("QA method");
        String s1 = "Selenium";
        return s1;
    }

    // return type -> int
    // accepts int parameters/arguments
    // some input, some output
    public int division(int a, int b){
        System.out.println("Division method");
        int d = a/b;
        return d;
    }

}
