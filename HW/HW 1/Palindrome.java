public class Palindrome {
    /**
     * determines if String s is a palindrome after removing all non-alphanumeric characters
     * @param s
     * @return true if palindrome after conditions
     */
    public static boolean isPalindrome (String s) {
        String filtered = "";

        //copies a new string that only has alphanumeric characters
        for (int i = 0; i < s.length(); i++) {
            if (isLowerCase(s.charAt(i)) || isNumber(s.charAt(i))) {
                filtered = filtered + s.charAt(i);
            } else if (isUpperCase(s.charAt(i))) {
                filtered = filtered + Character.toLowerCase(s.charAt(i));
            }
        }

        /*
        iterates through first half of filtered string
        compares characters on opposite ends of string
        ex) 1st character and last character, 2nd character and 2nd to last character
        if characters are not equivalent, break loop and return false

        works for strings of both even and odd lengths
         */
        for (int i = 0; i < filtered.length() / 2; i++) {
            if (filtered.charAt(i) != filtered.charAt((filtered.length() - 1) - i)) {
                return false;
            }
        }
        return true;
    }

    //unused
    public static boolean isAlphabet (Character c) {
        if (c >= 'a' && c <= 'z') return true;
        if (c >= 'A' && c <= 'Z') return true;
        return false;
    }

    public static boolean isLowerCase (Character c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean isUpperCase (Character c) {
        return c >= 'A' && c <= 'Z';
    }
    public static boolean isNumber (Character c) {
        return c >= '0' && c <= '9';
    }

    public static void main(String[] args) {
        String s = "ABC cba";
        System.out.println(s);
        System.out.println(isPalindrome(s));

        s = "123 123";
        System.out.println(s);
        System.out.println(isPalindrome(s));
    }
}
