// 숫자를 문자로 변환
// 숫자 -> 문자
import java.util.Scanner;

public class JavaScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int asciiNumber = sc.nextInt();
        char ch = (char)asciiNumber; // 문자로 형변환을 해주면 숫자에 맞는 문자로 표현됨

        System.out.println(ch);
    }
}
