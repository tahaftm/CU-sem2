public class Rectangle{
        public int length;
        public int breadth;

        // creating a constructor
        public Rectangle(int length, int breadth){
            this.length = length;
            this.breadth = breadth;

            // What is this? this is the keyword which is useed to tell that we are using the variable of the class itself instead of the arguments  of the constructor

            System.err.println("I am inside the construcotr");
        }

        public void draw(){
            System.out.println("Drawing a rectangle");
        }

        public void printArea(){
            System.out.println("The area is: " + length*breadth);       // compiler already knows that length and breadth are the one reffered in rectangle class
        }
        
    }
