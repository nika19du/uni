public class StatisticsCalculator {
    private int[] numbers;

    public  StatisticsCalculator(int[] numbers) {
        this.numbers=numbers;
    }
    public int getMin() {
        int min = numbers[0];
        for(int i =1; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        return  min;
    }
    public int getMax() {
        int max = numbers[0];
        for(int i =1; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        return  max;
    }
    public  double getAverage(){
        double sum = 0;
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        return  sum/numbers.length;
    }

    public double getIndex(int target){
        int index = -1;
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i]==target){
                index=i;
                break;
            }
        }
        return  index;
    }

    public void AddInFront(int newElement){
        int[] newArray = new int[numbers.length+1];
        // insert the new element at the beginning of the new array
        newArray[0]=newElement;
        // copy the contents of the original array into the new array
        for(int i = 0; i< numbers.length; i++){
            newArray[i+1]= numbers[i];
        }
        numbers=newArray;
    }

    public void AddInBack(int newElement){
        int[] newArray = new int[numbers.length+1];
        // copy the contents of the original array into the new array
        for(int i = 0; i < numbers.length; i++){
            newArray[i] = numbers[i];
        }
        // insert the new element at the end of the new array
        newArray[newArray.length-1] = newElement;
        numbers=newArray;
    }
    public void CheckAscendingOrder(){
        boolean isSorted=true;
        for(int i = 0; i<numbers.length-1; i++){
            if(numbers[i] > numbers[i+1]){
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.println("The array is sorted in ascending order.");
        }else{
            System.out.println("The array is not sorted in ascending order.");
        }
    }

    public void insertionSort(){
        int n=numbers.length;
        for(int i = 1; i < n; i++){
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key){
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = key;
        }
    }

    public  void Print(){
        for(int i = 0; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}