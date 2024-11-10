public class JavaWrapper {
    public static void main(String[] args) {
        // (6) 래퍼 클래스 (Wrapper Class 변수)
        int number = 21;

        // Integer num = new Integer(number) // 옛날 방식의 박싱
        Integer num = number; // 요즘 방식의 박싱

        System.out.println(num.intValue()); // 언박싱
    }
}
