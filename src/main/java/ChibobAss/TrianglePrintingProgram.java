package ChibobAss;


public class TrianglePrintingProgram {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            for(int j =1 ; j <= i; j++)
            System.out.print("*");
            System.out.println();
        }
        System.out.println(" ");

        for(int i =1; i <= 10 ;i++){
            for(int h = 0; h <= 10-i; h++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println(" ");

        for(int i = 0; i <= 10; i++){
            for (int s =1 ; s< i+1; s++ )
                System.out.print(" ");
            for(int h = 10 ;h >i ;h--)
                System.out.print("*");
            System.out.println();

        }
        System.out.println();
        for(int i = 10 ; i>= 1; i--){
            for(int s = 0; s<i-1; s++)
                System.out.print(" ");
            for (int h = 10; h >i- 1; h--)
                System.out.print("*");
            System.out.println();
        }


   }
}
