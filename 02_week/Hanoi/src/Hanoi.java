public class Hanoi {
    public static void main(String[] args) throws Exception {
        move(4,'A','B','C');
        System.out.println("sum steps: "+ count);
    }
    static int count=0;
    //a-start, b-help, c-goal | n - broq na kamuchetata
    public static void move(int n, char start, char help, char goal) {
        
        if (n == 1) {
            System.out.println("From "+ start + " to "+ goal);
        }
        else {
            move(n-1, start, goal, help);
            //iskam da go premesta na b kato izp goal kat pomoshten,mestq n bez 1
            System.out.println("From " + start + " to "+ goal+"\n steps:" + count);
            //izp startniq sq kat pomoshten
            move(n-1, help, start, goal );
        }
        count++;
    }

    //Reshenie chrez stack
}
