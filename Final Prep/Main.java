import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ali");
        System.out.println(s1.getName());

        System.out.println(s1.toString());
        s1.setName("Adnan");
        System.out.println(s1.getName());
        System.out.println(s1.toString());
    }
}
