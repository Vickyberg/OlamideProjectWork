package ChapterTen.ShapeHierarchy;

import java.util.Arrays;

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



            for (Shape shape: shapes){
                for (int i = 0; i < shapes.length; i++) {
                    if(shape instanceof ThreeDimensionalShape){
                        System.out.printf("Shape at %d is %n%s%n ",i,shapes[i].getClass().getName());

                    }
                    else if(shape instanceof  TwoDimensionalShape){
                        System.out.printf("Shape at %d is %n%s%n ",i,shapes[i].getClass().getName());

                    }
                }

        }
        System.out.println("=".repeat(40));








    }
}
