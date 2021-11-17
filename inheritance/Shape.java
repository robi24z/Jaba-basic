package inheritance;

public class Shape {
	public static void main(String args[]) {

		Circle c = new Circle(4);
		Cylinder cy = new Cylinder(4, 5);
		System.out.println(c.getRadius());
		System.out.println(c.getArea());
		System.out.println(cy.getHeight());
		System.out.println(cy.getVolume());
	}

}
