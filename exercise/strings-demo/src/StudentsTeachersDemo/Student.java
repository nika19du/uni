package StudentsTeachersDemo;

public class Student {
    public Student(String name, int age, String egn, String fNum){
        SetName(name);
        SetAge(age);
        SetEgn(egn);
        SetFNum(fNum);
    }
    private  String name;
    private  int age;
    private  String egn;
    private  String fNum="10101010";


    public void SetName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void SetAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
    public void SetEgn(String egn) {
        this.egn= egn ;
    }

    public String GetEgn(){
        return this.egn;
    }

    public void SetFNum(String fn) {
        if (fn.length()<=8){
            this.fNum= fn;
        }
        else {
            //System.out.println("Tupanar");
             throw  new IllegalArgumentException("Tupanar");
        }

    }

    public String getFum(){
        return this.fNum;
    }
}
