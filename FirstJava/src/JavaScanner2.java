// 문자를 숫자로 변환
import java.util.Scanner;

public class JavaScanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char letter = sc.nextLine().charAt(0); // 첫번째 글자만 받아오기위해 charAt(0) 메서드를 사용
        int asciiNumber = (int)letter; // 숫자로 형변환을 해주면 저장되어있던 아스키 숫자값으로 표현됨

        System.out.println(asciiNumber);
    }
}