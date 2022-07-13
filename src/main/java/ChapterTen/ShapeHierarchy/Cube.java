package ChapterTen.ShapeHierarchy;

public class Cube extends ThreeDimensionalShape{

    private double face;
    public Cube(double width, double height, double depth,double face) {
        super(width, height, depth);
        this.face = face;
    }

    public double getFace() {
        return face;
    }

    public void setFace(double face) {
        this.face = face;
    }

    public double getArea(){
        return 6 *(Math.pow(getFace(),2));
    }

    private double getVolume(){
        return Math.pow(getFace(),3);
    }


    @Override
    public String toString(){
        return String.format("%s%n %s%n %s%s%n %s%s%n %s%s%n","To Calculate Area and Volume of A Cube","Shape Parameters:","Face: ",
                getFace(),"Area: ",getArea(),"Volume: ",getVolume());
    }

}
