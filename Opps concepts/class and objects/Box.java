package ggg;

public class Box {
	double h,w,d;
	public Box(double width,double height,double depth) {
		h=height;
		w=width;
		d=depth;
	}
	double volume() {
		double v;
		v=h*w*d;
		return v;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Box b= new Box(8.5,80.3,9.6);
System.out.println(b.volume());
	}

}
