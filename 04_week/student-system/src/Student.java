public class Student {
    String name;
    String spec;
    float[] aver;

    public Student(String name,String spec,float[] aver){
        super();
        this.name = name;
        this.spec = spec;
        this.aver = aver;
    }

   

    public float averStd(){
        float sum=0;
        for(int i=0; i<aver.length;i++){
            sum+=aver[i];
        }
        sum=sum/aver.length;
        return sum;
    }

}
//da se napravi klas v koito ima masiv,namirane na min,max,avg