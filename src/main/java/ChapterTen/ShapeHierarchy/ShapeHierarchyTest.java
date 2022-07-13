package ChapterTen.ShapeHierarchy;

import java.util.Arrays;
import java.util.Locale;

public class ShapeHierarchyTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3.0,5.0);
        Cube cube = new Cube(3.0,5.0,4.5,7.0);
        Sphere sphere = new Sphere(2.0,3.4,5,5);

        System.out.println("=".repeat(40));
        System.out.println("SHAPE CALCULATION INDIVIDUALLY");
        System.out.println("=".repeat(40));

        System.out.printf("%s%n",triangle);
        System.out.println("=".repeat(40));

        System.out.printf("%s%n",cube);
        System.out.println("=".repeat(40));

        System.out.printf("%s%n",sphere);
        System.out.println("=".repeat(40));


        Shape [] shapes =  new Shape [3];
        shapes[0] = triangle;
        shapes[1] = cube;
        shapes[2] = sphere;

        System.out.println("SHAPE CALCULATION POLYMORPHICALLY");
        System.out.println("=".repeat(40));


                for (int i = 0; i < shapes.length; i++) {
                    if(shapes[i] instanceof ThreeDimensionalShape){
                        ThreeDimensionalShape threeDimensionalShape = (ThreeDimensionalShape) shapes[i];
                        System.out.printf("%s%n Shape at %d is %s%n  ",shapes[i],i,shapes[i].getClass().getName());
                        System.out.println("=".repeat(40));


                    }
                    else if (shapes[i] instanceof  TwoDimensionalShape){
                        TwoDimensionalShape twoDimensionalShape = (TwoDimensionalShape) shapes[i];
                        System.out.printf(" %s%n Shape at %d is %s%n ",shapes[i],i,shapes[i].getClass().getName());
                        System.out.println("=".repeat(40));
                }

        }









    }
}
