package com.atguigu.method;

public class MethodTest06 {
	public static void main(String[] args) {
		boolean bool = doChec(280);
		System.out.println(bool);
		boolean bool1 = doChec(-271);
		System.out.println(bool1);
	}
	public static boolean doChec(int iVar){
		System.out.println("num = " + iVar);
		boolean flag = false;
		if (iVar %  2 == 0) {
			for (int i = 0; i <= 20; i++) {
				iVar -= i;
				flag = true;
				return true;
			}
			
		} else {
			for (int i = 0; i <= 20; i++) {
				iVar += i;
				flag = false;
				return flag;
			}
			
		}
		
	}
}
