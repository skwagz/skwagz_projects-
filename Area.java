import java.util.Scanner;
import java.lang.Math;
class Area {
    public static double circleArea(double radius){
        double circleArea = Math.PI* (radius*radius);
       
        return circleArea;
    }


    public static double tArea(double height, double base){
        double tArea = 0.5*base *height;

        return tArea;
    }

    public static double rArea(double length, double width){
        double rArea = length*width;

        return rArea;
    }
    
    
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Would you like to calculate the area of a circle, triangle, or rectangle: ");
        String shape = in.next();
        
        switch (shape.toLowerCase()) {
          
            case "circle":
            System.out.print("Enter radius: ");
            double radius = in.nextDouble(); 
            double area = circleArea(radius);   
            System.out.println("Total area: " + area);
                break;
          
            case "triangle":
            System.out.print("Enter height: ");
            double height = in.nextDouble();
            System.out.print("Enter base: ");
            double base = in.nextDouble();
            double area2 = tArea(height, base);
            System.out.println("Total area: " + area2);
           break;
            default:
            System.out.print("Enter length: ");
            double length = in.nextDouble();
            System.out.print("Enter width: ");
            double width = in.nextDouble();
            double area3 = rArea(length, width);
            System.out.println("Total area: " + area3);
                break;
        }
    }
}
