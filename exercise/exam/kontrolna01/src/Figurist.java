public class Figurist {
    public Figurist(String name,String gender,int[] ocenki){
        setName(name);
        setGender(gender);
        setOcenki(ocenki);
    }
    private  String name;
    private String gender;
    private  int[] ocenki;
    public double getAvgScore(){
        int min=this.FindMin();
        int max=this.FindMax();
        int[] copyArr=new int[ocenki.length];
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
        return ((double)sum/5);
    }
    public int FindMin(){
        int min=ocenki[0];
        for (int i=0;i<this.ocenki.length;i++){
            if (ocenki[i]<min){
                min=ocenki[i];
            }
        }
        System.out.println("Min:"+min);
        return  min;
    }
    public int FindMax(){
        int max=ocenki[0];
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

    public void setOcenki(int[] arr){
        this.ocenki=arr;
    }

    public int[] getOcenki(){
        return this.ocenki;
    }
}
