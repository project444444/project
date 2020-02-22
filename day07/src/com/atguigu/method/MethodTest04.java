package com.atguigu.method;

/*public class MethodTest04 {
	public static void main(String[] args) {
		Sum(100);
	}
	public static void Sum(int num) {
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
	}
}
*/
public class MethodTest04 {
	public static void main(String[] args) {
		int sum = getSum();
		System.out.println(sum);
	}
	public static int getSum(){
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += i;
		}
		return sum;
	}
}
