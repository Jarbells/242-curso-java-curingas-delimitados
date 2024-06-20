package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
	
		List<Shape> myShapes = new ArrayList<>();
		List<Rectangle> myRectangles = new ArrayList<>();
		myRectangles.add(new Rectangle(2.0, 3.0));
		myRectangles.add(new Rectangle(3.0, 2.0));
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(3.0));
		myCircles.add(new Circle(4.0));
		
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		double totalArea = totalArea(myCircles);
		System.out.println(totalArea);		
	}
	
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
