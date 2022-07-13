package ChapterTen.ShapeHierarchy;

public  class Shape {
    private final double width;
    private final  double height;


    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString(){
        return String.format("%s%n %s%s%n %s%s%n","Shape Parameters: ","Height: ",getHeight(),"Width: ",getWidth());
    }

}
