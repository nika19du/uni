public class FactN {
    public static void main(String[] args) throws Exception {
        int n = 5;
        System.out.println(n + " != " + Factoriel(n));
    }

    public static int Factoriel(int n) {
        if (n == 1) {
            return 1;
        }
        else{
            return n * Factoriel(n-1);
        }
    }
}
