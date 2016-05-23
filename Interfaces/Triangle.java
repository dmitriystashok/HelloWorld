package Interfaces;


public class Triangle implements Shape {
    private int sideA;
    private int sideB;
    private int sideC;


    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void getPerimeter() {
        System.out.println("The Triangle perimeter is " + (this.sideA + this.sideB + this.sideC));
    }
}
