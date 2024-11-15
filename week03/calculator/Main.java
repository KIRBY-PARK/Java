package week03.calculator;

public class Main {
    public static void main(String[] args) {
        // 인스턴스 생성
        Calculator calculator = new Calculator(new OperationAdd());
        System.out.println(calculator.calculate(10, 3));

        calculator.setOperation(new OperationMultiply());
        System.out.println(calculator.calculate(9, 3));
    }
}
