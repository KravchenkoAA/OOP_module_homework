package com.gmail.a.a.kravchenko;

public class Circle extends Shape {
	private Point centrePoint;
	private Point circlePoint;

	public Circle(Point centrePoint, Point circlePoint) throws IllegalArgumentException {
		super();
		this.name = "Circle  ";
		try {
			toCheckConditionCircle(centrePoint, circlePoint);
			this.centrePoint = centrePoint;
			this.circlePoint = circlePoint;
		} catch (Exception e) {
			throw e;
		}
	}

	public Circle() {
		super();
		this.name = "Circle  ";
	}

	public Point getCentrePoint() {
		return centrePoint;
	}

	public void setCentrePoint(Point centrePoint) {
		this.centrePoint = centrePoint;
	}

	public Point getCirclePoint() {
		return circlePoint;
	}

	public void setCirclePoint(Point circlePoint) {
		this.circlePoint = circlePoint;
	}

	@Override
	public String toString() {
		return "Circle [centrePoint=" + centrePoint + ", circlePoint=" + circlePoint + "]";
	}

	private void toCheckConditionCircle(Point centrePoint, Point circlePoint) throws IllegalArgumentException {
		if ((centrePoint.getX() == circlePoint.getX()) && (centrePoint.getY() == circlePoint.getY())) {
			throw new IllegalArgumentException("Was input illegal argument for circle construction");
		}
	}

	public double getRadius() {
		return centrePoint.getLeinght(circlePoint);
	}

	public double getPerimetr() {
		return 2 * Math.PI * getRadius();
	}

	public double getArea() {
		return Math.PI * getRadius() * getRadius();
	}
	
}
