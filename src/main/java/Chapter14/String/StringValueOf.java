package Chapter14.String;

public class StringValueOf {
    public static void main(String[] args) {
        char [] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 1000000000L;
        float floatValue = 2.5f;
        double  doubleValue = 33.333;
        Object objectRef   ="hello";

        System.out.printf("char array = %s%n", String.valueOf(charArray));
        System.out.printf("part of char array = %s%n", String.valueOf(charArray,3,3));
        System.out.printf("boolean = %s%n", String.valueOf(booleanValue));
        System.out.printf("char = %s%n", String.valueOf(characterValue));
        System.out.printf("int = %s%n",String.valueOf(integerValue));
        System.out.printf("Long value = %s%n",String.valueOf(longValue));
        System.out.printf("Float value = %s%n", String.valueOf(floatValue));
        System.out.printf("Double value = %s%n", String.valueOf(doubleValue));
        System.out.printf("Object : %s%n",String.valueOf(objectRef));
    }
}
