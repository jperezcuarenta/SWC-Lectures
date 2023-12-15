package week11;

public class MetricDemo {
	public static void main(String[] args) {
		double miles, km;
		miles = 120.0;
		km = Metric.milesToKilometers(miles);
		System.out.println(miles + " miles in km: " + km + " km");
		}
	}
class Metric {
	public static double milesToKilometers(double m) {
		return m * 1.609;
		}
	}