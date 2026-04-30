public class Student {
    public int marks;
    public String name;
    public Student(String name,int marks){
        this.name = name;
        this.marks = marks;
    }
    public String toString(){
        return "Student Details: Name : " + this.name + " | Marks : " + this.marks;
    }
}