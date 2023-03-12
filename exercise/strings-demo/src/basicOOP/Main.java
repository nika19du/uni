package basicOOP;

public class Main {
    public static void main(String[] args) {
        Person person0 = new Person();
        Person person = new Person("Nikol",21);

        System.out.printf("My name is %1$s. I am %2$d years old! And my balance is %3$f \n", person.getName(), person.getAge(), person.getBalance());
        System.out.printf("My name is %1$s. I am %2$d years old! And my balance is %3$f", person0.getName(),person0.getAge(),person0.getBalance());

    }
}
