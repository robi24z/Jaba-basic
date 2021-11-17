package inheritance;

public class Circle {
	double radius;
	String color;

	Circle() {
		System.out.println("Circle class");

	}

	Circle(double radius) {
		this.radius = radius;
	}

	double getArea() {

		return 3.14 * radius * radius;

	}

	double getRadius() {

		return radius;

	}

}
