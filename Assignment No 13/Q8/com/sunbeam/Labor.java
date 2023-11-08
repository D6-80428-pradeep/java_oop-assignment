package com.sunbeam;

public class Labor implements Emp {
	int hours;
	double rate;
	
	public Labor() {
	}
	
	public Labor(int hours, double rate) {
		this.hours = hours;
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public double getSal() {
		return (hours * rate);
	}
	
	@Override
	public double calcIncentives() {
		double incentives = 0.0;
		if(hours > 300)
			incentives = (hours * rate) * 0.05;
		return incentives;
	}
}
