package Chapter14.String;

public class StringMiscellaneous2 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "GOODBYE";
        String s3 = "  spaces  ";
        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%n",s1,s2,s3);
        System.out.printf("Replace 'l' with 'L' in s1: %s%n%n",s1.replace('l','L'));
        System.out.printf("s3 after trim: \"%s\"%n",s3.trim());

        System.out.printf("s1 to upper case: %s%n",s1.toUpperCase());
        System.out.printf("s2 to lower case: %s%n",s2.toLowerCase());
    }
}
