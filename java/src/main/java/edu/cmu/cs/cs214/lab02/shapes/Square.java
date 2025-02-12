package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private double sideLen;
    
    public void setSideLen(double sideLen) {
    	this.sideLen = sideLen;
    }
    public double getSideLen() {
    	return this.sideLen;
    }

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }

    public double getArea() {
        return sideLen * sideLen;
    }

    public void draw() {
        System.out.println("Drawing Square with area: " + getArea());
    }
}
