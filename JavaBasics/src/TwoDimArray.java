public class TwoDimArray {

    public static void main(String[] args) {

        String x[][] = new String[2][3];

        System.out.println(x.length); // 2 - Total no. of rows
        System.out.println(x[0].length); // 3 - Total no. of Columns

        // first row
        x[0][0] = "A";
        x[0][1] = "B";
        x[0][2] = "C";

        // second row
        x[1][0] = "E";
        x[1][1] = "F";
        x[1][2] = "G";

        // print all values in 2D Array
        for(int row=0; row<x.length; row++){
            for(int column=0; column<x[0].length; column++){
                System.out.println("x["+row+"]["+column+"]: "+x[row][column]);
            }
        }
    }
}
