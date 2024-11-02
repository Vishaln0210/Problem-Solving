class Solution {
    public int maximumPopulation(int[][] logs) {
        int maxPopulation = 0;
        int maxYear = 1950;

        // Iterate through each year from 1950 to 2050
        for (int year = 1950; year <= 2050; year++) {
            int population = 0;

            // Count how many people are alive in this year
            for (int[] log : logs) {
                if (log[0] <= year && log[1] > year) {
                    population++;
                }
            }

            // Update the maximum population and earliest year with max population
            if (population > maxPopulation) {
                maxPopulation = population;
                maxYear = year;
            }
        }

        return maxYear;
    }
}
