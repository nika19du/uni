import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int course=2;
        String courseStr;

        // Scanner vhod=new Scanner(System.in);
        // System.out.println("Enter course:");
        // course=vhod.nextInt();

        courseStr=JOptionPane.showInputDialog("Course:");
        course=Integer.parseInt(courseStr);

        System.out.println("STD");
        System.out.print(course+ "\n\t course ");//syso
        System.out.println("Redovno");
    }
}
