package equal;

public class Main {
    public static void main(String[] args) {
        System.out.println("프러그램의 시작점");

        int a = 1;
        int b = 1;
        int c = 2;

        // 객체 생성
        Book bookA = new Book("소년이온다", "한강");
        Book bookB = new Book("소년이온다", "한강");
        Book bookC = new Book("채식주의자", "한강");

        // == : 비교연산자
        boolean ret = (bookA == bookB);
        // soutv 단축
        System.out.println("ret = " + ret);

    }
}
