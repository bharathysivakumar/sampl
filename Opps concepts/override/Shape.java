package ggg;

public class Shape {
public void draw() {
	System.out.println("shaping");
	
}
public void erase() {
	System.out.println("erasing shape");
}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("shaping");
		
	}
	public void erase() {
		System.out.println("erasing shape");
	}
}
class Sqaure extends Shape{
	public void draw() {
		System.out.println("shaping");
		
	}
	public void erase() {
		System.out.println("erasing shape");
	}
}
class Triangle extends Shape{
	public void draw() {
		System.out.println("shaping");
		
	}
	public void erase() {
		System.out.println("erasing shape");
	}
	public static void main(String arg[]) {
		Shape s=new Circle();
		Shape t=new Triangle();
		Shape s1=new Sqaure();
		s.draw();
		s.erase();
		t.draw();
		t.erase();
		s1.draw();
		s1.erase();
	}
}