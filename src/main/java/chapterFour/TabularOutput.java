package chapterFour;

public class TabularOutput {
    public static void main(String[] args) {
        int N = 1;
        System.out.println("N\tN2\tN3\tN4");

        while (N <= 5){
            System.out.printf("%d\t%d\t%d\t%d\n", N , (N*N), (N*N*N), (N*N*N*N));
            N++;
        }
    }

}
