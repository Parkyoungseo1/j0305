package t3_constructor;

public class Test4_2 {
	String model;
	String color = "블랙";
	int speed;
	
	Test4_2(String model) { // #1
		this(model, "흰색", 250);
	}
	
	Test4_2(String model, String color) {// #2
		this(model, color, 250);
	}

	Test4_2(String model, String color, int speed) {// #3
		this.model = model;
		this.color = color;
		this.speed = speed;
	}

}
