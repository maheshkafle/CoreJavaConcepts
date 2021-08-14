public class PostPreIncrementDecrement {

    public static void main(String[] args) {

        int i = 1;
        int j = i++; // Interview question post increment: Assign value of i to j and then increase the value of i by 1

        System.out.println("i: "+i); //output i: 2
        System.out.println("j: "+j); //output j: 1

        System.out.println("*********");

        int a = 1;
        int b = ++a; // Interview question pre increment: First increment value of a by 1 and then assign it to b

        System.out.println("a: "+a); //output a: 2
        System.out.println("b: "+b); //output b: 2

        System.out.println("*********");

        int m = 2;
        int n = m--; // Interview question post decrement: Assign value of m to n and then decrease the value of i by 1

        System.out.println("m: "+m); //output m: 1
        System.out.println("n: "+n); //output n: 2

        System.out.println("*********");

        int o = 2;
        int p = --o; // Interview question pre decrement: First decrement value of o by 1 and then assign it to b

        System.out.println("o: "+o); //output o: 1
        System.out.println("p: "+p); //output p: 1
    }
}
