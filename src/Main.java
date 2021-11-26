import Additional.Calculator;

import java.util.Scanner;

public class Main extends Calculator {

    public static void main(String[] arg) {
        Calculator calculator = new Calculator();

        System.out.println("Введіть перше число");
        Scanner input = new Scanner(System.in);
        double firsNumber = input.nextDouble();

        System.out.println("Введіть друге число");
        double secondNumber = input.nextDouble();

        System.out.println(calculator.plus(firsNumber, secondNumber));
        System.out.println(calculator.minus(firsNumber, secondNumber));
        System.out.println(calculator.multiple(firsNumber, secondNumber));
        System.out.println(calculator.divide(firsNumber, secondNumber));
    }
}
