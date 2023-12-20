package HW1;

import HW1.Shape.Circle;
import HW1.Shape.Rectangle;
import HW1.Shape.Rectangle.Square;

public class Main {
    
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getCalculateArea(5));
        System.out.println(circle.getCalculatePerimeter(5) + "\n");

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getCalculateArea(5, 3));
        System.out.println(rectangle.getCalculatePerimeter(5, 3) + "\n");


        Square square = new Square();
        System.out.println(square.getCalculateArea(5));
        System.out.println(square.getCalculatePerimeter(5));
    }
}
