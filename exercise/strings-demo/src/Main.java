import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        //Extract the first three characters of the string
        String substing1= input.substring(0,3);
        System.out.println("Substring 1: " + substing1);

        scanner.close();
    }
}