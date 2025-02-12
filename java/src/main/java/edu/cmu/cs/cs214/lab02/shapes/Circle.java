package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    private double radius;
    
    public double getRadius() {
    	return this.radius;
    }
    public void setRadius(double radius) {
    	this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    
    public void draw() {
        System.out.println("Drawing Circle with area: " + getArea());
    }
}
