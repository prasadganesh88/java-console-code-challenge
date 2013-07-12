package com.naviance.samples.domain.model;

import java.util.Arrays;

public class PercentileCalculator {

	/**
	 * Returns the value representing a specific percentile of the number list
	 * provided. This method uses the simple nearest rank algorithm for decile
	 * calculation. http://en.wikipedia.org/wiki/Percentile#Nearest_rank
	 * 
	 * @param percentile
	 * @param numberList
	 */
	public double calculatePercentile(int percentile, double[] numberList) {

		int percentilePosition = 0;
		Arrays.sort(numberList);
		double percentilePercentage = (double) percentile / 100;
		int listLength = numberList.length;
		percentilePosition = (int) Math
				.round((percentilePercentage * (double) listLength) + .5) - 1;

		percentilePosition = Math.min(listLength - 1, percentilePosition);

		return numberList[percentilePosition];
	}

}
