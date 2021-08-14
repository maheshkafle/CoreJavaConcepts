public class ArrayConcept {

    public static void main(String[] args) {
        // Interview Question-> Array: used to store similar data types value in array variable

        // lower bound/index : 0
        // upper bound/index: size of array - 1


        // 1. int array
        int i[] = new int[4];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        i[3] = 4;

        for(int j=0; j<i.length; j++){
            System.out.println("i[" + j + "]: "+i[j]);
        }

        System.out.println("*******");

        /*
            Interview Question: ArrayIndexOutOfBoundsException? -> Exception is thrown when we try to access elements
            beyond the size of array
            Advantages of 1 dim array: can store multiple values in single variable
            Disadvantages of 1 dim array:
            1. size if fixed so called as 'Static Array' if you try to store value more than size of static array then we
                get ArrayIndexOutOfBoundsException error -
                To overcome problem no. 1  we use dynamic array (Collections) (e.g ArrayList, Hashtable)
            2. Stores similar data types (what if i want to store company's employee records like name, tax%, age, city, DOY, sex
                having different data types)
                To overcome problem no. 2  we use object Array (can store different data types)
        */

        // e.g  //here i[4] doesn't exist so we get ArrayIndexOutOfBoundsException if we run below program in line no 27
        // System.out.println(i[4]);

        // 2. double array
        double a[] = new double[4];
        a[0] = 7.44;
        a[1] = 8.11;
        a[2] = 2.33;
        a[3] = 4.55;

        for(int b=0; b<a.length; b++){
            System.out.println("a[" + b + "]: "+a[b]);
        }

        System.out.println("*********");

        // 3. char array
        char c[] = new char[4];
        c[0] = 'c';
        c[1] = 'd';
        c[2] = '3';
        c[3] = '3';

        for(int d=0; d<c.length; d++){
            System.out.println("c[" + d + "]: "+c[d]);
        }

        System.out.println("*********");

        // 4. String array
        String e[] = new String[2];
        e[0] = "Hello";
        e[1] = "12345";

        for(int f=0; f<e.length; f++){
            System.out.println("c[" + f + "]: "+e[f]);
        }

        System.out.println("*********");

        // 5. boolean array
        boolean g[] = new boolean[2];
        g[0] = true;
        g[1] = false;

        for(int h=0; h<g.length; h++){
            System.out.println("c[" + h + "]: "+g[h]);
        }

        System.out.println("*********");

        // Object Array: Used to store different data types values
        Object ob[] = new Object[4];
        ob[0] = "Mahesh";
        ob[1] = 26;
        ob[2] = 'M';
        ob[3] = "Nawalparasi";

        for(int index=0; index<ob.length; index++){
            System.out.println("ob[" + index + "]: "+ob[index]);
        }


    }
}
