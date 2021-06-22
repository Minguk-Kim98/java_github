class Triangle {
	double base;
	double height;
	
	public Triangle(double b, double h) {
		base = b;
		height = h;
	}
	
	double findArea() {
		return base * height * 0.5;
	}
}
public class TriangleTest {
	public static void main(String[] args) {
		Triangle t = new Triangle(10.0, 5.0);
		System.out.println(t.findArea());
	}
}
