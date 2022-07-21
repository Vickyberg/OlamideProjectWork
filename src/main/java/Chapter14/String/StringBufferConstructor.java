package Chapter14.String;

public class StringBufferConstructor {
    public static void main(String[] args) {
        StringBuffer buffer1 = new StringBuffer();
        StringBuffer buffer2 = new StringBuffer(10);
        StringBuffer buffer3 = new StringBuffer("hello");

        System.out.printf("Buffer 1 = \"%s\"%n",buffer1);
        System.out.printf("Buffer 2 = \"%s\"%n",buffer2);
        System.out.printf("Buffer 3 = \"%s\"%n",buffer3);

    }
}
