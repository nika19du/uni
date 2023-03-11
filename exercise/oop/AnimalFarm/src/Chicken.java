import java.util.IllegalFormatCodePointException;

public class Chicken {
    private String name;
    private int age;

    Chicken(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    private  void setName(String name){
        if(name == null || name.trim().length() < 1){
            throw  new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age){
        if(age < 0 || age > 15){
            throw  new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public String getInfo(){
        return  String.format("Chicken %s (age %d) can produce %s eggs per day.",
                this.name, this.age, this.getProductPerDay());
    }

    private  String getProductPerDay(){
        String product = "0.75";
        if(this.age < 6){
            product = "2";
        }else if(this.age < 12){
            product = "1";
        }
        return  product;
    }
}
