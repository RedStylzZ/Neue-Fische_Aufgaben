import java.util.Arrays;

public class Expert {

    public static String reverseString(String s) {
        StringBuilder reverseString = new StringBuilder();
        char[] sCharArray = s.toCharArray();

        for(int x = s.length()-1; x >= 0; x--) {
            reverseString.append(sCharArray[x]);
        }
        return reverseString.toString();
    }

    public static int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static String[] seperateString(String s) {
        return s.split(",");
    }

    public static int calcChecksum(int num) {
        int checksum = 0;
        char[] numStringArray = Integer.toString(num).toCharArray();

        for (char x : numStringArray) {
            checksum += Character.getNumericValue(x);
        }

        return checksum;
    }
    
    public static String decimalToRoman(int num) {
        if (num < 1 || num > 3999)
            return "";

        StringBuilder roman = new StringBuilder();

        if (num >= 1000) {
            num -= 1000;
            return roman.append("M").append(decimalToRoman(num)).toString();
        }
        if (num >= 900) {
            num -= 900;
            return roman.append("CM").append(decimalToRoman(num)).toString();
        }
        if (num >= 500) {
            num -= 500;
            return roman.append("D").append(decimalToRoman(num)).toString();
        }
        if (num >= 400) {
            num -= 400;
            return roman.append("CD").append(decimalToRoman(num)).toString();
        }
        if (num >= 100) {
            num -= 100;
            return roman.append("C").append(decimalToRoman(num)).toString();
        }
        if (num >= 90) {
            num -= 90;
            return roman.append("XC").append(decimalToRoman(num)).toString();
        }
        if (num >= 50) {
            num -= 50;
            return roman.append("L").append(decimalToRoman(num)).toString();
        }
        if (num >= 40) {
            num -= 40;
            return roman.append("XL").append(decimalToRoman(num)).toString();
        }
        if (num >= 10) {
            num -= 10;
            return roman.append("X").append(decimalToRoman(num)).toString();
        }
        if (num >= 9) {
            num -= 9;
            return roman.append("IX").append(decimalToRoman(num)).toString();
        }
        if (num >= 5) {
            roman.append("D");
            num -= 5;
            return roman.append("D").append(decimalToRoman(num)).toString();
        }
        if (num >= 4) {
            num -= 4;
            return roman.append("IV").append(decimalToRoman(num)).toString();
        }
        if (num >= 1) {
            num -= 1;
            return roman.append("I").append(decimalToRoman(num)).toString();
        }
        return roman.toString();
    }
    
    public static void main(String[] args) {
        String s = "Turtle";
        String s2 = "Turtle,Meep,Bootcamp";
        int checksum = 254;
        int[] arr = {6, 2, 8, 3, 9, 6};
        int number = 34;

        // Reverse String
        System.out.println(s);
        System.out.println(reverseString(s));
        System.out.println();

        // Sort Array
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sortArray(arr)));
        System.out.println();

        // Separate String at ,
        System.out.println(s2);
        System.out.println(Arrays.toString(seperateString(s2)));
        System.out.println();

        // Calculate Checksum
        System.out.println(checksum);
        System.out.println(calcChecksum(checksum));
        System.out.println();

        // Decimal to Roman
        System.out.println(number);
        System.out.println(decimalToRoman(number));
        System.out.println();

    }

}
