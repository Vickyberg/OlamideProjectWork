package ChapterTen;

import ChapterEight.Composition.Date;

public class PieceWorker  extends Employee{
    private double wage;
    private int piece;

    public PieceWorker(String firstName, String secondName, String socialSecurityNumber, Date date, double wage, int piece) {
        super(firstName, secondName, socialSecurityNumber, date);
        this.wage = wage;
        this.piece = piece;
    }

    public double getWage() {
        return wage;
    }

    public int getPiece() {
        return piece;
    }

    @Override
    public Date getDate() {
        return new Date(7,3,2022);
    }

    @Override
    public double earnings() {
        return getPiece() * getWage();
    }

    @Override
    public String toString(){
        return String.format("%s%n %s$%s%n %s%s%n",super.toString(),"Wage per piece: ",getWage(),"Number of pieces produced: ",getPiece());
    }
}
