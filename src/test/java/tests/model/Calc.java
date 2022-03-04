package tests.model;

public class Calc {

    private double a;
    private double b;
    private String sign;

    public Calc(double a, double b, String sign) {
        this.a = a;
        this.b = b;
        this.sign = sign;
    }

    public double getResult() {
        switch (sign) {
            case "-":
                return a - b;
            case "+":
                return a + b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                System.out.println("incorrect arithmetic sign");
                break;
        }
        return 0;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public String getSign() {
        return sign;
    }
}
