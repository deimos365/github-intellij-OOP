import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Human human = new Human(19, true, "Alice");
        System.out.println(human.getName() + ": " + human.position());

        Employee employee = new Employee(21, true, "Bready", "Creative Industries", 380100);
        float newSalary = scanner.nextFloat();
        employee.setSalary(newSalary);
        System.out.println(employee.getName() + ": " + employee.position() + ". My salary now is " + employee.getSalary());

        Student student = new Student(17, true, "Coule", "Media Technologies", 3);
        System.out.println(student.getName() + ": " + student.toMove());
    }
}