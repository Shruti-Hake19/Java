package Reflections;

import java.util.Locale;

public class Test {
    public static void main(String[]args){

        Locale l1 = Locale.FRANCE;
        System.out.println(l1.getCountry());
        System.out.println(l1.getLanguage());
        System.out.println(l1.getDisplayCountry());
        System.out.println(l1.getDisplayLanguage());

        Locale l2 = Locale.CANADA;
        System.out.println(l2.getCountry());
        System.out.println(l2.getLanguage());
        System.out.println(l2.getDisplayCountry());
        System.out.println(l2.getDisplayLanguage());

        Locale l3 = Locale.CHINA;
        System.out.println(l3.getCountry());
        System.out.println(l3.getLanguage());
        System.out.println(l3.getDisplayCountry());
        System.out.println(l3.getDisplayLanguage());

        Locale l4 = Locale.US;			//Italy , Germany ,UK etc.
        System.out.println(l3.getCountry());
        System.out.println(l3.getLanguage());
        System.out.println(l3.getDisplayCountry());
        System.out.println(l3.getDisplayLanguage());

    }
}
