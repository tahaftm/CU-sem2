public class Student extends School{
    private String name;
    private int grade;

    // Static method to count how many objects have been created
    private static int count;
    public static int getCount(){
        return count;
    }

    public Student(String name){
        this(name, 0);
        System.out.println("I am inside the constructor of Student with name");
    }
    public Student(int grade){
        this("name", grade);
    }
    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
        count++;
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
