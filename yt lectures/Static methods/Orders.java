public class Orders{
    private static int count;
    public Orders(){
        count++;
        System.out.println("We are inside the constructor of the Orders class");
    }
    public static void get_count(){
        System.out.println("Count Of Orders: " + count);
    }
}