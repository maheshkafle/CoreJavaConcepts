package OOPConceptPart2;

public class TestCar {

  public static void main(String[] args){

      /* What is Polymorphism?
        Polymorphism means method overriding.
      */
      // Interview Question: Static/Compile Time -> Polymorphism Java decides which method to run during compilation time
      BMW b = new BMW();
      b.start();
      b.stop();
      b.refuel();
      b.theftsafety();
      b.engine(); // Interview Question: BMW class inheriting method from grand parent class i.e Vehicle Class

      System.out.println("*********");

      //
      Car c = new Car();
      c.start();
      c.stop();
      c.refuel();

      /*
      c.theftsafety() : //not allowed
      Interview Question: Can i access BMW theftsafety() because parents cannot inherit some property from child class
      */

      System.out.println("*********");

      // Interview Question: What is Dynamic/Run Time Polymorphism
      // object reference of Parent class referencing to new Child class object
      Car c1 = new BMW(); // This is also called Top Casting
      //Imp Interview Question: Can we do Down Casting? in e.g below
      //BMW b1 =(BMW)new Car(); //No we cannot Down Cast we will get ClassCastException in run time
      c1.start(); // Preference given to child class
      c1.stop();
      c1.refuel();
      /*
      c.theftsafety() : //Can i access the theftsafety() from child class Ans: It's not allowed
      Interview Question: Can i access BMW theftsafety() because parents cannot inherit some property from child class
      */


  }
}
