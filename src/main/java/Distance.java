public class Distance {
    private double distance;
    private static double result;

    public Distance(double distanse) {
        this.distance = distanse;
    }

    public static void print(double result) {
        System.out.println(result);

    }

    public static class Converter {

        public void distanceToKilometers(double distance) {
            result = distance / 1000;
            print(result);
        }

        public void distanceToMiles(double distance) {
            result = distance / 1600;
            print(result);
        }

        public void distanceToCm(double distance) {
            result = distance * 100;
            print(result);
        }

        public void distanceToMm(double distance) {
            result = distance * 1000;
            print(result);
        }


    }
}
