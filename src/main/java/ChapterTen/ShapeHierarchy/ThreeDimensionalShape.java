package ChapterTen.ShapeHierarchy;

public class ThreeDimensionalShape extends TwoDimensionalShape{
    private final double depth;

    public ThreeDimensionalShape(double width, double height, double depth) {
        super(width, height);
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }


    @Override
    public String toString(){
        return String.format("%s%n %s%s%n",super.toString(),"Depth: ",getDepth());
    }

}
