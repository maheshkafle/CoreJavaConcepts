package OOPConceptPart2;

public class TestCar {

  public static void main(String[] args){

      /*
      Interview Questions:
        Q.  What is Method Overriding?
        Ans:    When there are methods with same name and same number of arguments inside parent class as well as child class.
                Then this is known as Method Overriding.
        Q.  What is Static/ Compile Time Polymorphism?
        Ans:    In Java, if there are many methods in both the parent and child class with same name and no. of arguments then
                Java compiler decides which method to execute (preference is given to overridden method - method present in child class)
                among those methods. This property is known as Static/Compile Time Polymorphism.
      */

      BMW b = new BMW();
      b.start();
      b.stop();
      b.refuel();
      b.theftsafety();
      /*
      Interview Question:
      Q.    Can I access engine() method using below statement.
            b.engine();
      Ans:  Yup. Child class can inherit properties from grand parent class.
      */
      b.engine();

      System.out.println("*********");

      Car c = new Car();
      c.start();
      c.stop();
      c.refuel();

      /*
      Interview Question:
      Q.    Can I access theftsafety method using below statement.
            c.theftsafety();
      Ans:  No because child can inherit all the properties from parent class but parent cannot inherit some properties from child class.
            theftsafety method is created only inside child class so it is not possible.
      */

      System.out.println("*********");

      /*
        Q.  What is Dynamic/Run-Time Polymorphism?
        Ans:    Child Class Object can be referenced by parent class reference variable. This is known as Dynamic/Run-Time Polymorphism.
      */
      // This is also called Top Casting
      Car c1 = new BMW();

      /*
        Imp Interview Question:
        Q.  Can we do Down Casting? in e.g below
            BMW b1 =(BMW) new Car();
        Ans:    No we cannot Down Casting because we will get ClassCastException in run time
      */

      c1.start(); // Preference given to child class
      c1.stop();
      c1.refuel();
      /*
      Interview Question:
      Q. Can i access the theftsafety() from child class using parent class reference variable.
      i.e c1.theftsafety();
      Ans: No (why?) because only overridden methods(common methods) and parent class methods can be accessed by parent class variable
      although it is referring to the child class object.
      */


  }
}
