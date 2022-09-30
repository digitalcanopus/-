package task10;

public class MainClass {
	
	public static int blueBalls = 0;
	public static int ballsWeight = 0;
	
	public static void main(String args[]) {		
		BallInBasket("blue", 100);
		BallInBasket("red", 50);
		BallInBasket("green", 70);
		BallInBasket("blue", 100);
		BallInBasket("yellow", 60);
		System.out.printf("there are %s blue balls in the basket, common weight - %s g.", blueBalls, ballsWeight);
	}
	
	public static void BallInBasket(String color, int weight) {
		if (color == "blue")
			blueBalls++;
		ballsWeight += weight;
	}
}