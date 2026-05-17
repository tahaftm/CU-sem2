public class Student extends School{
    private String name;
    private int grade;
    public Student(){
        System.out.println("Iam inside the constructor of Student");
    }
    public Student(String name){
        this(name, 12);
        System.out.println("I am inside the constructor of Student with name");
    }
    public Student(int grade){
        System.out.println("I am inside the constructor of Student with grade");
        this.grade = grade;
    }
    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }
    public String toString(){
        return "name: " + this.name + " | grade: " + this.grade;
    }
    public String getName(){
        return this.name;
    }
    public int getGrade(){
        return this.grade;
    }
    public void setName(String newName){
        this.name = newName;
    }
}
