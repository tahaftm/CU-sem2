public class Demo{
    public static void main(String[] args) {
        Address address = new Address("New York");
        Person per1 = new Person("Taha", address);

        // Shallow Copy
        Person per2 = new Person(per1);

        System.out.println(per1.address.city);
        System.out.println(per2.address.city);

        // Demonstrating the problem of Shallow copy by changing the value of address
        address.city = "California";

        System.out.println(per1.address.city);
        System.out.println(per2.address.city);
 
        per1.address.city = "Los Angeles";

        System.out.println(per1.address.city);
        System.out.println(per2.address.city);
    }
}