import java.util.Scanner;

public class Main {
	private static Scanner in = new Scanner(System.in);

	/**
	 * Да се въведат два масива от N елемeнта - цели числа. Да се изведат всички
	 * елементи, които се срещат и в двата масива.
	 */
	public static void task1() {
		int N = in.nextInt();
		int a[] = new int[N];
		int b[] = new int[N];

		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}

		for (int i = 0; i < b.length; i++) {
			b[i] = in.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
					break;
				}
			}
		}
	}

	/**
	 * Имате двумерен масив от естествени числа от интервала [0..100].  Да се
	 * състави програма, чрез която се извеждат елементите от масива с
	 * най-малката и най-голямата стойност заедно с индексите, на които се
	 * намират.
	 */
	public static void task2() {
		int a[][] = new int[(int) (1.0 + Math.random() * 10)][(int) (1.0 + Math
				.random() * 10)];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 101);
			}
		}

		int min = a[0][0];
		int max = a[0][0];
		int minI = 0;
		int minJ = 0;
		int maxI = 0;
		int maxJ = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
					minI = i;
					minJ = j;
				}
				if (a[i][j] > max) {
					max = a[i][j];
					maxI = i;
					maxJ = j;
				}
			}
		}

		System.out.println(min);
		System.out.println(minI + " " + minJ);
		System.out.println(max);
		System.out.println(maxI + " " + maxJ);
	}

	/**
	 * Даден е масив с 10 елемента. Да се намери максималния измежду елементите
	 * с четен индекс и минималния измежду елементите с нечетен индекс.
	 */
	public static void task3() {
		int a[] = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 101);
		}

		int max = a[0];
		int min = a[1];
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0 && max < a[i]) {
				max = a[i];
			}
			if (i % 2 == 1 && min > a[i]) {
				min = a[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
	}

	public static void main(String[] args) {
		task1();
		task2();
		task3();
	}
}
