package sep_1101;

public class Casting1 {
    public static void main(String[] args) {
        int intvalue = 10;
        long longvalue;
        double doublevalue;

        // int -> long
        longvalue = intvalue;
        System.out.println("LongValue = " + longvalue);

        // int -> double
        doublevalue = intvalue;
        System.out.println("DoubleValue = " + doublevalue);

        // long -> double
        doublevalue = 20L;
        System.out.println("DoubleValue2 = " + doublevalue);
    }
}
