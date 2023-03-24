import java.util.Arrays;
import java.util.Scanner;
public class SumEvenNums {
    public static void main(String[] args) {
        //1 2 3 4 5 6
        Scanner scanner = new Scanner(System.in);
        int[] nums=Arrays.stream(scanner.nextLine().split(" "))
        .mapToInt(x -> Integer.parseInt(x))
        .toArray();
        int sum=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] % 2 == 0){
                sum+=nums[i];
            }
        }
        System.out.print("Sum of even numbers: ");
        System.out.println(sum);
    }
}
