import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Point3d pointOne = pointDesignation();
        Point3d pointTwo = pointDesignation();
        Point3d pointThree = pointDesignation();

        if (pointOne.equalsTo(pointTwo) || pointOne.equalsTo(pointThree) || pointTwo.equalsTo(pointThree)){
            System.out.println("Try other digits");
        } else{
            System.out.println("The square of triangle equals: ");
            System.out.printf("%.2f", computeArea(pointOne, pointTwo, pointThree));
        }
    }
    public static Point3d pointDesignation(){
        double x = 0;
        double y = 0;
        double z = 0;
        System.out.println("Enter three digits X, Y and Z: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()){
            x = sc.nextDouble();
            y = sc.nextDouble();
            z = sc.nextDouble();
        }
        Point3d point3d = new Point3d(x, y, z);
        return point3d;
    }
    public static double computeArea(Point3d pointOne, Point3d pointTwo, Point3d pointThree){
        double A = pointOne.distanceTo(pointTwo);
        double B = pointTwo.distanceTo(pointThree);
        double C = pointThree.distanceTo(pointOne);
        double halfPerimeter = (A + B + C)/2;
        return Math.sqrt(halfPerimeter*(halfPerimeter-A)*(halfPerimeter-B)*(halfPerimeter-C));
    }
}
