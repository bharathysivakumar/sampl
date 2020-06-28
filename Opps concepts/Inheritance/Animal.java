package ggg;

public class Animal{
	public void eat() {
		System.out.println("animals can eat");
		
	}
	public void sleep() {
		System.out.println("animals can sleep");
		
	}
}
class Bird extends Animal{
	public void eat() {
		System.out.println("animals can eat");
		
	}
	public void sleep() {
		System.out.println("animals can sleep");
		
	}
	public void fly() {
		System.out.println("Brids acn fly");
	}
	public static void main(String arg[]) {
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}
}
