package jar.dto;

public class Sumdto {

    public int a;
    // public int b;
    public int sum;
    public String message;

    public  void setS(int a) {
        this.a = a;

        this.sum = a * (a + 1) / 2;
        this.message = "Sum calculated successfully";
    }

}
