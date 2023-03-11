import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args){
         float[] arrFloat = {5,5,5,6,6,6};
        Student st = new Student("User","Std",arrFloat);

        System.out.println(st.name+" "+ st.spec +" "+st.averStd());
        //suzdadte li klas, roditelq mu e object
        // ArrayList smesica mejdu array and list,dinamichna struktura,ima index kat array
        Object object=new Object();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(10);
        arr.add(5);
        arr.add(40);
        arr.add(40);
        arr.add(100);

        //arr.add("STD");
        //arr.add("A");
        //arr.add(new MainClass());
        object=arr.remove(0);
        //foreach
        int max=Integer.MIN_VALUE;
        for(Object o:arr){
         //   System.out.println(o);//.getClass().getSimpleName());
            if((int)o>max){
                max=(int)o;
            }
        }
        System.out.println("Max:" + max);
    }
}
