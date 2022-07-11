package ChapterFive;

public class DeMorganLaw {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        boolean m  = !(x > 5 && y >= 7);
        boolean n = !(x > 5) || !(y >= 7 );
        System.out.println(m == n);

       int a =0;
       int b = 0;
       int g = 0;
       boolean w = !(a ==b || g != 5);
       boolean v = !(a == b) && !(g != 5);
        System.out.println(w == v);

        boolean s = !(x <= 8 && y > 4);
        boolean p = !((x <= 8) && (y > 4));
        System.out.println(s == p);

        int i = 0;
        int j = 0;
        boolean k = !((i > 4) || (j <= 6));
        boolean l = !(i > 4 )&& !(j<= 6) ;
        System.out.println(k == l);

    }
}
