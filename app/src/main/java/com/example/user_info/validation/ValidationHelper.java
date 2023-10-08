package com.example.user_info.validation;

import java.time.LocalDate;

public class ValidationHelper {
   public static boolean validateEmail(String email){
      return email.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
               + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
   }

   public static boolean validatePhoneNumber(String phoneNumber){
      return phoneNumber.startsWith("08") &&  phoneNumber.length() == 10;
   }

   public static boolean validateBirthday(String birthday){
      String[] birthdateFormat = birthday.split("-");
      int month = Integer.parseInt(birthdateFormat[1]);
      int day = Integer.parseInt(birthdateFormat[2]);
      int year = Integer.parseInt(birthdateFormat[0]);
      LocalDate birthdate = LocalDate.of(year, month, day);
      return !birthdate.equals(LocalDate.now()) &&
              !birthdate.isBefore(LocalDate.now().minusYears(150))
              && !birthdate.isAfter(LocalDate.now());
   }

   public static boolean validateHeight(String height){
      double personHeight = Double.parseDouble(height);
      return personHeight > 0.5 && personHeight < 3;
   }
}
