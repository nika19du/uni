import StudentsTeachersDemo.Student;
import StudentsTeachersDemo.Teacher;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        //Extract the first three characters of the string
        String substring1= input.substring(0,3);
        System.out.println("Substring 1: " + substring1);
        scanner.close();*/

        //Common Elements
//        Scanner scanner = new Scanner(System.in);
//
//        String[] words1 = scanner.nextLine().split(" ");
//        String[] words2 = scanner.nextLine().split(" ");
//
//        for(String word2 : words2){
//            for (String word1 : words1){
//                if (word2.equalsIgnoreCase(word1)){
//                    System.out.println(word2 + " ");
//                    break;
//                }
//            }
//        }

        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        System.out.println();
//        for (int i=1;i<=n;i++){

           // String[] input = scanner.nextLine().split(" ");
            Teacher[] teachers=new Teacher[100];
            Student[] students=new Student[100];
            int count=0;

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals("End")) {
                    break;
                }
                String[] input = line.split(" ");
                try {

                    if (input[0].equals("Teacher")){
                        input=scanner.nextLine().split(" ");
                        String name=input[0];
                        String dlujnost = input[1];
                        String katedra = input[2];
                        int staj=Integer.parseInt(input[3]);
                        Teacher teacher=new Teacher(name,dlujnost,katedra,staj);
                        teachers[count]= teacher;
                        //System.out.printf("I'm %1$s %2$i my eng: %3$s with f-number: %4$s", name, age, egn, fn);
                    }
                    else if(input[0].equals("Student")){
                        input=scanner.nextLine().split(" ");
                        String name=input[0];
                        int age = Integer.parseInt(input[1]);
                        String egn = input[2];
                        String fn=input[3];
                        Student student = new Student(name,age,egn,fn);
                        students[count] = student;
                    }
                    count++;
                    //   System.out.println("I'm "+name+" Im "+age+"old.my egn: "+egn+" with f-number:"+fn);
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }

        for(int i=0; i<teachers.length;i++){
            if(teachers[i]!=null && teachers[i].getStaj()>30){
                System.out.println(teachers[i].getName()+" "+teachers[i].getDlujnost());

            }
        }
        for(int i=0; i<students.length;i++){
            if(students[i]!=null && students[i].getAge()>25){
                System.out.println(students[i].getName()+" "+students[i].getAge());

            }
        }
    }
}