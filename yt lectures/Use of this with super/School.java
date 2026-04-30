public class School {
    public String name;
    public int rating;
    public School(){
        this("Karachi School");
        System.err.println("This is the default constructor of School class");
    }
    public School(String name){
        System.err.println("This is String constructor of School class");
    }
    public School(String name, int rating){
        this.name = name;
        this.rating = rating;
        System.err.println("This is the string and int constructor of School class");
    }
}