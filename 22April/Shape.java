public abstract class Shape{
    int x;
    int y;
    abstract void draw();
    abstract void remove();
    void move(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("The shape is moving to : (" + x+","+y+")");
    }
}