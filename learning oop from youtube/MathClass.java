public class MathClass{
    public static void main(String[] args) {
        int a  = 5;
        int b = 10;
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
        float percent = 85.67F;
        System.err.println(Math.round(percent));
        System.err.println((int) Math.floor(percent));
        System.err.println(Math.ceil(percent));

        int num=144;
        System.out.println(Math.sqrt(num)) ;
        System.out.println(Math.pow(num,3));


        //Generating random numbers

        double random = Math.random();
        System.out.println(random);
        System.out.println(random*100);
    }
}