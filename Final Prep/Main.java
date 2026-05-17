import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student("Ali");
//        System.out.println(s1.getName());
//
//        System.out.println(s1.toString());
//        s1.setName("Adnan");
//        System.out.println(s1.getName());
//        System.out.println(s1.toString());
//
//        Student s2 = new Student("Bashir");
//        Student s3 = new Student("Subhan");
//        Student s4 = new Student("Ibrahim");
//        Student s5 = new Student("Taha");
//
//
//        System.out.println(Student.getCount());

        // COPY OBJECTS

//        Student s1 = new Student("Ali");
//        Student s2 = s1;
//        System.out.println(s2.toString());
//        s1.setName("Adnan");
//        System.out.println(s2.toString());

        // Arrays
        Student s1 = new Student("Ali");
        Student s2 = new Student("Bashir");
        Student s3 = new Student("Subhan",2);
        Student s4 = new Student("Ibrahim",14);
        Student s5 = new Student("Taha",12);

        Student[] record = {s1,s2,s3,s4,s5};

        for (Student obj:record){
            System.out.println(obj.getName());
        }




    }
}
