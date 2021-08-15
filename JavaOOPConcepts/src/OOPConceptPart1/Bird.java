package OOPConceptPart1;

public class Bird {

    // Class variables
    String name;
    String color;

    public static void main(String[] args) {

        // new Bird() is class object,  new keyword is used to create object
        // parrot, pigeon are object reference variables

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
        pigeon = parrot;  // Interview Concept: pigeon references to parrot! but now parrot is referencing to sparrow so pigeon will also reference to sparrow.

        System.out.println("After shifting class variables values");
        parrot.color = "suga rang";
        // Top Interview Question
        System.out.println(parrot.color); // output: suga rang
        pigeon.color = "parewa ko rang";
        System.out.println(parrot.color); // output: parewa ko rang
    }
}
