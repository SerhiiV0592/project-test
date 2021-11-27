public class Main {

    public static void main(String[] args) {
        Distance.Converter res = new Distance.Converter();
        res.distanceToCm(3000);
        res.distanceToKilometers(3000);
        res.distanceToMm(500);
        res.distanceToMiles(1000);
    }
}
