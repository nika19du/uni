public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers={1,2,-3,5,7};

        int sum = 0;
        int product=1;
        double average;

        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
            product*=numbers[i];

        }
        average =(double) sum/numbers.length;
        System.out.println("sum= "+sum+", product= "+product+", average= "+average);

        // writing a program that displays the number of occurrences of an element in the array
        int[] nums = {1, 1, 1, 2, 3, 4};
        int searchElement = 1;

        System.out.println(getNumberOcc(nums, searchElement));

        //write a program that displays the maximum and minimum elements of an array
        int min = numbers[0];
        int max=numbers[0];
        for(int i=1;i<numbers.length;i++){
            max = (numbers[i] > max) ? numbers[i] : max;
            min = (numbers[i] < min) ? numbers[i] : min;
        }

        System.out.println("max= "+ max + ", min= "+min);
    }

    public static int getNumberOcc(int[] numbers, int searchElement){
        int occ=0;

        for(int i = 0; i< numbers.length; i++){
            if (searchElement==numbers[i]){
                occ++;
            }
        }

        return occ;
    }
}
