class Triangle {
	private
		double base;
		double height;
	public Triangle(double b, double h) {
		base = b;
		height = h;
	}
	double findArea() {
		return base * height * 0.5;
	}
	public String isSameArea(Triangle t) {
		if (this.findArea() == t.findArea()) {
			return "����";
		}
		else {
			return "�ٸ���";
		}
	}
}
public class TriangleTest {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(10.0, 5.0);
		Triangle t2 = new Triangle(5.0, 10.0);
		Triangle t3 = new Triangle(8.0, 8.0);
		
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}
}
