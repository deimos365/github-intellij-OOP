package people;

import interfaces.IStudy;

public final class Student extends Human implements IStudy {
    private String major;
    private float gpa;
    private static int counter = 1;
    private final int studentId;

    // constructors
    public Student() {
        this.studentId = counter++;
    }

    public Student(int age, boolean isJojoFan, String name, String major, float gpa) {
        super(age, isJojoFan, name);
        this.major = major;
        this.gpa = gpa;
        this.studentId = counter++;
    }

    // methods
    public final int showStudentId() {
        return studentId;
    }

    @Override
    public String position() {
        return "I am a student";
    }

    @Override
    public String getRole() {
        return "Student";
    }

    //IStudy
    @Override
    public int studyHours() {
        return 40;
    }

    @Override
    public boolean isStudying() {
        return true;
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
