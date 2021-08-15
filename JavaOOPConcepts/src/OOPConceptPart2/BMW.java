package OOPConceptPart2;

public class BMW extends Car{

    /* Interview Question: What is Method Overriding?
        When same method is present in parent/Super class as well as in child/Sub class with the same name and
        same no. of arguments, then this is called Method Overriding.
    */
    public void start(){ // Overridden Method
        System.out.println("BMW - Start");
    }

    public void theftsafety(){
        System.out.println("BMW - Theft Safety");
    }
}
