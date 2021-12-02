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
            return "Invalid Roman Number Value";

        StringBuilder roman = new StringBuilder();

        while (num >= 1000) {
            roman.append("M");
            num -= 1000;
        }
        while (num >= 900) {
            roman.append("CM");
            num -= 900;
        }
        while (num >= 500) {
            roman.append("D");
            num -= 500;
        }
        while (num >= 400) {
            roman.append("CD");
            num -= 400;
        }
        while (num >= 100) {
            roman.append("C");
            num -= 100;
        }
        while (num >= 90) {
            roman.append("XC");
            num -= 90;
        }
        while (num >= 50) {
            roman.append("L");
            num -= 50;
        }
        while (num >= 40) {
            roman.append("XL");
            num -= 40;
        }
        while (num >= 10) {
            roman.append("X");
            num -= 10;
        }
        while (num >= 9) {
            roman.append("IX");
            num -= 9;
        }
        while (num >= 5) {
            roman.append("V");
            num -= 5;
        }
        while (num >= 4) {
            roman.append("IV");
            num -= 4;
        }
        while (num >= 1) {
            roman.append("I");
            num -= 1;
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        String s = "Turtle";
        String s2 = "Turtle,Meep,Bootcamp";
        int checksum = 254;
        int[] arr = {6, 2, 8, 3, 9, 6};

        System.out.println(s);
        System.out.println(reverseString(s));

        System.out.println();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sortArray(arr)));

        System.out.println(s2);
        System.out.println(Arrays.toString(seperateString(s2)));

        System.out.println(checksum);
        System.out.println(calcChecksum(checksum));




    }

}
