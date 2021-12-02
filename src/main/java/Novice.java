import java.util.Scanner;

public class Novice {

    public static boolean biggerThanZero(double num) {
        return num > 0;
    }

    public static double calculateSquare(double num) {
        return num*num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your Name?: ");

        String name = scanner.nextLine();

        for(int x = 0; x <= 4; x++) {
            System.out.println(name);
        }

        System.out.print("Type a number: ");
        double num = scanner.nextDouble();

        if(biggerThanZero(num)) {
            System.out.println("Its bigger");
        } else {
            System.out.println("Its smaller");
        }

        System.out.printf("The square of %s is %s", num, calculateSquare(num));

    }

}
