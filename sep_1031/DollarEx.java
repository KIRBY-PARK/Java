package sep_1031;

public class DollarEx {
    public static void main(String[] args) {
        int dollars = 100;
        if (dollars < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollars == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int won = dollars * 1300;
            System.out.println("환전금액은" + won + "입니다.");
        }
    }
}
