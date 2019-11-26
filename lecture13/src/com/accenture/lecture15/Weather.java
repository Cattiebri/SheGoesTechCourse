package com.accenture.lecture15;

public class Weather {

	private final String country;
	private int[] daysWeather = new int[7];

	private int dayIndex = 0;

	public Weather(String country, int[] daysWeather) {
		this.country = country;
		this.daysWeather = daysWeather;

	}

	public int[] getDaysWeather() {
		return daysWeather;
	}

	public String getCountry() {
		return country;
	}

	private String printArray() {
		String result = "";

		int index = daysWeather.length - 1;
		for (int i = 0; i < daysWeather.length; i++) {
			if (i < index) {
				result += daysWeather[i] + ", ";
			} else {
				result += daysWeather[i];
			}
		}
		return result;
	}

	public String toString() {
		return "Weather forecast in " + country + " for next days `"
				+ printArray() + "`";
	}

	private int getSum() {

		int summ = 0;

		for (int i = 0; i < daysWeather.length; i++) {
			summ = summ + daysWeather[i];

		}

		return summ;
	}

	public double getWeekAverage() {

		return getSum() / (double) daysWeather.length;

	}

	public int getHottestTemperature() {
		int maxValue = daysWeather[0];

		for (int i = 0; i < daysWeather.length; i++) {
			if (daysWeather[i] >= maxValue) {
				maxValue = daysWeather[i];
				this.dayIndex = i;
			}
		}
		return maxValue;

	}

	private String getDayName(int dayIndex) {
		this.dayIndex = dayIndex;
		String dayName;
		switch (this.dayIndex + 1) {
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;
		default:
			dayName = "wrong index";
		}
		return dayName;

	}

	public String getHottestDayName() {
		getHottestTemperature();
		return getDayName(this.dayIndex);

	}

	public int getColdestTemperature() {

		int minValue = daysWeather[0];

		for (int i = 0; i < daysWeather.length; i++) {
			if (daysWeather[i] <= minValue) {
				minValue = daysWeather[i];
				this.dayIndex = i;
			}
		}
		return minValue;

	}

	public String getColdestDayName() {
		getColdestTemperature();
		return getDayName(this.dayIndex);

	}

	public void printAdvancedInformation() {

		System.out.println("In " + country
				+ " during next 7 days will be following weather: "
				+ printArray());

		System.out.println("the highest temperature will be on "
				+ getHottestDayName() + " " + getHottestTemperature()
				+ " degree,");

		System.out.println("the lowest temperature will be on "
				+ getColdestDayName() + " " + getColdestTemperature()
				+ " degree.");

	}

	public void applyWarmCycloneEffect() {
		for (int i = 0; i < daysWeather.length; i++) {
			daysWeather[i]++;

		}

	}

}
