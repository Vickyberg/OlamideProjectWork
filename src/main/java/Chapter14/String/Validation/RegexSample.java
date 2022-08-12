package Chapter14.String.Validation;

public class RegexSample {

    public static boolean isValidPhoneNumber(String phoneNumber) {
        return  phoneNumber.matches("([+]234[-])?0?[7-9][0-1]\\d{8}");
    }
}
