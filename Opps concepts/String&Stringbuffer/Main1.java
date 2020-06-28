package ggg;
import java.util.*;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
String str=sc.next();
String str1;
if(str.length()%2==0) {
	str1=str.substring(0,str.length()/2);
}
else {
	str1=null;
}
System.out.println(str1);
	}

}
