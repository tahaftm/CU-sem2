public class Demo {
    public static void main(String[] args) {
        Students s1 = new Students("Taha","A+");
        Students s2 = new Students("Faama","A");
        Students s3 = new Students("Jibran","C");
        Students s4 = new Students("Ali","A");
        Students s5 = new Students("Imran","A+");

        Students[] record = new Students[] {s1,s2,s3,s4,s5};

        for(Students rec: record){
            System.out.println(rec);
        } 
    }
}