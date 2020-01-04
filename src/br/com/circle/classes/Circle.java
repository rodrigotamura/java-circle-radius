package br.com.circle.classes;

import br.com.circle.interfaces.Form;

public class Circle implements Form
{
    protected double radius;
    
    public void setRadius(double raio) {
        this.radius = raio;
    }
    
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}