package com.ramya.main;
import java.util.Scanner;

public class PayMoney {
	private static Scanner sc1 = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the size of transaction array");
		int size = sc1.nextInt();
		System.out.println("Enter the values of array");
		Scanner sc = new Scanner(System.in);
		int[] values = new int[size];
		for (int i = 0; i < size; i++) {
			values[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targets = sc1.nextInt();
		System.out.println("Enter the value of target");
		int value = sc1.nextInt();
		int count = 0;
		int transaction = 0;
		for (int i = 0; i < values.length; i++) {
			transaction++;
			count = count + values[i];
			if (count > value) {
				System.out.println("Target achieved after " + transaction + " transactions");
				break;
			} else if (transaction == targets) {
				System.out.println("Given target is not achieved ");
			}
		}
	}
}
