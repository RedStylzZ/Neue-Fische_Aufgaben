import java.util.Scanner;

public class Intermediate {
    static final String[] numbers = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};

    public static String getNumWord(int num) {
        return numbers[num];
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
        String[] names = new String[1];
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true){
            if (count>=names.length){
                String [] tmp = new String [names.length+1];
                System.arraycopy(names, 0, tmp, 0, names.length);
                names = tmp;
            }

            System.out.print("Name: ");
            name = scanner.nextLine();
            if(name.equals("exit")) {
                break;
            }
            names[count]=name;
            count++;

            System.out.println();
            for (String x : names) {
                System.out.println(x);
            }
        }

    }

    public static void main(String[] args) {

        for (int x = 0; x <= 8; x++) {
            System.out.println(getNumWord(x));
        }

        printNumbers();
        inputNames();
    }

}
