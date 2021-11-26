package Task3;

public class Distance {
    double distance = 256584.154;

    public void print(double distance) {
        System.out.printf("Початкова дистанція в метрає складає %f%n", distance);
    }

    public static class Converter {
        public void convertKilometr(double dicntance) {
            System.out.printf("Дистанція в кілометрах %f%n", dicntance / 1000);
        }

        public void convertMile(double dicntance) {
            System.out.printf("Дистанція в милях %f%n", dicntance / 1600);
        }
    }
}
