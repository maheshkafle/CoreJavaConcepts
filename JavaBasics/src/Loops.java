public class Loops {

    public static void main(String[] args) {

        // 1. While Loops
        // print top 10 positive integer
        // print from 0 to 10 - j = 0
        // print from 0 to 9 - while(j<10)
        // print from 0 to 99 - while(j<100)
        // Interview question: Disadvantage of while loop- infinite loop:-> remove j++ -> result into infinite loop

        int i = 0; //initialization

        while(i<=10){ //conditional
            System.out.println("i: "+i);
            i++; //incremental
        }

        System.out.println("************");

        int a = 10; //initialization

        while(a>=0){ //conditional
            System.out.println("a: "+a);
            a--; //decremental
        }

        System.out.println("************");

        // 2. For Loops

        for(int j=0; j<=10; j++){ //(initialization, conditional, incremental)
            System.out.println("j: "+j);
        }

        System.out.println("************");

        //print from 10 to 0
        for(int k=10; k>=0; k--){ //(initialization, conditional, decremental)
            System.out.println("k: "+k);
        }

    }
}
