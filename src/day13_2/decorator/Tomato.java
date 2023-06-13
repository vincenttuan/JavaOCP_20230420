package day13_2.decorator;

import day13_2.Food;
import day13_2.SideDish;

public class Tomato extends SideDish {

	public Tomato(Food food) {
		super(food);
		name = "番茄";
		price = 12;
	}
	
}
