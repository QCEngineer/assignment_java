package string.com;

import java.util.Scanner;

public class RelplaceStringCharPractice01 {

	public void stringAdd(String str) {


		char ch[]=str.toCharArray();

		for(int  i=0;i<ch.length;i++) {

			int a=(int)ch[i]+3;
			System.out.println((char)a);

		}
	}	

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		sc.close();

		RelplaceStringCharPractice01 obj =new RelplaceStringCharPractice01();
		obj.stringAdd(str);
	}

}
