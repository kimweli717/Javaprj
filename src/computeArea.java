import java.util.Scanner;
public class computeArea {
    public static void main() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area = radius * radius * Math.PI;
        System.out.println("The area of the circle of radius " + radius + " is " + area );
    }
}
