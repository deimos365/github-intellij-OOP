public class Human {
    private int age;
    private boolean isJojoFan;
    private String name;

    // constructors
    public Human(){}
    public Human(int age, boolean isJojoFan, String name){
        this.age = age;
        this.isJojoFan = isJojoFan;
        this.name = name;
    }


    // methods
    public String position(){
        return "I am just a human";
    }
    public String favoriteSeason(){
        return "jjba part 4: Diamond is unbreakable";
    }
    public String toMove() {
        return "to move fast";
    }


    // g/s
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isJojoFan() {
        return isJojoFan;
    }
    public void setJojoFan(boolean jojoFan) {
        isJojoFan = jojoFan;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



}
