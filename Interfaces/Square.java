package Interfaces;


public class Square implements Shape{
   private int sideA;

    public Square(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public void getPerimeter() {
        System.out.println("The Square perimeter is " + (this.sideA*4));

    }
}
