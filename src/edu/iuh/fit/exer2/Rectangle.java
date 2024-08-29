/*
 * @ (#) Rectangle.java       1.0  8/29/2024
 *   
 * Copyright (c) 2024 IUH. All rights reserred
 */
 
package edu.iuh.fit.exer2;


/*
 * @description:
 * @author: Nguyen Trong Dat
 * @date:   8/29/2024
 * @version:    1.0
 */
 

public class Rectangle {
    //properties
    private double length;
    private double width;
    //constructor
    public Rectangle() {
        this(0.0, 0.0);
    }

    public Rectangle(double length, double width) {
        if (length < 0.0 || width < 0.0)
            throw new IllegalArgumentException("Length and width must be greater than 0");
        this.length = length;
        this.width = width;
    }

    // Setters/Getters

    public void setLength(double length) {
        if (length < 0.0) throw new IllegalArgumentException("Length must be greater than 0");
        this.length = length;
    }

    public void setWidth(double width) {
        if (width < 0.0) throw new IllegalArgumentException("Width must be greater than 0");
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return width;
    }
    //get area
    public double getArea() {
        return this.length * this.width;
    }
    //get perimeter
    public double getPerimeter() {
        return this.length + this.width;
    }

    @Override
    public String toString() {
        return String.format("Rectangle[length=%.2f, width=%.2f, area=%.2f, perimeter=%.2f]",
                length, width, getArea(), getPerimeter());
    }
}


