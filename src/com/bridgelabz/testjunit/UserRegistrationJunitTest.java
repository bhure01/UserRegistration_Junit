package com.bridgelabz.testjunit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationJunitTest {
    
    String resultExpected, resultActual;

    ValidatingUserRegistrationInformation validUseInfo = new ValidatingUserRegistrationInformation();

    @Test
    public void validFirstName() throws UserRegistrationException {
        try {
            resultExpected = "Happy:User Entry Validated Successfully";
            resultActual = validUseInfo.validFirstName("Datta");
            Assert.assertEquals(resultExpected, resultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_FIRST_NAME, e.type);
        }
    }

    @Test
    public void invalidFirstName() throws UserRegistrationException {
        try {
            resultExpected = "Sad:User Entry Validation Failed";
            resultActual = validUseInfo.validFirstName("datta");
            Assert.assertEquals(resultExpected, resultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_FIRST_NAME, e.type);
        }
    }

    @Test
    public void lastNameValid() throws  UserRegistrationException {
        try {
            resultExpected = "Happy:User Entry Validated Successfully";
            resultActual = validUseInfo.validLastName("Bhure");
            Assert.assertEquals(resultExpected, resultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_FIRST_NAME, e.type);
        }
    }

    @Test
    public void lastNameInValid() throws UserRegistrationException {
        try {
            resultExpected = "Sad:User Entry Validation Failed";
            resultActual = validUseInfo.validLastName("bhure");
            Assert.assertEquals(resultExpected, resultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_FIRST_NAME, e.type);
        }
    }

    @Test
    public void emailIdValid() throws  UserRegistrationException {
        try {
            resultExpected = "Happy:User Entry Validated Successfully";
            resultActual = validUseInfo.validMailID("dattatribhure@gmail.com");
            Assert.assertEquals(resultExpected, resultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_MAIL_ID, e.type);
        }
    }

    @Test
    public void emailIdInValid() throws  UserRegistrationException {
        try {
            resultExpected = "Sad:User Entry Validation Failed";
            resultActual = validUseInfo.validMailID("dattatribhure.co.in");
            Assert.assertEquals(resultExpected, resultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_MAIL_ID, e.type);
        }
    }

    @Test
    public void validMobileNum() throws  UserRegistrationException {
        try {
            resultExpected = "Happy:User Entry Validated Successfully";
            resultActual = validUseInfo.validMobileNumber("91-9923064024");
            Assert.assertEquals(resultExpected, resultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_MOBILE_NUMBER, e.type);
        }
    }

    @Test
    public void invalidMobileNum() throws UserRegistrationException {
        try {
            resultExpected = "Sad:User Entry Validation Failed";
            resultActual = validUseInfo.validMobileNumber("9923064024");
            Assert.assertEquals(resultExpected, resultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_MOBILE_NUMBER, e.type);
        }
    }

    @Test
    public void validPassword() throws UserRegistrationException {
        try {
            resultExpected = "Happy:User Entry Validated Successfully";
            resultActual = validUseInfo.validPassword("bd1gB&@z");
            Assert.assertEquals(resultExpected, resultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_PASSWORD, e.type);
        }
    }

    @Test
    public void invalidPassword() throws  UserRegistrationException {
        try {
            resultExpected = "Sad:User Entry Validation Failed";
            resultActual = validUseInfo.validPassword("bd1gBxzy");
            Assert.assertEquals(resultExpected, resultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_PASSWORD, e.type);
        }
    }
}