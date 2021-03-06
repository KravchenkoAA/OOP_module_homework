package com.gmail.a.a.kravchenko;

public class Tetragon extends Shape {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;

	public Tetragon(Point pointA, Point pointB, Point pointC, Point pointD) throws IllegalArgumentException {
		super();
		this.name = "Tetragon";
		try {
			toCheckConditionTetragon(pointA, pointB, pointC, pointD);
			this.pointA = pointA;
			this.pointB = pointB;
			this.pointC = pointC;
			this.pointD = pointD;
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}

	public Tetragon() {
		super();
		this.name = "Tetragon";
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

	public Point getPointD() {
		return pointD;
	}

	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}

	@Override
	public String toString() {
		return "Tetragon [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + ", pointD=" + pointD + "]";
	}

	private boolean toCheckPointsOnLine(Point pointA, Point pointB, Point pointC) {
		if (((pointA.getX() - pointC.getX()) * (pointB.getY() - pointC.getY())
				- (pointB.getX() - pointC.getX()) * (pointA.getY() - pointC.getY())) == 0) {
			return true;
		} else {
			return false;
		}
	}

	private void toCheckConditionTetragon(Point pointA, Point pointB, Point pointC, Point pointD)
			throws IllegalArgumentException {
		if ((toCheckPointsOnLine(pointA, pointB, pointC) == true)
				|| (toCheckPointsOnLine(pointA, pointB, pointD) == true)
				|| (toCheckPointsOnLine(pointB, pointC, pointD) == true)
				|| (toCheckPointsOnLine(pointA, pointC, pointD) == true)) {
			throw new IllegalArgumentException("Was input illegal argument for tetragon construction");
		}
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

	public double getSideCD() {
		return pointC.getLeinght(pointD);
	}

	@Override
	double getPerimetr() {
		return getSideAB() + getSideBC() + getSideAC() + getSideCD();
	}

	@Override
	double getArea() {
		double semiPerimetr;
		semiPerimetr = getPerimetr() / 2;
		return Math.sqrt((semiPerimetr - getSideAB()) * (semiPerimetr - getSideAC()) * (semiPerimetr - getSideBC())
				* (semiPerimetr - getSideCD()));
	}

}
