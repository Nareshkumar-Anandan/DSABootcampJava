package assignmentsolutions.conditionalLoops;

import java.util.Scanner;

public class AreaAndPerimeters {

    static Scanner sc = new Scanner(System.in);

    static void areaEquilateralTriangle() {
        System.out.print("Enter side: ");
        double side = sc.nextDouble();

        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.println("Area = " + area);
    }

    static void perimeterCircle() {
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter = " + perimeter);
    }

    static void perimeterEquilateralTriangle() {
        System.out.print("Enter side: ");
        double side = sc.nextDouble();

        System.out.println("Perimeter = " + (3 * side));
    }

    static void perimeterParallelogram() {
        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.println("Perimeter = " + (2 * (a + b)));
    }

    static void perimeterRectangle() {
        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        System.out.println("Perimeter = " + (2 * (length + breadth)));
    }

    static void perimeterSquare() {
        System.out.print("Enter side: ");
        double side = sc.nextDouble();

        System.out.println("Perimeter = " + (4 * side));
    }

    static void perimeterRhombus() {
        System.out.print("Enter side: ");
        double side = sc.nextDouble();

        System.out.println("Perimeter = " + (4 * side));
    }

    static void volumeCone() {
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        double volume = (Math.PI * r * r * h) / 3;
        System.out.println("Volume = " + volume);
    }

    static void volumePrism() {
        System.out.print("Enter base area: ");
        double baseArea = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        System.out.println("Volume = " + (baseArea * height));
    }

    static void volumeCylinder() {
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        double volume = Math.PI * r * r * h;
        System.out.println("Volume = " + volume);
    }

    static void volumeSphere() {
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * r * r * r;
        System.out.println("Volume = " + volume);
    }

    static void volumePyramid() {
        System.out.print("Enter base area: ");
        double baseArea = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        System.out.println("Volume = " + ((baseArea * height) / 3));
    }

    static void curvedSurfaceAreaCylinder() {
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        double csa = 2 * Math.PI * r * h;
        System.out.println("Curved Surface Area = " + csa);
    }

    static void totalSurfaceAreaCube() {
        System.out.print("Enter side: ");
        double side = sc.nextDouble();

        double tsa = 6 * side * side;
        System.out.println("Total Surface Area = " + tsa);
    }

    public static void main(String[] args) {

        System.out.println("1. Area of Equilateral Triangle");
        System.out.println("2. Perimeter of Circle");
        System.out.println("3. Perimeter of Equilateral Triangle");
        System.out.println("4. Perimeter of Parallelogram");
        System.out.println("5. Perimeter of Rectangle");
        System.out.println("6. Perimeter of Square");
        System.out.println("7. Perimeter of Rhombus");
        System.out.println("8. Volume of Cone");
        System.out.println("9. Volume of Prism");
        System.out.println("10. Volume of Cylinder");
        System.out.println("11. Volume of Sphere");
        System.out.println("12. Volume of Pyramid");
        System.out.println("13. Curved Surface Area of Cylinder");
        System.out.println("14. Total Surface Area of Cube");

        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> areaEquilateralTriangle();
            case 2 -> perimeterCircle();
            case 3 -> perimeterEquilateralTriangle();
            case 4 -> perimeterParallelogram();
            case 5 -> perimeterRectangle();
            case 6 -> perimeterSquare();
            case 7 -> perimeterRhombus();
            case 8 -> volumeCone();
            case 9 -> volumePrism();
            case 10 -> volumeCylinder();
            case 11 -> volumeSphere();
            case 12 -> volumePyramid();
            case 13 -> curvedSurfaceAreaCylinder();
            case 14 -> totalSurfaceAreaCube();
            default -> System.out.println("Invalid Choice!");
        }
    }
}