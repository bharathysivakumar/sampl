package ggg;

public class Fruit {
protected String name;
protected String taste;
protected int size;
public Fruit() {
	name="Fruit name";
	taste="taste of the fruit";
	size=0;
}
public void eat() {
	System.out.println(name+"likes fruit"+taste);
}
}
 class  Apple extends Fruit{
	public void eat() {
		System.out.println("the taste is good");
	}
}
 
 class Orange extends Fruit{
	 public void eat() {
			System.out.println("the taste is good");
		} 
 }
 class Main9{
	 public static void main(String[]arg) {
		 new Fruit().eat();
		 new Apple().eat();
		 new Orange().eat();
		 
	 }
 }