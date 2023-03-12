import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        //Extract the first three characters of the string
        String substring1= input.substring(0,3);
        System.out.println("Substring 1: " + substring1);
        scanner.close();*/

        //Common Elements
        Scanner scanner = new Scanner(System.in);

        String[] words1 = scanner.nextLine().split(" ");
        String[] words2 = scanner.nextLine().split(" ");

        for(String word2 : words2){
            for (String word1 : words1){
                if (word2.equalsIgnoreCase(word1)){
                    System.out.println(word2 + " ");
                    break;
                }
            }
        }
    }
}