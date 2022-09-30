package lab1;

import java.util.ArrayList;
import java.util.List;

public class logicClass {
	
	//task1
	public static double t1Expression(double x, double y) {
		return ((1 + Math.sin(x + y)*Math.sin(x + y))/(2 + Math.abs(x - 2*x/(1 + x*x + y*y))) + x);
	}
	
	//task2
	public static boolean t2DotsInFigure(float x, float y) {
		//not including area border
		return ((x > -4 && x < 4 && y > 0 && y < 5) || (x > -6 && x < 6 && y > -3 && y < 0)) ? true : false;
	}
	
	//task 3
	public static List<Double> t3Tan(double a, double b, double h){
		List<Double> values = new ArrayList<Double>();
		double val;
		while (a <= b) {
			val = Math.tan(a);
			values.add(val);
			a += h;
		}
		return values;
	}
	
	//task 4
	public static List<Integer> t4Prime(int arr[]){
		List<Integer> positions = new ArrayList<Integer>();
		boolean flag;
		int num;
		for (int i = 0; i < arr.length; i++) {
			num = arr[i];
			double s = Math.sqrt(num);
			flag = true;
			for (int j = 2; j <= s; j++) {
				if (num % j == 0)
					flag = false;
			}
			if (flag && num != 0 && num != 1)
				positions.add(i);
		}
		return positions;
	}
	
	//task 5
	public static int t5LongestSubseq(int arr[]) {
		int n = arr.length, k = 0;
		int[] incSubseq = new int[n];	     
        for (int u = 0; u < n; u++ )
            incSubseq[u] = 1;     
        for (int i = 1; i < n; i++ )
            for (int j = 0; j < i; j++ )
                if (arr[i] > arr[j] && incSubseq[i] < incSubseq[j] + 1)
                	incSubseq[i] = incSubseq[j] + 1;
        for (int i = 0; i < n; i++ )
            if (k < incSubseq[i])
                k = incSubseq[i];
		return (n - k);
	}
	
	//task 7
	public static List<Integer> t7ShellSort(int arr[]){
		List<Integer> sortedArr = new ArrayList<Integer>();
		int n = arr.length;
		for (int step = n/2; step > 0; step /= 2) 
		    for (int i = step; i < n; i++) 
		        for (int j = i - step; j >= 0 && arr[j] > arr[j + step]; j -= step) {
		            int x = arr[j];
		            arr[j] = arr[j + step];
		            arr[j + step] = x;
		        }
		for (int num : arr) {
			sortedArr.add(num);
		}
		return sortedArr;
	}
	
	//task 8
	//output: -1 - all inserts before 0th element of arrA[n], 
	//n - all inserts after the last arrA's element
	public static List<Integer> t8ElemInsert(int arrA[], int arrB[]){
		List<Integer> positions = new ArrayList<Integer>();
		int buf = 0;
		for (int i = 0; i < arrB.length; i++) {
			for (int j = 0; j < arrA.length - 1; j++) {
				if (arrB[i] >= arrA[j]) {
					buf = j + 1;
				}
				if (arrB[i] < arrA[0]) {
					buf = -1;
				}
				if (arrB[i] >= arrA[arrA.length - 1]) {
					buf = arrA.length;
				}
			}
			positions.add(buf);
		}
		return positions;
	}
}