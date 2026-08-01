package jar.dto;

public class SumDto {
    private String name;
    private int status;
    private int a;
    private int b;
    private int result;

    public SumDto(String name, int status, int a, int b, int result) {
        this.name = name;
        this.status = status;
        this.a = a;
        this.b = b;
        this.result = result;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getStatus() { return status; }
    public void setStatus(int status) { this.status = status; }

    public int getA() { return a; }
    public void setA(int a) { this.a = a; }

    public int getB() { return b; }
    public void setB(int b) { this.b = b; }

    public int getResult() { return result; }
    public void setResult(int result) { this.result = result; }
}