package ggg;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a,b="";
		Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
a=sc.next();
int n=a.length();
for(int i=n-1;i>=0;i--) {
	b=b+a.charAt(i);
}
if(a.equalsIgnoreCase(b)) {
	System.out.println("the string is palindrome");
	
}
else {
	System.out.println("the string is  not palindrome");
}
	}

}
