package Objects;

public class ShapeCalcRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeCalc circle = new ShapeCalc();
		System.out.println(ShapeCalc.getNumTimesUsed());
		ShapeCalc rectangle = new ShapeCalc();
		System.out.println(ShapeCalc.getNumTimesUsed());
		ShapeCalc cylinder = new ShapeCalc();
		System.out.println(ShapeCalc.getNumTimesUsed());
		ShapeCalc circle2 = new ShapeCalc("Circle #2");
		System.out.println(ShapeCalc.getNumTimesUsed());
		
		circle.circleInfo(3);
		rectangle.rectangleInfo(6.5, 3.2);
		cylinder.cylinderInfo(2, 4, 7.054);
		ShapeCalc.circleInfo(9);
		System.out.println(ShapeCalc.getNumTimesUsed());
	}

}
