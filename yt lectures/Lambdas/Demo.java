public class Demo {
    public static void main(String[] args) {
        Myfunctions func = () -> System.out.println("Hello MF"); 
    
        func.show();

        Students name_age = (name, age) -> System.out.println("Name: " + name + " Age: " + age);
    
        name_age.print_details("Fama", 18);
    }
}