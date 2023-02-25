import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter an integer: ");
        int num = in.nextInt();
        String command = Integer.toString(num);

        SolveWithoutArray(command);

        //With Array-key value pair ->map
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Monday");
        map.put(2,"Tuesday");
        map.put(3,"Wednesday");
        map.put(4,"Thursday");
        map.put(5,"Friday");
        map.put(6,"Saturday");
        map.put(7,"Sunday");

        if(map.containsKey(num)){
            String value=map.get(num);
            System.out.println(value);
        } else{
            System.out.println("Invalid day!");
        }

    }

    public static void SolveWithoutArray(String command){
         switch(command){
            case "1":
            System.out.println("Monday");
            break;
            case "2":
            System.out.println("Tuesday");
            break;
            case "3":
            System.out.println("Wednesday");
            break;
            case "4":
            System.out.println("Thursday");
            break;
            case "5":
            System.out.println("Friday");
            break;
            case "6":
            System.out.println("Saturday");
            break;
            case "7":
            System.out.println("Sunday");
            break;
            default:
                System.out.println("Invalid day!");
        }
    }
}
