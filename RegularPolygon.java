
public class RegularPolygon {

	private int n; // number of polygin sides
	private double side; // length of side
	private double x; // x-coordinate of polygon's center
	private double y; // y-coordinate of polygon's center

	/*
	 * no-arg constructor
	 */
	public RegularPolygon() {
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}

	/**
	 * parameter constructor to hold/copy values to new object
	 * 
	 * @param num
	 * @param length
	 * @param p
	 * @param q
	 */
	public RegularPolygon(int num, double length, double p, double q) {
		n = num;
		side = length;
		x = p;
		y = q;
	}

	/**
	 * copy constructor to deep copy object
	 * 
	 * @param myObj
	 */
	public RegularPolygon(RegularPolygon myObj) {
		n = myObj.n;
		side = myObj.side;
		x = myObj.x;
		y = myObj.y;
	}

	/**
	 * sets value of number of sides of polygon
	 * 
	 * @param num
	 */
	public void setN(int num) {
		n = num;
	}

	/**
	 * sets length of length
	 * 
	 * @param length
	 */
	public void setSide(double length) {
		side = length;
	}

	/**
	 * sets x coordinates
	 * 
	 * @param p
	 */
	public void setX(double p) {
		x = p;
	}

	/**
	 * sets y coordinates
	 * 
	 * @param q
	 */
	public void setY(double q) {
		y = q;
	}

	/**
	 * @return n
	 */
	public int getN() {
		return n;
	}

	/**
	 * 
	 * @return side length
	 */
	public double getSide() {
		return side;
	}

	/**
	 * 
	 * @return x coordinates
	 */
	public double getX() {
		return x;
	}

	/**
	 * 
	 * @return y coordinates
	 */
	public double getY() {
		return y;
	}

	/**
	 * 
	 * @return perimeter of polygon
	 */
	public double getPerimeter() {
		return n * (side);
	}

	/**
	 * 
	 * @return area of polygon
	 */
	public double getArea() {
		double area = (n * (side * side)) / (4 * Math.tan(Math.PI / n));
		return area;
	}

}
