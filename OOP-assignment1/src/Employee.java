public class Employee extends Human {
    private String School;
    private float salary;

    public static String employeeType = "Full-time";

    // constructors
    public Employee(){}
    public Employee(int age, boolean isJojoFan, String name, String school, float salary){
        super(age, isJojoFan, name);
        this.School = school;
        this.salary = salary;
    }
    // methods
    @Override
    public String position(){
        return "I am an employee";
    }


    // g/s
    public String getSchool() {
        return School;
    }
    public void setSchool(String school) {
        School = school;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }






}
