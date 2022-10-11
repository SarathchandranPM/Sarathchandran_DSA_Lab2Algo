package com.greatlearning.java;

public class PayMoney {
	static int size = 5;
	static int numberOfTarget=4;
	static int[] transactions = new int[size];
	public static void main(String[] args) {
		System.out.println("Programme started");
		int target = 380;
		int initialValue = 0;

		transactions[0] = 190;
		transactions[1] = 60;
		transactions[2] = 30;
		transactions[3]=70;
		transactions[4]=5;
		
		int result= reachedTarget(initialValue,target);
		if (result==-1) {
			System.out.println("Target is not achieved ");
		}
		else {
			System.out.println("Target achieved after "+result+" transactions");
		}
		
		

	}

	private static int reachedTarget(int initialValue, int target) {
		int index = 0;
		while (initialValue < target&&index<size) {
			if (initialValue == target) {
				System.out.println("Target reached after "+(index-1)+" transactions");
				return index;
			}
			if(index>=numberOfTarget) {
				System.out.println("Target could not be achived after the target count");
				break;
			}
			initialValue = initialValue + transactions[index++];
		}
		if (initialValue>target) {
			return index;
		}
		return -1;
	}
}
