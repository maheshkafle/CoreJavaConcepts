public class GreatestNumber {

    // Greatest among three numbers
    public static void main(String[] args){

        int a1 = 100;
        int b1 = 200;
        int c1 = 300;

        if (a1>b1 & a1>c1){
            System.out.println(a1+" is the greatest number");
        }

        else if(b1 > c1){
            System.out.println(b1 + " is the greatest number");
        }

        else {
            System.out.println(c1 + " is the greatest number");
        }
    }
}
