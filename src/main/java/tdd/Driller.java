package tdd;

public class Driller {
    public int numberOFCopies(int numCopies) {
        int price = 0;
        if (numCopies >= 1 && numCopies <= 4) price = numCopies * 2000;
        if (numCopies >= 5 && numCopies <= 9) price = numCopies * 1800;
        if (numCopies >= 10 && numCopies <= 29) price = numCopies * 1600;
        if (numCopies >= 30 && numCopies <= 49) price = numCopies * 1500;
        if (numCopies >= 50 && numCopies <= 99) price = numCopies * 1300;
        if (numCopies >= 100 && numCopies <= 199) price = numCopies * 1200;
        if (numCopies >= 200 && numCopies <= 499) price = numCopies * 1100;
        if (numCopies > 500) price = numCopies * 1000;

        return price;
    }

}
