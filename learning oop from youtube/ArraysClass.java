import java.util.Arrays;
public class ArraysClass{
    public static void main(String[] args) {
        // How to create array? 
        int[] marks = new int[4];
        marks[0] = 50;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 80;

        System.out.println(marks);       // memory address

        int[] year = new int[] {2023,2011,2022,2024};
        System.out.println(year[0]);      
        System.out.println(Arrays.toString(year));       // Strig format like python list

        // 2D
        int[][] marksNew = new int[][] {{50,50},{90,30}};
        System.out.println(Arrays.toString(marksNew));       // Does not works in 2D arrays
        System.out.println(Arrays.deepToString(marksNew));       

        // Sorting the array:
        Arrays.sort(marks);
        System.out.println(Arrays.toString(marks));
    }
}