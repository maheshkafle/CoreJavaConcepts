public class MethodOverloading {

    public static void main(String[] args) {

        MethodOverloading obj =  new MethodOverloading();

        // INterview Question: Method Overloading - When method name is same with different arguments or input params within same class
        obj.sum();
        obj.sum(10);
        obj.sum(10, 5);
    }

    // Interview Question: Yes, we can overload main method
    public static void main(int i){

    }

    public void sum(){
        System.out.println("Sum Method -  zero input param");

        // Interview Question: Duplicate Methods - Same method with same number of arguments are not allowed

        // Interview Question: we cannot create another method inside one method.
       //public void test(){
      // }
    }

    public void sum(int i){
        System.out.println("sum method - one input param");
        System.out.println(i);
    }

    public  void sum(int i , int j){
        System.out.println("sum method - two input param");
        System.out.println(i+j);
    }
}
