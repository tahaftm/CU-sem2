public class Rectangle{
        // One of the major benifits of encapsulation is that it bundles all the variables and methods into the class only but if you wat to access it outside the class then you have top include the keeyword public

        int length;
        int breadth;
        private int area;

        public Rectangle(int length, int breadth){
            this.area = length*breadth;
        }

        void draw(){
            System.out.println("Drawing a rectangle");
        }

        void printArea(){
            System.out.println("The area is: " + area);       // compiler already knows that length and breadth are the one reffered in rectangle class
        }
        
    }
