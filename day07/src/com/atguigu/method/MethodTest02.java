package com.atguigu.method;

public class MethodTest02 {
	public static void main(String[] args) {
		int[] arr = {-1,3,5,5,3};
		PrintArr(arr);
	}
	public static void PrintArr(int... arr){
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else{
				System.out.print(arr[i] + ", ");
			}
		}
	}
}
