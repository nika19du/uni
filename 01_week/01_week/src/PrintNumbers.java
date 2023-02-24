public class PrintNumbers {
    public static void main(String[] args) throws Exception {
        int i=1;
        // for (i=1; i<=10;i ++) {
        //     System.out.print(i+" ");
        // }
        // System.out.println("\ni= "+i);

        // while(i<=10) {
        //     System.out.print(i+" ");
        //     i++;
        // }

        do{
            if(i % 2 == 0){
                System.out.println("\t" + i + " even");
            }
            else {
                System.out.println(i + " odd");
            }
            i++;
        } while(i<=10);

    }
}
