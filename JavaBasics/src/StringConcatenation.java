public class StringConcatenation {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        double c = 11.11;
        double d = 22.22;

        String x = "Hello";
        String y = "World";

        /*
            Interview question:
            program execution always starts from left to right
        */

        // output: 300HelloWorld
        System.out.println(a+b+x+y);

        // output will be HelloWorld100200 not HelloWorld300
        System.out.println(x+y+a+b);

        // output will be HelloWorld300 not HelloWorld100200
        System.out.println(x+y+(a+b));

        System.out.println(a+b+x+y+a+x+b+y);
        System.out.println(c+d);
        System.out.println("value of a: "+a);
        System.out.println("value of c: "+c);

        /* Interview question: difference betn print and println function
            print simply prints in single line with no new line space
            println means print with line new below it
        */
        System.out.print("Hello Selenium");
        System.out.println("Hello Testing");
    }
}
