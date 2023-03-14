package StudentsTeachersDemo;

public class Teacher {
    public  Teacher(String name,String dlujnost,String katedra,int staj){
        this.name=name;
        this.dlujnost=dlujnost;
        this.katedra=katedra;
        this.staj=staj;
    }
    private  String name;
    private  String dlujnost;
    private  String katedra;
    private int staj;
    public void SetName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void SetDlujmost(String name) {
        this.dlujnost = dlujnost;
    }
    public String getDlujnost(){
        return this.dlujnost;
    }
    public String getKatedra(){
        return this.katedra;
    }
    public void SetKatedra(String name) {
        this.katedra = katedra;
    }

    public void SetStaj(int staj) {
        this.staj = staj;
    }

    public Integer getStaj(){
        return this.staj;
    }


}
