package inheritance;

public class Cylinder extends Circle {
	double height;

	Cylinder() {

	}

	Cylinder(double radius) {
		this.radius = radius;
	}

	Cylinder(double radius, double height) {
		this.height = height;
		this.radius=radius;

	}

	double getHeight() {

		return height;

	}

	double getVolume() {

		return 3.14 *radius*radius*height;

	}
}
