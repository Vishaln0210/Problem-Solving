class Solution {
    public int maximumPopulation(int[][] logs) {
        int maxPopulation = 0;
        int maxYear = 1950;
        for (int year = 1950; year <= 2050; year++) {
            int population = 0;
            for (int[] log : logs) {
                if (log[0] <= year && log[1] > year) {
                    population++;
                }
            }
            if (population > maxPopulation) {
                maxPopulation = population;
                maxYear = year;
            }
        }

        return maxYear;
    }
}
