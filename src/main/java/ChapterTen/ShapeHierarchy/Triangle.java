package ChapterTen.ShapeHierarchy;

public class Triangle extends TwoDimensionalShape{
    public Triangle(double width, double height) {
        super(width, height);
    }


    public double getArea() {
        return 0.5 * (getHeight() * getHeight());
    }

    @Override
    public String toString(){
        return String.format("%s%n %s%n %s%s","To Calculate Area of Triangle ",super.toString(),"Area: ",getArea());
    }
}
