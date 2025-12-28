import interfaces.IWork;import people.Employee;
import people.Human;
import people.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee employee1 = new Employee(21, true, "Bready", "Creative Industries", 380100);

        System.out.print("enter the new salary: ");
        float newSalary = scanner.nextFloat();
        employee1.setSalary(newSalary);

        System.out.println(employee1.getName() + ": " + employee1.position() + ". My salary now is " + employee1.getSalary());

        Student student1 = new Student();

        Human student2 = new Student();

        IWork employee2 = new Employee();

        System.out.println();

        //Employee methods
        System.out.println("employee1: " + employee1.position() + ". Therefore my role is " + employee1.getRole());
        System.out.println("employee1: " + "I study for " + employee1.studyHours() + " hours a day. You may think I'm studying right now, that's " + employee1.isStudying() + ".");
        System.out.println("employee1: " + "I work for " + employee1.workHours() + " hours a day. You may think I'm working right now, that's " + employee1.isStudying() + ".");
        System.out.println("employee1: " + employee1.tellAboutSalary());

        System.out.println();

        //Student methods
        System.out.println("student1: " + student1.position() + ". Therefore my role is " + student1.getRole());
        System.out.println("student1: " + "I study for " + student1.studyHours() + " hours a day. You may think I'm studying right now, that's " + student1.isStudying() + ".");
        System.out.println("student1: " + "My studentID is " + student1.showStudentId());

        //Polymorphism
        System.out.println("student2 role: " + student2.getRole());
        System.out.println("student2: " + "My studentID is " + ((Student) student2).showStudentId());

        System.out.println("employee2 works " + employee2.workHours() + " hours");
        System.out.println("employee2: " + ((Employee) employee2).tellAboutSalary());
    }
}