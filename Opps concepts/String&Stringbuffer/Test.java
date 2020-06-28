package ggg;
import java.util.*;
public class Test {
	public String concat(String str1,String str2) {
		if(str1.length()!=0&&str2.length()!=0&&str1.charAt(str1.length()-1)==str2.charAt(0))
			return str1+str2.substring(1);
		return str1+str2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
Test t=new Test();
String str=sc.next();
String st=sc.next();
System.out.println("the given string are:"+str+","+st);
System.out.println("the string after concat is:"+t.concat(str , st));
	}

}
