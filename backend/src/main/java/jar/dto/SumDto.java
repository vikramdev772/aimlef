package jar.dto;

public class SumDto {

    private int a;
    private int b;
    private int sum;

    public SumDto() {
    }

    public SumDto(int a, int b, int sum) {
        this.a = a;
        this.b = b;
        this.sum = sum;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}