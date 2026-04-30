public class Person{
    Address address;
    String name;
    Person(String name, Address address){
        this.name  = name;
        this.address = address;
    }

    //  Shallow Copy
    public Person(Person obj) {
        this.name = obj.name;
        this.address = obj.address;
    }
        
}