package Chapter14.String.Validation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexSampleTest {


    @Test
    void testForIsValidPhoneNumber(){
        String phoneNumber  = "+234-8022334455";
        assertTrue(RegexSample.isValidPhoneNumber(phoneNumber));
    }
    @Test
    void testPhoneNumberWithCharactersLessThan_15_AreInvalid(){
        String phoneNumber = "+234-903555678";
        assertFalse(RegexSample.isValidPhoneNumber(phoneNumber));
    }

  @Test
    void testThatPhoneNumberWithCharactersLessThan_15_AreInvalid(){
        String phoneNumber = "+234-903555678";
        assertFalse(RegexSample.isValidPhoneNumber(phoneNumber));
  }

  @Test
    void testThatPhoneNumbersWithOtherCountryPrefixAreInvalid(){
        String  phoneNumber = "+233-903555678";
        assertFalse(RegexSample.isValidPhoneNumber(phoneNumber));
  }

  @Test
    void testThatPhoneNumberWithZeroAfterDashIsValid(){
      String  phoneNumber = "+234-09035556789";
      assertTrue(RegexSample.isValidPhoneNumber(phoneNumber));
  }

  @Test
    void testThatPhoneNumberWorksWithoutThePrefix(){
        String phoneNumber = "09035556789";
        assertTrue(RegexSample.isValidPhoneNumber(phoneNumber));
  }

}