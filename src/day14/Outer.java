package day14;

//一般類別(外部類別)
public class Outer {
	int x = 7; // Outer 的物件變數
	static int sx = 9; // Outer 的類別變數 
	// 一般內部類別
	public class Inner {
		int x = 77; // Inner 的物件變數
		public void hello() {
			int x = 777; // 區域變數
			System.out.println("Hello Inner Class");
			System.out.println("區域變數 x = " + x);
			System.out.println("Inner 的物件變數 x = " + this.x);
			System.out.println("Outer 的物件變數 x = " + Outer.this.x); // 內部類別才有的特殊寫法
			System.out.println("Outer 的物件變數 sx = " + Outer.sx);
		}
	}
	
	public static void main(String[] args) {
		Outer ou = new Outer();
		Outer.Inner in = ou.new Inner();
		in.hello();
	}
	
}
