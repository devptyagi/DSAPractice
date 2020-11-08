/*

Given a string s representing a password, you need to check if the string is valid or not. A valid string has the following properties:

String must have the length greater than or equal to 10.
String must contain at least 1 numeric character.
String must contain at least 1 uppercase character.
String must contain at least 1 lowercase character.
String must contain at least 1 special character from @#$-*.

*/

public static boolean validate(String str) {
    if(str.length() < 10) return false;
    boolean lower = false, upper = false, digit = false, special = false;
    for(int i=0;i<str.length();i++) {
        char c = str.charAt(i);
        if(Character.isLowerCase(c)) lower = true;
        else if(Character.isUpperCase(c)) upper = true;
        else if(Character.isDigit(c)) digit = true;
        else {
            switch(c) {
                case '@' :
                case '#' : 
                case '$' :
                case '-' :
                case '*' :
                case '.' : special = true; break;
                default : return false;
            }
        }
    }
    return lower && upper && digit && special;
}
