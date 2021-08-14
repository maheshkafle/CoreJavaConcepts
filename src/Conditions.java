public class Conditions {

    public static void main(String[] args) {

        int c = 40;
        int d = 50;

        // equality operator
        if(c==d){
            System.out.println("Equal");
        }
        else {
            System.out.println("not Equal");
        }

        // Print largest among the three numbers
        int a1 = 100;
        int b1 = 200;
        int c1 = 300;

        if(a1>b1 & a1>c1){
            System.out.println("a1: " + "is greatest");
        }
        else if(b1 > c1){
            System.out.println("b1: " + "is greatest");
        }
        else {
            System.out.println("c1: " + "is greatest");
        }

    }
}
