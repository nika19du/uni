package StudentsTeachersDemo;

import java.util.Scanner;

public class Main {
    public static void Main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String name=input[0];
        int age = Integer.parseInt(input[1]);
        String egn = input[2];
        String fn=input[3];
        Student student = new Student(name,age,egn,fn);

        System.out.printf("I'm %1$s %2$i my eng: %3$s with f-number: %4$s", name, age, egn, fn);
    }
}
