public class StringClass{
    public static void main(String[] args) {
        String b = "value 2";
        String text = "This is my text";
        // String methods: 
        System.out.println(b.contains("al"));
        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());
        System.out.println(b.startsWith("va"));

        System.out.println(text.indexOf("text"));
        System.out.println(text.indexOf("taha"));           // non existent so t5he oputput will be -1
        
        
        System.out.println(text.charAt(11));

        System.out.println(text.replace("text", "test"));


        // String are not be changed
        b = "I changed b";
        System.out.println(b);


    }
}