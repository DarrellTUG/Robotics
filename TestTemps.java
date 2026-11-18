public class TestTemps {
    void main() {
        double[] testHighs = new double[] {56.3, 42.6, 71.4, 65.0, 59.4, 51.6, 69.4};
        double[] testLows = new double[] {44.2, 37.4, 67.3, 48.9, 43.5, 32.58, 63.7};

        for (int x = 0; x < testHighs.length; x++) {
            System.out.println("Day " + (x+1) + ": High: " + testHighs[x] + " Low: " + testLows[x]);
        }
        double Sum = 0.0;
        for (int y = 0; y < testHighs.length; y++) {
        
        Sum = Sum + testHighs[y] + testLows[y];
        }
        System.out.println("Average Temperature: " + Sum/7.0);
    }



    /**
     * Print out the forecast including the following information
     * <p>
     * Average temperature for the whole week.
     *
     * Weather breakdown for each day with:
     * - Highest temp
     * - Lowest temp
     * </p>
     * @param highTemps Highest temperature per day for the next 7 days, assume every element is greater than its corresponding low.
     * @param lowTemps Lowest temperature per day for the next 7 days, assume every element is less than its corresponding high.
     */
    void weeklyForecast(double[] highTemps, double[] lowTemps) {
    }

    // Hint: try not to do everything in one method!
    // Use helpers like the example problem
}