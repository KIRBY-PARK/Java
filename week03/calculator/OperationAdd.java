package week03.calculator;

public class OperationAdd extends OperationAbstract {
    @Override
    public double operate(int NumberFirst, int NumberSecond) {
        return NumberFirst + NumberSecond;
    }
}
