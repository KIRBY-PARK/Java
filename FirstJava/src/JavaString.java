import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaString {
    public static void main(String[] args) {
        // (5) 참조형 (주소값을 출력함)

        // (5)-1 문자열 변수
        // String helloWorld = "Hello World";
        // System.out.println(helloWorld);

        // (5)-2 배열
        int[] a = {1, 2, 3}; // a는 1, 2, 3을 가진 배열
        System.out.println(a); // a가 가지는 주소값 출력
        System.out.println(Arrays.toString(a));
    }
}
