public class Main {
    public static void main(String[] args) {
        int arr[]={10,20,40,30};
        StatisticsCalculator calculator=new StatisticsCalculator(arr);
        System.out.println("Min: "+calculator.getMin());
        System.out.println("Max: "+calculator.getMax());
        System.out.println("Avg: "+calculator.getAverage());
        //Find the index of a specific element in an array
        calculator.AddInFront(0);
        calculator.Print();
        calculator.AddInBack(100);
        calculator.Print();
        calculator.CheckAscendingOrder();
        calculator.insertionSort();
        calculator.Print();
        calculator.CheckAscendingOrder();
    }
}