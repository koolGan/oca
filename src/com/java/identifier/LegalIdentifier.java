package com.java.identifier;

/*
 * Identifier can not start with a digit like int 12a;
 * Start with letter currency character ($) or connecting character such as underscore (_)
 * Space is a special character, and Java identifier can’t contain any special symbol except _ and $.
 */
public class LegalIdentifier {

    public static void main(String[] args) {

        int _a; //start with underscore
        int a_aaa;// middle with underscore
        int a_;//end with underscore
        int $arr;//start with dollar sign
        int a$b;//middle with dollar sign
        char b$; // end with dollar sign
        int ______________w_; // legal identifier
        String __________str______;// legal identifier any number of character

        /*some illegal identifier  just un comments these you get compile time error */
        // int :b; no special character unexpected underscore and dollar
        // int -b; no special character unexpected underscore and dollar
        // int e#; no special character unexpected underscore and dollar
        // int .f; no special character unexpected underscore and dollar
        // int !rt; no special character unexpected underscore and dollar
        // int while; not reserve keywords used as a identifier
        // int 9i; should not start with digit.
        float LIFE_OF_PI = 3.14f;
        String String;
        int Int;
        int main;
        int a = 9;
        int _;
       // int a = 10; compiler error variable define twice
            String k="Variable";
        System.out.println(k);

        println();
    }

    private static void println() {
        System.out.print(" HI");
    }
}
