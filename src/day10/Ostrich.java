package day10;

public class Ostrich extends Bird {
 
	public Ostrich(String name, int legs) {
		super(name, legs);
	}
	 
	public void move() {
		System.out.println("鴕鳥不會飛");
	}
	 
	public void spirit() {
		System.out.println("鴕鳥精神");
	}
	 
}
 
