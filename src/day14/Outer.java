package day14;

//一般類別(外部類別)
public class Outer {
	
	// 一般內部類別
	public class Inner {
		public void hello() {
			System.out.println("Hello Inner Class");
		}
	}
	
	public static void main(String[] args) {
		Outer ou = new Outer();
		Outer.Inner in = ou.new Inner();
		in.hello();
	}
	
}
