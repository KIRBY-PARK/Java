package sep_1031;
// 삼항연산자 예제
public class CondOp2 {
    public static void main(String[] args) {
        int age = 15;
        String status = (age >= 18) ? "성인" : "미성년자";

        // 이 부분을 모두 날릴 수 있음
        /* if (age >= 18) {
            status = "성인";
        } else {
            status = "미성년자";
        }*/

        System.out.println("age = " + age + " status = " + status);
    }
}
