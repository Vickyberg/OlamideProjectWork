package ChapterTen.ShapeHierarchy;

public  class TwoDimensionalShape extends Shape {
    public TwoDimensionalShape(double width, double height) {
        super(width, height);
    }


    @Override
    public String toString(){
        return String.format("%s",super.toString());
    }

}
