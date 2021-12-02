import java.util.Scanner;

public class Intermediate {
    static final String[] numbers = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};

    public static String getNumWord(int num) {
        return numbers[num-1];
    }

    public static void printNumbers() {
        String prefix = "";
        StringBuilder test = new StringBuilder();
        for (int x = 1; x <= 100; x++) {
            prefix = "";
            if(x % 3 == 0) {
                prefix += "#";
            }
            if(x % 5 == 0) {
                prefix += "$";
            }
            System.out.println(prefix + x);
        }
    }

    public static void inputNames() {
        String name = "";
        String[] names = {""};
        Scanner scanner = new Scanner(System.in);

        while(true) {
            for (String s: names ) {
                System.out.println(s);
            }

            
        }
    }

    public static void main(String[] args) {

        for (int x = 1; x <= 9; x++) {
            System.out.println(getNumWord(x));
        }

        printNumbers();

        inputNames();
    }

}
