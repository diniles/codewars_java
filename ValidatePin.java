/*
https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java
ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.

If the function is passed a valid PIN string, return true, else return false.

Examples (Input --> Output)
"1234"   -->  true
"12345"  -->  false
"a234"   -->  false
*/

public class ValidatePin {
    public static boolean validatePin(String pin) {
        boolean result = false;
        if (pin.length() == 4 || pin.length() == 6) {
            try {
                Integer.parseInt(pin);
                result = true;
            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("0000"));
        System.out.println(validatePin("1111"));
        System.out.println(validatePin("123456"));
        System.out.println(validatePin("098765"));
        System.out.println(validatePin("000000"));
        System.out.println(validatePin("090909"));
    }
}
