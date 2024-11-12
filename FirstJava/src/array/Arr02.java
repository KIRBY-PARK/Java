package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arr02 {
    public static void main(String[] args) {
        // 초기화

        // 1. 배열에 특정값 대입해서 선언
        int[] intArr = {1, 2, 3, 4, 5}; // 길이는 자동으로 5가 세팅되면서 값들도 들어감
        String[] strArr = {"A", "B", "C", "D", "E", "F"};

        // 2. for문을 통해서 대입
        for(int i = 0; i < intArr.length; i++){
            intArr[i] = i;
        }

        System.out.println("-----------------------");

        // 다건 출력
        for(int i = 0; i<intArr.length; i++){
            System.out.println(intArr[i]);

        }

        System.out.println("-----------------------");

        int[] intArr2 = {1, 2, 3, 4, 5};



        // 배열의 주소를 모두 같은 값으로 초기화
        Arrays.fill(intArr2, 1);

        // 향상된 for문 다건 출력
        for (int item : intArr2) {
            System.out.println(item);
        }
    }
}
