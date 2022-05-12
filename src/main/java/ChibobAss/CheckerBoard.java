package ChibobAss;

public class CheckerBoard {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
                    System.out.print("* ");
                    System.out.print(" ");
                }
        for(int j = 1; j <= 8; j++){
            if(j % 2 == 0) {
                System.out.print(" ");
            }  else
            System.out.println("*");
        }
        System.out.println();

            }

}
