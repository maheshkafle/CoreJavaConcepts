package OOPConceptPart1;

public class WrapperClassConcepts {

    public static void main(String[] args) {

        // WrapperClass is used for data type conversion. Available wrapperClass are Integer, String, Boolean, Double

        // 1. Data type conversion: String to Integer
        String s = "100";
        System.out.println(s+20); //output: 10020
        Integer i = Integer.parseInt(s);
        System.out.println(i+20); //output: 120

        // Data Type Conversion: String to Double
        String s1 = "22";
        System.out.println(s1+10.5); // output: 2210.5
        Double d1 = Double.parseDouble(s1);
        System.out.println(d1+10.5); // output: 32.5

        // Data type conversion: String to Boolean
        String k = "true";
        System.out.println(k); // ouput: true
        boolean bool = Boolean.parseBoolean(k);
        System.out.println(bool); // output: true

        // Data Type conversion: int to string conversion
        int j = 200;
        System.out.println(j+20); // output: 220
        String s3 = String.valueOf(j);
        System.out.println(s3+20); // output: 20020

        // Interview Question: If the String is not pure integer and we try to convert it then we get NumberFormatException
//        String s4 = "10A";
//        System.out.println(s4);
//        Integer i5 = Integer.parseInt(s4);
//        System.out.println(i5);
    }
}
