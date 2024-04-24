//폴더명 11_InnerClass
package com.kh.InOut;
/*
 * 클래스 안에 이름이 다른 클래스 선언*/

public class InnerClassOutClass {
	private int num = 10;
	
	public InnerClassOutClass() {
	}
	
	//내부클래스 만들기
	class InnerClass{
		void showOut() {
			System.out.println("숫자 : " + num);
		}
	}
	
	public static void main(String[] args) {
		InnerClassOutClass inout = new InnerClassOutClass();
		InnerClassOutClass.InnerClass in = inout.new InnerClass();
		in.showOut();
	}

}
