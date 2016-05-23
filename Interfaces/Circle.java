package Interfaces;

public class Circle implements Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void getPerimeter() {
        System.out.println("The Circle perimeter is " + (Math.PI*(Math.sqrt(this.radius))));

    }
}
