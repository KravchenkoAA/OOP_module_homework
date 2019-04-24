package com.gmail.a.a.kravchenko;

public abstract class Shape {
	String name;
	
	abstract double getPerimetr();
	
	abstract double getArea();
	
	public String toStringFigure() {
		return name;
	}
}
