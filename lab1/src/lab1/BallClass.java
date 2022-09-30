package lab1;

//task 9
public class BallClass {
	
	public static String color;
	public static int weight;
	
	public static void throwABall(String bColor, int bWeight) {
		BasketClass.catchABall(bColor, bWeight);
	}
}