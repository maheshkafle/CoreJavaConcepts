package OOPConceptPart1;

public class Bird {

    // Class variables
    String name;
    String color;

    public static void main(String[] args) {

        // Interview Question: What is Class?
        // Class is a real world entity which has its properties which is defined in the form of methods and variables.
        //For If Bird is a class then it has its own properties like Name, Color, canFly etc
        // new Bird() this is Object of Bird Class, i.e  new keyword is used to create object
        // parrot, pigeon and sparrow are Object reference variables

        Bird parrot = new Bird();
        Bird pigeon = new Bird();
        Bird sparrow = new Bird();

        // initialize class variables
        System.out.println("Before initializing class variables values");

        parrot.name = "Tota";
        parrot.color= "Green";

        sparrow.name = "Bhagera";
        sparrow.color = "Brown";

        pigeon.name = "Parewa";
        pigeon.color = "Grey";

        System.out.println(parrot.name);
        System.out.println(parrot.color);
        System.out.println(sparrow.name);
        System.out.println(sparrow.color);
        System.out.println(pigeon.name);
        System.out.println(pigeon.color);

        // Shifting of object reference
        parrot = sparrow; // parrot references to sparrow after execution
        sparrow = pigeon; // sparrow references to pigeon after execution
        pigeon = parrot;  // Imp Line to understand!!! Interview Concept: pigeon references to parrot! but now parrot is referencing to sparrow so pigeon will also reference to sparrow.

        System.out.println("After shifting class variables values");
        // Top Interview Question
        System.out.println(pigeon.color); // output: sparrow.color
    }
}
