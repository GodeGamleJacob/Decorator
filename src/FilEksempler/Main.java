package FilEksempler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Shape shape;

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangel());

        Shape greenCircle = new GreenShapeDecorator(new Circle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

        System.out.println("\nCircle of red border");
        greenCircle.draw();

        GetShapeFactory shapeFactory = new GetShapeFactory();

        shape = shapeFactory.shapeFactory(input);
        shape.draw();
    }
}