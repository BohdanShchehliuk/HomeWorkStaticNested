package Additional;

public class Calculator {

    public double plus(double firsNumber, double secondNumber) {
        return firsNumber + secondNumber;
    }

    public double minus(double firsNumber, double secondNumber) {
        return firsNumber - secondNumber;
    }

    public double multiple(double firsNumber, double secondNumber) {
        return firsNumber * secondNumber;
    }

    public double divide(double firsNumber, double secondNumber) {
        if (secondNumber == 0) {
            System.out.print("Eroor.KOD: ");
            return -1;
        } else {
            return firsNumber / secondNumber;
        }
    }
}
