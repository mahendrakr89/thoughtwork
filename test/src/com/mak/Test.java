package com.mak;

public class Test {
	public void m2(){
		System.out.println("m2");
	}
	public void m1(){
		try{
			int a=10/0;
			System.out.println("after exp");
		}catch(ArithmeticException ae){
			System.out.println(ae);
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is gitHub");
		new Test().m1();
		new Test().m2();
		
		

	}

}
