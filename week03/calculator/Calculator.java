package week03.calculator;

public class Calculator {
    private OperationAbstract operation;

    public Calculator(OperationAbstract operation) {
        this.operation = operation;
    }

    public void setOperation (OperationAbstract operation){
        this.operation = operation;
    }

    public double calculate(int NumberFirst, int NumberSecond) {
        double answer = 0;

        answer = operation.operate(NumberFirst, NumberSecond);

        return answer;
    }
}
