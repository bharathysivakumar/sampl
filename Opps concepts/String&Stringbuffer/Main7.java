package ggg;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=str.length();
		String rep="";
		if(n<2)
			rep=str;
		else 
			rep=str.substring(2,5);
		String str1="";
		for(int i=0;i<n;i++) {
			str1+=rep;
		}
		System.out.println(str1);

	}

}
