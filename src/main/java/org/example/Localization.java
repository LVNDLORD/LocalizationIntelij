package org.example;

import java.util.Locale;
import java.util.ResourceBundle;

public class Localization {
    public static void main(String[] args) {
        String language = "en";
        String country = "UK";

        Locale locale =  new Locale(language,country);
        ResourceBundle resourse = ResourceBundle.getBundle("messages", locale);
        String str = resourse.getString("greetings");
        System.out.println(str);


        String languageFi = "fi";
        String countryFi = "FI";

        Locale localeFi =  new Locale(languageFi,countryFi);
        ResourceBundle resourseFi = ResourceBundle.getBundle("messages", localeFi);
        String strFi = resourseFi.getString("greetings");
        System.out.println(strFi);

        String languageUa = "ua";
        String countryUa = "UA";

        Locale localeUa =  new Locale(languageUa,countryUa);
        ResourceBundle resourseUa = ResourceBundle.getBundle("messages", localeUa);
        String strUa = resourseUa.getString("greetings");
        System.out.println(strUa);


    }
}
