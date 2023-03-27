public class Figurist {
    public Figurist(String name,String gender,float[] ocenki){
        setName(name);
        setGender(gender);
        setOcenki(ocenki);
    }
    private  String name;
    private String gender;
    private float[] ocenki;
    public double getAvgScore(){
        float min=this.FindMin();
        float max=this.FindMax();
        [] copyArr=new float[ocenki.length];
        double sum=0d;
        for (int i=0;i<this.ocenki.length;i++){
            if(ocenki[i]!=min && ocenki[i]!=max){
                copyArr[i] = ocenki[i];
                sum+=copyArr[i];
            }
            if (ocenki[i]==min){
                min =00;
            }
            if (ocenki[i]==max){
                max=00;
            }
        }

        this.ocenki=copyArr;
        return ((flot)sum/5);
    }
    public float FindMin(){
        float min=ocenki[0];
        for (int i=0;i<this.ocenki.length;i++){
            if (ocenki[i]<min){
                min=ocenki[i];
            }
        }
        System.out.println("Min:"+min);
        return  min;
    }
    public float FindMax(){
        float max=ocenki[0];
        for (int i=0;i<this.ocenki.length;i++){
            if (ocenki[i]>max){
                max=ocenki[i];
            }
        }
        System.out.println("Max:"+max);

        return max;
    }
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        if (name=="" || name ==null)
        {
            throw  new IllegalArgumentException("Name cant be empty!");
        }
        this.name=name;
    }

    public String getGender(){
        return this.gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setOcenki(float[] arr){
        this.ocenki=arr;
    }

    public float[] getOcenki(){
        return this.ocenki;
    }
}
