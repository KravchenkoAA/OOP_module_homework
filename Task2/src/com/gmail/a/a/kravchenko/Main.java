package com.gmail.a.a.kravchenko;

public class Main {

	public static void main(String[] args) {
		Board board = new Board();

		Point centrePoint = new Point(0, 0);
		Point circlePoint = new Point(2, 3);
		try {
			Circle oneCircle = new Circle(centrePoint, circlePoint);
			board.toAddFigure(oneCircle, 1);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		Point pointA = new Point(0, 0);
		Point pointB = new Point(0, 5);
		Point pointC = new Point(5, 0);
		Point pointD = new Point(8, 7);
		try {
			Tetragon oneTetragon = new Tetragon(pointA, pointB, pointC, pointD);
			board.toAddFigure(oneTetragon, 3);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		try {
			Triangle oneTriangle = new Triangle(pointA, pointB, pointC);
			board.toAddFigure(oneTriangle, 1);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		Point centrePointTwo = new Point(0, 0);
		Point circlePointTwo = new Point(3, 3);
		try {
			Circle twoCircle = new Circle(centrePointTwo, circlePointTwo);
			board.toAddFigure(twoCircle, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Before delete figure");
		board.toPrintInfo();

		board.toDeleteFigure(3);

		System.out.println('\r' + "After delete figure");
		board.toPrintInfo();
	}

}
