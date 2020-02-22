package com.atguigu.method;

public class MethodTest01 {
	public static void main(String[] args){
		System.out.println(compare(4,4));
	}
	public static boolean compare(int a, int b){
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}
}
