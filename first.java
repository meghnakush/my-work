public class CircleCalculator {
   
    public static double getCircleArea(double radius) {
        
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        double radius = 5.0;
        double area = getCircleArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}