package lab1;

import java.util.List;

public class executionClass {

	public static void main(String args[]) {
		//task 1
		System.out.printf("%.5f\n", logicClass.t1Expression(12, 15));
		
		//task 2
		System.out.println(logicClass.t2DotsInFigure(3, 4));
		
		//task 3
		double a = Math.toRadians(0), b = Math.toRadians(360), h = Math.toRadians(45); 
		List<Double> t3values = logicClass.t3Tan(a, b, h);
		for (double value : t3values) {
			System.out.printf("%.1f\t", Math.toDegrees(a));
			double delta = 10E-10;
			double d = Math.cos(a);
			if (d > -delta && d < delta)
				System.out.println("undefined");
			else
				System.out.printf("%.4f\n", value);
			a += h;			
		}
		
		//task 4
		int arr4[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		List<Integer> t4values = logicClass.t4Prime(arr4);
		for (int value : t4values) {
			System.out.printf("%s ", value);
		}
		System.out.println();
		
		//task 5
		int arr5[] = {3, 1, 2, 4, 5, 2, 6, 7};
		System.out.println(logicClass.t5LongestSubseq(arr5));
		
		//task 6, no logic method
		int arr6[] = {1, 2, 3, 4, 5};
		int n = arr6.length;
		int s = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%s\t", arr6[(s + j) % 5]);
			}
			System.out.println();
			s++;
		}
		
		//task 7
		int arr7[] = {1, 7, 6, 8, 1, 4, 4, 8, 7, 8, 2, 5};
		System.out.println(logicClass.t7ShellSort(arr7));
		
		//task 8 
		int arrA[] = {1, 3, 5, 7, 9}, arrB[] = {0, 2, 4, 6, 8, 10};
		System.out.println(logicClass.t8ElemInsert(arrA, arrB));
		
		//task 9
		BallClass.throwABall("blue", 100);
		BallClass.throwABall("red", 50);
		BallClass.throwABall("green", 70);
		BallClass.throwABall("blue", 100);
		BallClass.throwABall("yellow", 60);
		BasketClass.whatsInTheBasket();
	}
}