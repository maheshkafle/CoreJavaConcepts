public class Bird {

    // Class variables
    String name;
    String color;

    public static void main(String[] args) {

        // new Bird() is class object,  new keyword is used to create object
        // parrot, pigeon are object reference variables

        Bird parrot = new Bird();
        Bird pigeon = new Bird();

        // initialize class variables
        parrot.name = "Tota";
        parrot.color= "Green";

        pigeon.name = "Parewa";
        pigeon.color = "Grey";

        System.out.println(parrot.name);
        System.out.println(parrot.color);

        System.out.println(pigeon.name);
        System.out.println(pigeon.color);
    }
}
