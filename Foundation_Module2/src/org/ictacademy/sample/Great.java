package org.ictacademy.sample;
import org.ictacademy.student.myFunc;

public class Great {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valName = "treesa";
		int x=10, y=20;
		int z=30;
		System.out.print(valName);
		if(x>y) {
			System.out.println(x);
		}
		else {
			System.out.println(y);
		}
		System.out.println(z*z);
		myFunc val = new myFunc();
		int result = val.Great(20, 3098);
		System.out.println("Greater number is");
		System.out.println(result);
	}

}
