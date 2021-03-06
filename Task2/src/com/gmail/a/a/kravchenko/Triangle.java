package com.gmail.a.a.kravchenko;

public class Triangle extends Shape {
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Triangle(Point pointA, Point pointB, Point pointC) throws IllegalArgumentException {
		super();
		this.name = "Triangle";
		try {
			toCheckConditionTriangle(pointA, pointB, pointC);
			this.pointA = pointA;
			this.pointB = pointB;
			this.pointC = pointC;
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}

	public Triangle(Point[] points) throws IllegalArgumentException {
		super();
		this.name = "Triangle";
		try {
			toCheckConditionTriangle(pointA, pointB, pointC);
			this.pointA = points[0];
			this.pointB = points[1];
			this.pointC = points[2];
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}

	public Triangle() {
		super();
		this.name = "Triangle";
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override
	public String toString() {
		return "Triangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
	}

	public double getSideAB() {
		return pointA.getLeinght(pointB);
	}

	public double getSideAC() {
		return pointA.getLeinght(pointC);
	}

	public double getSideBC() {
		return pointB.getLeinght(pointC);
	}

	private void toCheckConditionTriangle(Point pointA, Point pointB, Point pointC) throws IllegalArgumentException {
		double sideAB = pointA.getLeinght(pointB);
		double sideAC = pointA.getLeinght(pointC);
		double sideBC = pointB.getLeinght(pointC);
		if (((sideAC + sideBC) <= sideAB) || ((sideAB + sideBC) <= sideAC) || ((sideAB + sideAC) <= sideBC)) {
			throw new IllegalArgumentException("Was input illegal argument for triangle construction");
		}

	}

	public double getPerimetr() {
		return getSideAB() + getSideAC() + getSideBC();
	}

	public double getArea() {
		double semiPerimetr;
		semiPerimetr = getPerimetr() / 2;
		return Math.sqrt(semiPerimetr * (semiPerimetr - getSideAB()) * (semiPerimetr - getSideAC())
				* (semiPerimetr - getSideBC()));
	}

}
