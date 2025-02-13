//Write a java program that computes the are of a circle, rectangle and a cylinder using function overloading
public class Program_019 {
    //Overloading method for circle
    static double calculateArea(double radius){
        return Math.PI * radius * radius;
    }
    //Overloading method for rectangle
    static double calculateArea(double length,double breadth){
        return length * breadth;
    }
    //Overloading method for Cylinder
    static double calculateArea(double height,double radius,boolean isCylinder){
        if(isCylinder){
            return 2 * Math.PI * radius * (height + radius);
        }else{
            return -1;
        }
    }

    public static void main(String[] args){
        double circleArea = calculateArea(5.0);
        double rectangleArea = calculateArea(4.0, 6.0);
        double cylinderArea = calculateArea(3.0, 7.0, true);

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Surface Area of Cylinder: " + cylinderArea);
    }
}
