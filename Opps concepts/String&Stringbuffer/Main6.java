package ggg;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ab*cd";
		String[] str1=str.split(".[\\*]+.");
		StringBuffer sb=new StringBuffer();
		for(String x:str1)
			sb.append(x);
		System.out.println(sb);

	}

}
