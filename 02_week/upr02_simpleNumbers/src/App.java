public class App {
    public static void main(String[] args) {
        for(int i=2; i<=100; i++) {
            boolean flag = true;
            for(int j=2;j<i;j++) {

                if(i % j == 0){
                    flag=false;
                    break;
                }
            }

            if(flag) { //ako e istina
                System.out.print(i+" ");
            }
        }
    }
}
