public abstract class Shape{
    // Method overriding means in parent and children have the same function name if the child defines the same function the compiler consider the function of child and overrides the parent function

    // Constructor chaining is known as the oprocess of adding the super in the constructor of the parent this means to call the constructor of parent first then the constructor of child however if we dont write super it would still work then too 
    
    // Abstract class is the class that tells that this class i only usded for inheritance and we cant create its objects

    public Shape(){
        super();
        System.out.println("I am inside the constructor");
    }

    public void draw(){
        System.err.println("I am drawing a shape");
    }


    public void printArea(){
        System.err.println("Area is unknown");

    // public abstract void printArea() ------> by adding abstract keyword we say that we have this method in the shape but we are not sure what this method will contain
    }
}