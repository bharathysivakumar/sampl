package ggg;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hi";
		String str1="hello";
		String str2;
		if(str.length()<str1.length())
			str2=str+str1+str;
		else
			str2=str1+str+str1;
		System.out.println(str2);

	}

}
