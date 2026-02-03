package com.mycompany.areaclaculator;

public class App {
    
    public static void main(String[] args) {

        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {

            String shapeType = Console.getString(
                "Calculate area of a circle, square, or rectangle? (c/s/r): "
            );

            Shape shape = null;

            if (shapeType.equalsIgnoreCase("c")) {
                System.out.println("\nCIRCLE:");
                double radius = Console.getDouble("Enter radius: ");
                shape = new Circle(radius);

            } else if (shapeType.equalsIgnoreCase("s")) {
                System.out.println("\nSQUARE:");
                double width = Console.getDouble("Enter width: ");
                shape = new Square(width);

            } else if (shapeType.equalsIgnoreCase("r")) {
                System.out.println("\nRECTANGLE:");
                double width = Console.getDouble("Enter width: ");
                double height = Console.getDouble("Enter height: ");
                shape = new Rectangle(width, height);
            }

            System.out.println(shape);
            choice = Console.getString("\nContinue? (y/n): ");
            System.out.println();
        }
    }
}
