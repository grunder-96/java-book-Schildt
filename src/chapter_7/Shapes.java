package chapter_7;

	abstract class TwoDShape {
	private double width;
	private double height;
	private String name;
	
	TwoDShape() {
		width = height = 0.0;
		name = "none";
	}
	
	TwoDShape(double x, String n) {
		width = height = x;
		name = n;
	}
	
	TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}
	
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
	
	void showDim() {
		System.out.println("Ширина и высота: " + width + ", " + height);
	}
	
	double getWidth() {
		return width;
	}
	
	double getHeight() {
		return height;
	}
	
	void setWidth(double param) {
		width = param;
	}
	
	void setHeight(double param) {
		height = param;
	}
	
	String getName() {
		return name;
	}
	
	abstract double area();
}

class Triangle extends TwoDShape {
	String style;
	
	Triangle() {
		super();
		style = "none";
	}
	
	Triangle(double x) {
		super(x, "треугольник");
		style = "закрашенный";
	}
	
	Triangle(String s, double w, double h) {
		super(w, h, "треугольник");
		style = s;
//		setWidth(w);
//		setHeight(h);
	}
	
	Triangle(Triangle ob) {
		super(ob);
		style = ob.style;
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Треугольник: " + style);
	}
}

class ColorTriangle extends Triangle {
	private String color;
	
	ColorTriangle(String s, double w, double h, String c) {
		super(s, w, h);
		color = c;
	}
	
	String getColor() {
		return color;
	}
	
	void showColor() {
		System.out.println("Цвет - " + color);
	}
}

class Rectangle extends TwoDShape {
	
	Rectangle() {
		super();
	}
	
	Rectangle(double x) {
		super(x, "прямоугольник");
	}
	
	Rectangle(double x, double y) {
		super(x, y, "прямоугольник");
	}
	
	boolean isSquare() {
		if (getWidth() == getHeight()) {
			return true;
		}
		return false;
	}
	
	double area() {
		return getWidth() * getHeight();
	}
}

class Circle extends TwoDShape {
	
	Circle() {
		super();
	}
	
	Circle(double x, String name) {
		super(x, name);
	}
	
	Circle(Circle a) {
		super(a);
	}
	
	double area() {
		// TODO Auto-generated method stub
		return (Math.pow((getWidth() / 2), 2) * 3.14);
	}
}

public class Shapes {
	public static void main(String[] args) {
		
//		ColorTriangle ct1 = new ColorTriangle("контурный", 8.0, 12.0, "синий");
//		ColorTriangle ct2 = new ColorTriangle("закрашенный", 2.0, 2.0, "красный");
//		
//		Triangle t1 = new Triangle();
//		Triangle t2 = new Triangle("контурный", 8.0, 12.0);
//		Triangle t3 = new Triangle(4.0);
//		
//		t1 = t2;
//		
//		
//		Triangle t1 = new Triangle("закрашенный", 4.0, 4.0);
//		Triangle t2 = new Triangle("контурный", 8.0, 12.0);
//		
//		t1.setWidth(4.0);
//		t1.setHeight(4.0);
//		t1.style = "закрашенный";
//		
//		t2.setWidth(8.0);
//		t2.setHeight(12.0);
//		t2.style = "контурный";
//		
//		System.out.println("Информация о ct1");
//		ct1.showStyle();
//		ct1.showDim();
//		ct1.showColor();
//		System.out.println("Площадь - " + ct1.area());
//		
//		System.out.println();
//		
//		System.out.println("Информация о ct2");
//		ct2.showStyle();
//		ct2.showDim();
//		ct2.showColor();
//		System.out.println("Площадь - " + ct2.area());
//		
//		System.out.println();
//		
//		System.out.println("Информация о t3");
//		t3.showStyle();
//		t3.showDim();
//		System.out.println("Площадь - " +t3.area());
//		
//		
//		
//		Triangle t1 = new Triangle("контурный", 8.0, 12.0);
//		Triangle t2 = new Triangle(t1);
//		
//		System.out.println("Информация о t1");
//		t1.showDim();
//		t1.showStyle();
//		System.out.println("Площадь - " + t1.area());
//		
//		System.out.println();
//		
//		System.out.println("Информация о t2");
//		t2.showDim();
//		t2.showStyle();
//		System.out.println("Площадь - " +t2.area());
		
		TwoDShape[] shapes = new TwoDShape[5];
		shapes[0] = new Triangle("контурный", 8.0, 12.0);
		shapes[1] = new Rectangle(10);
		shapes[2] = new Rectangle(10, 4);
		shapes[3] = new Triangle(7.0);
		shapes[4] = new Circle(4.15, "круг");
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("Объект - " + shapes[i].getName());
			System.out.println("Площадь - " + shapes[i].area());
			System.out.println();
		}
	}

}
