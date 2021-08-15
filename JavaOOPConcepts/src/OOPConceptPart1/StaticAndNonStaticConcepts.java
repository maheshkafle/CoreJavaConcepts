package OOPConceptPart1;

public class StaticAndNonStaticConcepts {

    int age = 26; // non static global var
    static int tax = 13; // static global var

    public static void main(String[] args) {

        // Interview Question: How to access static vars and methods?
        // 1. Direct calling
        sum(10, 5);
        System.out.println(tax);

        //2, Using ClassName
        StaticAndNonStaticConcepts.sum(5, 5);
        System.out.println(StaticAndNonStaticConcepts.tax);

        // Interview Question: How to access non static vars and methods
        // By creating object reference
        StaticAndNonStaticConcepts obj = new StaticAndNonStaticConcepts();
        System.out.println("Static var: "+obj.age);
        obj.sendMail();

    }

    public void sendMail(){ // non static method
        System.out.println("Non Static Method");
        System.out.println("Sending Mail");
    }

    public static void sum(int a, int b){
        System.out.println("Static Sum Method");
        int d = a + b;
        System.out.println(d);
    }
}
