public class JavaInt {
    public static void main(String[] args) {
        // (1) byte -> int
        byte byteNumber = 10;
        int intNumber = byteNumber;

        System.out.println(intNumber);

        // (2) char(1) -> int(4)
        char charAlphabet = 'A';
        intNumber = charAlphabet; // char -> int 자동 형 변환
        System.out.println(intNumber);

        // (3) int -> long number 형 변환
        intNumber = 100;
        long longNumber = intNumber;
        System.out.println(longNumber);

        // (4) int -> double 형 변환
        intNumber = 200;
        double doubleNumber = intNumber;
        System.out.println(doubleNumber);
    }
}
