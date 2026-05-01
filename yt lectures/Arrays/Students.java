public class Students{
    String name; String grade;
    public Students(String name, String grade){
        this.name = name;
        this.grade = grade;
    }
    public String toString(){
        return "Student detail: " + this.name + " | " + this.grade;
    }
}