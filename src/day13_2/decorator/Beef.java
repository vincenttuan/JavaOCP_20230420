package day13_2.decorator;

import day13_2.Food;
import day13_2.SideDish;

public class Beef extends SideDish {

	public Beef(Food food) {
		super(food);
		name = "牛肉";
		price = 35;
	}
	
}
