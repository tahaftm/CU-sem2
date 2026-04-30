public class Student extends School{
    public int age;
    public String name;
    public Student(){
        this("Taha",19);
        System.out.println("This is a default constructor of Student class");
    }
    public Student(String name){
        this("Taha",19);
        System.out.println("Tihs is a string constructor of Student class");
    }
    public Student(String name, int age){
        System.out.println("This is a string and integer constructor of Student class");
        super();
    }
}