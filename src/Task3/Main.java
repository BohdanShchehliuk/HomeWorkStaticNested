package Task3;
public class Main {
    public static void main(String [] arg) {
Distance distance = new Distance();
Distance.Converter converter = new Distance.Converter();
distance.print(distance.distance);
converter.convertKilometr(distance.distance);
converter.convertMile(distance.distance);
 }
}