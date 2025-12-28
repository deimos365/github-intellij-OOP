package people;

import interfaces.IStudy;
import interfaces.IWork;

public class Employee extends Human implements IStudy, IWork {
    private String school;
    private float salary;

    public static String employeeType = "Full-time";

    // constructors
    public Employee() {
    }

    public Employee(int age, boolean isJojoFan, String name, String school, float salary) {
        super(age, isJojoFan, name);
        this.school = school;
        this.salary = salary;
    }

    // methods
    @Override
    public String position() {
        return "I am an employee";
    }

    @Override
    public String getRole() {
        return "Employee";
    }

    //IStudy
    @Override
    public int studyHours() {
        return 10;
    }

    @Override
    public boolean isStudying() {
        return false;
    }

    //IWork
    @Override
    public int workHours() {
        return 30;
    }

    @Override
    public boolean isWorking() {
        return true;
    }

    @Override
    public String tellAboutSalary() {
        return "I get " + salary + " per month.";
    }

    // g/s
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


}
