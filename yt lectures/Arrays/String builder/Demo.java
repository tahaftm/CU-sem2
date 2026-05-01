
public class Demo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

// add text
        sb.append(" World");

// insert text
        sb.insert(5, " Java");

// replace text
        sb.replace(0, 5, "Hi");

// delete text
        sb.delete(0, 2);

// reverse string
        sb.reverse();

        System.out.println(sb);

    }
}
