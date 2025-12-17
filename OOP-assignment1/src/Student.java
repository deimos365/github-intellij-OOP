public class Student extends Human{
    private String major;
    private float gpa;

    // constructors
    public Student(){}
    public Student(int age, boolean isJojoFan, String name, String major, float gpa){
        super(age, isJojoFan, name);
        this.major = major;
        this.gpa = gpa;
    }

    // methods
    @Override
    public String position(){
        return "I am a student";
    }


    // g/s
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }






}
