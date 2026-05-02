public class Nested{
    String msg_out = "I am outside";
    public void greetings(){
        System.out.println("Hello from outside");
    }
    public class Inside {
        String msg_in = "I am inside";
    public void greetings(){
        System.out.println("Hello from inside");
    }
    }
}