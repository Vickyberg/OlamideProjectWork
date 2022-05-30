package ChapterEight;


public class Rectangle {

    private double Length = 1;
    private  double width = 1;

    public void setLength(double length) {
        if(length < 0.0 || length >= 20.0){
            throw new IllegalArgumentException("Length must be greater than" +
                    " 0 or less than 20");
        }
        this.Length = length;
    }

    public double getLength(){
        return Length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0.0 || width >= 20.0){
            throw  new IllegalArgumentException("Width must be greater than 0.0 a" +
                    "nd less than 20.0");
        }
        this.width = width;

    }

    public double calcAreaOfRectangle( double Length,double width) {
        double area;

        area = Length * width;
        return  area;
    }

    public double calcPerimeterOfRectangle(double length, double width) {
        double perimeter ;
        perimeter = 2 * (length + width);
        return perimeter;
    }
}
