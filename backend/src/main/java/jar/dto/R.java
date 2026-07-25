package jar.dto;

public class R {
    private int inputNumber;
    private int sumResult;

    public R() {}

    public R(int inputNumber, int sumResult) {
        this.inputNumber = inputNumber;
        this.sumResult = sumResult;
    }

    public int getInputNumber() { return inputNumber; }
    public void setInputNumber(int inputNumber) { this.inputNumber = inputNumber; }
    public int getSumResult() { return sumResult; }
    public void setSumResult(int sumResult) { this.sumResult = sumResult; }
}

