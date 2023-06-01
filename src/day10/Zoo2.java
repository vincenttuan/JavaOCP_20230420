package day10;

public class Zoo2 {

	public static void main(String[] args) {
		
		Dog dog = new Dog("狗", 4);
		Fish fish = new Fish("魚", 0);
		Bird bird = new Bird("鳥", 2);
		Ostrich ostrich = new Ostrich("鴕鳥", 2);
		
		//Bird[] birds = { bird, ostrich };
		Bird b1 = ostrich;
		((Ostrich)b1).spirit(); // 鴕鳥精神
		b1.move();
		
		Ostrich o1 = ostrich;
		o1.spirit(); // 鴕鳥精神
		o1.move(); // 鴕鳥不會飛
	}

}
