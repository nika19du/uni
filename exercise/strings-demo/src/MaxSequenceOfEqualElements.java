import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();
        int max=0;
        int maxNumber = 0;
        int leftMaxNumber = 0;
        int leftMax = 0;
        int maxSequence = 0;

        for ( int i = 0; i < nums.length -1 ; i++){
            int number = nums[i];// prochitam vsqko edno chislo

            if(number == nums[i+1]) { // proverqvam dali e ravno na chisloto sled nego
                maxSequence++;

                if(maxSequence > max) {
                    max = maxSequence;
                    maxNumber = number;
                }

                if (max<0) {
                    max=leftMax;
                    leftMaxNumber=number;
                }
            } else {
                maxSequence = 0;
            }
        }

        if (max - leftMax == 0){
            for (int i = 1; i<= max+1; i++){
                System.out.print(leftMaxNumber+" ");
            }
        }else{
            for ( int i=1; i <= max + 1; i++){
                System.out.print(maxNumber+" ");
            }
        }
    }
}
