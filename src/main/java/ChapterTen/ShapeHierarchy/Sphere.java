package ChapterTen.ShapeHierarchy;

public class Sphere extends ThreeDimensionalShape{

    private double  radius;
    public Sphere(double width, double height, double depth, double radius) {
        super(width, height, depth);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public  double getArea(){
        return 4 * (Math.PI * (Math.pow(getRadius(),2)));
    }
    public double getVolume(){
        return (1.3 * (Math.PI * (Math.pow(getRadius(),3))));
    }

    @Override
    public String toString(){
        return String.format("%s%n %s%.2f%n %s%.2f%n","To Calculate area and Volume of a Sphere","Area: ",getArea(),"Volume: ",getVolume());
    }
}
