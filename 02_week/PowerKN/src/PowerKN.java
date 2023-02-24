public class PowerKN {
    public static void main(String[] args) throws Exception {
        int k = 100, n = 100;
        System.out.println(k + "**" + n + "=" + power(k,n));
    }

    public static double power(int k,int n){
        if(n == 0) { //ako e povdignato na 0 e 1
            return 1;
        }
        else{
            double t = power(k, n / 2 );
            if (n % 2 == 0){
                return t * t;
            }
            else {
                return t * t * k;
            }
        }
    }

}
