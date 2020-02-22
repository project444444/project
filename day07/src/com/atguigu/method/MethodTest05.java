package com.atguigu.method;

public class MethodTest05 {
	public static void main(String[] args) {
		zhiShu(100);
	}
	public static void zhiShu(int num) {
		for (int i = 2; i < num; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}
	}
}
