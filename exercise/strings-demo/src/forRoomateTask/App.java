package forRoomateTask;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 5 and 60: ");
        int n = input.nextInt();

        if (n < 5 || n > 60) {
            System.out.println("Invalid input!");
            return;
        }

        File inputFile = new File("input.txt");
        if (!inputFile.exists()) {
            System.out.println("Input file does not exist!");
            return;
        }

        File outputFile = new File("output.txt");
        try {
            Scanner fileScanner = new Scanner(inputFile);
            PrintWriter writer = new PrintWriter(new FileWriter(outputFile));
            int lineNumber = 0;
            while (fileScanner.hasNextLine()) {
                lineNumber++;
                String line = fileScanner.nextLine();
                if (lineNumber % 3 == 0 && line.length() >= 5 && line.length() <= n) {
                    writer.println(lineNumber + " > " + line);
                }
            }
            fileScanner.close();
            writer.close();
            System.out.println("Output file created successfully!");
        } catch (IOException e) {
            System.out.println("Error creating output file!");
            e.printStackTrace();
        }
    }
}
