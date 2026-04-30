public class A{
    int a;
    String b;
    A(){
        this.a = 10; 
        this.b = "LearnCoding";
        System.out.println(a + " " + b);
    }

                                            // COPY CONSTRUCTOR
    A(A ref){
        a = ref.a;
        b = ref.b;
        System.out.println(a + " " + b);
    }
}