package week03.calculator;

public class OperationMultiply extends OperationAbstract {
    @Override
    public double operate(int NumberFirst, int NumberSecond) {
        return NumberFirst * NumberSecond;
    }
}
