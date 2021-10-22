/*
 * Vivian Do
 * ID: 002-48-6640
 * July 02, 2021
 *
 * Lab 8: Circle Client Class
 */
public class lab8_CircleClient {
    public static void main(String[] args) {
        //creating a new object for the point and circle class
        //point = (10, 5)
        lab8_Point point = new lab8_Point(10, 5);
        //radius = 7
        lab8_Circle circle = new lab8_Circle(point, 7);

        //prints the circle
        System.out.println(circle);
        //prints the circumference results of the circle
        System.out.println("Circumference: " + circle.getCircumference());
        //prints the area results of the circle
        System.out.println("Area: " + circle.getArea());

        //creating a new object in point class to check to see if the point lies withing the circle or not
        lab8_Point point2 = new lab8_Point(5, 7);
        //if prints when point is in the circle
        if(circle.contains(point2)) {
            System.out.println("(" + point2 + ") lies within the circle.");
        }
        //else prints when point is not in the circle
        else {
            System.out.println("(" + point2 + ") does not lie within the circle.");
        }
    }
}
