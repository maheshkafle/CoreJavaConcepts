package OOPConceptPart1;

public class FunctionsConcepts {

    public static void main(String[] args) {

        // main method never has any return type
        FunctionsConcepts obj = new FunctionsConcepts();
        // obj is object reference/variable name where object is new FunctionConcepts()
        // after this copy of all static methods is provided to obj object

        obj.test();
        String s = obj.qa();
        System.out.println(s);

        int divisor = obj.division(30,10);
        System.out.println(divisor);
    }

    // non static methods
    // void -> it doesn't have any return type
    public void test(){
        System.out.println("test method");
    }

    // return type -> String
    public String qa(){
        System.out.println("QA method");
        String s1 = "Selenium";
        return s1;
    }

    // return type -> int
    // accepts int parameters/arguments
    public int division(int a, int b){
        System.out.println("Division method");
        int d = a/b;
        return d;
    }

}
