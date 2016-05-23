package Interfaces;

public class Main {
    public static void main(String[] args) {
        Shape[] all = {
                new Triangle(4, 5, 6),
                new Square(5),
                new Circle(8)
        };

        for (Shape i : all) {
            i.getPerimeter();
        }
    }
}
