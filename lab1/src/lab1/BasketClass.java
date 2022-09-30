package lab1;

//task 9
public class BasketClass {
	
	public static int blueBalls = 0;
	public static int ballsWeight = 0;
	
	public static void catchABall(String bColor, int bWeight) {
		if (bColor == "blue")
			blueBalls++;
		ballsWeight += bWeight;
	}
	
	public static void whatsInTheBasket() {
		System.out.printf("there are %s blue balls in the basket, common weight - %s g.", blueBalls, ballsWeight);
	}
}