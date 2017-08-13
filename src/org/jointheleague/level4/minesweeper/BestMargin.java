package org.jointheleague.level4.minesweeper;

public class BestMargin {

	public static void main(String[] args) {
		double[] prices = { 6.80, 14.25, 2.35, 5.55};
		BestMargin runner = new BestMargin();
		double[] output = runner.findPrice(prices);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

	public double[] findPrice(double[] input) {
		double high = 1.0;
		double low = 2.0;
		double highTemp;
		double lowTemp;
		double maxDif = 0.0;

		for (int i = 0; i < input.length; i++) {
			lowTemp = input[i];
			for (int j = i+1; j < input.length; j++) {
				highTemp = input[j];
				if (maxDif < (highTemp - lowTemp)) {
					maxDif = highTemp - lowTemp;
					low = input[i];
					high = input[j];
				}
			}
		}
		double[] output = { low, high };
		return output;
	}
}