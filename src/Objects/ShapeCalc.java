package Objects;

public class ShapeCalc {
	public static int numTimesUsed = 0;
	public String shapeName = "";
	
	//constructors
	public ShapeCalc () {
		numTimesUsed++;
	}
	
	public ShapeCalc (String nameOfShape) {
		shapeName = nameOfShape;
		numTimesUsed++;
	}
	
	//methods
	public static void circleInfo(double radius) {
		System.out.println("Circumference = " + Math.PI*2*radius + "\nArea = " + Math.pow(radius, 2)*Math.PI);
	}
	
	public static void rectangleInfo(double length, double width) {
		System.out.println("Perimeter = " + (2*length + 2*width) + "\nArea = " + length*width);
	}
	
	public static void cylinderInfo(double radius, double height, double width) {
		System.out.println("Surface area = " + 2*Math.PI*radius*(radius+height) + "\nVolume = " + Math.PI*Math.pow(radius, 2)*height);
	}
	
	public static int getNumTimesUsed() {
		return numTimesUsed;
	}
}
