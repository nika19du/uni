package basicOOP;

import java.util.concurrent.RecursiveTask;

public class Person {
    // Overloading
    public  Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public Person(){
        name = "Default";
        age = 0;
    }
    public Person(String myName,int myAge, double myBalance){
        setName(myName);
        setAge(myAge);
        getBalance();
    }
    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if (age<=120){
            this.age=age;
        }
    }

    public int getAge(){
        return  age;
    }

    public double getBalance(){
        return  age * 42.5;
    }
}
