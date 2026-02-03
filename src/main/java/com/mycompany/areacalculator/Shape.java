package com.mycompany.areacalculator;

public abstract class Shape {
        
    public abstract double getArea();
    
    @Override
    public String toString() {
        return "Area: " + getArea(); 
    }
}
