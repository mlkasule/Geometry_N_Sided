/**
 * (Geometry: n-sided regular polygon)
 * 
 * In an n-sided regular polygon, all sides have the same length and all angles
 * have the same degree (i.e., the polygon is both equilateral and equiangular).
 * 
 * Design a class named RegularPolygon that contains:
 * 
 * - A private int data field named n that defines the number of sides in the
 * polygon with default value 3.
 * 
 * - A private double data field named side that stores the length of the side
 * with default value 1.
 * 
 * - A private double data field named x that defines the x-coordinate of the
 * polygon’s center with default value 0.
 * 
 * - A private double data field named y that defines the y-coordinate of the
 * polygon’s center with default value 0.
 * 
 * - A no-arg constructor that creates a regular polygon with default values.
 * 
 * - A constructor that creates a regular polygon with the specified number of
 * sides and length of side, centered at (0, 0).
 * 
 * - A constructor that creates a regular polygon with the specified number of
 * sides, length of side, and x- and y-coordinates.
 * 
 * - The accessor and mutator methods for all data fields.
 * 
 * - The method getPerimeter() that returns the perimeter of the polygon.
 * 
 * - The method getArea() that returns the area of the polygon.
 * 
 * 
 * The formula for computing the area of a regular polygon is:
 * 
 * Area = n * s^2 / (4 * tan(pi / n))
 * 
 * Draw the UML diagram for the class and then implement the class.
 * 
 * Write a test program that creates three RegularPolygon objects, created using
 * the no-arg constructor, using RegularPolygon(6, 4), and using
 * RegularPolygon(10, 4, 5.6, 7.8).
 * 
 * For each object, display its perimeter and area.
 * 
 * @author Mark Kasule
 *
 */
public class Exercise09_09 {

	public static void main(String[] args) {

		// Polygon object 1
		RegularPolygon one = new RegularPolygon();
		// print the object
		System.out.println("Polygon 1 perimeter: " + one.getPerimeter());
		System.out.println("Polygon 1 area: " + one.getArea());

		// Polygon object 2
		RegularPolygon two = new RegularPolygon();
		// assign values to object
		two.setN(6);
		two.getN();
		two.setSide(4);
		two.getSide();
		// print the object
		System.out.println("Polygon 2 perimeter: " + two.getPerimeter());
		System.out.println("Polygon 2 area: " + two.getArea());

		// Polygon object 3
		RegularPolygon three = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("Polygon 3 perimeter: " + three.getPerimeter());
		System.out.println("Polygon 3 area: " + three.getArea());

	}

}
