public class Circle extends Shape{
    private static final double PI = 3.14; 
    private int radius;
    public Circle(int radius){
        this.radius= radius;
        System.out.println("I am inside the constructor of circle");
    }

    public void draw(){
        System.out.println("You are drawing a circle");
    }

    public void printArea(){
        System.out.println("The area of the circcle is: " + (PI * radius * 2));
    }
}