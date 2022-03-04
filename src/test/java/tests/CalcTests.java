package tests;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;
import tests.model.Calc;

public class CalcTests {

    Calc calc;
    double result;

    @Дано("два числа {double} и {double} и знак {word}")
    public void given(double a, double b, String sign) {
        calc = new Calc(a, b, sign);
    }

    @Тогда("^находим результат операции")
    public void calculate() {
        result = calc.getResult();
    }

    @И("^вывод результата$")
    public void printResult() {
        System.out.println(calc.getA() + calc.getSign() + calc.getB() + "=" + result);
    }
}
