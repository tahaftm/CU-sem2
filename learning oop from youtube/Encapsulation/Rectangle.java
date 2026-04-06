public class Rectangle{
        // One of the major benifits of encapsulation is that it bundles all the variables and methods into the class only but if you wat to access it outside the class then you have top include the keeyword public

        public int length;
        public int breadth;

        public void draw(){
            System.out.println("Drawing a rectangle");
        }

        public void printArea(){
            System.out.println("The area is: " + length*breadth);       // compiler already knows that length and breadth are the one reffered in rectangle class
        }
        
    }
