package day09;

public class User {
	private double height; // 身高
	private double weight; // 體重
	
	public User() { // 建構子
		System.out.println("建構子1");
	}
	
	public User(double h, double w) { // 建構子封裝
		System.out.println("建構子2");
		height = h;
		weight = w;
	}
	
	// 自訂商業方法
	public double getBmi() {
		double bmi = weight / Math.pow(height/100,  2);
		return bmi;
	}
	
	// 方法封裝(getter()與setter())
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
