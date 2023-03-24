import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
       try {
            String[] input=scanner.nextLine().split(" ");
            String name=input[0];
            String gender=input[1];
            String[] nums= scanner.nextLine().split(" ");
            int[] ocenki = new int[nums.length];
            for(int i=0;i<nums.length;i++){
                ocenki[i]=Integer.parseInt(nums[i]);
            }
            Figurist fig=new Figurist(name,gender,ocenki);
            System.out.print(fig.getAvgScore());
        } catch (Exception e){
           System.out.print(e.getMessage());
        }
    }
}

