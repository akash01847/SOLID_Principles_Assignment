import java.util.Scanner;

// This code defines the main method for a program that calculates the area of a rectangle and a square.
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            Rectangle object = new Rectangle();
            System.out.println("\nEnter the height of rectangle: ");
            object.setHeight(sc.nextInt());

            System.out.println("\nEnter the width of rectangle: ");
            object.setWidth(sc.nextInt());

            System.out.println("\nArea of rectangle is: " + object.getArea());

            Square object2 = new Square();
            System.out.println("\nEnter the side of square: ");
            object2.set_square_side(sc.nextInt());

            System.out.println("\nArea of square is: " + object2.getArea());
        }
    }
}
